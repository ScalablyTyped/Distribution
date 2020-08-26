package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  /** Description of the input features in the data set. */
  var features: js.UndefOr[js.Array[Categorical]] = js.native
  /** Description of the output value or label. */
  var outputFeature: js.UndefOr[Numeric] = js.native
}

object Features {
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
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
    def setFeaturesVarargs(value: Categorical*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[Categorical]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setOutputFeature(value: Numeric): Self = this.set("outputFeature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFeature: Self = this.set("outputFeature", js.undefined)
  }
  
}

