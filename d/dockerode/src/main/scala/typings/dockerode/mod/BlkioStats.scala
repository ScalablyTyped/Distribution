package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlkioStats extends StObject {
  
  var io_merged_recursive: js.Array[BlkioStatEntry]
  
  var io_queue_recursive: js.Array[BlkioStatEntry]
  
  var io_service_bytes_recursive: js.Array[BlkioStatEntry]
  
  var io_service_time_recursive: js.Array[BlkioStatEntry]
  
  var io_serviced_recursive: js.Array[BlkioStatEntry]
  
  var io_time_recursive: js.Array[BlkioStatEntry]
  
  var io_wait_time_recursive: js.Array[BlkioStatEntry]
  
  var sectors_recursive: js.Array[BlkioStatEntry]
}
object BlkioStats {
  
  inline def apply(
    io_merged_recursive: js.Array[BlkioStatEntry],
    io_queue_recursive: js.Array[BlkioStatEntry],
    io_service_bytes_recursive: js.Array[BlkioStatEntry],
    io_service_time_recursive: js.Array[BlkioStatEntry],
    io_serviced_recursive: js.Array[BlkioStatEntry],
    io_time_recursive: js.Array[BlkioStatEntry],
    io_wait_time_recursive: js.Array[BlkioStatEntry],
    sectors_recursive: js.Array[BlkioStatEntry]
  ): BlkioStats = {
    val __obj = js.Dynamic.literal(io_merged_recursive = io_merged_recursive.asInstanceOf[js.Any], io_queue_recursive = io_queue_recursive.asInstanceOf[js.Any], io_service_bytes_recursive = io_service_bytes_recursive.asInstanceOf[js.Any], io_service_time_recursive = io_service_time_recursive.asInstanceOf[js.Any], io_serviced_recursive = io_serviced_recursive.asInstanceOf[js.Any], io_time_recursive = io_time_recursive.asInstanceOf[js.Any], io_wait_time_recursive = io_wait_time_recursive.asInstanceOf[js.Any], sectors_recursive = sectors_recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlkioStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlkioStats] (val x: Self) extends AnyVal {
    
    inline def setIo_merged_recursive(value: js.Array[BlkioStatEntry]): Self = StObject.set(x, "io_merged_recursive", value.asInstanceOf[js.Any])
    
    inline def setIo_merged_recursiveVarargs(value: BlkioStatEntry*): Self = StObject.set(x, "io_merged_recursive", js.Array(value*))
    
    inline def setIo_queue_recursive(value: js.Array[BlkioStatEntry]): Self = StObject.set(x, "io_queue_recursive", value.asInstanceOf[js.Any])
    
    inline def setIo_queue_recursiveVarargs(value: BlkioStatEntry*): Self = StObject.set(x, "io_queue_recursive", js.Array(value*))
    
    inline def setIo_service_bytes_recursive(value: js.Array[BlkioStatEntry]): Self = StObject.set(x, "io_service_bytes_recursive", value.asInstanceOf[js.Any])
    
    inline def setIo_service_bytes_recursiveVarargs(value: BlkioStatEntry*): Self = StObject.set(x, "io_service_bytes_recursive", js.Array(value*))
    
    inline def setIo_service_time_recursive(value: js.Array[BlkioStatEntry]): Self = StObject.set(x, "io_service_time_recursive", value.asInstanceOf[js.Any])
    
    inline def setIo_service_time_recursiveVarargs(value: BlkioStatEntry*): Self = StObject.set(x, "io_service_time_recursive", js.Array(value*))
    
    inline def setIo_serviced_recursive(value: js.Array[BlkioStatEntry]): Self = StObject.set(x, "io_serviced_recursive", value.asInstanceOf[js.Any])
    
    inline def setIo_serviced_recursiveVarargs(value: BlkioStatEntry*): Self = StObject.set(x, "io_serviced_recursive", js.Array(value*))
    
    inline def setIo_time_recursive(value: js.Array[BlkioStatEntry]): Self = StObject.set(x, "io_time_recursive", value.asInstanceOf[js.Any])
    
    inline def setIo_time_recursiveVarargs(value: BlkioStatEntry*): Self = StObject.set(x, "io_time_recursive", js.Array(value*))
    
    inline def setIo_wait_time_recursive(value: js.Array[BlkioStatEntry]): Self = StObject.set(x, "io_wait_time_recursive", value.asInstanceOf[js.Any])
    
    inline def setIo_wait_time_recursiveVarargs(value: BlkioStatEntry*): Self = StObject.set(x, "io_wait_time_recursive", js.Array(value*))
    
    inline def setSectors_recursive(value: js.Array[BlkioStatEntry]): Self = StObject.set(x, "sectors_recursive", value.asInstanceOf[js.Any])
    
    inline def setSectors_recursiveVarargs(value: BlkioStatEntry*): Self = StObject.set(x, "sectors_recursive", js.Array(value*))
  }
}
