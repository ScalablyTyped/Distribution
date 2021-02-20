package typings.gifEncoder

import typings.gifEncoder.mod.Pixels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HighWaterMark extends StObject {
    
    /**
      * Number, in bytes, to store in internal buffer. Defaults to 64kB.
      */
    var highWaterMark: js.UndefOr[Double] = js.native
  }
  object HighWaterMark {
    
    @scala.inline
    def apply(): HighWaterMark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighWaterMark]
    }
    
    @scala.inline
    implicit class HighWaterMarkMutableBuilder[Self <: HighWaterMark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
  
  @js.native
  trait IndexedPixels extends StObject {
    
    /**
      * Indicator to treat imageData as RGBA values (false) or indices in palette (true)
      */
    var indexedPixels: Boolean = js.native
    
    /**
      * Array of pixels to use as palette for the frame.
      * It should follow the sequence of r, g, b, a.
      *
      * Must be used with options.indexedPixels
      */
    var palette: Pixels = js.native
  }
  object IndexedPixels {
    
    @scala.inline
    def apply(indexedPixels: Boolean, palette: Pixels): IndexedPixels = {
      val __obj = js.Dynamic.literal(indexedPixels = indexedPixels.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedPixels]
    }
    
    @scala.inline
    implicit class IndexedPixelsMutableBuilder[Self <: IndexedPixels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexedPixels(value: Boolean): Self = StObject.set(x, "indexedPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalette(value: Pixels): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    }
  }
}
