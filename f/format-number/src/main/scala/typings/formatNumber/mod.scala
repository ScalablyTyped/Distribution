package typings.formatNumber

import typings.formatNumber.formatNumberStrings.brackets
import typings.formatNumber.formatNumberStrings.left
import typings.formatNumber.formatNumberStrings.none
import typings.formatNumber.formatNumberStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("format-number", JSImport.Default)
  @js.native
  def default(): format = js.native
  @JSImport("format-number", JSImport.Default)
  @js.native
  def default(options: IFormatNumberOptions): format = js.native
  
  @js.native
  trait IFormatNumberOptions extends StObject {
    
    var decimal: js.UndefOr[String] = js.native
    
    var decimalsSeparator: js.UndefOr[String] = js.native
    
    var integerSeparator: js.UndefOr[String] = js.native
    
    var negativeLeftOut: js.UndefOr[Boolean] = js.native
    
    var negativeLeftSymbol: js.UndefOr[String] = js.native
    
    var negativeRightOut: js.UndefOr[Boolean] = js.native
    
    var negativeRightSymbol: js.UndefOr[String] = js.native
    
    var negativeType: js.UndefOr[right | left | brackets | none] = js.native
    
    var padLeft: js.UndefOr[Double] = js.native
    
    var padRight: js.UndefOr[Double] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var round: js.UndefOr[Double] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var truncate: js.UndefOr[Double] = js.native
  }
  object IFormatNumberOptions {
    
    @scala.inline
    def apply(): IFormatNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFormatNumberOptions]
    }
    
    @scala.inline
    implicit class IFormatNumberOptionsMutableBuilder[Self <: IFormatNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setDecimalsSeparator(value: String): Self = StObject.set(x, "decimalsSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalsSeparatorUndefined: Self = StObject.set(x, "decimalsSeparator", js.undefined)
      
      @scala.inline
      def setIntegerSeparator(value: String): Self = StObject.set(x, "integerSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerSeparatorUndefined: Self = StObject.set(x, "integerSeparator", js.undefined)
      
      @scala.inline
      def setNegativeLeftOut(value: Boolean): Self = StObject.set(x, "negativeLeftOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeLeftOutUndefined: Self = StObject.set(x, "negativeLeftOut", js.undefined)
      
      @scala.inline
      def setNegativeLeftSymbol(value: String): Self = StObject.set(x, "negativeLeftSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeLeftSymbolUndefined: Self = StObject.set(x, "negativeLeftSymbol", js.undefined)
      
      @scala.inline
      def setNegativeRightOut(value: Boolean): Self = StObject.set(x, "negativeRightOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeRightOutUndefined: Self = StObject.set(x, "negativeRightOut", js.undefined)
      
      @scala.inline
      def setNegativeRightSymbol(value: String): Self = StObject.set(x, "negativeRightSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeRightSymbolUndefined: Self = StObject.set(x, "negativeRightSymbol", js.undefined)
      
      @scala.inline
      def setNegativeType(value: right | left | brackets | none): Self = StObject.set(x, "negativeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeTypeUndefined: Self = StObject.set(x, "negativeType", js.undefined)
      
      @scala.inline
      def setPadLeft(value: Double): Self = StObject.set(x, "padLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadLeftUndefined: Self = StObject.set(x, "padLeft", js.undefined)
      
      @scala.inline
      def setPadRight(value: Double): Self = StObject.set(x, "padRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadRightUndefined: Self = StObject.set(x, "padRight", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
  
  @js.native
  trait IFormatNumberOverrideOptions extends StObject {
    
    var noSeparator: js.UndefOr[Boolean] = js.native
    
    var noUnits: js.UndefOr[Boolean] = js.native
  }
  object IFormatNumberOverrideOptions {
    
    @scala.inline
    def apply(): IFormatNumberOverrideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFormatNumberOverrideOptions]
    }
    
    @scala.inline
    implicit class IFormatNumberOverrideOptionsMutableBuilder[Self <: IFormatNumberOverrideOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoSeparator(value: Boolean): Self = StObject.set(x, "noSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSeparatorUndefined: Self = StObject.set(x, "noSeparator", js.undefined)
      
      @scala.inline
      def setNoUnits(value: Boolean): Self = StObject.set(x, "noUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUnitsUndefined: Self = StObject.set(x, "noUnits", js.undefined)
    }
  }
  
  type format = js.Function2[
    /* number */ Double, 
    /* overrideOptions */ js.UndefOr[IFormatNumberOverrideOptions], 
    String
  ]
}
