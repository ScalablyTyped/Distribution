package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * URL pattern and description of how the URL should be handled. App Engine
  * can handle URLs by executing application code or by serving static files
  * uploaded with the version, such as images, CSS, or JavaScript.
  */
@js.native
trait Schema$UrlMap extends js.Object {
  /**
    * Uses API Endpoints to handle requests.
    */
  var apiEndpoint: js.UndefOr[Schema$ApiEndpointHandler] = js.native
  /**
    * Action to take when users access resources that require authentication.
    * Defaults to redirect.
    */
  var authFailAction: js.UndefOr[String] = js.native
  /**
    * Level of login required to access this resource. Not supported for
    * Node.js in the App Engine standard environment.
    */
  var login: js.UndefOr[String] = js.native
  /**
    * 30x code to use when performing redirects for the secure field. Defaults
    * to 302.
    */
  var redirectHttpResponseCode: js.UndefOr[String] = js.native
  /**
    * Executes a script to handle the requests that match this URL pattern.
    * Only the auto value is supported for Node.js in the App Engine standard
    * environment, for example &quot;script&quot;: &quot;auto&quot;.
    */
  var script: js.UndefOr[Schema$ScriptHandler] = js.native
  /**
    * Security (HTTPS) enforcement for this URL.
    */
  var securityLevel: js.UndefOr[String] = js.native
  /**
    * Returns the contents of a file, such as an image, as the response.
    */
  var staticFiles: js.UndefOr[Schema$StaticFilesHandler] = js.native
  /**
    * URL prefix. Uses regular expression syntax, which means regexp special
    * characters must be escaped, but should not contain groupings. All URLs
    * that begin with this prefix are handled by this handler, using the
    * portion of the URL after the prefix as part of the file path.
    */
  var urlRegex: js.UndefOr[String] = js.native
}

object Schema$UrlMap {
  @scala.inline
  def apply(
    apiEndpoint: Schema$ApiEndpointHandler = null,
    authFailAction: String = null,
    login: String = null,
    redirectHttpResponseCode: String = null,
    script: Schema$ScriptHandler = null,
    securityLevel: String = null,
    staticFiles: Schema$StaticFilesHandler = null,
    urlRegex: String = null
  ): Schema$UrlMap = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (authFailAction != null) __obj.updateDynamic("authFailAction")(authFailAction.asInstanceOf[js.Any])
    if (login != null) __obj.updateDynamic("login")(login.asInstanceOf[js.Any])
    if (redirectHttpResponseCode != null) __obj.updateDynamic("redirectHttpResponseCode")(redirectHttpResponseCode.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (securityLevel != null) __obj.updateDynamic("securityLevel")(securityLevel.asInstanceOf[js.Any])
    if (staticFiles != null) __obj.updateDynamic("staticFiles")(staticFiles.asInstanceOf[js.Any])
    if (urlRegex != null) __obj.updateDynamic("urlRegex")(urlRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlMap]
  }
}

