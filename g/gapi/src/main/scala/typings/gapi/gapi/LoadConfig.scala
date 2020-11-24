package typings.gapi.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadConfig extends js.Object {
  
  def callback(args: js.Any*): Unit = js.native
  @JSName("callback")
  var callback_Original: LoadCallback = js.native
  
  var onerror: js.UndefOr[js.Function] = js.native
  
  var ontimeout: js.UndefOr[js.Function] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
