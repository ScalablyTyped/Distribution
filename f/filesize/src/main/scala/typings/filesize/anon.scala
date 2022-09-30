package typings.filesize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: js.UndefOr[Double] = js.undefined
    
    var bits: js.UndefOr[Boolean] = js.undefined
    
    var exponent: js.UndefOr[Double] = js.undefined
    
    var fullform: js.UndefOr[Boolean] = js.undefined
    
    var fullforms: js.UndefOr[js.Array[Any]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var localeOptions: js.UndefOr[js.Object] = js.undefined
    
    var output: js.UndefOr[String] = js.undefined
    
    var pad: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var round: js.UndefOr[Double] = js.undefined
    
    var roundingMethod: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var spacer: js.UndefOr[String] = js.undefined
    
    var standard: js.UndefOr[String] = js.undefined
    
    var symbols: js.UndefOr[js.Object] = js.undefined
  }
  object Base {
    
    inline def apply(): Base = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBits(value: Boolean): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      inline def setFullform(value: Boolean): Self = StObject.set(x, "fullform", value.asInstanceOf[js.Any])
      
      inline def setFullformUndefined: Self = StObject.set(x, "fullform", js.undefined)
      
      inline def setFullforms(value: js.Array[Any]): Self = StObject.set(x, "fullforms", value.asInstanceOf[js.Any])
      
      inline def setFullformsUndefined: Self = StObject.set(x, "fullforms", js.undefined)
      
      inline def setFullformsVarargs(value: Any*): Self = StObject.set(x, "fullforms", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleOptions(value: js.Object): Self = StObject.set(x, "localeOptions", value.asInstanceOf[js.Any])
      
      inline def setLocaleOptionsUndefined: Self = StObject.set(x, "localeOptions", js.undefined)
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPad(value: Boolean): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setRoundingMethod(value: String): Self = StObject.set(x, "roundingMethod", value.asInstanceOf[js.Any])
      
      inline def setRoundingMethodUndefined: Self = StObject.set(x, "roundingMethod", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
      
      inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
      
      inline def setSymbols(value: js.Object): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
  
  trait Exponent extends StObject {
    
    var exponent: Double
    
    var symbol: Any
    
    var unit: String
    
    var value: Any
  }
  object Exponent {
    
    inline def apply(exponent: Double, symbol: Any, unit: String, value: Any): Exponent = {
      val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exponent]
    }
    
    extension [Self <: Exponent](x: Self) {
      
      inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: Any): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
