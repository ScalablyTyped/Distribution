package typings.fpTs

import typings.fpTs.libMagmaMod.Magma
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberMod {
  
  @JSImport("fp-ts/lib/number", "Bounded")
  @js.native
  val Bounded: typings.fpTs.libBoundedMod.Bounded[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "Eq")
  @js.native
  val Eq: typings.fpTs.libEqMod.Eq[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "Field")
  @js.native
  val Field: typings.fpTs.libFieldMod.Field[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "MagmaSub")
  @js.native
  val MagmaSub: Magma[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "MonoidProduct")
  @js.native
  val MonoidProduct: Monoid[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "MonoidSum")
  @js.native
  val MonoidSum: Monoid[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "Ord")
  @js.native
  val Ord: Ord_[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "SemigroupProduct")
  @js.native
  val SemigroupProduct: Semigroup[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "SemigroupSum")
  @js.native
  val SemigroupSum: Semigroup[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "Show")
  @js.native
  val Show: typings.fpTs.libShowMod.Show[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "isNumber")
  @js.native
  val isNumber: Refinement[Any, Double] = js.native
}
