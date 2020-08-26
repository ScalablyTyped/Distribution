package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaDatasetReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetReference extends js.Object {
  var datasetReference: js.UndefOr[SchemaDatasetReference] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  var location: js.UndefOr[String] = js.native
}

object DatasetReference {
  @scala.inline
  def apply(): DatasetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetReference]
  }
  @scala.inline
  implicit class DatasetReferenceOps[Self <: DatasetReference] (val x: Self) extends AnyVal {
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
    def setDatasetReference(value: SchemaDatasetReference): Self = this.set("datasetReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetReference: Self = this.set("datasetReference", js.undefined)
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

