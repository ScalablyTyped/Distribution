package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UrlMap extends js.Object {
  /** Uses API Endpoints to handle requests. */
  var apiEndpoint: js.UndefOr[ApiEndpointHandler] = js.undefined
  /** Action to take when users access resources that require authentication. Defaults to redirect. */
  var authFailAction: js.UndefOr[java.lang.String] = js.undefined
  /** Level of login required to access this resource. */
  var login: js.UndefOr[java.lang.String] = js.undefined
  /** 30x code to use when performing redirects for the secure field. Defaults to 302. */
  var redirectHttpResponseCode: js.UndefOr[java.lang.String] = js.undefined
  /** Executes a script to handle the request that matches this URL pattern. */
  var script: js.UndefOr[ScriptHandler] = js.undefined
  /** Security (HTTPS) enforcement for this URL. */
  var securityLevel: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the contents of a file, such as an image, as the response. */
  var staticFiles: js.UndefOr[StaticFilesHandler] = js.undefined
  /**
               * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that
               * begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
               */
  var urlRegex: js.UndefOr[java.lang.String] = js.undefined
}

