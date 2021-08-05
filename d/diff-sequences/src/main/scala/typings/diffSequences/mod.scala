package typings.diffSequences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diff-sequences", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(aLength: Double, bLength: Double, isCommon: IsCommon, foundSubsequence: FoundSubsequence): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(aLength.asInstanceOf[js.Any], bLength.asInstanceOf[js.Any], isCommon.asInstanceOf[js.Any], foundSubsequence.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Callbacks extends StObject {
    
    def foundSubsequence(
      nCommon: Double,
      // caller can assume: 0 < nCommon
    aCommon: Double,
      // caller can assume: 0 <= aCommon && aCommon < aLength
    bCommon: Double
    ): Unit
    @JSName("foundSubsequence")
    var foundSubsequence_Original: FoundSubsequence
    
    def isCommon(aIndex: Double, // caller can assume: 0 <= aIndex && aIndex < aLength
    bIndex: Double): Boolean
    @JSName("isCommon")
    var isCommon_Original: IsCommon
  }
  object Callbacks {
    
    inline def apply(
      foundSubsequence: (/* nCommon */ Double, /* aCommon */ Double, /* bCommon */ Double) => Unit,
      isCommon: (/* aIndex */ Double, /* bIndex */ Double) => Boolean
    ): Callbacks = {
      val __obj = js.Dynamic.literal(foundSubsequence = js.Any.fromFunction3(foundSubsequence), isCommon = js.Any.fromFunction2(isCommon))
      __obj.asInstanceOf[Callbacks]
    }
    
    extension [Self <: Callbacks](x: Self) {
      
      inline def setFoundSubsequence(value: (/* nCommon */ Double, /* aCommon */ Double, /* bCommon */ Double) => Unit): Self = StObject.set(x, "foundSubsequence", js.Any.fromFunction3(value))
      
      inline def setIsCommon(value: (/* aIndex */ Double, /* bIndex */ Double) => Boolean): Self = StObject.set(x, "isCommon", js.Any.fromFunction2(value))
    }
  }
  
  type FoundSubsequence = js.Function3[/* nCommon */ Double, /* aCommon */ Double, /* bCommon */ Double, Unit]
  
  type IsCommon = js.Function2[/* aIndex */ Double, /* bIndex */ Double, Boolean]
}
