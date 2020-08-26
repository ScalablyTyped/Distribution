package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDatasetReference extends js.Object {
  /**
    * [Required] A unique ID for this dataset, without the project name. The ID
    * must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
    * The maximum length is 1,024 characters.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * [Optional] The ID of the project containing this dataset.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaDatasetReference {
  @scala.inline
  def apply(): SchemaDatasetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatasetReference]
  }
  @scala.inline
  implicit class SchemaDatasetReferenceOps[Self <: SchemaDatasetReference] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

