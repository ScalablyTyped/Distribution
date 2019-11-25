package typings.gapiDotClientDotGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageConfiguration extends js.Object {
  /** The image type for the image. */
  var imageType: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#imageConfiguration. */
  var kind: js.UndefOr[String] = js.undefined
  /** The resource ID of resource which the image belongs to. */
  var resourceId: js.UndefOr[String] = js.undefined
  /** The url for this image. */
  var url: js.UndefOr[String] = js.undefined
}

object ImageConfiguration {
  @scala.inline
  def apply(imageType: String = null, kind: String = null, resourceId: String = null, url: String = null): ImageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (imageType != null) __obj.updateDynamic("imageType")(imageType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfiguration]
  }
}

