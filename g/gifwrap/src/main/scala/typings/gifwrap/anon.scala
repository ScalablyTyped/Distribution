package typings.gifwrap

import typings.gifwrap.mod.GifPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colors extends StObject {
    
    var colors: js.UndefOr[js.Array[Double]] = js.undefined
    
    var indexCount: js.UndefOr[Double] = js.undefined
    
    var palettes: js.Array[GifPalette]
    
    var usesTransparency: Boolean
  }
  object Colors {
    
    inline def apply(palettes: js.Array[GifPalette], usesTransparency: Boolean): Colors = {
      val __obj = js.Dynamic.literal(palettes = palettes.asInstanceOf[js.Any], usesTransparency = usesTransparency.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
      
      inline def setIndexCountUndefined: Self = StObject.set(x, "indexCount", js.undefined)
      
      inline def setPalettes(value: js.Array[GifPalette]): Self = StObject.set(x, "palettes", value.asInstanceOf[js.Any])
      
      inline def setPalettesVarargs(value: GifPalette*): Self = StObject.set(x, "palettes", js.Array(value*))
      
      inline def setUsesTransparency(value: Boolean): Self = StObject.set(x, "usesTransparency", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxHeight extends StObject {
    
    var maxHeight: Double
    
    var maxWidth: Double
  }
  object MaxHeight {
    
    inline def apply(maxHeight: Double, maxWidth: Double): MaxHeight = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxHeight]
    }
    
    extension [Self <: MaxHeight](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    }
  }
}
