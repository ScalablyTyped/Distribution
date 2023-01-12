package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageDataStreams
  extends StObject
     with XpackUsageBase {
  
  var data_streams: long
  
  var indices_count: long
}
object XpackUsageDataStreams {
  
  inline def apply(available: Boolean, data_streams: long, enabled: Boolean, indices_count: long): XpackUsageDataStreams = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], data_streams = data_streams.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], indices_count = indices_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageDataStreams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageDataStreams] (val x: Self) extends AnyVal {
    
    inline def setData_streams(value: long): Self = StObject.set(x, "data_streams", value.asInstanceOf[js.Any])
    
    inline def setIndices_count(value: long): Self = StObject.set(x, "indices_count", value.asInstanceOf[js.Any])
  }
}
