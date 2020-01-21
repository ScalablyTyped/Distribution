package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClientPrediction.AnonCsvInstanceOutput
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insert extends js.Object {
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.undefined
  /** Type of predictive model (classification or regression). */
  var modelType: js.UndefOr[String] = js.undefined
  /** The Id of the model to be copied over. */
  var sourceModel: js.UndefOr[String] = js.undefined
  /** Google storage location of the training data file. */
  var storageDataLocation: js.UndefOr[String] = js.undefined
  /** Google storage location of the preprocessing pmml file. */
  var storagePMMLLocation: js.UndefOr[String] = js.undefined
  /** Google storage location of the pmml model file. */
  var storagePMMLModelLocation: js.UndefOr[String] = js.undefined
  /** Instances to train model on. */
  var trainingInstances: js.UndefOr[js.Array[AnonCsvInstanceOutput]] = js.undefined
  /** A class weighting function, which allows the importance weights for class labels to be specified (Categorical models only). */
  var utility: js.UndefOr[js.Array[Record[String, Double]]] = js.undefined
}

object Insert {
  @scala.inline
  def apply(
    id: String = null,
    modelType: String = null,
    sourceModel: String = null,
    storageDataLocation: String = null,
    storagePMMLLocation: String = null,
    storagePMMLModelLocation: String = null,
    trainingInstances: js.Array[AnonCsvInstanceOutput] = null,
    utility: js.Array[Record[String, Double]] = null
  ): Insert = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (sourceModel != null) __obj.updateDynamic("sourceModel")(sourceModel.asInstanceOf[js.Any])
    if (storageDataLocation != null) __obj.updateDynamic("storageDataLocation")(storageDataLocation.asInstanceOf[js.Any])
    if (storagePMMLLocation != null) __obj.updateDynamic("storagePMMLLocation")(storagePMMLLocation.asInstanceOf[js.Any])
    if (storagePMMLModelLocation != null) __obj.updateDynamic("storagePMMLModelLocation")(storagePMMLModelLocation.asInstanceOf[js.Any])
    if (trainingInstances != null) __obj.updateDynamic("trainingInstances")(trainingInstances.asInstanceOf[js.Any])
    if (utility != null) __obj.updateDynamic("utility")(utility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
}

