package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetCategories[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var category_id: js.UndefOr[Double] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var job_id: String = js.native
  
  var partition_field_value: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object MlGetCategories {
  
  @scala.inline
  def apply[T](job_id: String): MlGetCategories[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCategories[T]]
  }
  
  @scala.inline
  implicit class MlGetCategoriesOps[Self <: MlGetCategories[_], T] (val x: Self with MlGetCategories[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCategory_id(value: Double): Self = this.set("category_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory_id: Self = this.set("category_id", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setPartition_field_value(value: String): Self = this.set("partition_field_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition_field_value: Self = this.set("partition_field_value", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
