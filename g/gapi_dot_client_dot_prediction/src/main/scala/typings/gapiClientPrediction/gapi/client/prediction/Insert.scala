package typings.gapiClientPrediction.gapi.client.prediction

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert extends js.Object {
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.native
  /** Type of predictive model (classification or regression). */
  var modelType: js.UndefOr[String] = js.native
  /** The Id of the model to be copied over. */
  var sourceModel: js.UndefOr[String] = js.native
  /** Google storage location of the training data file. */
  var storageDataLocation: js.UndefOr[String] = js.native
  /** Google storage location of the preprocessing pmml file. */
  var storagePMMLLocation: js.UndefOr[String] = js.native
  /** Google storage location of the pmml model file. */
  var storagePMMLModelLocation: js.UndefOr[String] = js.native
  /** Instances to train model on. */
  var trainingInstances: js.UndefOr[js.Array[typings.gapiClientPrediction.anon.Output]] = js.native
  /** A class weighting function, which allows the importance weights for class labels to be specified (Categorical models only). */
  var utility: js.UndefOr[js.Array[Record[String, Double]]] = js.native
}

object Insert {
  @scala.inline
  def apply(): Insert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insert]
  }
  @scala.inline
  implicit class InsertOps[Self <: Insert] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setModelType(value: String): Self = this.set("modelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
    @scala.inline
    def setSourceModel(value: String): Self = this.set("sourceModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceModel: Self = this.set("sourceModel", js.undefined)
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
    def setTrainingInstancesVarargs(value: typings.gapiClientPrediction.anon.Output*): Self = this.set("trainingInstances", js.Array(value :_*))
    @scala.inline
    def setTrainingInstances(value: js.Array[typings.gapiClientPrediction.anon.Output]): Self = this.set("trainingInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingInstances: Self = this.set("trainingInstances", js.undefined)
    @scala.inline
    def setUtilityVarargs(value: (Record[String, Double])*): Self = this.set("utility", js.Array(value :_*))
    @scala.inline
    def setUtility(value: js.Array[Record[String, Double]]): Self = this.set("utility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtility: Self = this.set("utility", js.undefined)
  }
  
}

