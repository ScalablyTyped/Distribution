package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClientPrediction.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.native
  /** What kind of resource this is. */
  var kind: js.UndefOr[String] = js.native
  /** The most likely class label (Categorical models only). */
  var outputLabel: js.UndefOr[String] = js.native
  /** A list of class labels with their estimated probabilities (Categorical models only). */
  var outputMulti: js.UndefOr[js.Array[Label]] = js.native
  /** The estimated regression value (Regression models only). */
  var outputValue: js.UndefOr[String] = js.native
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[String] = js.native
}

object Output {
  @scala.inline
  def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOutputLabel(value: String): Self = this.set("outputLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLabel: Self = this.set("outputLabel", js.undefined)
    @scala.inline
    def setOutputMultiVarargs(value: Label*): Self = this.set("outputMulti", js.Array(value :_*))
    @scala.inline
    def setOutputMulti(value: js.Array[Label]): Self = this.set("outputMulti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputMulti: Self = this.set("outputMulti", js.undefined)
    @scala.inline
    def setOutputValue(value: String): Self = this.set("outputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputValue: Self = this.set("outputValue", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

