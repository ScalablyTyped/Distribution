package typings.fpTs

import typings.fpTs.joinSemilatticeMod.JoinSemilattice
import typings.fpTs.meetSemilatticeMod.MeetSemilattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latticeMod {
  
  trait Lattice[A]
    extends StObject
       with JoinSemilattice[A]
       with MeetSemilattice[A]
  object Lattice {
    
    @scala.inline
    def apply[A](join: (A, A) => A, meet: (A, A) => A): Lattice[A] = {
      val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet))
      __obj.asInstanceOf[Lattice[A]]
    }
  }
}
