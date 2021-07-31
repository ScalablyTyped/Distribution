package typings.fpTs

import typings.fpTs.eqMod.Eq
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.semigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderingMod {
  
  @JSImport("fp-ts/lib/Ordering", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Ordering", "eqOrdering")
  @js.native
  val eqOrdering: Eq[Ordering] = js.native
  
  @scala.inline
  def invert(O: Ordering): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(O.asInstanceOf[js.Any]).asInstanceOf[Ordering]
  
  @JSImport("fp-ts/lib/Ordering", "monoidOrdering")
  @js.native
  val monoidOrdering: Monoid[Ordering] = js.native
  
  @JSImport("fp-ts/lib/Ordering", "semigroupOrdering")
  @js.native
  val semigroupOrdering: Semigroup[Ordering] = js.native
  
  @scala.inline
  def sign(n: Double): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[Ordering]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fpTs.fpTsNumbers.`-1`
    - typings.fpTs.fpTsNumbers.`0`
    - typings.fpTs.fpTsNumbers.`1`
  */
  trait Ordering extends StObject
  object Ordering {
    
    @scala.inline
    def `-1`: typings.fpTs.fpTsNumbers.`-1` = -1.asInstanceOf[typings.fpTs.fpTsNumbers.`-1`]
    
    @scala.inline
    def `0`: typings.fpTs.fpTsNumbers.`0` = 0.asInstanceOf[typings.fpTs.fpTsNumbers.`0`]
    
    @scala.inline
    def `1`: typings.fpTs.fpTsNumbers.`1` = 1.asInstanceOf[typings.fpTs.fpTsNumbers.`1`]
  }
}
