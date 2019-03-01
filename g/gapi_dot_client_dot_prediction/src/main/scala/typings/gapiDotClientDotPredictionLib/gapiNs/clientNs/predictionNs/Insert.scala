package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insert extends js.Object {
  /** The unique name for the predictive model. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of predictive model (classification or regression). */
  var modelType: js.UndefOr[java.lang.String] = js.undefined
  /** The Id of the model to be copied over. */
  var sourceModel: js.UndefOr[java.lang.String] = js.undefined
  /** Google storage location of the training data file. */
  var storageDataLocation: js.UndefOr[java.lang.String] = js.undefined
  /** Google storage location of the preprocessing pmml file. */
  var storagePMMLLocation: js.UndefOr[java.lang.String] = js.undefined
  /** Google storage location of the pmml model file. */
  var storagePMMLModelLocation: js.UndefOr[java.lang.String] = js.undefined
  /** Instances to train model on. */
  var trainingInstances: js.UndefOr[js.Array[gapiDotClientDotPredictionLib.Anon_CsvInstanceOutput]] = js.undefined
  /** A class weighting function, which allows the importance weights for class labels to be specified (Categorical models only). */
  var utility: js.UndefOr[js.Array[stdLib.Record[java.lang.String, scala.Double]]] = js.undefined
}

object Insert {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    modelType: java.lang.String = null,
    sourceModel: java.lang.String = null,
    storageDataLocation: java.lang.String = null,
    storagePMMLLocation: java.lang.String = null,
    storagePMMLModelLocation: java.lang.String = null,
    trainingInstances: js.Array[gapiDotClientDotPredictionLib.Anon_CsvInstanceOutput] = null,
    utility: js.Array[stdLib.Record[java.lang.String, scala.Double]] = null
  ): Insert = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (modelType != null) __obj.updateDynamic("modelType")(modelType)
    if (sourceModel != null) __obj.updateDynamic("sourceModel")(sourceModel)
    if (storageDataLocation != null) __obj.updateDynamic("storageDataLocation")(storageDataLocation)
    if (storagePMMLLocation != null) __obj.updateDynamic("storagePMMLLocation")(storagePMMLLocation)
    if (storagePMMLModelLocation != null) __obj.updateDynamic("storagePMMLModelLocation")(storagePMMLModelLocation)
    if (trainingInstances != null) __obj.updateDynamic("trainingInstances")(trainingInstances)
    if (utility != null) __obj.updateDynamic("utility")(utility)
    __obj.asInstanceOf[Insert]
  }
}

