package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxLoadingPanel control.
  */
trait ASPxClientLoadingPanel
  extends StObject
     with ASPxClientControl {
  
  /**
    * Gets the text displayed within the ASPxLoadingPanel.
    */
  def GetText(): String
  
  /**
    * Hides the loading panel.
    */
  def Hide(): Unit
  
  /**
    * Sets the text to be displayed within the ASPxLoadingPanel.
    * @param text A string value specifying the text to be displayed within the ASPxLoadingPanel.
    */
  def SetText(text: String): Unit
  
  /**
    * Invokes the loading panel.
    */
  def Show(): Unit
  
  /**
    * Invokes the loading panel at the specified position.
    * @param x An integer value specifying the x-coordinate of the loading panel's display position.
    * @param y An integer value specifying the y-coordinate of the loaidng panel's display position.
    */
  def ShowAtPos(x: Double, y: Double): Unit
  
  /**
    * Invokes the loading panel, displaying it over the specified HTML element.
    * @param htmlElement An object that specifies the required HTML element.
    */
  def ShowInElement(htmlElement: Any): Unit
  
  /**
    * Invokes the loading panel, displaying it over the specified element.
    * @param id A string that specifies the required element's identifier.
    */
  def ShowInElementByID(id: String): Unit
}
object ASPxClientLoadingPanel {
  
  inline def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetText: () => String,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    Hide: () => Unit,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Show: () => Unit,
    ShowAtPos: (Double, Double) => Unit,
    ShowInElement: Any => Unit,
    ShowInElementByID: String => Unit,
    name: String
  ): ASPxClientLoadingPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), Hide = js.Any.fromFunction0(Hide), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Show = js.Any.fromFunction0(Show), ShowAtPos = js.Any.fromFunction2(ShowAtPos), ShowInElement = js.Any.fromFunction1(ShowInElement), ShowInElementByID = js.Any.fromFunction1(ShowInElementByID), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLoadingPanel]
  }
  
  extension [Self <: ASPxClientLoadingPanel](x: Self) {
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "Hide", js.Any.fromFunction0(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
    
    inline def setShowAtPos(value: (Double, Double) => Unit): Self = StObject.set(x, "ShowAtPos", js.Any.fromFunction2(value))
    
    inline def setShowInElement(value: Any => Unit): Self = StObject.set(x, "ShowInElement", js.Any.fromFunction1(value))
    
    inline def setShowInElementByID(value: String => Unit): Self = StObject.set(x, "ShowInElementByID", js.Any.fromFunction1(value))
  }
}
