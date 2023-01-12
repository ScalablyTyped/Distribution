package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a popup control's PopupWindow object.
  */
trait ASPxClientPopupWindow extends StObject {
  
  /**
    * Returns the URL pointing to the image displayed within the window footer.
    */
  def GetFooterImageUrl(): String
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
    */
  def GetFooterNavigateUrl(): String
  
  /**
    * Returns the text displayed within the popup window's footer.
    */
  def GetFooterText(): String
  
  /**
    * Returns the URL pointing to the image displayed within the window header.
    */
  def GetHeaderImageUrl(): String
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
    */
  def GetHeaderNavigateUrl(): String
  
  /**
    * Returns the text displayed within the window's header.
    */
  def GetHeaderText(): String
  
  /**
    * Specifies the URL which points to the image displayed within the window footer.
    * @param value A string value that is the URL to the image displayed within the window footer.
    */
  def SetFooterImageUrl(value: String): Unit
  
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
    * @param value A string value which specifies the required navigation location.
    */
  def SetFooterNavigateUrl(value: String): Unit
  
  /**
    * Specifies the text displayed within the window's footer.
    * @param value A string value that specifies the window's footer text.
    */
  def SetFooterText(value: String): Unit
  
  /**
    * Specifies the URL which points to the image displayed within the window header.
    * @param value A string value that is the URL to the image displayed within the header.
    */
  def SetHeaderImageUrl(value: String): Unit
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
    * @param value A string value which specifies the required navigation location.
    */
  def SetHeaderNavigateUrl(value: String): Unit
  
  /**
    * Specifies the text displayed within the window's header.
    * @param value A string value that specifies the window's header text.
    */
  def SetHeaderText(value: String): Unit
  
  /**
    * Gets the index of the current popup window within the popup control's ASPxPopupControl.Windows collection.
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the current popup window.
    */
  var name: String
  
  /**
    * Gets the popup control to which the current popup window belongs.
    */
  var popupControl: ASPxClientPopupControl
}
object ASPxClientPopupWindow {
  
  inline def apply(
    GetFooterImageUrl: () => String,
    GetFooterNavigateUrl: () => String,
    GetFooterText: () => String,
    GetHeaderImageUrl: () => String,
    GetHeaderNavigateUrl: () => String,
    GetHeaderText: () => String,
    SetFooterImageUrl: String => Unit,
    SetFooterNavigateUrl: String => Unit,
    SetFooterText: String => Unit,
    SetHeaderImageUrl: String => Unit,
    SetHeaderNavigateUrl: String => Unit,
    SetHeaderText: String => Unit,
    index: Double,
    name: String,
    popupControl: ASPxClientPopupControl
  ): ASPxClientPopupWindow = {
    val __obj = js.Dynamic.literal(GetFooterImageUrl = js.Any.fromFunction0(GetFooterImageUrl), GetFooterNavigateUrl = js.Any.fromFunction0(GetFooterNavigateUrl), GetFooterText = js.Any.fromFunction0(GetFooterText), GetHeaderImageUrl = js.Any.fromFunction0(GetHeaderImageUrl), GetHeaderNavigateUrl = js.Any.fromFunction0(GetHeaderNavigateUrl), GetHeaderText = js.Any.fromFunction0(GetHeaderText), SetFooterImageUrl = js.Any.fromFunction1(SetFooterImageUrl), SetFooterNavigateUrl = js.Any.fromFunction1(SetFooterNavigateUrl), SetFooterText = js.Any.fromFunction1(SetFooterText), SetHeaderImageUrl = js.Any.fromFunction1(SetHeaderImageUrl), SetHeaderNavigateUrl = js.Any.fromFunction1(SetHeaderNavigateUrl), SetHeaderText = js.Any.fromFunction1(SetHeaderText), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popupControl = popupControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientPopupWindow] (val x: Self) extends AnyVal {
    
    inline def setGetFooterImageUrl(value: () => String): Self = StObject.set(x, "GetFooterImageUrl", js.Any.fromFunction0(value))
    
    inline def setGetFooterNavigateUrl(value: () => String): Self = StObject.set(x, "GetFooterNavigateUrl", js.Any.fromFunction0(value))
    
    inline def setGetFooterText(value: () => String): Self = StObject.set(x, "GetFooterText", js.Any.fromFunction0(value))
    
    inline def setGetHeaderImageUrl(value: () => String): Self = StObject.set(x, "GetHeaderImageUrl", js.Any.fromFunction0(value))
    
    inline def setGetHeaderNavigateUrl(value: () => String): Self = StObject.set(x, "GetHeaderNavigateUrl", js.Any.fromFunction0(value))
    
    inline def setGetHeaderText(value: () => String): Self = StObject.set(x, "GetHeaderText", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPopupControl(value: ASPxClientPopupControl): Self = StObject.set(x, "popupControl", value.asInstanceOf[js.Any])
    
    inline def setSetFooterImageUrl(value: String => Unit): Self = StObject.set(x, "SetFooterImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetFooterNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetFooterNavigateUrl", js.Any.fromFunction1(value))
    
    inline def setSetFooterText(value: String => Unit): Self = StObject.set(x, "SetFooterText", js.Any.fromFunction1(value))
    
    inline def setSetHeaderImageUrl(value: String => Unit): Self = StObject.set(x, "SetHeaderImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetHeaderNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetHeaderNavigateUrl", js.Any.fromFunction1(value))
    
    inline def setSetHeaderText(value: String => Unit): Self = StObject.set(x, "SetHeaderText", js.Any.fromFunction1(value))
  }
}
