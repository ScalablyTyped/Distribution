package typings.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  /** Potential name of the thumbnail. */
  var description: js.UndefOr[String] = js.undefined
  /** Image resource. */
  var image: js.UndefOr[AnonHeight] = js.undefined
  /** URL of the webpage containing the image. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonDescription {
  @scala.inline
  def apply(description: String = null, image: AnonHeight = null, url: String = null): AnonDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

