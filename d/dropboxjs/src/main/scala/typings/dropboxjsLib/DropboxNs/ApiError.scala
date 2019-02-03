package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.ApiError")
@js.native
class ApiError protected () extends js.Object {
  def this(xhr: stdLib.XMLHttpRequest, method: java.lang.String, url: java.lang.String) = this()
  var method: java.lang.String = js.native
  var responseText: java.lang.String = js.native
  var status: scala.Double = js.native
  var url: java.lang.String = js.native
}

/* static members */
@JSGlobal("Dropbox.ApiError")
@js.native
object ApiError extends js.Object {
  var CONFLICT: scala.Double = js.native
  var INVALID_METHOD: scala.Double = js.native
  var INVALID_PARAM: scala.Double = js.native
  var INVALID_TOKEN: scala.Double = js.native
  var NETWORK_ERROR: scala.Double = js.native
  var NOT_ACCEPTABLE: scala.Double = js.native
  var NOT_FOUND: scala.Double = js.native
  var NO_CONTENT: scala.Double = js.native
  var OAUTH_ERROR: scala.Double = js.native
  var OVER_QUOTA: scala.Double = js.native
  var RATE_LIMITED: scala.Double = js.native
  var SERVER_ERROR: scala.Double = js.native
}

