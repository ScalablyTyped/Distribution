package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABAction object.
  */
trait BootstrapClientFABAction
  extends StObject
     with ASPxClientFABAction {
  
  def GetActionIconCssClass(): String
  
  def GetBadgeCssClass(): String
  
  def GetBadgeIconCssClass(): String
  
  def GetBadgeText(): String
  
  def GetCollapseIconCssClass(): String
  
  def GetExpandIconCssClass(): String
  
  def SetActionIconCssClass(cssClass: String): Unit
  
  def SetBadgeCssClass(cssClass: String): Unit
  
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  def SetBadgeText(text: String): Unit
  
  def SetCollapseIconCssClass(cssClass: String): Unit
  
  def SetExpandIconCssClass(cssClass: String): Unit
}
object BootstrapClientFABAction {
  
  inline def apply(
    GetActionIconCssClass: () => String,
    GetActionItem: Double => ASPxClientFABActionItem,
    GetActionItemByName: String => ASPxClientFABActionItem,
    GetActionItemCount: () => Double,
    GetActionName: () => String,
    GetBadgeCssClass: () => String,
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetCollapseIconCssClass: () => String,
    GetContextName: () => String,
    GetExpandIconCssClass: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetActionIconCssClass: String => Unit,
    SetBadgeCssClass: String => Unit,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetCollapseIconCssClass: String => Unit,
    SetExpandIconCssClass: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): BootstrapClientFABAction = {
    val __obj = js.Dynamic.literal(GetActionIconCssClass = js.Any.fromFunction0(GetActionIconCssClass), GetActionItem = js.Any.fromFunction1(GetActionItem), GetActionItemByName = js.Any.fromFunction1(GetActionItemByName), GetActionItemCount = js.Any.fromFunction0(GetActionItemCount), GetActionName = js.Any.fromFunction0(GetActionName), GetBadgeCssClass = js.Any.fromFunction0(GetBadgeCssClass), GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetCollapseIconCssClass = js.Any.fromFunction0(GetCollapseIconCssClass), GetContextName = js.Any.fromFunction0(GetContextName), GetExpandIconCssClass = js.Any.fromFunction0(GetExpandIconCssClass), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetActionIconCssClass = js.Any.fromFunction1(SetActionIconCssClass), SetBadgeCssClass = js.Any.fromFunction1(SetBadgeCssClass), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetCollapseIconCssClass = js.Any.fromFunction1(SetCollapseIconCssClass), SetExpandIconCssClass = js.Any.fromFunction1(SetExpandIconCssClass), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
    __obj.asInstanceOf[BootstrapClientFABAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapClientFABAction] (val x: Self) extends AnyVal {
    
    inline def setGetActionIconCssClass(value: () => String): Self = StObject.set(x, "GetActionIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetBadgeCssClass(value: () => String): Self = StObject.set(x, "GetBadgeCssClass", js.Any.fromFunction0(value))
    
    inline def setGetBadgeIconCssClass(value: () => String): Self = StObject.set(x, "GetBadgeIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetBadgeText(value: () => String): Self = StObject.set(x, "GetBadgeText", js.Any.fromFunction0(value))
    
    inline def setGetCollapseIconCssClass(value: () => String): Self = StObject.set(x, "GetCollapseIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetExpandIconCssClass(value: () => String): Self = StObject.set(x, "GetExpandIconCssClass", js.Any.fromFunction0(value))
    
    inline def setSetActionIconCssClass(value: String => Unit): Self = StObject.set(x, "SetActionIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetBadgeCssClass(value: String => Unit): Self = StObject.set(x, "SetBadgeCssClass", js.Any.fromFunction1(value))
    
    inline def setSetBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetBadgeText(value: String => Unit): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1(value))
    
    inline def setSetCollapseIconCssClass(value: String => Unit): Self = StObject.set(x, "SetCollapseIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetExpandIconCssClass(value: String => Unit): Self = StObject.set(x, "SetExpandIconCssClass", js.Any.fromFunction1(value))
  }
}
