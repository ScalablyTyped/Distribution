package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthError")
@js.native
class AuthError protected () extends js.Object {
  def this(queryString: QueryParams) = this()
  var code: java.lang.String = js.native
  var description: java.lang.String = js.native
  var uri: java.lang.String = js.native
}

@JSGlobal("Dropbox.AuthError")
@js.native
object AuthError extends js.Object {
  var ACCESS_DENIED: java.lang.String = js.native
  var INVALID_GRANT: java.lang.String = js.native
  var INVALID_REQUEST: java.lang.String = js.native
  var INVALID_SCOPE: java.lang.String = js.native
  var SERVER_ERROR: java.lang.String = js.native
  var TEMPORARILY_UNAVAILABLE: java.lang.String = js.native
  var UNAUTHORIZED_CLIENT: java.lang.String = js.native
  var UNSUPPORTED_GRANT_TYPE: java.lang.String = js.native
  var UNSUPPORTED_RESPONSE_TYPE: java.lang.String = js.native
}

