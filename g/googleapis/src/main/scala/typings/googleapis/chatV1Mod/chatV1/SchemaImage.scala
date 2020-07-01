package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image that is specified by a URL and can have an onclick action.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * The aspect ratio of this image (width/height).
    */
  var aspectRatio: js.UndefOr[Double] = js.native
  /**
    * The URL of the image.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The onclick action.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[Double] = js.undefined,
    imageUrl: String = null,
    onClick: SchemaOnClick = null
  ): SchemaImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImage]
  }
}

