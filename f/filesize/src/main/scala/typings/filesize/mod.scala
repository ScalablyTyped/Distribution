package typings.filesize

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.filesize.filesizeStrings.`object`
import typings.filesize.filesizeStrings.array
import typings.filesize.filesizeStrings.exponent
import typings.filesize.filesizeStrings.iec
import typings.filesize.filesizeStrings.jedec
import typings.filesize.filesizeStrings.string
import typings.filesize.mod.Filesize.Filesize
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("filesize", JSImport.Namespace)
  @js.native
  val ^ : Filesize = js.native
  
  object Filesize {
    
    @js.native
    trait Filesize extends StObject {
      
      def apply(bytes: Double): String = js.native
      def apply(bytes: Double, options: Options): String = js.native
      
      def partial(options: Options): js.Function1[/* bytes */ Double, String] = js.native
    }
    
    trait Options extends StObject {
      
      /**
        * Number base, default is 2
        */
      var base: js.UndefOr[Double] = js.undefined
      
      /**
        * Enables bit sizes, default is false
        */
      var bits: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Specifies the SI suffix via exponent, e.g. 2 is MB for bytes, default is -1
        */
      var exponent: js.UndefOr[Double] = js.undefined
      
      /**
        * Enables full form of unit of measure, default is false
        */
      var fullform: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Array of full form overrides, default is []
        */
      var fullforms: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * BCP 47 language tag to specify a locale, or true to use default locale, default is ""
        */
      var locale: js.UndefOr[String | Boolean] = js.undefined
      
      /**
        * ECMA-402 number format option overrides, default is "{}"
        */
      var localeOptions: js.UndefOr[NumberFormatOptions] = js.undefined
      
      /**
        * Output of function (array, exponent, object, or string), default is string
        */
      var output: js.UndefOr[array | exponent | `object` | string] = js.undefined
      
      /**
        * Decimal place, default is 2
        */
      var round: js.UndefOr[Double] = js.undefined
      
      /**
        * Decimal separator character, default is `.`
        */
      var separator: js.UndefOr[String] = js.undefined
      
      /**
        * Character between the result and suffix, default is ` `
        */
      var spacer: js.UndefOr[String] = js.undefined
      
      /**
        * Standard unit of measure, can be iec or jedec, default is jedec; can be overruled by base
        */
      var standard: js.UndefOr[iec | jedec] = js.undefined
      
      /**
        * Dictionary of SI/JEDEC symbols to replace for localization, defaults to english if no match is found
        */
      var symbols: js.UndefOr[SiJedec] = js.undefined
      
      /**
        *  Enables unix style human readable output, e.g ls -lh, default is false
        */
      var unix: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        inline def setBits(value: Boolean): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
        
        inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
        
        inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
        
        inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
        
        inline def setFullform(value: Boolean): Self = StObject.set(x, "fullform", value.asInstanceOf[js.Any])
        
        inline def setFullformUndefined: Self = StObject.set(x, "fullform", js.undefined)
        
        inline def setFullforms(value: js.Array[String]): Self = StObject.set(x, "fullforms", value.asInstanceOf[js.Any])
        
        inline def setFullformsUndefined: Self = StObject.set(x, "fullforms", js.undefined)
        
        inline def setFullformsVarargs(value: String*): Self = StObject.set(x, "fullforms", js.Array(value :_*))
        
        inline def setLocale(value: String | Boolean): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        inline def setLocaleOptions(value: NumberFormatOptions): Self = StObject.set(x, "localeOptions", value.asInstanceOf[js.Any])
        
        inline def setLocaleOptionsUndefined: Self = StObject.set(x, "localeOptions", js.undefined)
        
        inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        inline def setOutput(value: array | exponent | `object` | string): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
        
        inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
        
        inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
        
        inline def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
        
        inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
        
        inline def setStandard(value: iec | jedec): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
        
        inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
        
        inline def setSymbols(value: SiJedec): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
        
        inline def setUnix(value: Boolean): Self = StObject.set(x, "unix", value.asInstanceOf[js.Any])
        
        inline def setUnixUndefined: Self = StObject.set(x, "unix", js.undefined)
      }
    }
    
    trait SiJedec
      extends StObject
         with SiJedecBits
         with SiJedecBytes
         with /* name */ StringDictionary[String]
    object SiJedec {
      
      inline def apply(): SiJedec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SiJedec]
      }
    }
    
    trait SiJedecBits extends StObject {
      
      var Eb: js.UndefOr[String] = js.undefined
      
      var Gb: js.UndefOr[String] = js.undefined
      
      var Kb: js.UndefOr[String] = js.undefined
      
      var Mb: js.UndefOr[String] = js.undefined
      
      var Pb: js.UndefOr[String] = js.undefined
      
      var Tb: js.UndefOr[String] = js.undefined
      
      var Yb: js.UndefOr[String] = js.undefined
      
      var Zb: js.UndefOr[String] = js.undefined
      
      var b: js.UndefOr[String] = js.undefined
    }
    object SiJedecBits {
      
      inline def apply(): SiJedecBits = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SiJedecBits]
      }
      
      extension [Self <: SiJedecBits](x: Self) {
        
        inline def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
        
        inline def setEb(value: String): Self = StObject.set(x, "Eb", value.asInstanceOf[js.Any])
        
        inline def setEbUndefined: Self = StObject.set(x, "Eb", js.undefined)
        
        inline def setGb(value: String): Self = StObject.set(x, "Gb", value.asInstanceOf[js.Any])
        
        inline def setGbUndefined: Self = StObject.set(x, "Gb", js.undefined)
        
        inline def setKb(value: String): Self = StObject.set(x, "Kb", value.asInstanceOf[js.Any])
        
        inline def setKbUndefined: Self = StObject.set(x, "Kb", js.undefined)
        
        inline def setMb(value: String): Self = StObject.set(x, "Mb", value.asInstanceOf[js.Any])
        
        inline def setMbUndefined: Self = StObject.set(x, "Mb", js.undefined)
        
        inline def setPb(value: String): Self = StObject.set(x, "Pb", value.asInstanceOf[js.Any])
        
        inline def setPbUndefined: Self = StObject.set(x, "Pb", js.undefined)
        
        inline def setTb(value: String): Self = StObject.set(x, "Tb", value.asInstanceOf[js.Any])
        
        inline def setTbUndefined: Self = StObject.set(x, "Tb", js.undefined)
        
        inline def setYb(value: String): Self = StObject.set(x, "Yb", value.asInstanceOf[js.Any])
        
        inline def setYbUndefined: Self = StObject.set(x, "Yb", js.undefined)
        
        inline def setZb(value: String): Self = StObject.set(x, "Zb", value.asInstanceOf[js.Any])
        
        inline def setZbUndefined: Self = StObject.set(x, "Zb", js.undefined)
      }
    }
    
    trait SiJedecBytes extends StObject {
      
      var B: js.UndefOr[String] = js.undefined
      
      var EB: js.UndefOr[String] = js.undefined
      
      var GB: js.UndefOr[String] = js.undefined
      
      var KB: js.UndefOr[String] = js.undefined
      
      var MB: js.UndefOr[String] = js.undefined
      
      var PB: js.UndefOr[String] = js.undefined
      
      var TB: js.UndefOr[String] = js.undefined
      
      var YB: js.UndefOr[String] = js.undefined
      
      var ZB: js.UndefOr[String] = js.undefined
    }
    object SiJedecBytes {
      
      inline def apply(): SiJedecBytes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SiJedecBytes]
      }
      
      extension [Self <: SiJedecBytes](x: Self) {
        
        inline def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
        
        inline def setBUndefined: Self = StObject.set(x, "B", js.undefined)
        
        inline def setEB(value: String): Self = StObject.set(x, "EB", value.asInstanceOf[js.Any])
        
        inline def setEBUndefined: Self = StObject.set(x, "EB", js.undefined)
        
        inline def setGB(value: String): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
        
        inline def setGBUndefined: Self = StObject.set(x, "GB", js.undefined)
        
        inline def setKB(value: String): Self = StObject.set(x, "KB", value.asInstanceOf[js.Any])
        
        inline def setKBUndefined: Self = StObject.set(x, "KB", js.undefined)
        
        inline def setMB(value: String): Self = StObject.set(x, "MB", value.asInstanceOf[js.Any])
        
        inline def setMBUndefined: Self = StObject.set(x, "MB", js.undefined)
        
        inline def setPB(value: String): Self = StObject.set(x, "PB", value.asInstanceOf[js.Any])
        
        inline def setPBUndefined: Self = StObject.set(x, "PB", js.undefined)
        
        inline def setTB(value: String): Self = StObject.set(x, "TB", value.asInstanceOf[js.Any])
        
        inline def setTBUndefined: Self = StObject.set(x, "TB", js.undefined)
        
        inline def setYB(value: String): Self = StObject.set(x, "YB", value.asInstanceOf[js.Any])
        
        inline def setYBUndefined: Self = StObject.set(x, "YB", js.undefined)
        
        inline def setZB(value: String): Self = StObject.set(x, "ZB", value.asInstanceOf[js.Any])
        
        inline def setZBUndefined: Self = StObject.set(x, "ZB", js.undefined)
      }
    }
  }
  
  type _To = Filesize
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Filesize = ^
}
