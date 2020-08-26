package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * URL pattern and description of how the URL should be handled. App Engine
  * can handle URLs by executing application code or by serving static files
  * uploaded with the version, such as images, CSS, or JavaScript.
  */
@js.native
trait SchemaUrlMap extends js.Object {
  /**
    * Uses API Endpoints to handle requests.
    */
  var apiEndpoint: js.UndefOr[SchemaApiEndpointHandler] = js.native
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
  var script: js.UndefOr[SchemaScriptHandler] = js.native
  /**
    * Security (HTTPS) enforcement for this URL.
    */
  var securityLevel: js.UndefOr[String] = js.native
  /**
    * Returns the contents of a file, such as an image, as the response.
    */
  var staticFiles: js.UndefOr[SchemaStaticFilesHandler] = js.native
  /**
    * URL prefix. Uses regular expression syntax, which means regexp special
    * characters must be escaped, but should not contain groupings. All URLs
    * that begin with this prefix are handled by this handler, using the
    * portion of the URL after the prefix as part of the file path.
    */
  var urlRegex: js.UndefOr[String] = js.native
}

object SchemaUrlMap {
  @scala.inline
  def apply(): SchemaUrlMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMap]
  }
  @scala.inline
  implicit class SchemaUrlMapOps[Self <: SchemaUrlMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiEndpoint(value: SchemaApiEndpointHandler): Self = this.set("apiEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiEndpoint: Self = this.set("apiEndpoint", js.undefined)
    @scala.inline
    def setAuthFailAction(value: String): Self = this.set("authFailAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthFailAction: Self = this.set("authFailAction", js.undefined)
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    @scala.inline
    def setRedirectHttpResponseCode(value: String): Self = this.set("redirectHttpResponseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectHttpResponseCode: Self = this.set("redirectHttpResponseCode", js.undefined)
    @scala.inline
    def setScript(value: SchemaScriptHandler): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    @scala.inline
    def setSecurityLevel(value: String): Self = this.set("securityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityLevel: Self = this.set("securityLevel", js.undefined)
    @scala.inline
    def setStaticFiles(value: SchemaStaticFilesHandler): Self = this.set("staticFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticFiles: Self = this.set("staticFiles", js.undefined)
    @scala.inline
    def setUrlRegex(value: String): Self = this.set("urlRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlRegex: Self = this.set("urlRegex", js.undefined)
  }
  
}

