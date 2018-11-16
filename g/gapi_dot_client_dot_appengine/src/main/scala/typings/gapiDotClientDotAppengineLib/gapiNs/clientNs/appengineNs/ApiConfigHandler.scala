package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApiConfigHandler extends js.Object {
  /** Action to take when users access resources that require authentication. Defaults to redirect. */
  var authFailAction: js.UndefOr[java.lang.String] = js.undefined
  /** Level of login required to access this resource. Defaults to optional. */
  var login: js.UndefOr[java.lang.String] = js.undefined
  /** Path to the script from the application root directory. */
  var script: js.UndefOr[java.lang.String] = js.undefined
  /** Security (HTTPS) enforcement for this URL. */
  var securityLevel: js.UndefOr[java.lang.String] = js.undefined
  /** URL to serve the endpoint at. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

