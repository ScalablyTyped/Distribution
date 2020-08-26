package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPrediction.anon.Fields
import typings.gapiClientPrediction.anon.Key
import typings.gapiClientPrediction.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: Fields): Request[Analyze] = js.native
  /** Delete a trained model. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Check training status of your model. */
  def get(request: Fields): Request[Insert2] = js.native
  /** Train a Prediction API model. */
  def insert(request: Key): Request[Insert2] = js.native
  /** List available models. */
  def list(request: MaxResults): Request[List] = js.native
  /** Submit model id and request a prediction. */
  def predict(request: Fields): Request[Output] = js.native
  /** Add new data to a trained model. */
  def update(request: Fields): Request[Insert2] = js.native
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
  @scala.inline
  implicit class TrainedmodelsResourceOps[Self <: TrainedmodelsResource] (val x: Self) extends AnyVal {
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
    def setAnalyze(value: Fields => Request[Analyze]): Self = this.set("analyze", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Insert2]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Insert2]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[List]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPredict(value: Fields => Request[Output]): Self = this.set("predict", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fields => Request[Insert2]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

