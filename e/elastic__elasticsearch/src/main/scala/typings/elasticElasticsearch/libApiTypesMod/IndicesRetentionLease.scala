package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRetentionLease extends StObject {
  
  var period: Duration
}
object IndicesRetentionLease {
  
  inline def apply(period: Duration): IndicesRetentionLease = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRetentionLease]
  }
  
  extension [Self <: IndicesRetentionLease](x: Self) {
    
    inline def setPeriod(value: Duration): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
  }
}
