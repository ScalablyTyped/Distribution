package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: gapiDotClientDotPredictionLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Analyze]
  /** Delete a trained model. */
  def delete(request: gapiDotClientDotPredictionLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Check training status of your model. */
  def get(request: gapiDotClientDotPredictionLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Insert2]
  /** Train a Prediction API model. */
  def insert(request: gapiDotClientDotPredictionLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Insert2]
  /** List available models. */
  def list(request: gapiDotClientDotPredictionLib.Anon_AltFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[List]
  /** Submit model id and request a prediction. */
  def predict(request: gapiDotClientDotPredictionLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Output]
  /** Add new data to a trained model. */
  def update(request: gapiDotClientDotPredictionLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Insert2]
}

object TrainedmodelsResource {
  @scala.inline
  def apply(
    analyze: js.Function1[
      gapiDotClientDotPredictionLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Analyze]
    ],
    delete: js.Function1[
      gapiDotClientDotPredictionLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotPredictionLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Insert2]
    ],
    insert: js.Function1[
      gapiDotClientDotPredictionLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Insert2]
    ],
    list: js.Function1[
      gapiDotClientDotPredictionLib.Anon_AltFieldsKeyMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[List]
    ],
    predict: js.Function1[
      gapiDotClientDotPredictionLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Output]
    ],
    update: js.Function1[
      gapiDotClientDotPredictionLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Insert2]
    ]
  ): TrainedmodelsResource = {
    val __obj = js.Dynamic.literal(analyze = analyze, delete = delete, get = get, insert = insert, list = list, predict = predict, update = update)
  
    __obj.asInstanceOf[TrainedmodelsResource]
  }
}

