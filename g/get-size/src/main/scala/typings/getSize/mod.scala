package typings.getSize

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(element: String): Size = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[Size]
  inline def apply(element: Element): Size = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  @JSImport("get-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Size extends StObject {
    
    var borderBottomWidth: Double
    
    var borderLeftWidth: Double
    
    var borderRightWidth: Double
    
    var borderTopWidth: Double
    
    var height: Double
    
    var innerHeight: Double
    
    var innerWidth: Double
    
    var marginBottom: Double
    
    var marginLeft: Double
    
    var marginRight: Double
    
    var marginTop: Double
    
    var outerHeight: Double
    
    var outerWidth: Double
    
    var paddingBottom: Double
    
    var paddingLeft: Double
    
    var paddingRight: Double
    
    var paddingTop: Double
    
    var width: Double
  }
  object Size {
    
    inline def apply(
      borderBottomWidth: Double,
      borderLeftWidth: Double,
      borderRightWidth: Double,
      borderTopWidth: Double,
      height: Double,
      innerHeight: Double,
      innerWidth: Double,
      marginBottom: Double,
      marginLeft: Double,
      marginRight: Double,
      marginTop: Double,
      outerHeight: Double,
      outerWidth: Double,
      paddingBottom: Double,
      paddingLeft: Double,
      paddingRight: Double,
      paddingTop: Double,
      width: Double
    ): Size = {
      val __obj = js.Dynamic.literal(borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], outerHeight = outerHeight.asInstanceOf[js.Any], outerWidth = outerWidth.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftWidth(value: Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
      
      inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setOuterHeight(value: Double): Self = StObject.set(x, "outerHeight", value.asInstanceOf[js.Any])
      
      inline def setOuterWidth(value: Double): Self = StObject.set(x, "outerWidth", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
