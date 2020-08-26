package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookbackConfiguration extends js.Object {
  /**
    * Lookback window, in days, from the last time a given user clicked on one of your ads. If you enter 0, clicks will not be considered as triggering
    * events for floodlight tracking. If you leave this field blank, the default value for your account will be used. Acceptable values are 0 to 90,
    * inclusive.
    */
  var clickDuration: js.UndefOr[Double] = js.native
  /**
    * Lookback window, in days, from the last time a given user viewed one of your ads. If you enter 0, impressions will not be considered as triggering
    * events for floodlight tracking. If you leave this field blank, the default value for your account will be used. Acceptable values are 0 to 90,
    * inclusive.
    */
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

