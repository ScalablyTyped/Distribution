package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /** The author's name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** ID of the author. */
  var id: js.UndefOr[String] = js.undefined
  /** The author's Google profile image. */
  var image: js.UndefOr[Url] = js.undefined
  /** A link to the author's Google profile. */
  var url: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(displayName: String = null, id: String = null, image: Url = null, url: String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

