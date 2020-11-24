package typings.dropboxjs.global.Dropbox

import typings.dropboxjs.Dropbox.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.Client")
@js.native
class Client protected ()
  extends typings.dropboxjs.Dropbox.Client {
  def this(options: Credentials) = this()
}
/* static members */
@JSGlobal("Dropbox.Client")
@js.native
object Client extends js.Object {
  
  var AUTHORIZED: Double = js.native
  
  var DONE: Double = js.native
  
  var ERROR: Double = js.native
  
  var PARAM_LOADED: Double = js.native
  
  var PARAM_SET: Double = js.native
  
  var RESET: Double = js.native
  
  var SIGNED_OUT: Double = js.native
}
