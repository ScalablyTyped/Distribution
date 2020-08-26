package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookbackConfiguration extends js.Object {
  var clickDuration: js.UndefOr[Double] = js.native
  var postImpressionActivitiesDuration: js.UndefOr[Double] = js.native
}

object LookbackConfiguration {
  @scala.inline
  def apply(): LookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookbackConfiguration]
  }
  @scala.inline
  implicit class LookbackConfigurationOps[Self <: LookbackConfiguration] (val x: Self) extends AnyVal {
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
    def setClickDuration(value: Double): Self = this.set("clickDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickDuration: Self = this.set("clickDuration", js.undefined)
    @scala.inline
    def setPostImpressionActivitiesDuration(value: Double): Self = this.set("postImpressionActivitiesDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostImpressionActivitiesDuration: Self = this.set("postImpressionActivitiesDuration", js.undefined)
  }
  
}

