package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
@js.native
trait ASPxClientHintWindow extends StObject {
  
  /**
    * Sets the hint's content.
    * @param html An object that specifies the hint content.
    * @param options An  object that specifies the hint's options.
    */
  def SetContent(html: js.Any, options: ASPxClientHintOptions): Unit = js.native
  
  /**
    * Set the hint's loading animation
    */
  def SetContentLoading(): Unit = js.native
  
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  def UpdatePosition(): Unit = js.native
}
object ASPxClientHintWindow {
  
  @scala.inline
  def apply(
    SetContent: (js.Any, ASPxClientHintOptions) => Unit,
    SetContentLoading: () => Unit,
    UpdatePosition: () => Unit
  ): ASPxClientHintWindow = {
    val __obj = js.Dynamic.literal(SetContent = js.Any.fromFunction2(SetContent), SetContentLoading = js.Any.fromFunction0(SetContentLoading), UpdatePosition = js.Any.fromFunction0(UpdatePosition))
    __obj.asInstanceOf[ASPxClientHintWindow]
  }
  
  @scala.inline
  implicit class ASPxClientHintWindowMutableBuilder[Self <: ASPxClientHintWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetContent(value: (js.Any, ASPxClientHintOptions) => Unit): Self = StObject.set(x, "SetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetContentLoading(value: () => Unit): Self = StObject.set(x, "SetContentLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdatePosition(value: () => Unit): Self = StObject.set(x, "UpdatePosition", js.Any.fromFunction0(value))
  }
}
