package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<std.IArguments, 'callee'> */
trait OmitIArgumentscallee extends StObject {
  
  var length: Double
}
object OmitIArgumentscallee {
  
  inline def apply(length: Double): OmitIArgumentscallee = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIArgumentscallee]
  }
  
  extension [Self <: OmitIArgumentscallee](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
