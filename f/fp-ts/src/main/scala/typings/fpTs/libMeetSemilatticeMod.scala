package typings.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMeetSemilatticeMod {
  
  trait MeetSemilattice[A] extends StObject {
    
    def meet(x: A, y: A): A
  }
  object MeetSemilattice {
    
    inline def apply[A](meet: (A, A) => A): MeetSemilattice[A] = {
      val __obj = js.Dynamic.literal(meet = js.Any.fromFunction2(meet))
      __obj.asInstanceOf[MeetSemilattice[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MeetSemilattice[?], A] (val x: Self & MeetSemilattice[A]) extends AnyVal {
      
      inline def setMeet(value: (A, A) => A): Self = StObject.set(x, "meet", js.Any.fromFunction2(value))
    }
  }
}
