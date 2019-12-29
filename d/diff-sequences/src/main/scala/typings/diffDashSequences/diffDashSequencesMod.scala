package typings.diffDashSequences

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff-sequences", JSImport.Namespace)
@js.native
object diffDashSequencesMod extends js.Object {
  @js.native
  trait Callbacks extends js.Object {
    @JSName("foundSubsequence")
    var foundSubsequence_Original: FoundSubsequence = js.native
    @JSName("isCommon")
    var isCommon_Original: IsCommon = js.native
    def foundSubsequence(
       // caller can assume: 0 < nCommon
    nCommon: Double,
       // caller can assume: 0 <= aCommon && aCommon < aLength
    aCommon: Double,
      bCommon: Double
    ): Unit = js.native
    def isCommon( // caller can assume: 0 <= aIndex && aIndex < aLength
    aIndex: Double, bIndex: Double): Boolean = js.native
  }
  
  def default(aLength: Double, bLength: Double, isCommon: IsCommon, foundSubsequence: FoundSubsequence): Unit = js.native
  type FoundSubsequence = js.Function3[/* nCommon */ Double, /* aCommon */ Double, /* bCommon */ Double, Unit]
  type IsCommon = js.Function2[/* aIndex */ Double, /* bIndex */ Double, Boolean]
}

