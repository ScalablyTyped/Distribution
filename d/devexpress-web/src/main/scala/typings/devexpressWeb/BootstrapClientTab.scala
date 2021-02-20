package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a tab control's BootstrapTab or a page control's BootstrapTabPage object.
  */
@js.native
trait BootstrapClientTab extends ASPxClientTab {
  
  /**
    * Gets the CSS class of an icon displayed by the tab when it is active.
    */
  def GetActiveIconCssClass(): String = js.native
  
  /**
    * Gets the CSS class of the icon displayed within the tab badge.
    */
  def GetBadgeIconCssClass(): String = js.native
  
  /**
    * Gets the text displayed within the tab badge.
    */
  def GetBadgeText(): String = js.native
  
  /**
    * Gets the CSS class of the icon displayed by the tab.
    */
  def GetIconCssClass(): String = js.native
  
  /**
    * Sets the CSS class of an icon displayed by the tab when it is active.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetActiveIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Sets the CSS class of the icon displayed within the tab badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Sets the text displayed within the tab badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit = js.native
  
  /**
    * Sets the CSS class of the icon displayed by the tab.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit = js.native
}
object BootstrapClientTab {
  
  @scala.inline
  def apply(
    GetActiveIconCssClass: () => String,
    GetActiveImageUrl: () => String,
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetEnabled: () => Boolean,
    GetIconCssClass: () => String,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetActiveIconCssClass: String => Unit,
    SetActiveImageUrl: String => Unit,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetEnabled: Boolean => Unit,
    SetIconCssClass: String => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    name: String,
    tabControl: ASPxClientTabControlBase
  ): BootstrapClientTab = {
    val __obj = js.Dynamic.literal(GetActiveIconCssClass = js.Any.fromFunction0(GetActiveIconCssClass), GetActiveImageUrl = js.Any.fromFunction0(GetActiveImageUrl), GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetEnabled = js.Any.fromFunction0(GetEnabled), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetActiveIconCssClass = js.Any.fromFunction1(SetActiveIconCssClass), SetActiveImageUrl = js.Any.fromFunction1(SetActiveImageUrl), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetEnabled = js.Any.fromFunction1(SetEnabled), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tabControl = tabControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTab]
  }
  
  @scala.inline
  implicit class BootstrapClientTabMutableBuilder[Self <: BootstrapClientTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetActiveIconCssClass(value: () => String): Self = StObject.set(x, "GetActiveIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBadgeIconCssClass(value: () => String): Self = StObject.set(x, "GetBadgeIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBadgeText(value: () => String): Self = StObject.set(x, "GetBadgeText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIconCssClass(value: () => String): Self = StObject.set(x, "GetIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActiveIconCssClass(value: String => Unit): Self = StObject.set(x, "SetActiveIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBadgeText(value: String => Unit): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconCssClass(value: String => Unit): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1(value))
  }
}
