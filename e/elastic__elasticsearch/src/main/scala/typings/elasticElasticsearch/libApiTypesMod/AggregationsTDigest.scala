package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTDigest extends StObject {
  
  var compression: js.UndefOr[integer] = js.undefined
}
object AggregationsTDigest {
  
  inline def apply(): AggregationsTDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsTDigest]
  }
  
  extension [Self <: AggregationsTDigest](x: Self) {
    
    inline def setCompression(value: integer): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
  }
}
