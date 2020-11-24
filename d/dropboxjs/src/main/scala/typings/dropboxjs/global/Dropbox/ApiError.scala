package typings.dropboxjs.global.Dropbox

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.ApiError")
@js.native
class ApiError protected ()
  extends typings.dropboxjs.Dropbox.ApiError {
  def this(xhr: XMLHttpRequest, method: String, url: String) = this()
}
/* static members */
@JSGlobal("Dropbox.ApiError")
@js.native
object ApiError extends js.Object {
  
  var CONFLICT: Double = js.native
  
  var INVALID_METHOD: Double = js.native
  
  var INVALID_PARAM: Double = js.native
  
  var INVALID_TOKEN: Double = js.native
  
  var NETWORK_ERROR: Double = js.native
  
  var NOT_ACCEPTABLE: Double = js.native
  
  var NOT_FOUND: Double = js.native
  
  var NO_CONTENT: Double = js.native
  
  var OAUTH_ERROR: Double = js.native
  
  var OVER_QUOTA: Double = js.native
  
  var RATE_LIMITED: Double = js.native
  
  var SERVER_ERROR: Double = js.native
}
