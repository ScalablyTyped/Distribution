package typings.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Linear extends js.Object {
  /** Must be greater than 0. */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /** Lower bound of the first bucket. */
  var offset: js.UndefOr[Double] = js.native
  /** Must be greater than 0. */
  var width: js.UndefOr[Double] = js.native
}

object Linear {
  @scala.inline
  def apply(): Linear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Linear]
  }
  @scala.inline
  implicit class LinearOps[Self <: Linear] (val x: Self) extends AnyVal {
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
    def setNumFiniteBuckets(value: Double): Self = this.set("numFiniteBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFiniteBuckets: Self = this.set("numFiniteBuckets", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

