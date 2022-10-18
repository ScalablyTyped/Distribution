package typings.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJoinSemilatticeMod {
  
  trait JoinSemilattice[A] extends StObject {
    
    def join(x: A, y: A): A
  }
  object JoinSemilattice {
    
    inline def apply[A](join: (A, A) => A): JoinSemilattice[A] = {
      val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join))
      __obj.asInstanceOf[JoinSemilattice[A]]
    }
    
    extension [Self <: JoinSemilattice[?], A](x: Self & JoinSemilattice[A]) {
      
      inline def setJoin(value: (A, A) => A): Self = StObject.set(x, "join", js.Any.fromFunction2(value))
    }
  }
}
