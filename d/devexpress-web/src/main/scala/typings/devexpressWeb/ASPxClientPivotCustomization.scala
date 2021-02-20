package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxPivotCustomizationControl control.
  */
@js.native
trait ASPxClientPivotCustomization extends ASPxClientControl {
  
  /**
    * Returns an HTML element that represents the root of the control's hierarchy.
    */
  def GetMainContainer(): js.Any = js.native
  
  /**
    * Returns a client-side equivalent of the owner Pivot Grid Control.
    */
  def GetPivotGrid(): ASPxClientPivotGrid = js.native
  
  /**
    * Specifies the Customization Control's layout.
    * @param layout A string that specifies the Customization Control's layout.
    */
  def SetLayout(layout: String): Unit = js.native
  
  /**
    * Recalculates the Customization Control height.
    */
  def UpdateHeight(): Unit = js.native
}
object ASPxClientPivotCustomization {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainContainer: () => js.Any,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
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
  implicit class ASPxClientPivotCustomizationMutableBuilder[Self <: ASPxClientPivotCustomization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMainContainer(value: () => js.Any): Self = StObject.set(x, "GetMainContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPivotGrid(value: () => ASPxClientPivotGrid): Self = StObject.set(x, "GetPivotGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLayout(value: String => Unit): Self = StObject.set(x, "SetLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateHeight(value: () => Unit): Self = StObject.set(x, "UpdateHeight", js.Any.fromFunction0(value))
  }
}
