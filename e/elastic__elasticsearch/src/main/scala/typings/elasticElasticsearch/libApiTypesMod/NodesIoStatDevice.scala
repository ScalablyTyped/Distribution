package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesIoStatDevice extends StObject {
  
  var device_name: js.UndefOr[String] = js.undefined
  
  var operations: js.UndefOr[long] = js.undefined
  
  var read_kilobytes: js.UndefOr[long] = js.undefined
  
  var read_operations: js.UndefOr[long] = js.undefined
  
  var write_kilobytes: js.UndefOr[long] = js.undefined
  
  var write_operations: js.UndefOr[long] = js.undefined
}
object NodesIoStatDevice {
  
  inline def apply(): NodesIoStatDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesIoStatDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesIoStatDevice] (val x: Self) extends AnyVal {
    
    inline def setDevice_name(value: String): Self = StObject.set(x, "device_name", value.asInstanceOf[js.Any])
    
    inline def setDevice_nameUndefined: Self = StObject.set(x, "device_name", js.undefined)
    
    inline def setOperations(value: long): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setRead_kilobytes(value: long): Self = StObject.set(x, "read_kilobytes", value.asInstanceOf[js.Any])
    
    inline def setRead_kilobytesUndefined: Self = StObject.set(x, "read_kilobytes", js.undefined)
    
    inline def setRead_operations(value: long): Self = StObject.set(x, "read_operations", value.asInstanceOf[js.Any])
    
    inline def setRead_operationsUndefined: Self = StObject.set(x, "read_operations", js.undefined)
    
    inline def setWrite_kilobytes(value: long): Self = StObject.set(x, "write_kilobytes", value.asInstanceOf[js.Any])
    
    inline def setWrite_kilobytesUndefined: Self = StObject.set(x, "write_kilobytes", js.undefined)
    
    inline def setWrite_operations(value: long): Self = StObject.set(x, "write_operations", value.asInstanceOf[js.Any])
    
    inline def setWrite_operationsUndefined: Self = StObject.set(x, "write_operations", js.undefined)
  }
}
