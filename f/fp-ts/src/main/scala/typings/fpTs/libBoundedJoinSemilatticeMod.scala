package typings.fpTs

import typings.fpTs.libJoinSemilatticeMod.JoinSemilattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundedJoinSemilatticeMod {
  
  trait BoundedJoinSemilattice[A]
    extends StObject
       with JoinSemilattice[A] {
    
    val zero: A
  }
  object BoundedJoinSemilattice {
    
    inline def apply[A](join: (A, A) => A, zero: A): BoundedJoinSemilattice[A] = {
      val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundedJoinSemilattice[A]]
    }
    
    extension [Self <: BoundedJoinSemilattice[?], A](x: Self & BoundedJoinSemilattice[A]) {
      
      inline def setZero(value: A): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    }
  }
}
