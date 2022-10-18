package typings.fpTs.mod

import typings.fpTs.libMagmaMod.Magma
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object number {
  
  @JSImport("fp-ts", "number.Bounded")
  @js.native
  val Bounded: typings.fpTs.libBoundedMod.Bounded[Double] = js.native
  
  @JSImport("fp-ts", "number.Eq")
  @js.native
  val Eq: typings.fpTs.libEqMod.Eq[Double] = js.native
  
  @JSImport("fp-ts", "number.Field")
  @js.native
  val Field: typings.fpTs.libFieldMod.Field[Double] = js.native
  
  @JSImport("fp-ts", "number.MagmaSub")
  @js.native
  val MagmaSub: Magma[Double] = js.native
  
  @JSImport("fp-ts", "number.MonoidProduct")
  @js.native
  val MonoidProduct: Monoid[Double] = js.native
  
  @JSImport("fp-ts", "number.MonoidSum")
  @js.native
  val MonoidSum: Monoid[Double] = js.native
  
  @JSImport("fp-ts", "number.Ord")
  @js.native
  val Ord: Ord_[Double] = js.native
  
  @JSImport("fp-ts", "number.SemigroupProduct")
  @js.native
  val SemigroupProduct: Semigroup[Double] = js.native
  
  @JSImport("fp-ts", "number.SemigroupSum")
  @js.native
  val SemigroupSum: Semigroup[Double] = js.native
  
  @JSImport("fp-ts", "number.Show")
  @js.native
  val Show: typings.fpTs.libShowMod.Show[Double] = js.native
  
  @JSImport("fp-ts", "number.isNumber")
  @js.native
  val isNumber: Refinement[Any, Double] = js.native
}
