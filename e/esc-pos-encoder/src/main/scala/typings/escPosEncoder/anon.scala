package typings.escPosEncoder

import typings.escPosEncoder.mod.alignType
import typings.escPosEncoder.mod.styleType
import typings.escPosEncoder.mod.verticalAlignType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: js.UndefOr[alignType] = js.undefined
    
    var marginLeft: js.UndefOr[Double] = js.undefined
    
    var marginRight: js.UndefOr[Double] = js.undefined
    
    var verticalAlign: js.UndefOr[verticalAlignType] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Align {
    
    inline def apply(): Align = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: alignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setVerticalAlign(value: verticalAlignType): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MarginLeft extends StObject {
    
    var marginLeft: js.UndefOr[Double] = js.undefined
    
    var marginRight: js.UndefOr[Double] = js.undefined
    
    var paddingLeft: js.UndefOr[Double] = js.undefined
    
    var paddingRight: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[styleType] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object MarginLeft {
    
    inline def apply(): MarginLeft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarginLeft]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarginLeft] (val x: Self) extends AnyVal {
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setStyle(value: styleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[styleType] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: styleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
