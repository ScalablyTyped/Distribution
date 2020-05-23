package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  /** Potential name of the thumbnail. */
  var description: js.UndefOr[String] = js.undefined
  /** Image resource. */
  var image: js.UndefOr[Height] = js.undefined
  /** URL of the webpage containing the image. */
  var url: js.UndefOr[String] = js.undefined
}

object Description {
  @scala.inline
  def apply(description: String = null, image: Height = null, url: String = null): Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

