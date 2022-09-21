package typings.geopattern

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geopattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Pattern]
  inline def generate(string: String): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any]).asInstanceOf[Pattern]
  inline def generate(string: String, options: PatternOptions): Pattern = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Pattern]
  inline def generate(string: Unit, options: PatternOptions): Pattern = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Pattern]
  
  /* Rewritten from type alias, can be one of: 
    - typings.geopattern.geopatternStrings.chevrons
    - typings.geopattern.geopatternStrings.octogons
    - typings.geopattern.geopatternStrings.overlappingCircles
    - typings.geopattern.geopatternStrings.plusSigns
    - typings.geopattern.geopatternStrings.xes
    - typings.geopattern.geopatternStrings.sineWaves
    - typings.geopattern.geopatternStrings.hexagons
    - typings.geopattern.geopatternStrings.overlappingRings
    - typings.geopattern.geopatternStrings.plaid
    - typings.geopattern.geopatternStrings.triangles
    - typings.geopattern.geopatternStrings.squares
    - typings.geopattern.geopatternStrings.nestedSquares
    - typings.geopattern.geopatternStrings.mosaicSquares
    - typings.geopattern.geopatternStrings.concentricCircles
    - typings.geopattern.geopatternStrings.diamonds
    - typings.geopattern.geopatternStrings.tessellation
  */
  trait GeneratorType extends StObject
  object GeneratorType {
    
    inline def chevrons: typings.geopattern.geopatternStrings.chevrons = "chevrons".asInstanceOf[typings.geopattern.geopatternStrings.chevrons]
    
    inline def concentricCircles: typings.geopattern.geopatternStrings.concentricCircles = "concentricCircles".asInstanceOf[typings.geopattern.geopatternStrings.concentricCircles]
    
    inline def diamonds: typings.geopattern.geopatternStrings.diamonds = "diamonds".asInstanceOf[typings.geopattern.geopatternStrings.diamonds]
    
    inline def hexagons: typings.geopattern.geopatternStrings.hexagons = "hexagons".asInstanceOf[typings.geopattern.geopatternStrings.hexagons]
    
    inline def mosaicSquares: typings.geopattern.geopatternStrings.mosaicSquares = "mosaicSquares".asInstanceOf[typings.geopattern.geopatternStrings.mosaicSquares]
    
    inline def nestedSquares: typings.geopattern.geopatternStrings.nestedSquares = "nestedSquares".asInstanceOf[typings.geopattern.geopatternStrings.nestedSquares]
    
    inline def octogons: typings.geopattern.geopatternStrings.octogons = "octogons".asInstanceOf[typings.geopattern.geopatternStrings.octogons]
    
    inline def overlappingCircles: typings.geopattern.geopatternStrings.overlappingCircles = "overlappingCircles".asInstanceOf[typings.geopattern.geopatternStrings.overlappingCircles]
    
    inline def overlappingRings: typings.geopattern.geopatternStrings.overlappingRings = "overlappingRings".asInstanceOf[typings.geopattern.geopatternStrings.overlappingRings]
    
    inline def plaid: typings.geopattern.geopatternStrings.plaid = "plaid".asInstanceOf[typings.geopattern.geopatternStrings.plaid]
    
    inline def plusSigns: typings.geopattern.geopatternStrings.plusSigns = "plusSigns".asInstanceOf[typings.geopattern.geopatternStrings.plusSigns]
    
    inline def sineWaves: typings.geopattern.geopatternStrings.sineWaves = "sineWaves".asInstanceOf[typings.geopattern.geopatternStrings.sineWaves]
    
    inline def squares: typings.geopattern.geopatternStrings.squares = "squares".asInstanceOf[typings.geopattern.geopatternStrings.squares]
    
    inline def tessellation: typings.geopattern.geopatternStrings.tessellation = "tessellation".asInstanceOf[typings.geopattern.geopatternStrings.tessellation]
    
    inline def triangles: typings.geopattern.geopatternStrings.triangles = "triangles".asInstanceOf[typings.geopattern.geopatternStrings.triangles]
    
    inline def xes: typings.geopattern.geopatternStrings.xes = "xes".asInstanceOf[typings.geopattern.geopatternStrings.xes]
  }
  
  trait Pattern extends StObject {
    
    /** Gets the pattern's background color as a hexadecimal string. */
    var color: String
    
    /** Gets the SVG as a Base64-encoded string. */
    def toBase64(): String
    
    /**
      * Gets the pattern as a data URI,
      * i.e. data:image/svg+xml;base64,PHN2ZyB...
      */
    def toDataUri(): String
    
    /**
      * Gets the pattern as a data URL suitable for use as a CSS
      * background-image, i.e. url("data:image/svg+xml;base64,PHN2ZyB...").
      */
    def toDataUrl(): String
    
    /** Gets the SVG string representing the pattern. */
    def toSvg(): String
  }
  object Pattern {
    
    inline def apply(
      color: String,
      toBase64: () => String,
      toDataUri: () => String,
      toDataUrl: () => String,
      toSvg: () => String
    ): Pattern = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], toBase64 = js.Any.fromFunction0(toBase64), toDataUri = js.Any.fromFunction0(toDataUri), toDataUrl = js.Any.fromFunction0(toDataUrl), toSvg = js.Any.fromFunction0(toSvg))
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setToBase64(value: () => String): Self = StObject.set(x, "toBase64", js.Any.fromFunction0(value))
      
      inline def setToDataUri(value: () => String): Self = StObject.set(x, "toDataUri", js.Any.fromFunction0(value))
      
      inline def setToDataUrl(value: () => String): Self = StObject.set(x, "toDataUrl", js.Any.fromFunction0(value))
      
      inline def setToSvg(value: () => String): Self = StObject.set(x, "toSvg", js.Any.fromFunction0(value))
    }
  }
  
  trait PatternOptions extends StObject {
    
    /**
      * Controls the relative background color of the generated image. The color
      * is not identical to that used in the pattern because the hue is rotated
      * by the generator. This is a CSS hexadecimal color value, which defaults
      * to #933c3c.
      */
    var baseColor: js.UndefOr[String] = js.undefined
    
    /**
      * Specify an exact background color. This is a CSS hexadecimal color
      * value.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Determines the pattern. All of the original patterns from the Ruby
      * version at jasonlong/geo_pattern are available in this port, and their
      * names are camelCased.
      */
    var generator: js.UndefOr[GeneratorType] = js.undefined
  }
  object PatternOptions {
    
    inline def apply(): PatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternOptions]
    }
    
    extension [Self <: PatternOptions](x: Self) {
      
      inline def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      inline def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGenerator(value: GeneratorType): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def geopattern(string: String): JQuery = js.native
      def geopattern(string: String, options: PatternOptions): JQuery = js.native
    }
  }
}
