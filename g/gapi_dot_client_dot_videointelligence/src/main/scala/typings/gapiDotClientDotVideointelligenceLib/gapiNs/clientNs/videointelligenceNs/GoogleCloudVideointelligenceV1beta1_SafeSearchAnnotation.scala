package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1_SafeSearchAnnotation extends js.Object {
  /** Likelihood of adult content. */
  var adult: js.UndefOr[java.lang.String] = js.undefined
  /** Likelihood of medical content. */
  var medical: js.UndefOr[java.lang.String] = js.undefined
  /** Likelihood of racy content. */
  var racy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Likelihood that an obvious modification was made to the original
    * version to make it appear funny or offensive.
    */
  var spoof: js.UndefOr[java.lang.String] = js.undefined
  /** Video time offset in microseconds. */
  var timeOffset: js.UndefOr[java.lang.String] = js.undefined
  /** Likelihood of violent content. */
  var violent: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1_SafeSearchAnnotation {
  @scala.inline
  def apply(
    adult: java.lang.String = null,
    medical: java.lang.String = null,
    racy: java.lang.String = null,
    spoof: java.lang.String = null,
    timeOffset: java.lang.String = null,
    violent: java.lang.String = null
  ): GoogleCloudVideointelligenceV1beta1_SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    if (adult != null) __obj.updateDynamic("adult")(adult)
    if (medical != null) __obj.updateDynamic("medical")(medical)
    if (racy != null) __obj.updateDynamic("racy")(racy)
    if (spoof != null) __obj.updateDynamic("spoof")(spoof)
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset)
    if (violent != null) __obj.updateDynamic("violent")(violent)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1_SafeSearchAnnotation]
  }
}

