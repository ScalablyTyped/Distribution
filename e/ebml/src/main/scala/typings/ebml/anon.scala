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
    
    extension [Self <: Length](x: Self) {
      
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
    
    extension [Self <: PickTagStackItemend](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    }
  }
}
