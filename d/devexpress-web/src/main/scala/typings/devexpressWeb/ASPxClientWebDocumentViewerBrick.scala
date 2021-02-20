package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientWebDocumentViewerBrick extends StObject {
  
  var content: StringDictionary[String] = js.native
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var navigation: ASPxClientWebDocumentViewerBrickNavigation = js.native
  
  var rtl: Boolean = js.native
  
  var top: Double = js.native
  
  var width: Double = js.native
}
object ASPxClientWebDocumentViewerBrick {
  
  @scala.inline
  def apply(
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
  implicit class ASPxClientWebDocumentViewerBrickMutableBuilder[Self <: ASPxClientWebDocumentViewerBrick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: StringDictionary[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: ASPxClientWebDocumentViewerBrickNavigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
