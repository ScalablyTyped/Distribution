package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image that is specified by a URL and can have an onclick action.
  */
@js.native
trait Schema$Image extends js.Object {
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
  var onClick: js.UndefOr[Schema$OnClick] = js.native
}

object Schema$Image {
  @scala.inline
  def apply(aspectRatio: Int | Double = null, imageUrl: String = null, onClick: Schema$OnClick = null): Schema$Image = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Image]
  }
}

