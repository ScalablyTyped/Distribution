package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDownsampleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, use 'config' instead. */
  var body: js.UndefOr[IndicesDownsampleConfig] = js.undefined
  
  var index: IndexName
  
  var target_index: IndexName
}
object IndicesDownsampleRequest {
  
  inline def apply(index: IndexName, target_index: IndexName): IndicesDownsampleRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], target_index = target_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDownsampleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesDownsampleRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: IndicesDownsampleConfig): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setTarget_index(value: IndexName): Self = StObject.set(x, "target_index", value.asInstanceOf[js.Any])
  }
}
