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

