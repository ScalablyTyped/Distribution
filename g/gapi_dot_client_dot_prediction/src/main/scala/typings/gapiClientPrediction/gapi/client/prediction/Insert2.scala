package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClientPrediction.anon.ClassWeightedAccuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert2 extends js.Object {
  /** Insert time of the model (as a RFC 3339 timestamp). */
  var created: js.UndefOr[String] = js.native
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.native
  /** What kind of resource this is. */
  var kind: js.UndefOr[String] = js.native
  /** Model metadata. */
  var modelInfo: js.UndefOr[ClassWeightedAccuracy] = js.native
  /** Type of predictive model (CLASSIFICATION or REGRESSION). */
  var modelType: js.UndefOr[String] = js.native
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** Google storage location of the training data file. */
  var storageDataLocation: js.UndefOr[String] = js.native
  /** Google storage location of the preprocessing pmml file. */
  var storagePMMLLocation: js.UndefOr[String] = js.native
  /** Google storage location of the pmml model file. */
  var storagePMMLModelLocation: js.UndefOr[String] = js.native
  /** Training completion time (as a RFC 3339 timestamp). */
  var trainingComplete: js.UndefOr[String] = js.native
  /** The current status of the training job. This can be one of following: RUNNING; DONE; ERROR; ERROR: TRAINING JOB NOT FOUND */
  var trainingStatus: js.UndefOr[String] = js.native
}

object Insert2 {
  @scala.inline
  def apply(): Insert2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insert2]
  }
  @scala.inline
  implicit class Insert2Ops[Self <: Insert2] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setModelInfo(value: ClassWeightedAccuracy): Self = this.set("modelInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelInfo: Self = this.set("modelInfo", js.undefined)
    @scala.inline
    def setModelType(value: String): Self = this.set("modelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStorageDataLocation(value: String): Self = this.set("storageDataLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageDataLocation: Self = this.set("storageDataLocation", js.undefined)
    @scala.inline
    def setStoragePMMLLocation(value: String): Self = this.set("storagePMMLLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoragePMMLLocation: Self = this.set("storagePMMLLocation", js.undefined)
    @scala.inline
    def setStoragePMMLModelLocation(value: String): Self = this.set("storagePMMLModelLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoragePMMLModelLocation: Self = this.set("storagePMMLModelLocation", js.undefined)
    @scala.inline
    def setTrainingComplete(value: String): Self = this.set("trainingComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingComplete: Self = this.set("trainingComplete", js.undefined)
    @scala.inline
    def setTrainingStatus(value: String): Self = this.set("trainingStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingStatus: Self = this.set("trainingStatus", js.undefined)
  }
  
}

