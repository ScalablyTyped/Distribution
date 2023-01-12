package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.FirebaseArrayIndexError
import typings.firebaseAdmin.libAuthActionCodeSettingsBuilderMod.ActionCodeSettings
import typings.firebaseAdmin.libAuthAuthConfigMod.AuthProviderConfig
import typings.firebaseAdmin.libAuthAuthConfigMod.AuthProviderConfigFilter
import typings.firebaseAdmin.libAuthAuthConfigMod.CreateRequest
import typings.firebaseAdmin.libAuthAuthConfigMod.ListProviderConfigResults
import typings.firebaseAdmin.libAuthAuthConfigMod.UpdateAuthProviderRequest
import typings.firebaseAdmin.libAuthAuthConfigMod.UpdateRequest
import typings.firebaseAdmin.libAuthIdentifierMod.UserIdentifier
import typings.firebaseAdmin.libAuthTokenVerifierMod.DecodedAuthBlockingToken
import typings.firebaseAdmin.libAuthTokenVerifierMod.DecodedIdToken
import typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportOptions
import typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportRecord
import typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportResult
import typings.firebaseAdmin.libAuthUserRecordMod.UserRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthBaseAuthMod {
  
  /* note: abstract class */ @JSImport("firebase-admin/lib/auth/base-auth", "BaseAuth")
  @js.native
  open class BaseAuth () extends StObject {
    
    /** @alpha */
    def _verifyAuthBlockingToken(token: String): js.Promise[DecodedAuthBlockingToken] = js.native
    def _verifyAuthBlockingToken(token: String, audience: String): js.Promise[DecodedAuthBlockingToken] = js.native
    
    /**
      * Creates a new Firebase custom token (JWT) that can be sent back to a client
      * device to use to sign in with the client SDKs' `signInWithCustomToken()`
      * methods. (Tenant-aware instances will also embed the tenant ID in the
      * token.)
      *
      * See {@link https://firebase.google.com/docs/auth/admin/create-custom-tokens | Create Custom Tokens}
      * for code samples and detailed documentation.
      *
      * @param uid - The `uid` to use as the custom token's subject.
      * @param developerClaims - Optional additional claims to include
      *   in the custom token's payload.
      *
      * @returns A promise fulfilled with a custom token for the
      *   provided `uid` and payload.
      */
    def createCustomToken(uid: String): js.Promise[String] = js.native
    def createCustomToken(uid: String, developerClaims: js.Object): js.Promise[String] = js.native
    
    /**
      * Returns a promise that resolves with the newly created `AuthProviderConfig`
      * when the new provider configuration is created.
      *
      * SAML and OIDC provider support requires Google Cloud's Identity Platform
      * (GCIP). To learn more about GCIP, including pricing and features,
      * see the {@link https://cloud.google.com/identity-platform | GCIP documentation}.
      *
      * @param config - The provider configuration to create.
      * @returns A promise that resolves with the created provider configuration.
      */
    def createProviderConfig(config: AuthProviderConfig): js.Promise[AuthProviderConfig] = js.native
    
    /**
      * Creates a new Firebase session cookie with the specified options. The created
      * JWT string can be set as a server-side session cookie with a custom cookie
      * policy, and be used for session management. The session cookie JWT will have
      * the same payload claims as the provided ID token.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-cookies | Manage Session Cookies}
      * for code samples and detailed documentation.
      *
      * @param idToken - The Firebase ID token to exchange for a session
      *   cookie.
      * @param sessionCookieOptions - The session
      *   cookie options which includes custom session duration.
      *
      * @returns A promise that resolves on success with the
      *   created session cookie.
      */
    def createSessionCookie(idToken: String, sessionCookieOptions: SessionCookieOptions): js.Promise[String] = js.native
    
    /**
      * Creates a new user.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-users#create_a_user | Create a user}
      * for code samples and detailed documentation.
      *
      * @param properties - The properties to set on the
      *   new user record to be created.
      *
      * @returns A promise fulfilled with the user
      *   data corresponding to the newly created user.
      */
    def createUser(properties: CreateRequest): js.Promise[UserRecord] = js.native
    
    /**
      * Deletes the provider configuration corresponding to the provider ID passed.
      * If the specified ID does not exist, an `auth/configuration-not-found` error
      * is thrown.
      *
      * SAML and OIDC provider support requires Google Cloud's Identity Platform
      * (GCIP). To learn more about GCIP, including pricing and features,
      * see the {@link https://cloud.google.com/identity-platform | GCIP documentation}.
      *
      * @param providerId - The provider ID corresponding to the provider
      *     config to delete.
      * @returns A promise that resolves on completion.
      */
    def deleteProviderConfig(providerId: String): js.Promise[Unit] = js.native
    
    /**
      * Deletes an existing user.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-users#delete_a_user | Delete a user}
      * for code samples and detailed documentation.
      *
      * @param uid - The `uid` corresponding to the user to delete.
      *
      * @returns An empty promise fulfilled once the user has been
      *   deleted.
      */
    def deleteUser(uid: String): js.Promise[Unit] = js.native
    
    /**
      * Deletes the users specified by the given uids.
      *
      * Deleting a non-existing user won't generate an error (i.e. this method
      * is idempotent.) Non-existing users are considered to be successfully
      * deleted, and are therefore counted in the
      * `DeleteUsersResult.successCount` value.
      *
      * Only a maximum of 1000 identifiers may be supplied. If more than 1000
      * identifiers are supplied, this method throws a FirebaseAuthError.
      *
      * This API is currently rate limited at the server to 1 QPS. If you exceed
      * this, you may get a quota exceeded error. Therefore, if you want to
      * delete more than 1000 users, you may need to add a delay to ensure you
      * don't go over this limit.
      *
      * @param uids - The `uids` corresponding to the users to delete.
      *
      * @returns A Promise that resolves to the total number of successful/failed
      *     deletions, as well as the array of errors that corresponds to the
      *     failed deletions.
      */
    def deleteUsers(uids: js.Array[String]): js.Promise[DeleteUsersResult] = js.native
    
    /**
      * Generates the out of band email action link to verify the user's ownership
      * of the specified email. The {@link ActionCodeSettings} object provided
      * as an argument to this method defines whether the link is to be handled by a
      * mobile app or browser along with additional state information to be passed in
      * the deep link, etc.
      *
      * @example
      * ```javascript
      * var actionCodeSettings = {
      *   url: 'https://www.example.com/cart?email=user@example.com&cartId=123',
      *   iOS: {
      *     bundleId: 'com.example.ios'
      *   },
      *   android: {
      *     packageName: 'com.example.android',
      *     installApp: true,
      *     minimumVersion: '12'
      *   },
      *   handleCodeInApp: true,
      *   dynamicLinkDomain: 'custom.page.link'
      * };
      * admin.auth()
      *     .generateEmailVerificationLink('user@example.com', actionCodeSettings)
      *     .then(function(link) {
      *       // The link was successfully generated.
      *     })
      *     .catch(function(error) {
      *       // Some error occurred, you can inspect the code: error.code
      *     });
      * ```
      *
      * @param email - The email account to verify.
      * @param actionCodeSettings - The action
      *     code settings. If specified, the state/continue URL is set as the
      *     "continueUrl" parameter in the email verification link. The default email
      *     verification landing page will use this to display a link to go back to
      *     the app if it is installed.
      *     If the actionCodeSettings is not specified, no URL is appended to the
      *     action URL.
      *     The state URL provided must belong to a domain that is whitelisted by the
      *     developer in the console. Otherwise an error is thrown.
      *     Mobile app redirects are only applicable if the developer configures
      *     and accepts the Firebase Dynamic Links terms of service.
      *     The Android package name and iOS bundle ID are respected only if they
      *     are configured in the same Firebase Auth project.
      * @returns A promise that resolves with the generated link.
      */
    def generateEmailVerificationLink(email: String): js.Promise[String] = js.native
    def generateEmailVerificationLink(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[String] = js.native
    
    /**
      * Generates the out of band email action link to reset a user's password.
      * The link is generated for the user with the specified email address. The
      * optional  {@link ActionCodeSettings} object
      * defines whether the link is to be handled by a mobile app or browser and the
      * additional state information to be passed in the deep link, etc.
      *
      * @example
      * ```javascript
      * var actionCodeSettings = {
      *   url: 'https://www.example.com/?email=user@example.com',
      *   iOS: {
      *     bundleId: 'com.example.ios'
      *   },
      *   android: {
      *     packageName: 'com.example.android',
      *     installApp: true,
      *     minimumVersion: '12'
      *   },
      *   handleCodeInApp: true,
      *   dynamicLinkDomain: 'custom.page.link'
      * };
      * admin.auth()
      *     .generatePasswordResetLink('user@example.com', actionCodeSettings)
      *     .then(function(link) {
      *       // The link was successfully generated.
      *     })
      *     .catch(function(error) {
      *       // Some error occurred, you can inspect the code: error.code
      *     });
      * ```
      *
      * @param email - The email address of the user whose password is to be
      *   reset.
      * @param actionCodeSettings - The action
      *     code settings. If specified, the state/continue URL is set as the
      *     "continueUrl" parameter in the password reset link. The default password
      *     reset landing page will use this to display a link to go back to the app
      *     if it is installed.
      *     If the actionCodeSettings is not specified, no URL is appended to the
      *     action URL.
      *     The state URL provided must belong to a domain that is whitelisted by the
      *     developer in the console. Otherwise an error is thrown.
      *     Mobile app redirects are only applicable if the developer configures
      *     and accepts the Firebase Dynamic Links terms of service.
      *     The Android package name and iOS bundle ID are respected only if they
      *     are configured in the same Firebase Auth project.
      * @returns A promise that resolves with the generated link.
      */
    def generatePasswordResetLink(email: String): js.Promise[String] = js.native
    def generatePasswordResetLink(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[String] = js.native
    
    /**
      * Generates the out of band email action link to verify the user's ownership
      * of the specified email. The {@link ActionCodeSettings} object provided
      * as an argument to this method defines whether the link is to be handled by a
      * mobile app or browser along with additional state information to be passed in
      * the deep link, etc.
      *
      * @example
      * ```javascript
      * var actionCodeSettings = {
      *   url: 'https://www.example.com/cart?email=user@example.com&cartId=123',
      *   iOS: {
      *     bundleId: 'com.example.ios'
      *   },
      *   android: {
      *     packageName: 'com.example.android',
      *     installApp: true,
      *     minimumVersion: '12'
      *   },
      *   handleCodeInApp: true,
      *   dynamicLinkDomain: 'custom.page.link'
      * };
      * admin.auth()
      *     .generateEmailVerificationLink('user@example.com', actionCodeSettings)
      *     .then(function(link) {
      *       // The link was successfully generated.
      *     })
      *     .catch(function(error) {
      *       // Some error occurred, you can inspect the code: error.code
      *     });
      * ```
      *
      * @param email - The email account to verify.
      * @param actionCodeSettings - The action
      *     code settings. If specified, the state/continue URL is set as the
      *     "continueUrl" parameter in the email verification link. The default email
      *     verification landing page will use this to display a link to go back to
      *     the app if it is installed.
      *     If the actionCodeSettings is not specified, no URL is appended to the
      *     action URL.
      *     The state URL provided must belong to a domain that is whitelisted by the
      *     developer in the console. Otherwise an error is thrown.
      *     Mobile app redirects are only applicable if the developer configures
      *     and accepts the Firebase Dynamic Links terms of service.
      *     The Android package name and iOS bundle ID are respected only if they
      *     are configured in the same Firebase Auth project.
      * @returns A promise that resolves with the generated link.
      */
    def generateSignInWithEmailLink(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[String] = js.native
    
    /**
      * Generates an out-of-band email action link to verify the user's ownership
      * of the specified email. The {@link ActionCodeSettings} object provided
      * as an argument to this method defines whether the link is to be handled by a
      * mobile app or browser along with additional state information to be passed in
      * the deep link, etc.
      *
      * @param email - The current email account.
      * @param newEmail - The email address the account is being updated to.
      * @param actionCodeSettings - The action
      *     code settings. If specified, the state/continue URL is set as the
      *     "continueUrl" parameter in the email verification link. The default email
      *     verification landing page will use this to display a link to go back to
      *     the app if it is installed.
      *     If the actionCodeSettings is not specified, no URL is appended to the
      *     action URL.
      *     The state URL provided must belong to a domain that is authorized
      *     in the console, or an error will be thrown.
      *     Mobile app redirects are only applicable if the developer configures
      *     and accepts the Firebase Dynamic Links terms of service.
      *     The Android package name and iOS bundle ID are respected only if they
      *     are configured in the same Firebase Auth project.
      * @returns A promise that resolves with the generated link.
      */
    def generateVerifyAndChangeEmailLink(email: String, newEmail: String): js.Promise[String] = js.native
    def generateVerifyAndChangeEmailLink(email: String, newEmail: String, actionCodeSettings: ActionCodeSettings): js.Promise[String] = js.native
    
    /**
      * Looks up an Auth provider configuration by the provided ID.
      * Returns a promise that resolves with the provider configuration
      * corresponding to the provider ID specified. If the specified ID does not
      * exist, an `auth/configuration-not-found` error is thrown.
      *
      * SAML and OIDC provider support requires Google Cloud's Identity Platform
      * (GCIP). To learn more about GCIP, including pricing and features,
      * see the {@link https://cloud.google.com/identity-platform | GCIP documentation}.
      *
      * @param providerId - The provider ID corresponding to the provider
      *     config to return.
      * @returns A promise that resolves
      *     with the configuration corresponding to the provided ID.
      */
    def getProviderConfig(providerId: String): js.Promise[AuthProviderConfig] = js.native
    
    /**
      * Gets the user data for the user corresponding to a given `uid`.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-users#retrieve_user_data | Retrieve user data}
      * for code samples and detailed documentation.
      *
      * @param uid - The `uid` corresponding to the user whose data to fetch.
      *
      * @returns A promise fulfilled with the user
      *   data corresponding to the provided `uid`.
      */
    def getUser(uid: String): js.Promise[UserRecord] = js.native
    
    /**
      * Gets the user data for the user corresponding to a given email.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-users#retrieve_user_data | Retrieve user data}
      * for code samples and detailed documentation.
      *
      * @param email - The email corresponding to the user whose data to
      *   fetch.
      *
      * @returns A promise fulfilled with the user
      *   data corresponding to the provided email.
      */
    def getUserByEmail(email: String): js.Promise[UserRecord] = js.native
    
    /**
      * Gets the user data for the user corresponding to a given phone number. The
      * phone number has to conform to the E.164 specification.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-users#retrieve_user_data | Retrieve user data}
      * for code samples and detailed documentation.
      *
      * @param phoneNumber - The phone number corresponding to the user whose
      *   data to fetch.
      *
      * @returns A promise fulfilled with the user
      *   data corresponding to the provided phone number.
      */
    def getUserByPhoneNumber(phoneNumber: String): js.Promise[UserRecord] = js.native
    
    /**
      * Gets the user data for the user corresponding to a given provider id.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-users#retrieve_user_data | Retrieve user data}
      * for code samples and detailed documentation.
      *
      * @param providerId - The provider ID, for example, "google.com" for the
      *   Google provider.
      * @param uid - The user identifier for the given provider.
      *
      * @returns A promise fulfilled with the user data corresponding to the
      *   given provider id.
      */
    def getUserByProviderUid(providerId: String, uid: String): js.Promise[UserRecord] = js.native
    
    /**
      * Gets the user data corresponding to the specified identifiers.
      *
      * There are no ordering guarantees; in particular, the nth entry in the result list is not
      * guaranteed to correspond to the nth entry in the input parameters list.
      *
      * Only a maximum of 100 identifiers may be supplied. If more than 100 identifiers are supplied,
      * this method throws a FirebaseAuthError.
      *
      * @param identifiers - The identifiers used to indicate which user records should be returned.
      *     Must not have more than 100 entries.
      * @returns A promise that resolves to the corresponding user records.
      * @throws FirebaseAuthError If any of the identifiers are invalid or if more than 100
      *     identifiers are specified.
      */
    def getUsers(identifiers: js.Array[UserIdentifier]): js.Promise[GetUsersResult] = js.native
    
    /**
      * Imports the provided list of users into Firebase Auth.
      * A maximum of 1000 users are allowed to be imported one at a time.
      * When importing users with passwords,
      * {@link UserImportOptions} are required to be
      * specified.
      * This operation is optimized for bulk imports and will ignore checks on `uid`,
      * `email` and other identifier uniqueness which could result in duplications.
      *
      * @param users - The list of user records to import to Firebase Auth.
      * @param options - The user import options, required when the users provided include
      *   password credentials.
      * @returns A promise that resolves when
      *   the operation completes with the result of the import. This includes the
      *   number of successful imports, the number of failed imports and their
      *   corresponding errors.
      */
    def importUsers(users: js.Array[UserImportRecord]): js.Promise[UserImportResult] = js.native
    def importUsers(users: js.Array[UserImportRecord], options: UserImportOptions): js.Promise[UserImportResult] = js.native
    
    /**
      * Returns the list of existing provider configurations matching the filter
      * provided. At most, 100 provider configs can be listed at a time.
      *
      * SAML and OIDC provider support requires Google Cloud's Identity Platform
      * (GCIP). To learn more about GCIP, including pricing and features,
      * see the {@link https://cloud.google.com/identity-platform | GCIP documentation}.
      *
      * @param options - The provider config filter to apply.
      * @returns A promise that resolves with the list of provider configs meeting the
      *   filter requirements.
      */
    def listProviderConfigs(options: AuthProviderConfigFilter): js.Promise[ListProviderConfigResults] = js.native
    
    /**
      * Retrieves a list of users (single batch only) with a size of `maxResults`
      * starting from the offset as specified by `pageToken`. This is used to
      * retrieve all the users of a specified project in batches.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-users#list_all_users | List all users}
      * for code samples and detailed documentation.
      *
      * @param maxResults - The page size, 1000 if undefined. This is also
      *   the maximum allowed limit.
      * @param pageToken - The next page token. If not specified, returns
      *   users starting without any offset.
      * @returns A promise that resolves with
      *   the current batch of downloaded users and the next page token.
      */
    def listUsers(): js.Promise[ListUsersResult] = js.native
    def listUsers(maxResults: Double): js.Promise[ListUsersResult] = js.native
    def listUsers(maxResults: Double, pageToken: String): js.Promise[ListUsersResult] = js.native
    def listUsers(maxResults: Unit, pageToken: String): js.Promise[ListUsersResult] = js.native
    
    /**
      * Revokes all refresh tokens for an existing user.
      *
      * This API will update the user's {@link UserRecord.tokensValidAfterTime} to
      * the current UTC. It is important that the server on which this is called has
      * its clock set correctly and synchronized.
      *
      * While this will revoke all sessions for a specified user and disable any
      * new ID tokens for existing sessions from getting minted, existing ID tokens
      * may remain active until their natural expiration (one hour). To verify that
      * ID tokens are revoked, use {@link BaseAuth.verifyIdToken}
      * where `checkRevoked` is set to true.
      *
      * @param uid - The `uid` corresponding to the user whose refresh tokens
      *   are to be revoked.
      *
      * @returns An empty promise fulfilled once the user's refresh
      *   tokens have been revoked.
      */
    def revokeRefreshTokens(uid: String): js.Promise[Unit] = js.native
    
    /**
      * Sets additional developer claims on an existing user identified by the
      * provided `uid`, typically used to define user roles and levels of
      * access. These claims should propagate to all devices where the user is
      * already signed in (after token expiration or when token refresh is forced)
      * and the next time the user signs in. If a reserved OIDC claim name
      * is used (sub, iat, iss, etc), an error is thrown. They are set on the
      * authenticated user's ID token JWT.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/custom-claims |
      * Defining user roles and access levels}
      * for code samples and detailed documentation.
      *
      * @param uid - The `uid` of the user to edit.
      * @param customUserClaims - The developer claims to set. If null is
      *   passed, existing custom claims are deleted. Passing a custom claims payload
      *   larger than 1000 bytes will throw an error. Custom claims are added to the
      *   user's ID token which is transmitted on every authenticated request.
      *   For profile non-access related user attributes, use database or other
      *   separate storage systems.
      * @returns A promise that resolves when the operation completes
      *   successfully.
      */
    def setCustomUserClaims(uid: String): js.Promise[Unit] = js.native
    def setCustomUserClaims(uid: String, customUserClaims: js.Object): js.Promise[Unit] = js.native
    
    /**
      * Returns a promise that resolves with the updated `AuthProviderConfig`
      * corresponding to the provider ID specified.
      * If the specified ID does not exist, an `auth/configuration-not-found` error
      * is thrown.
      *
      * SAML and OIDC provider support requires Google Cloud's Identity Platform
      * (GCIP). To learn more about GCIP, including pricing and features,
      * see the {@link https://cloud.google.com/identity-platform | GCIP documentation}.
      *
      * @param providerId - The provider ID corresponding to the provider
      *     config to update.
      * @param updatedConfig - The updated configuration.
      * @returns A promise that resolves with the updated provider configuration.
      */
    def updateProviderConfig(providerId: String, updatedConfig: UpdateAuthProviderRequest): js.Promise[AuthProviderConfig] = js.native
    
    /**
      * Updates an existing user.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-users#update_a_user | Update a user}
      * for code samples and detailed documentation.
      *
      * @param uid - The `uid` corresponding to the user to update.
      * @param properties - The properties to update on
      *   the provided user.
      *
      * @returns A promise fulfilled with the
      *   updated user data.
      */
    def updateUser(uid: String, properties: UpdateRequest): js.Promise[UserRecord] = js.native
    
    /**
      * Verifies the decoded Firebase issued JWT is not revoked or disabled. Returns a promise that
      * resolves with the decoded claims on success. Rejects the promise with revocation error if revoked
      * or user disabled.
      *
      * @param decodedIdToken - The JWT's decoded claims.
      * @param revocationErrorInfo - The revocation error info to throw on revocation
      *     detection.
      * @returns A promise that will be fulfilled after a successful verification.
      */
    /* private */ var verifyDecodedJWTNotRevokedOrDisabled: Any = js.native
    
    /**
      * Verifies a Firebase ID token (JWT). If the token is valid, the promise is
      * fulfilled with the token's decoded claims; otherwise, the promise is
      * rejected.
      *
      * If `checkRevoked` is set to true, first verifies whether the corresponding
      * user is disabled. If yes, an `auth/user-disabled` error is thrown. If no,
      * verifies if the session corresponding to the ID token was revoked. If the
      * corresponding user's session was invalidated, an `auth/id-token-revoked`
      * error is thrown. If not specified the check is not applied.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/verify-id-tokens | Verify ID Tokens}
      * for code samples and detailed documentation.
      *
      * @param idToken - The ID token to verify.
      * @param checkRevoked - Whether to check if the ID token was revoked.
      *   This requires an extra request to the Firebase Auth backend to check
      *   the `tokensValidAfterTime` time for the corresponding user.
      *   When not specified, this additional check is not applied.
      *
      * @returns A promise fulfilled with the
      *   token's decoded claims if the ID token is valid; otherwise, a rejected
      *   promise.
      */
    def verifyIdToken(idToken: String): js.Promise[DecodedIdToken] = js.native
    def verifyIdToken(idToken: String, checkRevoked: Boolean): js.Promise[DecodedIdToken] = js.native
    
    /**
      * Verifies a Firebase session cookie. Returns a Promise with the cookie claims.
      * Rejects the promise if the cookie could not be verified.
      *
      * If `checkRevoked` is set to true, first verifies whether the corresponding
      * user is disabled: If yes, an `auth/user-disabled` error is thrown. If no,
      * verifies if the session corresponding to the session cookie was revoked.
      * If the corresponding user's session was invalidated, an
      * `auth/session-cookie-revoked` error is thrown. If not specified the check
      * is not performed.
      *
      * See {@link https://firebase.google.com/docs/auth/admin/manage-cookies#verify_session_cookie_and_check_permissions |
      * Verify Session Cookies}
      * for code samples and detailed documentation
      *
      * @param sessionCookie - The session cookie to verify.
      * @param checkForRevocation -  Whether to check if the session cookie was
      *   revoked. This requires an extra request to the Firebase Auth backend to
      *   check the `tokensValidAfterTime` time for the corresponding user.
      *   When not specified, this additional check is not performed.
      *
      * @returns A promise fulfilled with the
      *   session cookie's decoded claims if the session cookie is valid; otherwise,
      *   a rejected promise.
      */
    def verifySessionCookie(sessionCookie: String): js.Promise[DecodedIdToken] = js.native
    def verifySessionCookie(sessionCookie: String, checkRevoked: Boolean): js.Promise[DecodedIdToken] = js.native
  }
  
  trait DeleteUsersResult extends StObject {
    
    /**
      * A list of `FirebaseArrayIndexError` instances describing the errors that
      * were encountered during the deletion. Length of this list is equal to
      * the return value of {@link DeleteUsersResult.failureCount}.
      */
    var errors: js.Array[FirebaseArrayIndexError]
    
    /**
      * The number of user records that failed to be deleted (possibly zero).
      */
    var failureCount: Double
    
    /**
      * The number of users that were deleted successfully (possibly zero).
      * Users that did not exist prior to calling `deleteUsers()` are
      * considered to be successfully deleted.
      */
    var successCount: Double
  }
  object DeleteUsersResult {
    
    inline def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): DeleteUsersResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteUsersResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteUsersResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[FirebaseArrayIndexError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: FirebaseArrayIndexError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
      
      inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetUsersResult extends StObject {
    
    /** Set of identifiers that were requested, but not found. */
    var notFound: js.Array[UserIdentifier]
    
    /**
      * Set of user records, corresponding to the set of users that were
      * requested. Only users that were found are listed here. The result set is
      * unordered.
      */
    var users: js.Array[UserRecord]
  }
  object GetUsersResult {
    
    inline def apply(notFound: js.Array[UserIdentifier], users: js.Array[UserRecord]): GetUsersResult = {
      val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUsersResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetUsersResult] (val x: Self) extends AnyVal {
      
      inline def setNotFound(value: js.Array[UserIdentifier]): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
      
      inline def setNotFoundVarargs(value: UserIdentifier*): Self = StObject.set(x, "notFound", js.Array(value*))
      
      inline def setUsers(value: js.Array[UserRecord]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: UserRecord*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  trait ListUsersResult extends StObject {
    
    /**
      * The next page token if available. This is needed for the next batch download.
      */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /**
      * The list of {@link UserRecord} objects for the
      * current downloaded batch.
      */
    var users: js.Array[UserRecord]
  }
  object ListUsersResult {
    
    inline def apply(users: js.Array[UserRecord]): ListUsersResult = {
      val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListUsersResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListUsersResult] (val x: Self) extends AnyVal {
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setUsers(value: js.Array[UserRecord]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: UserRecord*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  trait SessionCookieOptions extends StObject {
    
    /**
      * The session cookie custom expiration in milliseconds. The minimum allowed is
      * 5 minutes and the maxium allowed is 2 weeks.
      */
    var expiresIn: Double
  }
  object SessionCookieOptions {
    
    inline def apply(expiresIn: Double): SessionCookieOptions = {
      val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionCookieOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionCookieOptions] (val x: Self) extends AnyVal {
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    }
  }
}
