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
import scala.scalajs.js.`|`
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
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Number base, default is 2
        */
      var base: js.UndefOr[Double] = js.native
      
      /**
        * Enables bit sizes, default is false
        */
      var bits: js.UndefOr[Boolean] = js.native
      
      /**
        * Specifies the SI suffix via exponent, e.g. 2 is MB for bytes, default is -1
        */
      var exponent: js.UndefOr[Double] = js.native
      
      /**
        * Enables full form of unit of measure, default is false
        */
      var fullform: js.UndefOr[Boolean] = js.native
      
      /**
        * Array of full form overrides, default is []
        */
      var fullforms: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * BCP 47 language tag to specify a locale, or true to use default locale, default is ""
        */
      var locale: js.UndefOr[String | Boolean] = js.native
      
      /**
        * ECMA-402 number format option overrides, default is "{}"
        */
      var localeOptions: js.UndefOr[NumberFormatOptions] = js.native
      
      /**
        * Output of function (array, exponent, object, or string), default is string
        */
      var output: js.UndefOr[array | exponent | `object` | string] = js.native
      
      /**
        * Decimal place, default is 2
        */
      var round: js.UndefOr[Double] = js.native
      
      /**
        * Decimal separator character, default is `.`
        */
      var separator: js.UndefOr[String] = js.native
      
      /**
        * Character between the result and suffix, default is ` `
        */
      var spacer: js.UndefOr[String] = js.native
      
      /**
        * Standard unit of measure, can be iec or jedec, default is jedec; can be overruled by base
        */
      var standard: js.UndefOr[iec | jedec] = js.native
      
      /**
        * Dictionary of SI/JEDEC symbols to replace for localization, defaults to english if no match is found
        */
      var symbols: js.UndefOr[SiJedec] = js.native
      
      /**
        *  Enables unix style human readable output, e.g ls -lh, default is false
        */
      var unix: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        @scala.inline
        def setBits(value: Boolean): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
        
        @scala.inline
        def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
        
        @scala.inline
        def setFullform(value: Boolean): Self = StObject.set(x, "fullform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullformUndefined: Self = StObject.set(x, "fullform", js.undefined)
        
        @scala.inline
        def setFullforms(value: js.Array[String]): Self = StObject.set(x, "fullforms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullformsUndefined: Self = StObject.set(x, "fullforms", js.undefined)
        
        @scala.inline
        def setFullformsVarargs(value: String*): Self = StObject.set(x, "fullforms", js.Array(value :_*))
        
        @scala.inline
        def setLocale(value: String | Boolean): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleOptions(value: NumberFormatOptions): Self = StObject.set(x, "localeOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleOptionsUndefined: Self = StObject.set(x, "localeOptions", js.undefined)
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setOutput(value: array | exponent | `object` | string): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        @scala.inline
        def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
        
        @scala.inline
        def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
        
        @scala.inline
        def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
        
        @scala.inline
        def setStandard(value: iec | jedec): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
        
        @scala.inline
        def setSymbols(value: SiJedec): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
        
        @scala.inline
        def setUnix(value: Boolean): Self = StObject.set(x, "unix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnixUndefined: Self = StObject.set(x, "unix", js.undefined)
      }
    }
    
    /* Inlined filesize.filesize.Filesize.SiJedecBits & filesize.filesize.Filesize.SiJedecBytes & {[name: string] : string} */
    @js.native
    trait SiJedec extends /* name */ StringDictionary[String] {
      
      var B: js.UndefOr[String] = js.native
      
      var EB: js.UndefOr[String] = js.native
      
      var Eb: js.UndefOr[String] = js.native
      
      var GB: js.UndefOr[String] = js.native
      
      var Gb: js.UndefOr[String] = js.native
      
      var KB: js.UndefOr[String] = js.native
      
      var Kb: js.UndefOr[String] = js.native
      
      var MB: js.UndefOr[String] = js.native
      
      var Mb: js.UndefOr[String] = js.native
      
      var PB: js.UndefOr[String] = js.native
      
      var Pb: js.UndefOr[String] = js.native
      
      var TB: js.UndefOr[String] = js.native
      
      var Tb: js.UndefOr[String] = js.native
      
      var YB: js.UndefOr[String] = js.native
      
      var Yb: js.UndefOr[String] = js.native
      
      var ZB: js.UndefOr[String] = js.native
      
      var Zb: js.UndefOr[String] = js.native
      
      var b: js.UndefOr[String] = js.native
    }
    object SiJedec {
      
      @scala.inline
      def apply(): SiJedec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SiJedec]
      }
      
      @scala.inline
      implicit class SiJedecMutableBuilder[Self <: SiJedec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBUndefined: Self = StObject.set(x, "B", js.undefined)
        
        @scala.inline
        def setEB(value: String): Self = StObject.set(x, "EB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEBUndefined: Self = StObject.set(x, "EB", js.undefined)
        
        @scala.inline
        def setGB(value: String): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGBUndefined: Self = StObject.set(x, "GB", js.undefined)
        
        @scala.inline
        def setKB(value: String): Self = StObject.set(x, "KB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKBUndefined: Self = StObject.set(x, "KB", js.undefined)
        
        @scala.inline
        def setMB(value: String): Self = StObject.set(x, "MB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMBUndefined: Self = StObject.set(x, "MB", js.undefined)
        
        @scala.inline
        def setPB(value: String): Self = StObject.set(x, "PB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPBUndefined: Self = StObject.set(x, "PB", js.undefined)
        
        @scala.inline
        def setTB(value: String): Self = StObject.set(x, "TB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTBUndefined: Self = StObject.set(x, "TB", js.undefined)
        
        @scala.inline
        def setYB(value: String): Self = StObject.set(x, "YB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYBUndefined: Self = StObject.set(x, "YB", js.undefined)
        
        @scala.inline
        def setZB(value: String): Self = StObject.set(x, "ZB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZBUndefined: Self = StObject.set(x, "ZB", js.undefined)
      }
    }
    
    @js.native
    trait SiJedecBits extends StObject {
      
      var Eb: js.UndefOr[String] = js.native
      
      var Gb: js.UndefOr[String] = js.native
      
      var Kb: js.UndefOr[String] = js.native
      
      var Mb: js.UndefOr[String] = js.native
      
      var Pb: js.UndefOr[String] = js.native
      
      var Tb: js.UndefOr[String] = js.native
      
      var Yb: js.UndefOr[String] = js.native
      
      var Zb: js.UndefOr[String] = js.native
      
      var b: js.UndefOr[String] = js.native
    }
    object SiJedecBits {
      
      @scala.inline
      def apply(): SiJedecBits = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SiJedecBits]
      }
      
      @scala.inline
      implicit class SiJedecBitsMutableBuilder[Self <: SiJedecBits] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBUndefined: Self = StObject.set(x, "b", js.undefined)
        
        @scala.inline
        def setEb(value: String): Self = StObject.set(x, "Eb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEbUndefined: Self = StObject.set(x, "Eb", js.undefined)
        
        @scala.inline
        def setGb(value: String): Self = StObject.set(x, "Gb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGbUndefined: Self = StObject.set(x, "Gb", js.undefined)
        
        @scala.inline
        def setKb(value: String): Self = StObject.set(x, "Kb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKbUndefined: Self = StObject.set(x, "Kb", js.undefined)
        
        @scala.inline
        def setMb(value: String): Self = StObject.set(x, "Mb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMbUndefined: Self = StObject.set(x, "Mb", js.undefined)
        
        @scala.inline
        def setPb(value: String): Self = StObject.set(x, "Pb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPbUndefined: Self = StObject.set(x, "Pb", js.undefined)
        
        @scala.inline
        def setTb(value: String): Self = StObject.set(x, "Tb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTbUndefined: Self = StObject.set(x, "Tb", js.undefined)
        
        @scala.inline
        def setYb(value: String): Self = StObject.set(x, "Yb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYbUndefined: Self = StObject.set(x, "Yb", js.undefined)
        
        @scala.inline
        def setZb(value: String): Self = StObject.set(x, "Zb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZbUndefined: Self = StObject.set(x, "Zb", js.undefined)
      }
    }
    
    @js.native
    trait SiJedecBytes extends StObject {
      
      var B: js.UndefOr[String] = js.native
      
      var EB: js.UndefOr[String] = js.native
      
      var GB: js.UndefOr[String] = js.native
      
      var KB: js.UndefOr[String] = js.native
      
      var MB: js.UndefOr[String] = js.native
      
      var PB: js.UndefOr[String] = js.native
      
      var TB: js.UndefOr[String] = js.native
      
      var YB: js.UndefOr[String] = js.native
      
      var ZB: js.UndefOr[String] = js.native
    }
    object SiJedecBytes {
      
      @scala.inline
      def apply(): SiJedecBytes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SiJedecBytes]
      }
      
      @scala.inline
      implicit class SiJedecBytesMutableBuilder[Self <: SiJedecBytes] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBUndefined: Self = StObject.set(x, "B", js.undefined)
        
        @scala.inline
        def setEB(value: String): Self = StObject.set(x, "EB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEBUndefined: Self = StObject.set(x, "EB", js.undefined)
        
        @scala.inline
        def setGB(value: String): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGBUndefined: Self = StObject.set(x, "GB", js.undefined)
        
        @scala.inline
        def setKB(value: String): Self = StObject.set(x, "KB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKBUndefined: Self = StObject.set(x, "KB", js.undefined)
        
        @scala.inline
        def setMB(value: String): Self = StObject.set(x, "MB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMBUndefined: Self = StObject.set(x, "MB", js.undefined)
        
        @scala.inline
        def setPB(value: String): Self = StObject.set(x, "PB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPBUndefined: Self = StObject.set(x, "PB", js.undefined)
        
        @scala.inline
        def setTB(value: String): Self = StObject.set(x, "TB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTBUndefined: Self = StObject.set(x, "TB", js.undefined)
        
        @scala.inline
        def setYB(value: String): Self = StObject.set(x, "YB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYBUndefined: Self = StObject.set(x, "YB", js.undefined)
        
        @scala.inline
        def setZB(value: String): Self = StObject.set(x, "ZB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZBUndefined: Self = StObject.set(x, "ZB", js.undefined)
      }
    }
  }
  
  type _To = Filesize
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Filesize = ^
}
