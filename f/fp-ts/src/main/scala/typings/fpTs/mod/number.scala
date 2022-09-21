package typings.fpTs.mod

import typings.fpTs.magmaMod.Magma
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.ordMod.Ord_
import typings.fpTs.refinementMod.Refinement
import typings.fpTs.semigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object number {
  
  @JSImport("fp-ts", "number.Bounded")
  @js.native
  val Bounded: typings.fpTs.boundedMod.Bounded[Double] = js.native
  
  @JSImport("fp-ts", "number.Eq")
  @js.native
  val Eq: typings.fpTs.eqMod.Eq[Double] = js.native
  
  @JSImport("fp-ts", "number.Field")
  @js.native
  val Field: typings.fpTs.fieldMod.Field[Double] = js.native
  
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
  val Show: typings.fpTs.showMod.Show[Double] = js.native
  
  @JSImport("fp-ts", "number.isNumber")
  @js.native
  val isNumber: Refinement[Any, Double] = js.native
}
