package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackOptions extends StObject {
  
  /**
    * Callback to call with the result instead of returning the result directly.
    */
  def callback(): Unit
  def callback(err: Unit, value: js.Array[Change]): Unit
  /**
    * Callback to call with the result instead of returning the result directly.
    */
  @JSName("callback")
  var callback_Original: Callback
}
object CallbackOptions {
  
  @scala.inline
  def apply(callback: (/* err */ Unit, /* value */ js.UndefOr[js.Array[Change]]) => Unit): CallbackOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback))
    __obj.asInstanceOf[CallbackOptions]
  }
  
  @scala.inline
  implicit class CallbackOptionsMutableBuilder[Self <: CallbackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: (/* err */ Unit, /* value */ js.UndefOr[js.Array[Change]]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
  }
}
