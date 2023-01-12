package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesRetentionLease] (val x: Self) extends AnyVal {
    
    inline def setPeriod(value: Duration): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
  }
}
