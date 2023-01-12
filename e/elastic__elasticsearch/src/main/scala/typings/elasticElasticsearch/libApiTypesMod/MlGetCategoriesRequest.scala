package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetCategoriesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var category_id: js.UndefOr[CategoryId] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var job_id: Id
  
  var page: js.UndefOr[MlPage] = js.undefined
  
  var partition_field_value: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object MlGetCategoriesRequest {
  
  inline def apply(job_id: Id): MlGetCategoriesRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCategoriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetCategoriesRequest] (val x: Self) extends AnyVal {
    
    inline def setCategory_id(value: CategoryId): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
    
    inline def setCategory_idUndefined: Self = StObject.set(x, "category_id", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setPage(value: MlPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPartition_field_value(value: String): Self = StObject.set(x, "partition_field_value", value.asInstanceOf[js.Any])
    
    inline def setPartition_field_valueUndefined: Self = StObject.set(x, "partition_field_value", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
