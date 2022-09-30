package typings.expoImageUtils

import org.scalablytyped.runtime.StringDictionary
import typings.expoImageUtils.expoImageUtilsStrings._empty
import typings.expoImageUtils.expoImageUtilsStrings.cubic
import typings.expoImageUtils.expoImageUtilsStrings.flatten
import typings.expoImageUtils.expoImageUtilsStrings.lanczos2
import typings.expoImageUtils.expoImageUtilsStrings.lanczos3
import typings.expoImageUtils.expoImageUtilsStrings.mitchell
import typings.expoImageUtils.expoImageUtilsStrings.nearest
import typings.expoImageUtils.expoImageUtilsStrings.removeAlpha
import typings.expoImageUtils.expoImageUtilsStrings.resize
import typings.expoImageUtils.imageTypesMod.ImageFormat
import typings.expoImageUtils.imageTypesMod.ResizeMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharpTypesMod {
  
  trait FlattenOptions
    extends StObject
       with SharpCommandOptions {
    
    var background: String
    
    var operation: flatten
  }
  object FlattenOptions {
    
    inline def apply(background: String): FlattenOptions = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], operation = "flatten")
      __obj.asInstanceOf[FlattenOptions]
    }
    
    extension [Self <: FlattenOptions](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: flatten): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = js.Object | (StringDictionary[js.UndefOr[Boolean | Double | String]])
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoImageUtils.expoImageUtilsStrings.center
    - typings.expoImageUtils.expoImageUtilsStrings.centre
    - typings.expoImageUtils.expoImageUtilsStrings.north
    - typings.expoImageUtils.expoImageUtilsStrings.east
    - typings.expoImageUtils.expoImageUtilsStrings.south
    - typings.expoImageUtils.expoImageUtilsStrings.west
    - typings.expoImageUtils.expoImageUtilsStrings.northeast
    - typings.expoImageUtils.expoImageUtilsStrings.southeast
    - typings.expoImageUtils.expoImageUtilsStrings.southwest
    - typings.expoImageUtils.expoImageUtilsStrings.northwest
    - typings.expoImageUtils.expoImageUtilsStrings.top
    - typings.expoImageUtils.expoImageUtilsStrings.right
    - typings.expoImageUtils.expoImageUtilsStrings.bottom
    - typings.expoImageUtils.expoImageUtilsStrings.left
    - typings.expoImageUtils.expoImageUtilsStrings.`right top`
    - typings.expoImageUtils.expoImageUtilsStrings.`right bottom`
    - typings.expoImageUtils.expoImageUtilsStrings.`left bottom`
    - typings.expoImageUtils.expoImageUtilsStrings.`left top`
    - typings.expoImageUtils.expoImageUtilsStrings.entropy
    - typings.expoImageUtils.expoImageUtilsStrings.attention
  */
  trait Position extends StObject
  object Position {
    
    inline def attention: typings.expoImageUtils.expoImageUtilsStrings.attention = "attention".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.attention]
    
    inline def bottom: typings.expoImageUtils.expoImageUtilsStrings.bottom = "bottom".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.bottom]
    
    inline def center: typings.expoImageUtils.expoImageUtilsStrings.center = "center".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.center]
    
    inline def centre: typings.expoImageUtils.expoImageUtilsStrings.centre = "centre".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.centre]
    
    inline def east: typings.expoImageUtils.expoImageUtilsStrings.east = "east".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.east]
    
    inline def entropy: typings.expoImageUtils.expoImageUtilsStrings.entropy = "entropy".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.entropy]
    
    inline def left: typings.expoImageUtils.expoImageUtilsStrings.left = "left".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.left]
    
    inline def `left bottom`: typings.expoImageUtils.expoImageUtilsStrings.`left bottom` = ("left bottom").asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.`left bottom`]
    
    inline def `left top`: typings.expoImageUtils.expoImageUtilsStrings.`left top` = ("left top").asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.`left top`]
    
    inline def north: typings.expoImageUtils.expoImageUtilsStrings.north = "north".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.north]
    
    inline def northeast: typings.expoImageUtils.expoImageUtilsStrings.northeast = "northeast".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.northeast]
    
    inline def northwest: typings.expoImageUtils.expoImageUtilsStrings.northwest = "northwest".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.northwest]
    
    inline def right: typings.expoImageUtils.expoImageUtilsStrings.right = "right".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.right]
    
    inline def `right bottom`: typings.expoImageUtils.expoImageUtilsStrings.`right bottom` = ("right bottom").asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.`right bottom`]
    
    inline def `right top`: typings.expoImageUtils.expoImageUtilsStrings.`right top` = ("right top").asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.`right top`]
    
    inline def south: typings.expoImageUtils.expoImageUtilsStrings.south = "south".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.south]
    
    inline def southeast: typings.expoImageUtils.expoImageUtilsStrings.southeast = "southeast".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.southeast]
    
    inline def southwest: typings.expoImageUtils.expoImageUtilsStrings.southwest = "southwest".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.southwest]
    
    inline def top: typings.expoImageUtils.expoImageUtilsStrings.top = "top".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.top]
    
    inline def west: typings.expoImageUtils.expoImageUtilsStrings.west = "west".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.west]
  }
  
  trait RemoveAlphaOptions
    extends StObject
       with SharpCommandOptions {
    
    var operation: removeAlpha
  }
  object RemoveAlphaOptions {
    
    inline def apply(): RemoveAlphaOptions = {
      val __obj = js.Dynamic.literal(operation = "removeAlpha")
      __obj.asInstanceOf[RemoveAlphaOptions]
    }
    
    extension [Self <: RemoveAlphaOptions](x: Self) {
      
      inline def setOperation(value: removeAlpha): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeOptions
    extends StObject
       with SharpCommandOptions {
    
    var background: js.UndefOr[String] = js.undefined
    
    var fastShrinkOnLoad: js.UndefOr[Boolean] = js.undefined
    
    var fit: js.UndefOr[ResizeMode] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var kernel: js.UndefOr[nearest | cubic | mitchell | lanczos2 | lanczos3] = js.undefined
    
    var operation: resize
    
    var position: js.UndefOr[Position] = js.undefined
    
    var width: Double
    
    var withoutEnlargement: js.UndefOr[Boolean] = js.undefined
  }
  object ResizeOptions {
    
    inline def apply(width: Double): ResizeOptions = {
      val __obj = js.Dynamic.literal(operation = "resize", width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeOptions]
    }
    
    extension [Self <: ResizeOptions](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setFastShrinkOnLoad(value: Boolean): Self = StObject.set(x, "fastShrinkOnLoad", value.asInstanceOf[js.Any])
      
      inline def setFastShrinkOnLoadUndefined: Self = StObject.set(x, "fastShrinkOnLoad", js.undefined)
      
      inline def setFit(value: ResizeMode): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKernel(value: nearest | cubic | mitchell | lanczos2 | lanczos3): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      inline def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
      
      inline def setOperation(value: resize): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWithoutEnlargement(value: Boolean): Self = StObject.set(x, "withoutEnlargement", value.asInstanceOf[js.Any])
      
      inline def setWithoutEnlargementUndefined: Self = StObject.set(x, "withoutEnlargement", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoImageUtils.sharpTypesMod.RemoveAlphaOptions
    - typings.expoImageUtils.sharpTypesMod.ResizeOptions
    - typings.expoImageUtils.sharpTypesMod.FlattenOptions
  */
  trait SharpCommandOptions extends StObject
  object SharpCommandOptions {
    
    inline def FlattenOptions(background: String): typings.expoImageUtils.sharpTypesMod.FlattenOptions = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], operation = "flatten")
      __obj.asInstanceOf[typings.expoImageUtils.sharpTypesMod.FlattenOptions]
    }
    
    inline def RemoveAlphaOptions(): typings.expoImageUtils.sharpTypesMod.RemoveAlphaOptions = {
      val __obj = js.Dynamic.literal(operation = "removeAlpha")
      __obj.asInstanceOf[typings.expoImageUtils.sharpTypesMod.RemoveAlphaOptions]
    }
    
    inline def ResizeOptions(width: Double): typings.expoImageUtils.sharpTypesMod.ResizeOptions = {
      val __obj = js.Dynamic.literal(operation = "resize", width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoImageUtils.sharpTypesMod.ResizeOptions]
    }
  }
  
  trait SharpGlobalOptions
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null]] {
    
    var compressionLevel: js.UndefOr[_empty] = js.undefined
    
    var format: js.UndefOr[ImageFormat] = js.undefined
    
    var input: String
    
    var limitInputPixels: js.UndefOr[Double] = js.undefined
    
    var output: String
    
    var progressive: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var withMetadata: js.UndefOr[Boolean] = js.undefined
  }
  object SharpGlobalOptions {
    
    inline def apply(input: String, output: String): SharpGlobalOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharpGlobalOptions]
    }
    
    extension [Self <: SharpGlobalOptions](x: Self) {
      
      inline def setCompressionLevel(value: _empty): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
      
      inline def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
      
      inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLimitInputPixels(value: Double): Self = StObject.set(x, "limitInputPixels", value.asInstanceOf[js.Any])
      
      inline def setLimitInputPixelsUndefined: Self = StObject.set(x, "limitInputPixels", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setWithMetadata(value: Boolean): Self = StObject.set(x, "withMetadata", value.asInstanceOf[js.Any])
      
      inline def setWithMetadataUndefined: Self = StObject.set(x, "withMetadata", js.undefined)
    }
  }
}
