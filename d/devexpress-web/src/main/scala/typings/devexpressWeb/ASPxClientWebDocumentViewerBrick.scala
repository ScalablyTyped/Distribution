package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientWebDocumentViewerBrick extends StObject {
  
  var content: StringDictionary[String]
  
  var height: Double
  
  var left: Double
  
  var navigation: ASPxClientWebDocumentViewerBrickNavigation
  
  var rtl: Boolean
  
  var top: Double
  
  var width: Double
}
object ASPxClientWebDocumentViewerBrick {
  
  inline def apply(
    content: StringDictionary[String],
    height: Double,
    left: Double,
    navigation: ASPxClientWebDocumentViewerBrickNavigation,
    rtl: Boolean,
    top: Double,
    width: Double
  ): ASPxClientWebDocumentViewerBrick = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerBrick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientWebDocumentViewerBrick] (val x: Self) extends AnyVal {
    
    inline def setContent(value: StringDictionary[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: ASPxClientWebDocumentViewerBrickNavigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
