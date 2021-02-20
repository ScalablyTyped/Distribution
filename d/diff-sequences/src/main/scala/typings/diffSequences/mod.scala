package typings.diffSequences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diff-sequences", JSImport.Default)
  @js.native
  def default(aLength: Double, bLength: Double, isCommon: IsCommon, foundSubsequence: FoundSubsequence): Unit = js.native
  
  @js.native
  trait Callbacks extends StObject {
    
    def foundSubsequence(
      nCommon: Double,
      // caller can assume: 0 < nCommon
    aCommon: Double,
      // caller can assume: 0 <= aCommon && aCommon < aLength
    bCommon: Double
    ): Unit = js.native
    @JSName("foundSubsequence")
    var foundSubsequence_Original: FoundSubsequence = js.native
    
    def isCommon(aIndex: Double, // caller can assume: 0 <= aIndex && aIndex < aLength
    bIndex: Double): Boolean = js.native
    @JSName("isCommon")
    var isCommon_Original: IsCommon = js.native
  }
  
  type FoundSubsequence = js.Function3[/* nCommon */ Double, /* aCommon */ Double, /* bCommon */ Double, Unit]
  
  type IsCommon = js.Function2[/* aIndex */ Double, /* bIndex */ Double, Boolean]
}
