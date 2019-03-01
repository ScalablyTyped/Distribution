package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeSearchAnnotation extends js.Object {
  /**
    * Represents the adult content likelihood for the image. Adult content may
    * contain elements such as nudity, pornographic images or cartoons, or
    * sexual activities.
    */
  var adult: js.UndefOr[java.lang.String] = js.undefined
  /** Likelihood that this is a medical image. */
  var medical: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Spoof likelihood. The likelihood that an modification
    * was made to the image's canonical version to make it appear
    * funny or offensive.
    */
  var spoof: js.UndefOr[java.lang.String] = js.undefined
  /** Likelihood that this image contains violent content. */
  var violence: js.UndefOr[java.lang.String] = js.undefined
}

object SafeSearchAnnotation {
  @scala.inline
  def apply(
    adult: java.lang.String = null,
    medical: java.lang.String = null,
    spoof: java.lang.String = null,
    violence: java.lang.String = null
  ): SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    if (adult != null) __obj.updateDynamic("adult")(adult)
    if (medical != null) __obj.updateDynamic("medical")(medical)
    if (spoof != null) __obj.updateDynamic("spoof")(spoof)
    if (violence != null) __obj.updateDynamic("violence")(violence)
    __obj.asInstanceOf[SafeSearchAnnotation]
  }
}

