package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lookback configuration settings.
  */
@js.native
trait Schema$LookbackConfiguration extends js.Object {
  /**
    * Lookback window, in days, from the last time a given user clicked on one
    * of your ads. If you enter 0, clicks will not be considered as triggering
    * events for floodlight tracking. If you leave this field blank, the
    * default value for your account will be used. Acceptable values are 0 to
    * 90, inclusive.
    */
  var clickDuration: js.UndefOr[Double] = js.native
  /**
    * Lookback window, in days, from the last time a given user viewed one of
    * your ads. If you enter 0, impressions will not be considered as
    * triggering events for floodlight tracking. If you leave this field blank,
    * the default value for your account will be used. Acceptable values are 0
    * to 90, inclusive.
    */
  var postImpressionActivitiesDuration: js.UndefOr[Double] = js.native
}

object Schema$LookbackConfiguration {
  @scala.inline
  def apply(clickDuration: Int | Double = null, postImpressionActivitiesDuration: Int | Double = null): Schema$LookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (clickDuration != null) __obj.updateDynamic("clickDuration")(clickDuration.asInstanceOf[js.Any])
    if (postImpressionActivitiesDuration != null) __obj.updateDynamic("postImpressionActivitiesDuration")(postImpressionActivitiesDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LookbackConfiguration]
  }
}

