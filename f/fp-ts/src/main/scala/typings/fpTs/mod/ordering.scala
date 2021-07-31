package typings.fpTs.mod

import typings.fpTs.eqMod.Eq
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.orderingMod.Ordering
import typings.fpTs.semigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ordering {
  
  @JSImport("fp-ts", "ordering")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "ordering.eqOrdering")
  @js.native
  val eqOrdering: Eq[Ordering] = js.native
  
  @scala.inline
  def invert(O: Ordering): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(O.asInstanceOf[js.Any]).asInstanceOf[Ordering]
  
  @JSImport("fp-ts", "ordering.monoidOrdering")
  @js.native
  val monoidOrdering: Monoid[Ordering] = js.native
  
  @JSImport("fp-ts", "ordering.semigroupOrdering")
  @js.native
  val semigroupOrdering: Semigroup[Ordering] = js.native
  
  @scala.inline
  def sign(n: Double): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[Ordering]
}
