package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmRetryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: IndexName
}
object IlmRetryRequest {
  
  inline def apply(index: IndexName): IlmRetryRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmRetryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IlmRetryRequest] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
