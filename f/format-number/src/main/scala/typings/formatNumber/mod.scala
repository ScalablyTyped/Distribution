package typings.formatNumber

import typings.formatNumber.formatNumberStrings.brackets
import typings.formatNumber.formatNumberStrings.left
import typings.formatNumber.formatNumberStrings.none
import typings.formatNumber.formatNumberStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("format-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): format = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[format]
  inline def default(options: IFormatNumberOptions): format = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[format]
  
  trait IFormatNumberOptions extends StObject {
    
    var decimal: js.UndefOr[String] = js.undefined
    
    var decimalsSeparator: js.UndefOr[String] = js.undefined
    
    var integerSeparator: js.UndefOr[String] = js.undefined
    
    var negativeLeftOut: js.UndefOr[Boolean] = js.undefined
    
    var negativeLeftSymbol: js.UndefOr[String] = js.undefined
    
    var negativeRightOut: js.UndefOr[Boolean] = js.undefined
    
    var negativeRightSymbol: js.UndefOr[String] = js.undefined
    
    var negativeType: js.UndefOr[right | left | brackets | none] = js.undefined
    
    var padLeft: js.UndefOr[Double] = js.undefined
    
    var padRight: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var round: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var truncate: js.UndefOr[Double] = js.undefined
  }
  object IFormatNumberOptions {
    
    inline def apply(): IFormatNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFormatNumberOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFormatNumberOptions] (val x: Self) extends AnyVal {
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setDecimalsSeparator(value: String): Self = StObject.set(x, "decimalsSeparator", value.asInstanceOf[js.Any])
      
      inline def setDecimalsSeparatorUndefined: Self = StObject.set(x, "decimalsSeparator", js.undefined)
      
      inline def setIntegerSeparator(value: String): Self = StObject.set(x, "integerSeparator", value.asInstanceOf[js.Any])
      
      inline def setIntegerSeparatorUndefined: Self = StObject.set(x, "integerSeparator", js.undefined)
      
      inline def setNegativeLeftOut(value: Boolean): Self = StObject.set(x, "negativeLeftOut", value.asInstanceOf[js.Any])
      
      inline def setNegativeLeftOutUndefined: Self = StObject.set(x, "negativeLeftOut", js.undefined)
      
      inline def setNegativeLeftSymbol(value: String): Self = StObject.set(x, "negativeLeftSymbol", value.asInstanceOf[js.Any])
      
      inline def setNegativeLeftSymbolUndefined: Self = StObject.set(x, "negativeLeftSymbol", js.undefined)
      
      inline def setNegativeRightOut(value: Boolean): Self = StObject.set(x, "negativeRightOut", value.asInstanceOf[js.Any])
      
      inline def setNegativeRightOutUndefined: Self = StObject.set(x, "negativeRightOut", js.undefined)
      
      inline def setNegativeRightSymbol(value: String): Self = StObject.set(x, "negativeRightSymbol", value.asInstanceOf[js.Any])
      
      inline def setNegativeRightSymbolUndefined: Self = StObject.set(x, "negativeRightSymbol", js.undefined)
      
      inline def setNegativeType(value: right | left | brackets | none): Self = StObject.set(x, "negativeType", value.asInstanceOf[js.Any])
      
      inline def setNegativeTypeUndefined: Self = StObject.set(x, "negativeType", js.undefined)
      
      inline def setPadLeft(value: Double): Self = StObject.set(x, "padLeft", value.asInstanceOf[js.Any])
      
      inline def setPadLeftUndefined: Self = StObject.set(x, "padLeft", js.undefined)
      
      inline def setPadRight(value: Double): Self = StObject.set(x, "padRight", value.asInstanceOf[js.Any])
      
      inline def setPadRightUndefined: Self = StObject.set(x, "padRight", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
  
  trait IFormatNumberOverrideOptions extends StObject {
    
    var noSeparator: js.UndefOr[Boolean] = js.undefined
    
    var noUnits: js.UndefOr[Boolean] = js.undefined
  }
  object IFormatNumberOverrideOptions {
    
    inline def apply(): IFormatNumberOverrideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFormatNumberOverrideOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFormatNumberOverrideOptions] (val x: Self) extends AnyVal {
      
      inline def setNoSeparator(value: Boolean): Self = StObject.set(x, "noSeparator", value.asInstanceOf[js.Any])
      
      inline def setNoSeparatorUndefined: Self = StObject.set(x, "noSeparator", js.undefined)
      
      inline def setNoUnits(value: Boolean): Self = StObject.set(x, "noUnits", value.asInstanceOf[js.Any])
      
      inline def setNoUnitsUndefined: Self = StObject.set(x, "noUnits", js.undefined)
    }
  }
  
  type format = js.Function2[
    /* number */ Double, 
    /* overrideOptions */ js.UndefOr[IFormatNumberOverrideOptions], 
    String
  ]
}
