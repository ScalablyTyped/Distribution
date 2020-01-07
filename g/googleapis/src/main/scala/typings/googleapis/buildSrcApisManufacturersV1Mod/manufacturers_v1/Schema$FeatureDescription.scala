package typings.googleapis.buildSrcApisManufacturersV1Mod.manufacturers_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A feature description of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#featuredesc.
  */
@js.native
trait Schema$FeatureDescription extends js.Object {
  /**
    * A short description of the feature.
    */
  var headline: js.UndefOr[String] = js.native
  /**
    * An optional image describing the feature.
    */
  var image: js.UndefOr[Schema$Image] = js.native
  /**
    * A detailed description of the feature.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$FeatureDescription {
  @scala.inline
  def apply(headline: String = null, image: Schema$Image = null, text: String = null): Schema$FeatureDescription = {
    val __obj = js.Dynamic.literal()
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FeatureDescription]
  }
}

