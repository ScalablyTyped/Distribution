package typings.evernote.mod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service:    UserStore
  * <p>
  * The UserStore service is primarily used by EDAM clients to establish
  * authentication via username and password over a trusted connection (e.g.
  * SSL).    A client's first call to this interface should be checkVersion() to
  * ensure that the client's software is up to date.
  * </p>
  * All calls which require an authenticationToken may throw an
  * EDAMUserException for the following reasons:
  *    <ul>
  *     <li> AUTH_EXPIRED "authenticationToken" - token has expired
  *     <li> BAD_DATA_FORMAT "authenticationToken" - token is malformed
  *     <li> DATA_REQUIRED "authenticationToken" - token is empty
  *     <li> INVALID_AUTH "authenticationToken" - token signature is invalid
  * </ul>
  */
@JSImport("evernote", "Evernote.UserStoreClient")
@js.native
class UserStoreClient () extends js.Object {
  var seqid: Double = js.native
  /**
    * This is used to take an existing authentication token that grants access
    * to an individual user account (returned from 'authenticate',
    * 'authenticateLongSession' or an OAuth authorization) and obtain an additional
    * authentication token that may be used to access business notebooks if the user
    * is a member of an Evernote Business account.
    *
    * The resulting authentication token may be used to make NoteStore API calls
    * against the business using the NoteStore URL returned in the result.
    *
    * @param authenticationToken
    *     The authentication token for the user. This may not be a shared authentication
    *     token (returned by NoteStore.authenticateToSharedNotebook or
    *     NoteStore.authenticateToSharedNote) or a business authentication token.
    *
    * @return
    *     The result of the authentication, with the token granting access to the
    *     business in the result's 'authenticationToken' field. The URL that must
    *     be used to access the business account NoteStore will be returned in the
    *     result's 'noteStoreUrl' field.    The 'User' field will
    *     not be set in the result.
    *
    * @throws EDAMUserException <ul>
    *     <li> PERMISSION_DENIED "authenticationToken" - the provided authentication token
    *                is a shared or business authentication token. </li>
    *     <li> PERMISSION_DENIED "Business" - the user identified by the provided
    *                authentication token is not currently a member of a business. </li>
    *     <li> PERMISSION_DENIED "Business.status" - the business that the user is a
    *                member of is not currently in an active status. </li>
    * </ul>
    */
  def authenticateToBusiness(cb: Callback[AuthenticationResult]): Unit = js.native
  /**
    * This should be the first call made by a client to the EDAM service.    It
    * tells the service what protocol version is used by the client.    The
    * service will then return true if the client is capable of talking to
    * the service, and false if the client's protocol version is incompatible
    * with the service, so the client must upgrade.    If a client receives a
    * false value, it should report the incompatibility to the user and not
    * continue with any more EDAM requests (UserStore or NoteStore).
    *
    * @param clientName
    *     This string provides some information about the client for
    *     tracking/logging on the service.    It should provide information about
    *     the client's software and platform. The structure should be:
    *     application/version; platform/version; [ device/version ]
    *     E.g. "Evernote Windows/3.0.1; Windows/XP SP3".
    *
    * @param edamVersionMajor
    *     This should be the major protocol version that was compiled by the
    *     client.    This should be the current value of the EDAM_VERSION_MAJOR
    *     constant for the client.
    *
    * @param edamVersionMinor
    *     This should be the major protocol version that was compiled by the
    *     client.    This should be the current value of the EDAM_VERSION_MINOR
    *     constant for the client.
    */
  def checkVersion(clientName: String, edamVersionMajor: Double, edamVersionMinor: Double, cb: Callback[Boolean]): Unit = js.native
  /**
    * This provides bootstrap information to the client. Various bootstrap
    * profiles and settings may be used by the client to configure itself.
    *
    * @param locale
    *     The client's current locale, expressed in language[_country]
    *     format. E.g., "en_US". See ISO-639 and ISO-3166 for valid
    *     language and country codes.
    *
    * @return
    *     The bootstrap information suitable for this client.
    */
  def getBootstrapInfo(locale: String, cb: Callback[BootstrapInfo]): Unit = js.native
  /**
    * Returns the URL that should be used to talk to the NoteStore for the
    * account represented by the provided authenticationToken.
    * This method isn't needed by most clients, who can retrieve the correct
    * NoteStore URL from the AuthenticationResult returned from the authenticate
    * or refreshAuthentication calls. This method is typically only needed
    * to look up the correct URL for a long-lived session token (e.g. for an
    * OAuth web service).
    */
  def getNoteStoreUrl(cb: Callback[String]): Unit = js.native
  /**
    * Asks the UserStore about the publicly available location information for
    * a particular username.
    *
    * @throws EDAMUserException <ul>
    *     <li> DATA_REQUIRED "username" - username is empty
    * </ul>
    */
  def getPublicUserInfo(username: String, cb: Callback[PublicUserInfo]): Unit = js.native
  /**
    * Returns the User corresponding to the provided authentication token,
    * or throws an exception if this token is not valid.
    * The level of detail provided in the returned User structure depends on
    * the access level granted by the token, so a web service client may receive
    * fewer fields than an integrated desktop client.
    */
  def getUser(cb: Callback[User]): Unit = js.native
  /**
    * Revoke an existing long lived authentication token. This can be used to
    * revoke OAuth tokens or tokens created by calling authenticateLongSession,
    * and allows a user to effectively log out of Evernote from the perspective
    * of the application that holds the token. The authentication token that is
    * passed is immediately revoked and may not be used to call any authenticated
    * EDAM function.
    *
    * @param authenticationToken the authentication token to revoke.
    *
    * @throws EDAMUserException <ul>
    *     <li> DATA_REQUIRED "authenticationToken" - no authentication token provided
    *     <li> BAD_DATA_FORMAT "authenticationToken" - the authentication token is not well formed
    *     <li> INVALID_AUTH "authenticationToken" - the authentication token is invalid
    *     <li> AUTH_EXPIRED "authenticationToken" - the authentication token is expired or
    *         is already revoked.
    * </ul>
    */
  def revokeLongSession(cb: Callback[Unit]): Unit = js.native
}

