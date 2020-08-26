package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClientPrediction.anon.ConfusionMatrix
import typings.gapiClientPrediction.anon.Features
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analyze extends js.Object {
  /** Description of the data the model was trained on. */
  var dataDescription: js.UndefOr[Features] = js.native
  /** List of errors with the data. */
  var errors: js.UndefOr[js.Array[Record[String, String]]] = js.native
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.native
  /** What kind of resource this is. */
  var kind: js.UndefOr[String] = js.native
  /** Description of the model. */
  var modelDescription: js.UndefOr[ConfusionMatrix] = js.native
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[String] = js.native
}

object Analyze {
  @scala.inline
  def apply(): Analyze = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analyze]
  }
  @scala.inline
  implicit class AnalyzeOps[Self <: Analyze] (val x: Self) extends AnyVal {
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
    def setDataDescription(value: Features): Self = this.set("dataDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDescription: Self = this.set("dataDescription", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: (Record[String, String])*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Record[String, String]]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setModelDescription(value: ConfusionMatrix): Self = this.set("modelDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelDescription: Self = this.set("modelDescription", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

