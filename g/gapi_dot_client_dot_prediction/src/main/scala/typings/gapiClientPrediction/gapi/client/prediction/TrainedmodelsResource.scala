package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPrediction.anon.Fields
import typings.gapiClientPrediction.anon.Key
import typings.gapiClientPrediction.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: Fields): Request[Analyze]
  /** Delete a trained model. */
  def delete(request: Fields): Request[Unit]
  /** Check training status of your model. */
  def get(request: Fields): Request[Insert2]
  /** Train a Prediction API model. */
  def insert(request: Key): Request[Insert2]
  /** List available models. */
  def list(request: MaxResults): Request[List]
  /** Submit model id and request a prediction. */
  def predict(request: Fields): Request[Output]
  /** Add new data to a trained model. */
  def update(request: Fields): Request[Insert2]
}

object TrainedmodelsResource {
  @scala.inline
  def apply(
    analyze: Fields => Request[Analyze],
    delete: Fields => Request[Unit],
    get: Fields => Request[Insert2],
    insert: Key => Request[Insert2],
    list: MaxResults => Request[List],
    predict: Fields => Request[Output],
    update: Fields => Request[Insert2]
  ): TrainedmodelsResource = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), predict = js.Any.fromFunction1(predict), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TrainedmodelsResource]
  }
}

