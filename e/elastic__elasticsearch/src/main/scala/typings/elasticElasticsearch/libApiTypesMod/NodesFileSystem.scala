package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesFileSystem extends StObject {
  
  var data: js.UndefOr[js.Array[NodesDataPathStats]] = js.undefined
  
  var io_stats: js.UndefOr[NodesIoStats] = js.undefined
  
  var timestamp: js.UndefOr[long] = js.undefined
  
  var total: js.UndefOr[NodesFileSystemTotal] = js.undefined
}
object NodesFileSystem {
  
  inline def apply(): NodesFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesFileSystem]
  }
  
  extension [Self <: NodesFileSystem](x: Self) {
    
    inline def setData(value: js.Array[NodesDataPathStats]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: NodesDataPathStats*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIo_stats(value: NodesIoStats): Self = StObject.set(x, "io_stats", value.asInstanceOf[js.Any])
    
    inline def setIo_statsUndefined: Self = StObject.set(x, "io_stats", js.undefined)
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTotal(value: NodesFileSystemTotal): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
