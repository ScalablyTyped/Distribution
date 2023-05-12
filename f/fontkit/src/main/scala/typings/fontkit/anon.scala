package typings.fontkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BitmapOnly extends StObject {
    
    var bitmapOnly: Boolean
    
    var editable: Boolean
    
    var noEmbedding: Boolean
    
    var noSubsetting: Boolean
    
    var viewOnly: Boolean
  }
  object BitmapOnly {
    
    inline def apply(
      bitmapOnly: Boolean,
      editable: Boolean,
      noEmbedding: Boolean,
      noSubsetting: Boolean,
      viewOnly: Boolean
    ): BitmapOnly = {
      val __obj = js.Dynamic.literal(bitmapOnly = bitmapOnly.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], noEmbedding = noEmbedding.asInstanceOf[js.Any], noSubsetting = noSubsetting.asInstanceOf[js.Any], viewOnly = viewOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapOnly]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitmapOnly] (val x: Self) extends AnyVal {
      
      inline def setBitmapOnly(value: Boolean): Self = StObject.set(x, "bitmapOnly", value.asInstanceOf[js.Any])
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setNoEmbedding(value: Boolean): Self = StObject.set(x, "noEmbedding", value.asInstanceOf[js.Any])
      
      inline def setNoSubsetting(value: Boolean): Self = StObject.set(x, "noSubsetting", value.asInstanceOf[js.Any])
      
      inline def setViewOnly(value: Boolean): Self = StObject.set(x, "viewOnly", value.asInstanceOf[js.Any])
    }
  }
  
  trait Italic extends StObject {
    
    var italic: Boolean
    
    var negative: Boolean
    
    var outlined: Boolean
    
    var strikeout: Boolean
    
    var underscore: Boolean
    
    var useTypoMetrics: Boolean
    
    var wws: Boolean
  }
  object Italic {
    
    inline def apply(
      italic: Boolean,
      negative: Boolean,
      outlined: Boolean,
      strikeout: Boolean,
      underscore: Boolean,
      useTypoMetrics: Boolean,
      wws: Boolean
    ): Italic = {
      val __obj = js.Dynamic.literal(italic = italic.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], strikeout = strikeout.asInstanceOf[js.Any], underscore = underscore.asInstanceOf[js.Any], useTypoMetrics = useTypoMetrics.asInstanceOf[js.Any], wws = wws.asInstanceOf[js.Any])
      __obj.asInstanceOf[Italic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Italic] (val x: Self) extends AnyVal {
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setOutlined(value: Boolean): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setStrikeout(value: Boolean): Self = StObject.set(x, "strikeout", value.asInstanceOf[js.Any])
      
      inline def setUnderscore(value: Boolean): Self = StObject.set(x, "underscore", value.asInstanceOf[js.Any])
      
      inline def setUseTypoMetrics(value: Boolean): Self = StObject.set(x, "useTypoMetrics", value.asInstanceOf[js.Any])
      
      inline def setWws(value: Boolean): Self = StObject.set(x, "wws", value.asInstanceOf[js.Any])
    }
  }
}
