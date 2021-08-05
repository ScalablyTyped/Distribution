package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABActionItem object.
  */
trait BootstrapClientFABActionItem
  extends StObject
     with ASPxClientFABActionItemBase {
  
  def GetBadgeCssClass(): String
  
  def GetBadgeIconCssClass(): String
  
  def GetBadgeText(): String
  
  def GetIconCssClass(): String
  
  def SetBadgeCssClass(cssClass: String): Unit
  
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  def SetBadgeText(text: String): Unit
  
  def SetIconCssClass(cssClass: String): Unit
}
object BootstrapClientFABActionItem {
  
  inline def apply(
    GetActionName: () => String,
    GetBadgeCssClass: () => String,
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetIconCssClass: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetBadgeCssClass: String => Unit,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetIconCssClass: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): BootstrapClientFABActionItem = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetBadgeCssClass = js.Any.fromFunction0(GetBadgeCssClass), GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeCssClass = js.Any.fromFunction1(SetBadgeCssClass), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
    __obj.asInstanceOf[BootstrapClientFABActionItem]
  }
  
  extension [Self <: BootstrapClientFABActionItem](x: Self) {
    
    inline def setGetBadgeCssClass(value: () => String): Self = StObject.set(x, "GetBadgeCssClass", js.Any.fromFunction0(value))
    
    inline def setGetBadgeIconCssClass(value: () => String): Self = StObject.set(x, "GetBadgeIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetBadgeText(value: () => String): Self = StObject.set(x, "GetBadgeText", js.Any.fromFunction0(value))
    
    inline def setGetIconCssClass(value: () => String): Self = StObject.set(x, "GetIconCssClass", js.Any.fromFunction0(value))
    
    inline def setSetBadgeCssClass(value: String => Unit): Self = StObject.set(x, "SetBadgeCssClass", js.Any.fromFunction1(value))
    
    inline def setSetBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetBadgeText(value: String => Unit): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1(value))
    
    inline def setSetIconCssClass(value: String => Unit): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1(value))
  }
}
