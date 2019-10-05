package typings.googleDashAppsDashScriptDashOauth2.GoogleAppsScriptOAuth2

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashAppsDashScript.GoogleAppsScript.Cache.Cache
import typings.googleDashAppsDashScript.GoogleAppsScript.Properties.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Service extends js.Object {
  /**
    * Gets an access token for this service.
    * This token can be used in HTTP requests to the service's endpoint.
    * This method will throw an error if the user's access was not granted or has expired.
    */
  def getAccessToken(): String = js.native
  /**
    * Gets the authorization URL.
    * The first step in getting an OAuth2 token is to have the user visit this URL
    * and approve the authorization request. The user will then be redirected back to your
    * application using callback function name specified, so that the flow may continue.
    */
  def getAuthorizationUrl(): String = js.native
  /**
    * Gets the last error that occurred this execution when trying to
    * automatically refresh or generate an access token.
    */
  def getLastError(): js.Any = js.native
  /**
    * Returns the redirect URI that will be used for this service.
    * Often this URI needs to be entered into a configuration screen of your OAuth provider.
    */
  def getRedirectUri(): String = js.native
  /**
    * Gets the token from the service's property store or cache.
    */
  def getToken(): js.Object | Null = js.native
  /**
    * Completes the OAuth2 flow using the request data passed in to the callback function.
    */
  def handleCallback(callbackRequest: js.Object): Boolean = js.native
  /**
    * Determines if the service has access (has been authorized and hasn't expired).
    * If offline access was granted and the previous token has expired this method attempts
    * to generate a new token.
    */
  def hasAccess(): Boolean = js.native
  /**
    * Refreshes a token that has expired.
    * This is only possible if offline access was requested when the token was authorized.
    */
  def refresh(): Unit = js.native
  /**
    * Resets the service, removing access and requiring the service to be re-authorized.
    */
  def reset(): Unit = js.native
  /**
    * Sets the service's authorization base URL (required).
    * For Google services this URL should be `https://accounts.google.com/o/oauth2/auth`.
    */
  def setAuthorizationBaseUrl(authorizationBaseUrl: String): OAuth2Service = js.native
  /**
    * Sets the cache to use when persisting credentials (optional).
    * Using a cache will reduce the need to read from the property store and may increase
    * performance. In most cases this should be a private cache, but a public cache may be
    * appropriate if you want to share access across users.
    */
  def setCache(cache: Cache): OAuth2Service = js.native
  /**
    * Sets the name of the authorization callback function (required).
    * This is the function that will be called when the user completes the authorization flow
    * on the service provider's website. The callback accepts a request parameter, which
    * should be passed to this service's `handleCallback()` method to complete the process.
    */
  def setCallbackFunction(callbackFunctionName: String): OAuth2Service = js.native
  /**
    * Sets the client ID to use for the OAuth flow (required).
    * You can create client IDs in the "Credentials" section of a Google Developers Console
    * project. Although you can use any project with this library, it may be convinient to use
    * the project that was created for your script. These projects are not visible if you
    * visit the console directly, but you can access it by click on the menu item
    * "Resources > Advanced Google services" in the Script Editor, and then click on the link
    * "Google Developers Console" in the resulting dialog.
    */
  def setClientId(clientId: String): OAuth2Service = js.native
  /**
    * Sets the client secret to use for the OAuth flow (required).
    * See the documentation for `setClientId()` for more information on how to create client IDs and secrets.
    */
  def setClientSecret(clientSecret: String): OAuth2Service = js.native
  /**
    * Sets number of minutes that a token obtained through Service Account authorization should be valid. Default: 60 minutes.
    */
  def setExpirationMinutes(expirationMinutes: String): OAuth2Service = js.native
  /**
    * Sets the issuer (iss) value to use for Service Account authorization.
    * If not set the client ID will be used instead.
    */
  def setIssuer(issuer: String): OAuth2Service = js.native
  /**
    * Sets an additional parameter to use when constructing the authorization URL (optional).
    * See the documentation for your service provider for information on what parameter values they support.
    */
  def setParam(name: String, value: String): OAuth2Service = js.native
  /**
    * Sets the private key to use for Service Account authorization.
    */
  def setPrivateKey(privateKey: String): OAuth2Service = js.native
  /**
    * Sets the property store to use when persisting credentials (required).
    * In most cases this should be user properties, but document or script properties may be appropriate
    * if you want to share access across users.
    */
  def setPropertyStore(propertyStore: Properties): OAuth2Service = js.native
  /**
    * Sets the scope or scopes to request during the authorization flow (optional).
    * If the scope value is an array it will be joined using the separator before being sent to the server,
    * which is is a space character by default.
    */
  def setScope(scope: String): OAuth2Service = js.native
  def setScope(scope: String, separator: String): OAuth2Service = js.native
  def setScope(scope: js.Array[String]): OAuth2Service = js.native
  def setScope(scope: js.Array[String], separator: String): OAuth2Service = js.native
  /**
    * Sets the subject (sub) value to use for Service Account authorization.
    */
  def setSubject(subject: String): OAuth2Service = js.native
  /**
    * Sets the format of the returned token. Default: `OAuth2.TOKEN_FORMAT.JSON`.
    */
  def setTokenFormat(tokenFormat: TokenFormat): OAuth2Service = js.native
  /**
    * Sets the additional HTTP headers that should be sent when retrieving or refreshing the access token.
    */
  def setTokenHeaders(tokenHeaders: StringDictionary[String]): OAuth2Service = js.native
  /**
    * Sets an additional function to invoke on the payload of the access token request.
    */
  def setTokenPayloadHandler(tokenHandler: js.Function1[/* tokenPayload */ TokenPayload, js.Object]): OAuth2Service = js.native
  /**
    * Sets the service's token URL (required).
    * For Google services this URL should be `https://accounts.google.com/o/oauth2/token`.
    */
  def setTokenUrl(tokenUrl: String): OAuth2Service = js.native
}

