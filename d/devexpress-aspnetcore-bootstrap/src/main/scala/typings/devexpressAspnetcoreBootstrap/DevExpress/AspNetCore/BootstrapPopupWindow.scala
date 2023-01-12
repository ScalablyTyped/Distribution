package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapPopupWindow extends StObject {
  
  def getFooterImageUrl(): String
  
  def getFooterNavigateUrl(): String
  
  def getFooterText(): String
  
  def getHeaderImageUrl(): String
  
  def getHeaderNavigateUrl(): String
  
  def getHeaderText(): String
  
  val index: Double
  
  /* protected */ val instance: Any
  
  val name: String
  
  val popupControl: BootstrapPopupControl | Null
  
  def setFooterImageUrl(value: String): Unit
  
  def setFooterNavigateUrl(value: String): Unit
  
  def setFooterText(value: String): Unit
  
  def setHeaderImageUrl(value: String): Unit
  
  def setHeaderNavigateUrl(value: String): Unit
  
  def setHeaderText(value: String): Unit
}
object BootstrapPopupWindow {
  
  inline def apply(
    getFooterImageUrl: () => String,
    getFooterNavigateUrl: () => String,
    getFooterText: () => String,
    getHeaderImageUrl: () => String,
    getHeaderNavigateUrl: () => String,
    getHeaderText: () => String,
    index: Double,
    instance: Any,
    name: String,
    setFooterImageUrl: String => Unit,
    setFooterNavigateUrl: String => Unit,
    setFooterText: String => Unit,
    setHeaderImageUrl: String => Unit,
    setHeaderNavigateUrl: String => Unit,
    setHeaderText: String => Unit
  ): BootstrapPopupWindow = {
    val __obj = js.Dynamic.literal(getFooterImageUrl = js.Any.fromFunction0(getFooterImageUrl), getFooterNavigateUrl = js.Any.fromFunction0(getFooterNavigateUrl), getFooterText = js.Any.fromFunction0(getFooterText), getHeaderImageUrl = js.Any.fromFunction0(getHeaderImageUrl), getHeaderNavigateUrl = js.Any.fromFunction0(getHeaderNavigateUrl), getHeaderText = js.Any.fromFunction0(getHeaderText), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setFooterImageUrl = js.Any.fromFunction1(setFooterImageUrl), setFooterNavigateUrl = js.Any.fromFunction1(setFooterNavigateUrl), setFooterText = js.Any.fromFunction1(setFooterText), setHeaderImageUrl = js.Any.fromFunction1(setHeaderImageUrl), setHeaderNavigateUrl = js.Any.fromFunction1(setHeaderNavigateUrl), setHeaderText = js.Any.fromFunction1(setHeaderText), popupControl = null)
    __obj.asInstanceOf[BootstrapPopupWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapPopupWindow] (val x: Self) extends AnyVal {
    
    inline def setGetFooterImageUrl(value: () => String): Self = StObject.set(x, "getFooterImageUrl", js.Any.fromFunction0(value))
    
    inline def setGetFooterNavigateUrl(value: () => String): Self = StObject.set(x, "getFooterNavigateUrl", js.Any.fromFunction0(value))
    
    inline def setGetFooterText(value: () => String): Self = StObject.set(x, "getFooterText", js.Any.fromFunction0(value))
    
    inline def setGetHeaderImageUrl(value: () => String): Self = StObject.set(x, "getHeaderImageUrl", js.Any.fromFunction0(value))
    
    inline def setGetHeaderNavigateUrl(value: () => String): Self = StObject.set(x, "getHeaderNavigateUrl", js.Any.fromFunction0(value))
    
    inline def setGetHeaderText(value: () => String): Self = StObject.set(x, "getHeaderText", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPopupControl(value: BootstrapPopupControl): Self = StObject.set(x, "popupControl", value.asInstanceOf[js.Any])
    
    inline def setPopupControlNull: Self = StObject.set(x, "popupControl", null)
    
    inline def setSetFooterImageUrl(value: String => Unit): Self = StObject.set(x, "setFooterImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetFooterNavigateUrl(value: String => Unit): Self = StObject.set(x, "setFooterNavigateUrl", js.Any.fromFunction1(value))
    
    inline def setSetFooterText(value: String => Unit): Self = StObject.set(x, "setFooterText", js.Any.fromFunction1(value))
    
    inline def setSetHeaderImageUrl(value: String => Unit): Self = StObject.set(x, "setHeaderImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetHeaderNavigateUrl(value: String => Unit): Self = StObject.set(x, "setHeaderNavigateUrl", js.Any.fromFunction1(value))
    
    inline def setSetHeaderText(value: String => Unit): Self = StObject.set(x, "setHeaderText", js.Any.fromFunction1(value))
  }
}
