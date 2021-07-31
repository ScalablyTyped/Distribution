package typings.eventIterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<event-iterator.event-iterator/lib/event-iterator.EventIteratorOptions> */
  trait PartialEventIteratorOptio extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var lowWaterMark: js.UndefOr[Double] = js.undefined
  }
  object PartialEventIteratorOptio {
    
    @scala.inline
    def apply(): PartialEventIteratorOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEventIteratorOptio]
    }
    
    @scala.inline
    implicit class PartialEventIteratorOptioMutableBuilder[Self <: PartialEventIteratorOptio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setLowWaterMark(value: Double): Self = StObject.set(x, "lowWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowWaterMarkUndefined: Self = StObject.set(x, "lowWaterMark", js.undefined)
    }
  }
}
