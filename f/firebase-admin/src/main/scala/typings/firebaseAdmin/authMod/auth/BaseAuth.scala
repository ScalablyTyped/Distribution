package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAuth extends StObject {
  
  /**
    * Creates a new Firebase custom token (JWT) that can be sent back to a client
    * device to use to sign in with the client SDKs' `signInWithCustomToken()`
    * methods. (Tenant-aware instances will also embed the tenant ID in the
    * token.)
    *
    * See [Create Custom Tokens](/docs/auth/admin/create-custom-tokens) for code
    * samples and detailed documentation.
    *
    * @param uid The `uid` to use as the custom token's subject.
    * @param developerClaims Optional additional claims to include
    *   in the custom token's payload.
    *
    * @return A promise fulfilled with a custom token for the
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
    * see the [GCIP documentation](https://cloud.google.com/identity-platform).
    *
    * @param config The provider configuration to create.
    * @return A promise that resolves with the created provider configuration.
    */
  def createProviderConfig(config: AuthProviderConfig): js.Promise[AuthProviderConfig] = js.native
  
  /**
    * Creates a new Firebase session cookie with the specified options. The created
    * JWT string can be set as a server-side session cookie with a custom cookie
    * policy, and be used for session management. The session cookie JWT will have
    * the same payload claims as the provided ID token.
    *
    * See [Manage Session Cookies](/docs/auth/admin/manage-cookies) for code
    * samples and detailed documentation.
    *
    * @param idToken The Firebase ID token to exchange for a session
    *   cookie.
    * @param sessionCookieOptions The session
    *   cookie options which includes custom session duration.
    *
    * @return A promise that resolves on success with the
    *   created session cookie.
    */
  def createSessionCookie(idToken: String, sessionCookieOptions: SessionCookieOptions): js.Promise[String] = js.native
  
  /**
    * Creates a new user.
    *
    * See [Create a user](/docs/auth/admin/manage-users#create_a_user) for code
    * samples and detailed documentation.
    *
    * @param properties The properties to set on the
    *   new user record to be created.
    *
    * @return A promise fulfilled with the user
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
    * see the [GCIP documentation](https://cloud.google.com/identity-platform).
    *
    * @param providerId The provider ID corresponding to the provider
    *     config to delete.
    * @return A promise that resolves on completion.
    */
  def deleteProviderConfig(providerId: String): js.Promise[Unit] = js.native
  
  /**
    * Deletes an existing user.
    *
    * See [Delete a user](/docs/auth/admin/manage-users#delete_a_user) for code
    * samples and detailed documentation.
    *
    * @param uid The `uid` corresponding to the user to delete.
    *
    * @return An empty promise fulfilled once the user has been
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
    * @param uids The `uids` corresponding to the users to delete.
    *
    * @return A Promise that resolves to the total number of successful/failed
    *     deletions, as well as the array of errors that corresponds to the
    *     failed deletions.
    */
  def deleteUsers(uids: js.Array[String]): js.Promise[DeleteUsersResult] = js.native
  
  /**
    * Generates the out of band email action link to verify the user's ownership
    * of the specified email. The
    * {@link auth.ActionCodeSettings `ActionCodeSettings`} object provided
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
    * @param email The email account to verify.
    * @param actionCodeSettings The action
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
    * @return A promise that resolves with the generated link.
    */
  def generateEmailVerificationLink(email: String): js.Promise[String] = js.native
  def generateEmailVerificationLink(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[String] = js.native
  
  /**
    * Generates the out of band email action link to reset a user's password.
    * The link is generated for the user with the specified email address. The
    * optional  {@link auth.ActionCodeSettings `ActionCodeSettings`} object
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
    * @param email The email address of the user whose password is to be
    *   reset.
    * @param actionCodeSettings The action
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
    * @return A promise that resolves with the generated link.
    */
  def generatePasswordResetLink(email: String): js.Promise[String] = js.native
  def generatePasswordResetLink(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[String] = js.native
  
  /**
    * Generates the out of band email action link to sign in or sign up the owner
    * of the specified email. The
    * {@link auth.ActionCodeSettings `ActionCodeSettings`} object provided
    * as an argument to this method defines whether the link is to be handled by a
    * mobile app or browser along with additional state information to be passed in
    * the deep link, etc.
    *
    * @example
    * ```javascript
    * var actionCodeSettings = {
    *   // The URL to redirect to for sign-in completion. This is also the deep
    *   // link for mobile redirects. The domain (www.example.com) for this URL
    *   // must be whitelisted in the Firebase Console.
    *   url: 'https://www.example.com/finishSignUp?cartId=1234',
    *   iOS: {
    *     bundleId: 'com.example.ios'
    *   },
    *   android: {
    *     packageName: 'com.example.android',
    *     installApp: true,
    *     minimumVersion: '12'
    *   },
    *   // This must be true.
    *   handleCodeInApp: true,
    *   dynamicLinkDomain: 'custom.page.link'
    * };
    * admin.auth()
    *     .generateSignInWithEmailLink('user@example.com', actionCodeSettings)
    *     .then(function(link) {
    *       // The link was successfully generated.
    *     })
    *     .catch(function(error) {
    *       // Some error occurred, you can inspect the code: error.code
    *     });
    * ```
    *
    * @param email The email account to sign in with.
    * @param actionCodeSettings The action
    *     code settings. These settings provide Firebase with instructions on how
    *     to construct the email link. This includes the sign in completion URL or
    *     the deep link for redirects and the mobile apps to use when the
    *     sign-in link is opened on an Android or iOS device.
    *     Mobile app redirects are only applicable if the developer configures
    *     and accepts the Firebase Dynamic Links terms of service.
    *     The Android package name and iOS bundle ID are respected only if they
    *     are configured in the same Firebase Auth project.
    * @return A promise that resolves with the generated link.
    */
  def generateSignInWithEmailLink(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[String] = js.native
  
  /**
    * Looks up an Auth provider configuration by the provided ID.
    * Returns a promise that resolves with the provider configuration
    * corresponding to the provider ID specified. If the specified ID does not
    * exist, an `auth/configuration-not-found` error is thrown.
    *
    * SAML and OIDC provider support requires Google Cloud's Identity Platform
    * (GCIP). To learn more about GCIP, including pricing and features,
    * see the [GCIP documentation](https://cloud.google.com/identity-platform).
    *
    * @param providerId The provider ID corresponding to the provider
    *     config to return.
    * @return A promise that resolves
    *     with the configuration corresponding to the provided ID.
    */
  def getProviderConfig(providerId: String): js.Promise[AuthProviderConfig] = js.native
  
  /**
    * Gets the user data for the user corresponding to a given `uid`.
    *
    * See [Retrieve user data](/docs/auth/admin/manage-users#retrieve_user_data)
    * for code samples and detailed documentation.
    *
    * @param uid The `uid` corresponding to the user whose data to fetch.
    *
    * @return A promise fulfilled with the user
    *   data corresponding to the provided `uid`.
    */
  def getUser(uid: String): js.Promise[UserRecord] = js.native
  
  /**
    * Gets the user data for the user corresponding to a given email.
    *
    * See [Retrieve user data](/docs/auth/admin/manage-users#retrieve_user_data)
    * for code samples and detailed documentation.
    *
    * @param email The email corresponding to the user whose data to
    *   fetch.
    *
    * @return A promise fulfilled with the user
    *   data corresponding to the provided email.
    */
  def getUserByEmail(email: String): js.Promise[UserRecord] = js.native
  
  /**
    * Gets the user data for the user corresponding to a given phone number. The
    * phone number has to conform to the E.164 specification.
    *
    * See [Retrieve user data](/docs/auth/admin/manage-users#retrieve_user_data)
    * for code samples and detailed documentation.
    *
    * @param phoneNumber The phone number corresponding to the user whose
    *   data to fetch.
    *
    * @return A promise fulfilled with the user
    *   data corresponding to the provided phone number.
    */
  def getUserByPhoneNumber(phoneNumber: String): js.Promise[UserRecord] = js.native
  
  /**
    * Gets the user data corresponding to the specified identifiers.
    *
    * There are no ordering guarantees; in particular, the nth entry in the result list is not
    * guaranteed to correspond to the nth entry in the input parameters list.
    *
    * Only a maximum of 100 identifiers may be supplied. If more than 100 identifiers are supplied,
    * this method throws a FirebaseAuthError.
    *
    * @param identifiers The identifiers used to indicate which user records should be returned.
    *     Must have <= 100 entries.
    * @return {Promise<GetUsersResult>} A promise that resolves to the corresponding user records.
    * @throws FirebaseAuthError If any of the identifiers are invalid or if more than 100
    *     identifiers are specified.
    */
  def getUsers(identifiers: js.Array[UserIdentifier]): js.Promise[GetUsersResult] = js.native
  
  /**
    * Imports the provided list of users into Firebase Auth.
    * A maximum of 1000 users are allowed to be imported one at a time.
    * When importing users with passwords,
    * {@link auth.UserImportOptions `UserImportOptions`} are required to be
    * specified.
    * This operation is optimized for bulk imports and will ignore checks on `uid`,
    * `email` and other identifier uniqueness which could result in duplications.
    *
    * @param users The list of user records to import to Firebase Auth.
    * @param options The user import options, required when the users provided include
    *   password credentials.
    * @return A promise that resolves when
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
    * see the [GCIP documentation](https://cloud.google.com/identity-platform).
    *
    * @param options The provider config filter to apply.
    * @return A promise that resolves with the list of provider configs meeting the
    *   filter requirements.
    */
  def listProviderConfigs(options: AuthProviderConfigFilter): js.Promise[ListProviderConfigResults] = js.native
  
  /**
    * Retrieves a list of users (single batch only) with a size of `maxResults`
    * starting from the offset as specified by `pageToken`. This is used to
    * retrieve all the users of a specified project in batches.
    *
    * See [List all users](/docs/auth/admin/manage-users#list_all_users)
    * for code samples and detailed documentation.
    *
    * @param maxResults The page size, 1000 if undefined. This is also
    *   the maximum allowed limit.
    * @param pageToken The next page token. If not specified, returns
    *   users starting without any offset.
    * @return A promise that resolves with
    *   the current batch of downloaded users and the next page token.
    */
  def listUsers(): js.Promise[ListUsersResult] = js.native
  def listUsers(maxResults: js.UndefOr[scala.Nothing], pageToken: String): js.Promise[ListUsersResult] = js.native
  def listUsers(maxResults: Double): js.Promise[ListUsersResult] = js.native
  def listUsers(maxResults: Double, pageToken: String): js.Promise[ListUsersResult] = js.native
  
  /**
    * Revokes all refresh tokens for an existing user.
    *
    * This API will update the user's
    * {@link auth.UserRecord.tokensValidAfterTime `tokensValidAfterTime`} to
    * the current UTC. It is important that the server on which this is called has
    * its clock set correctly and synchronized.
    *
    * While this will revoke all sessions for a specified user and disable any
    * new ID tokens for existing sessions from getting minted, existing ID tokens
    * may remain active until their natural expiration (one hour). To verify that
    * ID tokens are revoked, use
    * {@link auth.Auth.verifyIdToken `verifyIdToken(idToken, true)`}
    * where `checkRevoked` is set to true.
    *
    * @param uid The `uid` corresponding to the user whose refresh tokens
    *   are to be revoked.
    *
    * @return An empty promise fulfilled once the user's refresh
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
    * See
    * [Defining user roles and access levels](/docs/auth/admin/custom-claims)
    * for code samples and detailed documentation.
    *
    * @param uid The `uid` of the user to edit.
    * @param customUserClaims The developer claims to set. If null is
    *   passed, existing custom claims are deleted. Passing a custom claims payload
    *   larger than 1000 bytes will throw an error. Custom claims are added to the
    *   user's ID token which is transmitted on every authenticated request.
    *   For profile non-access related user attributes, use database or other
    *   separate storage systems.
    * @return A promise that resolves when the operation completes
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
    * see the [GCIP documentation](https://cloud.google.com/identity-platform).
    *
    * @param providerId The provider ID corresponding to the provider
    *     config to update.
    * @param updatedConfig The updated configuration.
    * @return A promise that resolves with the updated provider configuration.
    */
  def updateProviderConfig(providerId: String, updatedConfig: UpdateAuthProviderRequest): js.Promise[AuthProviderConfig] = js.native
  
  /**
    * Updates an existing user.
    *
    * See [Update a user](/docs/auth/admin/manage-users#update_a_user) for code
    * samples and detailed documentation.
    *
    * @param uid The `uid` corresponding to the user to update.
    * @param properties The properties to update on
    *   the provided user.
    *
    * @return A promise fulfilled with the
    *   updated user data.
    */
  def updateUser(uid: String, properties: UpdateRequest): js.Promise[UserRecord] = js.native
  
  /**
    * Verifies a Firebase ID token (JWT). If the token is valid, the promise is
    * fulfilled with the token's decoded claims; otherwise, the promise is
    * rejected.
    * An optional flag can be passed to additionally check whether the ID token
    * was revoked.
    *
    * See [Verify ID Tokens](/docs/auth/admin/verify-id-tokens) for code samples
    * and detailed documentation.
    *
    * @param idToken The ID token to verify.
    * @param checkRevoked Whether to check if the ID token was revoked.
    *   This requires an extra request to the Firebase Auth backend to check
    *   the `tokensValidAfterTime` time for the corresponding user.
    *   When not specified, this additional check is not applied.
    *
    * @return A promise fulfilled with the
    *   token's decoded claims if the ID token is valid; otherwise, a rejected
    *   promise.
    */
  def verifyIdToken(idToken: String): js.Promise[DecodedIdToken] = js.native
  def verifyIdToken(idToken: String, checkRevoked: Boolean): js.Promise[DecodedIdToken] = js.native
  
  /**
    * Verifies a Firebase session cookie. Returns a Promise with the cookie claims.
    * Rejects the promise if the cookie could not be verified. If `checkRevoked` is
    * set to true, verifies if the session corresponding to the session cookie was
    * revoked. If the corresponding user's session was revoked, an
    * `auth/session-cookie-revoked` error is thrown. If not specified the check is
    * not performed.
    *
    * See [Verify Session Cookies](/docs/auth/admin/manage-cookies#verify_session_cookie_and_check_permissions)
    * for code samples and detailed documentation
    *
    * @param sessionCookie The session cookie to verify.
    * @param checkForRevocation  Whether to check if the session cookie was
    *   revoked. This requires an extra request to the Firebase Auth backend to
    *   check the `tokensValidAfterTime` time for the corresponding user.
    *   When not specified, this additional check is not performed.
    *
    * @return A promise fulfilled with the
    *   session cookie's decoded claims if the session cookie is valid; otherwise,
    *   a rejected promise.
    */
  def verifySessionCookie(sessionCookie: String): js.Promise[DecodedIdToken] = js.native
  def verifySessionCookie(sessionCookie: String, checkForRevocation: Boolean): js.Promise[DecodedIdToken] = js.native
}
