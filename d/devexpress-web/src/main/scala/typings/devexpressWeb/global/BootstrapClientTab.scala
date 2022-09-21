package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a tab control's BootstrapTab or a page control's BootstrapTabPage object.
  */
@JSGlobal("BootstrapClientTab")
@js.native
open class BootstrapClientTab ()
  extends StObject
     with typings.devexpressWeb.BootstrapClientTab {
  
  /**
    * Gets the CSS class of an icon displayed by the tab when it is active.
    */
  /* CompleteClass */
  override def GetActiveIconCssClass(): String = js.native
  
  /**
    * Returns the URL pointing to the image displayed within the active tab.
    */
  /* CompleteClass */
  override def GetActiveImageUrl(): String = js.native
  
  /**
    * Gets the CSS class of the icon displayed within the tab badge.
    */
  /* CompleteClass */
  override def GetBadgeIconCssClass(): String = js.native
  
  /**
    * Gets the text displayed within the tab badge.
    */
  /* CompleteClass */
  override def GetBadgeText(): String = js.native
  
  /**
    * Returns a value specifying whether a tab is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Gets the CSS class of the icon displayed by the tab.
    */
  /* CompleteClass */
  override def GetIconCssClass(): String = js.native
  
  /**
    * Returns the URL pointing to the image displayed within the tab.
    */
  /* CompleteClass */
  override def GetImageUrl(): String = js.native
  
  /**
    * Gets an URL which defines the navigation location for the tab.
    */
  /* CompleteClass */
  override def GetNavigateUrl(): String = js.native
  
  /**
    * Returns text displayed within the tab.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  
  /**
    * Returns a value specifying whether a tab is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Sets the CSS class of an icon displayed by the tab when it is active.
    * @param cssClass A String containing the name of a CSS class.
    */
  /* CompleteClass */
  override def SetActiveIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the active tab.
    * @param value A string value that is the URL to the image displayed within the active tab.
    */
  /* CompleteClass */
  override def SetActiveImageUrl(value: String): Unit = js.native
  
  /**
    * Sets the CSS class of the icon displayed within the tab badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  /* CompleteClass */
  override def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Sets the text displayed within the tab badge.
    * @param text A String specifying the badge text.
    */
  /* CompleteClass */
  override def SetBadgeText(text: String): Unit = js.native
  
  /**
    * Specifies whether the tab is enabled.
    * @param value true to enable the tab; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Sets the CSS class of the icon displayed by the tab.
    * @param cssClass A string containing the name of a CSS class.
    */
  /* CompleteClass */
  override def SetIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the tab.
    * @param value A string value that is the URL to the image displayed within the tab.
    */
  /* CompleteClass */
  override def SetImageUrl(value: String): Unit = js.native
  
  /**
    * Specifies a URL which defines the navigation location for the tab.
    * @param value A string value which is a URL to where the client web browser will navigate when the tab is clicked.
    */
  /* CompleteClass */
  override def SetNavigateUrl(value: String): Unit = js.native
  
  /**
    * Specifies the text displayed within the tab.
    * @param value A string value that is the text displayed within the tab.
    */
  /* CompleteClass */
  override def SetText(value: String): Unit = js.native
  
  /**
    * Specifies whether the tab is visible.
    * @param value true is the tab is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
  
  /**
    * Gets the index of the current tab (tabbed page) within the control's collection of tabs (tabbed pages).
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets the name that uniquely identifies the current tab.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the tab control to which the current tab belongs.
    */
  /* CompleteClass */
  var tabControl: typings.devexpressWeb.ASPxClientTabControlBase = js.native
}
