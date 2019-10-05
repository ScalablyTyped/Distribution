package typings.gapiDotClientDotPrediction.gapi.client.prediction

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPrediction.Anon_AltFields
import typings.gapiDotClientDotPrediction.Anon_AltFieldsKey
import typings.gapiDotClientDotPrediction.Anon_AltFieldsKeyMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: Anon_AltFields): Request[Analyze]
  /** Delete a trained model. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Check training status of your model. */
  def get(request: Anon_AltFields): Request[Insert2]
  /** Train a Prediction API model. */
  def insert(request: Anon_AltFieldsKey): Request[Insert2]
  /** List available models. */
  def list(request: Anon_AltFieldsKeyMaxResults): Request[List]
  /** Submit model id and request a prediction. */
  def predict(request: Anon_AltFields): Request[Output]
  /** Add new data to a trained model. */
  def update(request: Anon_AltFields): Request[Insert2]
}

object TrainedmodelsResource {
  @scala.inline
  def apply(
    analyze: Anon_AltFields => Request[Analyze],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Insert2],
    insert: Anon_AltFieldsKey => Request[Insert2],
    list: Anon_AltFieldsKeyMaxResults => Request[List],
    predict: Anon_AltFields => Request[Output],
    update: Anon_AltFields => Request[Insert2]
  ): TrainedmodelsResource = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), predict = js.Any.fromFunction1(predict), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TrainedmodelsResource]
  }
}

