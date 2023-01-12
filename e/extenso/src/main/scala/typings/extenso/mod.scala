package typings.extenso

import typings.extenso.anon.Decimal
import typings.extenso.anon.Type
import typings.extenso.extensoStrings.br
import typings.extenso.extensoStrings.currency
import typings.extenso.extensoStrings.formal
import typings.extenso.extensoStrings.informal
import typings.extenso.extensoStrings.long
import typings.extenso.extensoStrings.number
import typings.extenso.extensoStrings.pt
import typings.extenso.extensoStrings.short
import typings.extenso.mod.Extenso.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(number: String): String = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(number: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(number: Double): String = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(number: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("extenso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Extenso {
    
    trait BaseOptions extends StObject {
      
      var locale: js.UndefOr[br | pt] = js.undefined
      
      var negative: js.UndefOr[formal | informal] = js.undefined
      
      var scale: js.UndefOr[short | long] = js.undefined
    }
    object BaseOptions {
      
      inline def apply(): BaseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
        
        inline def setLocale(value: br | pt): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        inline def setNegative(value: formal | informal): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
        
        inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
        
        inline def setScale(value: short | long): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      }
    }
    
    trait CurrencyModeOptions
      extends StObject
         with BaseOptions
         with Options {
      
      var currency: js.UndefOr[Type] = js.undefined
      
      var mode: currency
    }
    object CurrencyModeOptions {
      
      inline def apply(): CurrencyModeOptions = {
        val __obj = js.Dynamic.literal(mode = "currency")
        __obj.asInstanceOf[CurrencyModeOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CurrencyModeOptions] (val x: Self) extends AnyVal {
        
        inline def setCurrency(value: Type): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setMode(value: currency): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      }
    }
    
    trait NumberModeOptions
      extends StObject
         with BaseOptions
         with Options {
      
      var mode: js.UndefOr[number] = js.undefined
      
      var number: js.UndefOr[Decimal] = js.undefined
    }
    object NumberModeOptions {
      
      inline def apply(): NumberModeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NumberModeOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NumberModeOptions] (val x: Self) extends AnyVal {
        
        inline def setMode(value: number): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setNumber(value: Decimal): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.extenso.mod.Extenso.NumberModeOptions
      - typings.extenso.mod.Extenso.CurrencyModeOptions
    */
    trait Options extends StObject
    object Options {
      
      inline def CurrencyModeOptions(): typings.extenso.mod.Extenso.CurrencyModeOptions = {
        val __obj = js.Dynamic.literal(mode = "currency")
        __obj.asInstanceOf[typings.extenso.mod.Extenso.CurrencyModeOptions]
      }
      
      inline def NumberModeOptions(): typings.extenso.mod.Extenso.NumberModeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.extenso.mod.Extenso.NumberModeOptions]
      }
    }
  }
}
