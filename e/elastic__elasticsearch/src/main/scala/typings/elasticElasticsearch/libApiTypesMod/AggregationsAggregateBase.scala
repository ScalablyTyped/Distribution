package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAggregateBase extends StObject {
  
  var meta: js.UndefOr[Metadata] = js.undefined
}
object AggregationsAggregateBase {
  
  inline def apply(): AggregationsAggregateBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsAggregateBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsAggregateBase] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Metadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
