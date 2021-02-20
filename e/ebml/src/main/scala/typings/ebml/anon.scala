package typings.ebml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Length extends StObject {
    
    var length: Double = js.native
    
    var value: Double = js.native
  }
  object Length {
    
    @scala.inline
    def apply(length: Double, value: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<ebml.ebml.Encoder.TagStackItem, 'end'> */
  @js.native
  trait PickTagStackItemend extends StObject {
    
    var end: Double = js.native
  }
  object PickTagStackItemend {
    
    @scala.inline
    def apply(end: Double): PickTagStackItemend = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickTagStackItemend]
    }
    
    @scala.inline
    implicit class PickTagStackItemendMutableBuilder[Self <: PickTagStackItemend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    }
  }
}
