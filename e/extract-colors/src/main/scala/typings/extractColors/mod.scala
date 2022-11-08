package typings.extractColors

import typings.extractColors.extractColorsStrings._empty
import typings.extractColors.extractColorsStrings.`use-credentials`
import typings.extractColors.extractColorsStrings.anonymous
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extract-colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractColors(src: String): js.Promise[js.Array[Colors]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractColors")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Colors]]]
  inline def extractColors(src: String, options: Options): js.Promise[js.Array[Colors]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractColors")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Colors]]]
  inline def extractColors(src: HTMLImageElement): js.Promise[js.Array[Colors]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractColors")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Colors]]]
  inline def extractColors(src: HTMLImageElement, options: Options): js.Promise[js.Array[Colors]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractColors")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Colors]]]
  inline def extractColors(src: ImageData): js.Promise[js.Array[Colors]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractColors")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Colors]]]
  inline def extractColors(src: ImageData, options: Options): js.Promise[js.Array[Colors]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractColors")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Colors]]]
  
  inline def extractColorsFromImageData(imageData: ImageData): js.Array[Colors] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractColorsFromImageData")(imageData.asInstanceOf[js.Any]).asInstanceOf[js.Array[Colors]]
  inline def extractColorsFromImageData(imageData: ImageData, option: Options): js.Array[Colors] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractColorsFromImageData")(imageData.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Array[Colors]]
  
  inline def extractColorsFromSrc(src: String): js.Array[Colors] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractColorsFromSrc")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[Colors]]
  inline def extractColorsFromSrc(src: String, option: Options): js.Array[Colors] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractColorsFromSrc")(src.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Array[Colors]]
  
  trait Colors extends StObject {
    
    /**
      * Area of the color and his neighbouring colors from 0 to 1
      * @example 0.5915
      */
    var area: Double
    
    /**
      * Blue canal from 0 to 255
      * @example 43
      */
    var blue: Double
    
    /**
      * Green canal from 0 to 255
      * @example 52
      */
    var green: Double
    
    /**
      * Color in hexadecimal string
      * @example '#62342b'
      */
    var hex: String
    
    /**
      * Red canal from 0 to 255
      * @example 98
      */
    var red: Double
    
    /**
      * Color saturation from 0 to 1
      * @example 0.2156862
      */
    var saturation: Double
  }
  object Colors {
    
    inline def apply(area: Double, blue: Double, green: Double, hex: String, red: Double, saturation: Double): Colors = {
      val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Callback to enable only some colors
      * @param red
      * @param green
      * @param blue
      * @param alpha
      */
    var colorValidator: js.UndefOr[
        js.Function4[/* red */ Double, /* green */ Double, /* blue */ Double, /* alpha */ Double, Boolean]
      ] = js.undefined
    
    /**
      * Only for browser, can be 'Anonymous' to avoid CORS
      * @default null
      */
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
    
    /**
      * From 0 to 1 is the color distance to not have near colors (1 distance is between white and black)
      * @default 0.2
      */
    var distance: js.UndefOr[Double] = js.undefined
    
    /**
      * Total pixel number of the resized picture for calculation
      * @default 10000
      */
    var pixels: js.UndefOr[Double] = js.undefined
    
    /**
      * Power of the saturation weight during the process (0 is not used, 1 is only saturation and not area size)
      * @default 0.2
      */
    var saturationImportance: js.UndefOr[Double] = js.undefined
    
    /**
      * Approximation power in the first color splitting during process (from 2 to 16)
      * @default 10
      */
    var splitPower: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColorValidator(value: (/* red */ Double, /* green */ Double, /* blue */ Double, /* alpha */ Double) => Boolean): Self = StObject.set(x, "colorValidator", js.Any.fromFunction4(value))
      
      inline def setColorValidatorUndefined: Self = StObject.set(x, "colorValidator", js.undefined)
      
      inline def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setPixels(value: Double): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
      
      inline def setPixelsUndefined: Self = StObject.set(x, "pixels", js.undefined)
      
      inline def setSaturationImportance(value: Double): Self = StObject.set(x, "saturationImportance", value.asInstanceOf[js.Any])
      
      inline def setSaturationImportanceUndefined: Self = StObject.set(x, "saturationImportance", js.undefined)
      
      inline def setSplitPower(value: Double): Self = StObject.set(x, "splitPower", value.asInstanceOf[js.Any])
      
      inline def setSplitPowerUndefined: Self = StObject.set(x, "splitPower", js.undefined)
    }
  }
}
