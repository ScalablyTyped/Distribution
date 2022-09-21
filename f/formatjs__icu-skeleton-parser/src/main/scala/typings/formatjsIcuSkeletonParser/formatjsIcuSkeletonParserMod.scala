package typings.formatjsIcuSkeletonParser

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.compact
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.engineering
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.scientific
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.standard
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCompactDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencyDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencySign
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsLocaleMatcher
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsNotation
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsStyle
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsUnitDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatjsIcuSkeletonParserMod {
  
  @JSImport("@formatjs/icu-skeleton-parser/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseNumberSkeleton(tokens: js.Array[NumberSkeletonToken]): ExtendedNumberFormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumberSkeleton")(tokens.asInstanceOf[js.Any]).asInstanceOf[ExtendedNumberFormatOptions]
  
  inline def parseNumberSkeletonFromString(skeleton: String): js.Array[NumberSkeletonToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumberSkeletonFromString")(skeleton.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberSkeletonToken]]
  
  trait ExtendedNumberFormatOptions
    extends StObject
       with NumberFormatOptions {
    
    var scale: js.UndefOr[Double] = js.undefined
  }
  object ExtendedNumberFormatOptions {
    
    inline def apply(
      compactDisplay: (js.UndefOr[short | long]) & js.UndefOr[NumberFormatOptionsCompactDisplay],
      currencyDisplay: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencyDisplay],
      currencySign: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencySign],
      localeMatcher: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsLocaleMatcher],
      notation: (js.UndefOr[standard | scientific | engineering | compact]) & js.UndefOr[NumberFormatOptionsNotation],
      style: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsStyle],
      unitDisplay: (js.UndefOr[short | long | narrow]) & js.UndefOr[NumberFormatOptionsUnitDisplay]
    ): ExtendedNumberFormatOptions = {
      val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedNumberFormatOptions]
    }
    
    extension [Self <: ExtendedNumberFormatOptions](x: Self) {
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  trait NumberSkeletonToken extends StObject {
    
    var options: js.Array[String]
    
    var stem: String
  }
  object NumberSkeletonToken {
    
    inline def apply(options: js.Array[String], stem: String): NumberSkeletonToken = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberSkeletonToken]
    }
    
    extension [Self <: NumberSkeletonToken](x: Self) {
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    }
  }
}
