package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a popup control's PopupWindow object.
  */
@JSGlobal("ASPxClientPopupWindow")
@js.native
open class ASPxClientPopupWindow ()
  extends StObject
     with typings.devexpressWeb.ASPxClientPopupWindow {
  
  /**
    * Returns the URL pointing to the image displayed within the window footer.
    */
  /* CompleteClass */
  override def GetFooterImageUrl(): String = js.native
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
    */
  /* CompleteClass */
  override def GetFooterNavigateUrl(): String = js.native
  
  /**
    * Returns the text displayed within the popup window's footer.
    */
  /* CompleteClass */
  override def GetFooterText(): String = js.native
  
  /**
    * Returns the URL pointing to the image displayed within the window header.
    */
  /* CompleteClass */
  override def GetHeaderImageUrl(): String = js.native
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
    */
  /* CompleteClass */
  override def GetHeaderNavigateUrl(): String = js.native
  
  /**
    * Returns the text displayed within the window's header.
    */
  /* CompleteClass */
  override def GetHeaderText(): String = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the window footer.
    * @param value A string value that is the URL to the image displayed within the window footer.
    */
  /* CompleteClass */
  override def SetFooterImageUrl(value: String): Unit = js.native
  
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
    * @param value A string value which specifies the required navigation location.
    */
  /* CompleteClass */
  override def SetFooterNavigateUrl(value: String): Unit = js.native
  
  /**
    * Specifies the text displayed within the window's footer.
    * @param value A string value that specifies the window's footer text.
    */
  /* CompleteClass */
  override def SetFooterText(value: String): Unit = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the window header.
    * @param value A string value that is the URL to the image displayed within the header.
    */
  /* CompleteClass */
  override def SetHeaderImageUrl(value: String): Unit = js.native
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
    * @param value A string value which specifies the required navigation location.
    */
  /* CompleteClass */
  override def SetHeaderNavigateUrl(value: String): Unit = js.native
  
  /**
    * Specifies the text displayed within the window's header.
    * @param value A string value that specifies the window's header text.
    */
  /* CompleteClass */
  override def SetHeaderText(value: String): Unit = js.native
  
  /**
    * Gets the index of the current popup window within the popup control's ASPxPopupControl.Windows collection.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets the name that uniquely identifies the current popup window.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the popup control to which the current popup window belongs.
    */
  /* CompleteClass */
  var popupControl: typings.devexpressWeb.ASPxClientPopupControl = js.native
}
