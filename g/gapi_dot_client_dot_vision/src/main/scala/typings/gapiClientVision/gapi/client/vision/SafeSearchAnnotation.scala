package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeSearchAnnotation extends js.Object {
  /**
    * Represents the adult content likelihood for the image. Adult content may
    * contain elements such as nudity, pornographic images or cartoons, or
    * sexual activities.
    */
  var adult: js.UndefOr[String] = js.undefined
  /** Likelihood that this is a medical image. */
  var medical: js.UndefOr[String] = js.undefined
  /**
    * Spoof likelihood. The likelihood that an modification
    * was made to the image's canonical version to make it appear
    * funny or offensive.
    */
  var spoof: js.UndefOr[String] = js.undefined
  /** Likelihood that this image contains violent content. */
  var violence: js.UndefOr[String] = js.undefined
}

object SafeSearchAnnotation {
  @scala.inline
  def apply(adult: String = null, medical: String = null, spoof: String = null, violence: String = null): SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    if (adult != null) __obj.updateDynamic("adult")(adult.asInstanceOf[js.Any])
    if (medical != null) __obj.updateDynamic("medical")(medical.asInstanceOf[js.Any])
    if (spoof != null) __obj.updateDynamic("spoof")(spoof.asInstanceOf[js.Any])
    if (violence != null) __obj.updateDynamic("violence")(violence.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeSearchAnnotation]
  }
}

