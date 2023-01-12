package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Throughput extends StObject {
  
  var readCapacity: Double
  
  var writeCapacity: Double
}
object Throughput {
  
  inline def apply(readCapacity: Double, writeCapacity: Double): Throughput = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throughput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Throughput] (val x: Self) extends AnyVal {
    
    inline def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
  }
}
