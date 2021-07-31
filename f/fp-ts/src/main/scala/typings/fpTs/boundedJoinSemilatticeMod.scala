package typings.fpTs

import typings.fpTs.joinSemilatticeMod.JoinSemilattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundedJoinSemilatticeMod {
  
  trait BoundedJoinSemilattice[A]
    extends StObject
       with JoinSemilattice[A] {
    
    val zero: A
  }
  object BoundedJoinSemilattice {
    
    @scala.inline
    def apply[A](join: (A, A) => A, zero: A): BoundedJoinSemilattice[A] = {
      val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundedJoinSemilattice[A]]
    }
    
    @scala.inline
    implicit class BoundedJoinSemilatticeMutableBuilder[Self <: BoundedJoinSemilattice[?], A] (val x: Self & BoundedJoinSemilattice[A]) extends AnyVal {
      
      @scala.inline
      def setZero(value: A): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    }
  }
}
