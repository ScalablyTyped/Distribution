package typings.fpTs

import typings.fpTs.meetSemilatticeMod.MeetSemilattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundedMeetSemilatticeMod {
  
  trait BoundedMeetSemilattice[A]
    extends StObject
       with MeetSemilattice[A] {
    
    val one: A
  }
  object BoundedMeetSemilattice {
    
    @scala.inline
    def apply[A](meet: (A, A) => A, one: A): BoundedMeetSemilattice[A] = {
      val __obj = js.Dynamic.literal(meet = js.Any.fromFunction2(meet), one = one.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundedMeetSemilattice[A]]
    }
    
    @scala.inline
    implicit class BoundedMeetSemilatticeMutableBuilder[Self <: BoundedMeetSemilattice[?], A] (val x: Self & BoundedMeetSemilattice[A]) extends AnyVal {
      
      @scala.inline
      def setOne(value: A): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    }
  }
}
