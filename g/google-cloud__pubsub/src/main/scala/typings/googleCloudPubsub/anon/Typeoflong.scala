package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflong extends StObject {
  
  var fixed64: Double
  
  var int64: Double
  
  var sfixed64: Double
  
  var sint64: Double
  
  var uint64: Double
}
object Typeoflong {
  
  inline def apply(fixed64: Double, int64: Double, sfixed64: Double, sint64: Double, uint64: Double): Typeoflong = {
    val __obj = js.Dynamic.literal(fixed64 = fixed64.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], sfixed64 = sfixed64.asInstanceOf[js.Any], sint64 = sint64.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflong]
  }
  
  extension [Self <: Typeoflong](x: Self) {
    
    inline def setFixed64(value: Double): Self = StObject.set(x, "fixed64", value.asInstanceOf[js.Any])
    
    inline def setInt64(value: Double): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
    
    inline def setSfixed64(value: Double): Self = StObject.set(x, "sfixed64", value.asInstanceOf[js.Any])
    
    inline def setSint64(value: Double): Self = StObject.set(x, "sint64", value.asInstanceOf[js.Any])
    
    inline def setUint64(value: Double): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
  }
}
