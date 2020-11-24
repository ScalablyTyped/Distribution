package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Id path of a model.
  */
@js.native
trait SchemaModelReference extends js.Object {
  
  /**
    * [Required] The ID of the dataset containing this model.
    */
  var datasetId: js.UndefOr[String] = js.native
  
  /**
    * [Required] The ID of the model. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024
    * characters.
    */
  var modelId: js.UndefOr[String] = js.native
  
  /**
    * [Required] The ID of the project containing this model.
    */
  var projectId: js.UndefOr[String] = js.native
}
object SchemaModelReference {
  
  @scala.inline
  def apply(): SchemaModelReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModelReference]
  }
  
  @scala.inline
  implicit class SchemaModelReferenceOps[Self <: SchemaModelReference] (val x: Self) extends AnyVal {
    
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
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    
    @scala.inline
    def setModelId(value: String): Self = this.set("modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelId: Self = this.set("modelId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
}
