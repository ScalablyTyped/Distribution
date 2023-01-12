package typings.ebml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Length extends StObject {
    
    var length: Double
    
    var value: Double
  }
  object Length {
    
    inline def apply(length: Double, value: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<ebml.ebml.Encoder.TagStackItem, 'end'> */
  trait PickTagStackItemend extends StObject {
    
    var end: Double
  }
  object PickTagStackItemend {
    
    inline def apply(end: Double): PickTagStackItemend = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickTagStackItemend]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickTagStackItemend] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    }
  }
}
