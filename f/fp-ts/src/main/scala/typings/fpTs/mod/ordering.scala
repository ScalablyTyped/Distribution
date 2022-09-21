package typings.fpTs.mod

import typings.fpTs.orderingMod.Ordering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ordering {
  
  @JSImport("fp-ts", "ordering")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "ordering.Eq")
  @js.native
  val Eq: typings.fpTs.eqMod.Eq[Ordering] = js.native
  
  @JSImport("fp-ts", "ordering.Monoid")
  @js.native
  val Monoid: typings.fpTs.monoidMod.Monoid[Ordering] = js.native
  
  @JSImport("fp-ts", "ordering.Semigroup")
  @js.native
  val Semigroup: typings.fpTs.semigroupMod.Semigroup[Ordering] = js.native
  
  @JSImport("fp-ts", "ordering.eqOrdering")
  @js.native
  val eqOrdering: typings.fpTs.eqMod.Eq[Ordering] = js.native
  
  inline def invert(o: Ordering): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(o.asInstanceOf[js.Any]).asInstanceOf[Ordering]
  
  inline def `match`[A](onLessThan: js.Function0[A], onEqual: js.Function0[A], onGreaterThan: js.Function0[A]): js.Function1[/* o */ Ordering, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLessThan.asInstanceOf[js.Any], onEqual.asInstanceOf[js.Any], onGreaterThan.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* o */ Ordering, A]]
  
  inline def matchW[A, B, C](onLessThan: js.Function0[A], onEqual: js.Function0[B], onGreaterThan: js.Function0[C]): js.Function1[/* o */ Ordering, A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLessThan.asInstanceOf[js.Any], onEqual.asInstanceOf[js.Any], onGreaterThan.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* o */ Ordering, A | B | C]]
  
  @JSImport("fp-ts", "ordering.monoidOrdering")
  @js.native
  val monoidOrdering: typings.fpTs.monoidMod.Monoid[Ordering] = js.native
  
  inline def reverse(o: Ordering): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(o.asInstanceOf[js.Any]).asInstanceOf[Ordering]
  
  @JSImport("fp-ts", "ordering.semigroupOrdering")
  @js.native
  val semigroupOrdering: typings.fpTs.semigroupMod.Semigroup[Ordering] = js.native
  
  inline def sign(n: Double): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[Ordering]
}
