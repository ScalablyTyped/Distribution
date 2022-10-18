package typings.fpTs

import typings.fpTs.libBoundedJoinSemilatticeMod.BoundedJoinSemilattice
import typings.fpTs.libBoundedMeetSemilatticeMod.BoundedMeetSemilattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundedLatticeMod {
  
  trait BoundedLattice[A]
    extends StObject
       with BoundedJoinSemilattice[A]
       with BoundedMeetSemilattice[A]
  object BoundedLattice {
    
    inline def apply[A](join: (A, A) => A, meet: (A, A) => A, one: A, zero: A): BoundedLattice[A] = {
      val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundedLattice[A]]
    }
  }
}
