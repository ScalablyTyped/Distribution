package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of features pertaining to the image, computed by computer vision
  * methods over safe-search verticals (for example, adult, spoof, medical,
  * violence).
  */
@js.native
trait Schema$SafeSearchAnnotation extends js.Object {
  /**
    * Represents the adult content likelihood for the image. Adult content may
    * contain elements such as nudity, pornographic images or cartoons, or
    * sexual activities.
    */
  var adult: js.UndefOr[String] = js.native
  /**
    * Likelihood that this is a medical image.
    */
  var medical: js.UndefOr[String] = js.native
  /**
    * Likelihood that the request image contains racy content. Racy content may
    * include (but is not limited to) skimpy or sheer clothing, strategically
    * covered nudity, lewd or provocative poses, or close-ups of sensitive body
    * areas.
    */
  var racy: js.UndefOr[String] = js.native
  /**
    * Spoof likelihood. The likelihood that an modification was made to the
    * image&#39;s canonical version to make it appear funny or offensive.
    */
  var spoof: js.UndefOr[String] = js.native
  /**
    * Likelihood that this image contains violent content.
    */
  var violence: js.UndefOr[String] = js.native
}

object Schema$SafeSearchAnnotation {
  @scala.inline
  def apply(
    adult: String = null,
    medical: String = null,
    racy: String = null,
    spoof: String = null,
    violence: String = null
  ): Schema$SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    if (adult != null) __obj.updateDynamic("adult")(adult.asInstanceOf[js.Any])
    if (medical != null) __obj.updateDynamic("medical")(medical.asInstanceOf[js.Any])
    if (racy != null) __obj.updateDynamic("racy")(racy.asInstanceOf[js.Any])
    if (spoof != null) __obj.updateDynamic("spoof")(spoof.asInstanceOf[js.Any])
    if (violence != null) __obj.updateDynamic("violence")(violence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SafeSearchAnnotation]
  }
}

