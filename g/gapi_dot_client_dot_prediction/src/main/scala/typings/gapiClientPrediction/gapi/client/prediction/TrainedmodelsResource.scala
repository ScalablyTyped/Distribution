package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPrediction.AnonFields
import typings.gapiClientPrediction.AnonKey
import typings.gapiClientPrediction.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: AnonFields): Request_[Analyze]
  /** Delete a trained model. */
  def delete(request: AnonFields): Request_[Unit]
  /** Check training status of your model. */
  def get(request: AnonFields): Request_[Insert2]
  /** Train a Prediction API model. */
  def insert(request: AnonKey): Request_[Insert2]
  /** List available models. */
  def list(request: AnonMaxResults): Request_[List]
  /** Submit model id and request a prediction. */
  def predict(request: AnonFields): Request_[Output]
  /** Add new data to a trained model. */
  def update(request: AnonFields): Request_[Insert2]
}

object TrainedmodelsResource {
  @scala.inline
  def apply(
    analyze: AnonFields => Request_[Analyze],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Insert2],
    insert: AnonKey => Request_[Insert2],
    list: AnonMaxResults => Request_[List],
    predict: AnonFields => Request_[Output],
    update: AnonFields => Request_[Insert2]
  ): TrainedmodelsResource = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), predict = js.Any.fromFunction1(predict), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TrainedmodelsResource]
  }
}

