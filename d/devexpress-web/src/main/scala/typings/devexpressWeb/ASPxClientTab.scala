package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a tab control's Tab or a page control's TabPage object.
  */
@js.native
trait ASPxClientTab extends StObject {
  
  /**
    * Returns the URL pointing to the image displayed within the active tab.
    */
  def GetActiveImageUrl(): String = js.native
  
  /**
    * Returns a value specifying whether a tab is enabled.
    */
  def GetEnabled(): Boolean = js.native
  
  /**
    * Returns the URL pointing to the image displayed within the tab.
    */
  def GetImageUrl(): String = js.native
  
  /**
    * Gets an URL which defines the navigation location for the tab.
    */
  def GetNavigateUrl(): String = js.native
  
  /**
    * Returns text displayed within the tab.
    */
  def GetText(): String = js.native
  
  /**
    * Returns a value specifying whether a tab is displayed.
    */
  def GetVisible(): Boolean = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the active tab.
    * @param value A string value that is the URL to the image displayed within the active tab.
    */
  def SetActiveImageUrl(value: String): Unit = js.native
  
  /**
    * Specifies whether the tab is enabled.
    * @param value true to enable the tab; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the tab.
    * @param value A string value that is the URL to the image displayed within the tab.
    */
  def SetImageUrl(value: String): Unit = js.native
  
  /**
    * Specifies a URL which defines the navigation location for the tab.
    * @param value A string value which is a URL to where the client web browser will navigate when the tab is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  
  /**
    * Specifies the text displayed within the tab.
    * @param value A string value that is the text displayed within the tab.
    */
  def SetText(value: String): Unit = js.native
  
  /**
    * Specifies whether the tab is visible.
    * @param value true is the tab is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
  
  /**
    * Gets the index of the current tab (tabbed page) within the control's collection of tabs (tabbed pages).
    */
  var index: Double = js.native
  
  /**
    * Gets the name that uniquely identifies the current tab.
    */
  var name: String = js.native
  
  /**
    * Gets the tab control to which the current tab belongs.
    */
  var tabControl: ASPxClientTabControlBase = js.native
}
object ASPxClientTab {
  
  @scala.inline
  def apply(
    GetActiveImageUrl: () => String,
    GetEnabled: () => Boolean,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetActiveImageUrl: String => Unit,
    SetEnabled: Boolean => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    name: String,
    tabControl: ASPxClientTabControlBase
  ): ASPxClientTab = {
    val __obj = js.Dynamic.literal(GetActiveImageUrl = js.Any.fromFunction0(GetActiveImageUrl), GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetActiveImageUrl = js.Any.fromFunction1(SetActiveImageUrl), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tabControl = tabControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTab]
  }
  
  @scala.inline
  implicit class ASPxClientTabMutableBuilder[Self <: ASPxClientTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetActiveImageUrl(value: () => String): Self = StObject.set(x, "GetActiveImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImageUrl(value: () => String): Self = StObject.set(x, "GetImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNavigateUrl(value: () => String): Self = StObject.set(x, "GetNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetActiveImageUrl(value: String => Unit): Self = StObject.set(x, "SetActiveImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabControl(value: ASPxClientTabControlBase): Self = StObject.set(x, "tabControl", value.asInstanceOf[js.Any])
  }
}
