package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAggregation extends StObject {
  
  var meta: js.UndefOr[Metadata] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object AggregationsAggregation {
  
  inline def apply(): AggregationsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsAggregation] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Metadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
