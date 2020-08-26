package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsInTrial extends js.Object {
  var isInTrial: js.UndefOr[Boolean] = js.native
  var trialEndTime: js.UndefOr[String] = js.native
}

object IsInTrial {
  @scala.inline
  def apply(): IsInTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsInTrial]
  }
  @scala.inline
  implicit class IsInTrialOps[Self <: IsInTrial] (val x: Self) extends AnyVal {
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
    def setIsInTrial(value: Boolean): Self = this.set("isInTrial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInTrial: Self = this.set("isInTrial", js.undefined)
    @scala.inline
    def setTrialEndTime(value: String): Self = this.set("trialEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialEndTime: Self = this.set("trialEndTime", js.undefined)
  }
  
}

