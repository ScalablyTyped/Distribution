package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
@js.native
trait ASPxClientControl extends ASPxClientControlBase {
  
  /**
    * Modifies the control's size against the control's container.
    */
  def AdjustControl(): Unit = js.native
  
  /**
    * Returns the control's height.
    */
  def GetHeight(): Double = js.native
  
  /**
    * Returns the control's width.
    */
  def GetWidth(): Double = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  def SetHeight(height: Double): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  def SetWidth(width: Double): Unit = js.native
}
object ASPxClientControl {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientControl = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControl]
  }
  
  @scala.inline
  implicit class ASPxClientControlMutableBuilder[Self <: ASPxClientControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustControl(value: () => Unit): Self = StObject.set(x, "AdjustControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = StObject.set(x, "GetHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "GetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHeight(value: Double => Unit): Self = StObject.set(x, "SetHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidth(value: Double => Unit): Self = StObject.set(x, "SetWidth", js.Any.fromFunction1(value))
  }
}
