package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mean extends js.Object {
  /** Number of numeric output values in the data set. */
  var count: js.UndefOr[String] = js.native
  /** Mean of the output values in the data set. */
  var mean: js.UndefOr[String] = js.native
  /** Variance of the output values in the data set. */
  var variance: js.UndefOr[String] = js.native
}

object Mean {
  @scala.inline
  def apply(): Mean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mean]
  }
  @scala.inline
  implicit class MeanOps[Self <: Mean] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setMean(value: String): Self = this.set("mean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMean: Self = this.set("mean", js.undefined)
    @scala.inline
    def setVariance(value: String): Self = this.set("variance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariance: Self = this.set("variance", js.undefined)
  }
  
}

