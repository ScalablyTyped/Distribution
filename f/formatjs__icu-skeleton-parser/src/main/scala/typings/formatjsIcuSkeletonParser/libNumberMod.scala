package typings.formatjsIcuSkeletonParser

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberMod {
  
  @JSImport("@formatjs/icu-skeleton-parser/lib/number", JSImport.Namespace)
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
    
    inline def apply(): ExtendedNumberFormatOptions = {
      val __obj = js.Dynamic.literal()
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
