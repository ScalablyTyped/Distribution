package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageConfiguration extends js.Object {
  /** The image type for the image. */
  var imageType: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#imageConfiguration. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The resource ID of resource which the image belongs to. */
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  /** The url for this image. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ImageConfiguration {
  @scala.inline
  def apply(
    imageType: java.lang.String = null,
    kind: java.lang.String = null,
    resourceId: java.lang.String = null,
    url: java.lang.String = null
  ): ImageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (imageType != null) __obj.updateDynamic("imageType")(imageType)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImageConfiguration]
  }
}

