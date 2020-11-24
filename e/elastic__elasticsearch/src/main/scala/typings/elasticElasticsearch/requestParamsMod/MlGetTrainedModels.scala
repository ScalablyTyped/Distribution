package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetTrainedModels extends Generic {
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
  var decompress_definition: js.UndefOr[Boolean] = js.native
  
  var for_export: js.UndefOr[Boolean] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var include: js.UndefOr[String] = js.native
  
  var include_model_definition: js.UndefOr[Boolean] = js.native
  
  var model_id: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var tags: js.UndefOr[String | js.Array[String]] = js.native
}
object MlGetTrainedModels {
  
  @scala.inline
  def apply(): MlGetTrainedModels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetTrainedModels]
  }
  
  @scala.inline
  implicit class MlGetTrainedModelsOps[Self <: MlGetTrainedModels] (val x: Self) extends AnyVal {
    
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
    def setAllow_no_match(value: Boolean): Self = this.set("allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_match: Self = this.set("allow_no_match", js.undefined)
    
    @scala.inline
    def setDecompress_definition(value: Boolean): Self = this.set("decompress_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecompress_definition: Self = this.set("decompress_definition", js.undefined)
    
    @scala.inline
    def setFor_export(value: Boolean): Self = this.set("for_export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFor_export: Self = this.set("for_export", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setInclude_model_definition(value: Boolean): Self = this.set("include_model_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_model_definition: Self = this.set("include_model_definition", js.undefined)
    
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: String | js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
