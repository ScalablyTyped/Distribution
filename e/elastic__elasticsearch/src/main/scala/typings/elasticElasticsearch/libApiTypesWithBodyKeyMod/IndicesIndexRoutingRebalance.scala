package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexRoutingRebalance extends StObject {
  
  var enable: IndicesIndexRoutingRebalanceOptions
}
object IndicesIndexRoutingRebalance {
  
  inline def apply(enable: IndicesIndexRoutingRebalanceOptions): IndicesIndexRoutingRebalance = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesIndexRoutingRebalance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexRoutingRebalance] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: IndicesIndexRoutingRebalanceOptions): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
  }
}
