package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMonitoring
  extends StObject
     with XpackUsageBase {
  
  var collection_enabled: Boolean
  
  var enabled_exporters: Record[String, long]
}
object XpackUsageMonitoring {
  
  inline def apply(
    available: Boolean,
    collection_enabled: Boolean,
    enabled: Boolean,
    enabled_exporters: Record[String, long]
  ): XpackUsageMonitoring = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], collection_enabled = collection_enabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], enabled_exporters = enabled_exporters.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMonitoring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMonitoring] (val x: Self) extends AnyVal {
    
    inline def setCollection_enabled(value: Boolean): Self = StObject.set(x, "collection_enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabled_exporters(value: Record[String, long]): Self = StObject.set(x, "enabled_exporters", value.asInstanceOf[js.Any])
  }
}
