package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlGetAsyncStatusRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object SqlGetAsyncStatusRequest {
  
  inline def apply(id: Id): SqlGetAsyncStatusRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlGetAsyncStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlGetAsyncStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
