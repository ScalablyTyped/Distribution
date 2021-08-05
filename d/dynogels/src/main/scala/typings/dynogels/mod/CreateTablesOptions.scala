package typings.dynogels.mod

import typings.dynogels.anon.StreamEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTablesOptions extends StObject {
  
  var readCapacity: js.UndefOr[Double] = js.undefined
  
  var streamSpecification: js.UndefOr[StreamEnabled] = js.undefined
  
  var writeCapacity: js.UndefOr[Double] = js.undefined
}
object CreateTablesOptions {
  
  inline def apply(): CreateTablesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTablesOptions]
  }
  
  extension [Self <: CreateTablesOptions](x: Self) {
    
    inline def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUndefined: Self = StObject.set(x, "readCapacity", js.undefined)
    
    inline def setStreamSpecification(value: StreamEnabled): Self = StObject.set(x, "streamSpecification", value.asInstanceOf[js.Any])
    
    inline def setStreamSpecificationUndefined: Self = StObject.set(x, "streamSpecification", js.undefined)
    
    inline def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUndefined: Self = StObject.set(x, "writeCapacity", js.undefined)
  }
}
