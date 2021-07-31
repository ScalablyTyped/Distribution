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
    
    @scala.inline
    def apply(palettes: js.Array[GifPalette], usesTransparency: Boolean): Colors = {
      val __obj = js.Dynamic.literal(palettes = palettes.asInstanceOf[js.Any], usesTransparency = usesTransparency.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexCountUndefined: Self = StObject.set(x, "indexCount", js.undefined)
      
      @scala.inline
      def setPalettes(value: js.Array[GifPalette]): Self = StObject.set(x, "palettes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalettesVarargs(value: GifPalette*): Self = StObject.set(x, "palettes", js.Array(value :_*))
      
      @scala.inline
      def setUsesTransparency(value: Boolean): Self = StObject.set(x, "usesTransparency", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxHeight extends StObject {
    
    var maxHeight: Double
    
    var maxWidth: Double
  }
  object MaxHeight {
    
    @scala.inline
    def apply(maxHeight: Double, maxWidth: Double): MaxHeight = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxHeight]
    }
    
    @scala.inline
    implicit class MaxHeightMutableBuilder[Self <: MaxHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    }
  }
}
