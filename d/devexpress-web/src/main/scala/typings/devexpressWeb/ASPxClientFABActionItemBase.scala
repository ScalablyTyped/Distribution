package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base class for classes that serves as a client-side equivalent of the floating action button's action and action item objects.
  */
trait ASPxClientFABActionItemBase extends StObject {
  
  /**
    * Gets the action item's name.
    */
  def GetActionName(): String
  
  /**
    * Gets the action item's text.
    */
  def GetText(): String
  
  /**
    * Returns a value specifying whether an action item is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Specifies the action item's text.
    * @param value A string value that specifies the action item's text.
    */
  def SetText(value: String): Unit
  
  /**
    * Specifies the action item's visibility.
    * @param value true, if the action item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
}
object ASPxClientFABActionItemBase {
  
  inline def apply(
    GetActionName: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): ASPxClientFABActionItemBase = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
    __obj.asInstanceOf[ASPxClientFABActionItemBase]
  }
  
  extension [Self <: ASPxClientFABActionItemBase](x: Self) {
    
    inline def setGetActionName(value: () => String): Self = StObject.set(x, "GetActionName", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    inline def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1(value))
  }
}
