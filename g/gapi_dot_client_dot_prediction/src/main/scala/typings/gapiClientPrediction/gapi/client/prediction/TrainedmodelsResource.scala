package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPrediction.AnonAltFields
import typings.gapiClientPrediction.AnonAltFieldsKey
import typings.gapiClientPrediction.AnonAltFieldsKeyMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: AnonAltFields): Request_[Analyze]
  /** Delete a trained model. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Check training status of your model. */
  def get(request: AnonAltFields): Request_[Insert2]
  /** Train a Prediction API model. */
  def insert(request: AnonAltFieldsKey): Request_[Insert2]
  /** List available models. */
  def list(request: AnonAltFieldsKeyMaxResults): Request_[List]
  /** Submit model id and request a prediction. */
  def predict(request: AnonAltFields): Request_[Output]
  /** Add new data to a trained model. */
  def update(request: AnonAltFields): Request_[Insert2]
}

object TrainedmodelsResource {
  @scala.inline
  def apply(
    analyze: AnonAltFields => Request_[Analyze],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[Insert2],
    insert: AnonAltFieldsKey => Request_[Insert2],
    list: AnonAltFieldsKeyMaxResults => Request_[List],
    predict: AnonAltFields => Request_[Output],
    update: AnonAltFields => Request_[Insert2]
  ): TrainedmodelsResource = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), predict = js.Any.fromFunction1(predict), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TrainedmodelsResource]
  }
}

