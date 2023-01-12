package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSql
  extends StObject
     with XpackUsageBase {
  
  var features: Record[String, integer]
  
  var queries: Record[String, XpackUsageQuery]
}
object XpackUsageSql {
  
  inline def apply(
    available: Boolean,
    enabled: Boolean,
    features: Record[String, integer],
    queries: Record[String, XpackUsageQuery]
  ): XpackUsageSql = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSql]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageSql] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: Record[String, integer]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setQueries(value: Record[String, XpackUsageQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
  }
}
