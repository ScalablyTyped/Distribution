package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatistics extends StObject {
  
  var skipped: integer
  
  var successful: integer
  
  var total: integer
}
object ClusterStatistics {
  
  inline def apply(skipped: integer, successful: integer, total: integer): ClusterStatistics = {
    val __obj = js.Dynamic.literal(skipped = skipped.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatistics]
  }
  
  extension [Self <: ClusterStatistics](x: Self) {
    
    inline def setSkipped(value: integer): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setSuccessful(value: integer): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
