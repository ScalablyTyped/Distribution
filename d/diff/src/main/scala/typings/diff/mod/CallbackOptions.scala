package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackOptions extends js.Object {
  
  /**
    * Callback to call with the result instead of returning the result directly.
    */
  def callback(): Unit = js.native
  def callback(err: js.UndefOr[scala.Nothing], value: js.Array[Change]): Unit = js.native
  /**
    * Callback to call with the result instead of returning the result directly.
    */
  @JSName("callback")
  var callback_Original: Callback = js.native
}
