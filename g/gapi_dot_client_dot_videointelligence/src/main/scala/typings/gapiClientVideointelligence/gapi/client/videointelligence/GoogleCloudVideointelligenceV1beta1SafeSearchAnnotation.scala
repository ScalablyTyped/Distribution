package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation extends js.Object {
  /** Likelihood of adult content. */
  var adult: js.UndefOr[String] = js.undefined
  /** Likelihood of medical content. */
  var medical: js.UndefOr[String] = js.undefined
  /** Likelihood of racy content. */
  var racy: js.UndefOr[String] = js.undefined
  /**
    * Likelihood that an obvious modification was made to the original
    * version to make it appear funny or offensive.
    */
  var spoof: js.UndefOr[String] = js.undefined
  /** Video time offset in microseconds. */
  var timeOffset: js.UndefOr[String] = js.undefined
  /** Likelihood of violent content. */
  var violent: js.UndefOr[String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation {
  @scala.inline
  def apply(
    adult: String = null,
    medical: String = null,
    racy: String = null,
    spoof: String = null,
    timeOffset: String = null,
    violent: String = null
  ): GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    if (adult != null) __obj.updateDynamic("adult")(adult.asInstanceOf[js.Any])
    if (medical != null) __obj.updateDynamic("medical")(medical.asInstanceOf[js.Any])
    if (racy != null) __obj.updateDynamic("racy")(racy.asInstanceOf[js.Any])
    if (spoof != null) __obj.updateDynamic("spoof")(spoof.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    if (violent != null) __obj.updateDynamic("violent")(violent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation]
  }
}

