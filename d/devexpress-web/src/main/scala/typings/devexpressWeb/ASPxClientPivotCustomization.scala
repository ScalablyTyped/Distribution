package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxPivotCustomizationControl control.
  */
trait ASPxClientPivotCustomization
  extends StObject
     with ASPxClientControl {
  
  /**
    * Returns an HTML element that represents the root of the control's hierarchy.
    */
  def GetMainContainer(): Any
  
  /**
    * Returns a client-side equivalent of the owner Pivot Grid Control.
    */
  def GetPivotGrid(): ASPxClientPivotGrid
  
  /**
    * Specifies the Customization Control's layout.
    * @param layout A string that specifies the Customization Control's layout.
    */
  def SetLayout(layout: String): Unit
  
  /**
    * Recalculates the Customization Control height.
    */
  def UpdateHeight(): Unit
}
object ASPxClientPivotCustomization {
  
  inline def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainContainer: () => Any,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetPivotGrid: () => ASPxClientPivotGrid,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetLayout: String => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    UpdateHeight: () => Unit,
    name: String
  ): ASPxClientPivotCustomization = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainContainer = js.Any.fromFunction0(GetMainContainer), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetPivotGrid = js.Any.fromFunction0(GetPivotGrid), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetLayout = js.Any.fromFunction1(SetLayout), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), UpdateHeight = js.Any.fromFunction0(UpdateHeight), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPivotCustomization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientPivotCustomization] (val x: Self) extends AnyVal {
    
    inline def setGetMainContainer(value: () => Any): Self = StObject.set(x, "GetMainContainer", js.Any.fromFunction0(value))
    
    inline def setGetPivotGrid(value: () => ASPxClientPivotGrid): Self = StObject.set(x, "GetPivotGrid", js.Any.fromFunction0(value))
    
    inline def setSetLayout(value: String => Unit): Self = StObject.set(x, "SetLayout", js.Any.fromFunction1(value))
    
    inline def setUpdateHeight(value: () => Unit): Self = StObject.set(x, "UpdateHeight", js.Any.fromFunction0(value))
  }
}
