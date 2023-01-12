package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlFilterRef extends StObject {
  
  var filter_id: Id
  
  var filter_type: js.UndefOr[MlFilterType] = js.undefined
}
object MlFilterRef {
  
  inline def apply(filter_id: Id): MlFilterRef = {
    val __obj = js.Dynamic.literal(filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFilterRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlFilterRef] (val x: Self) extends AnyVal {
    
    inline def setFilter_id(value: Id): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
    
    inline def setFilter_type(value: MlFilterType): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    inline def setFilter_typeUndefined: Self = StObject.set(x, "filter_type", js.undefined)
  }
}
