package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageEql
  extends StObject
     with XpackUsageBase {
  
  var features: XpackUsageEqlFeatures
  
  var queries: Record[String, XpackUsageQuery]
}
object XpackUsageEql {
  
  inline def apply(
    available: Boolean,
    enabled: Boolean,
    features: XpackUsageEqlFeatures,
    queries: Record[String, XpackUsageQuery]
  ): XpackUsageEql = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageEql]
  }
  
  extension [Self <: XpackUsageEql](x: Self) {
    
    inline def setFeatures(value: XpackUsageEqlFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setQueries(value: Record[String, XpackUsageQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
  }
}
