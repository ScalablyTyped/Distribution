package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  /**
    * URL of a thumbnail image of the target URL.
    *
    * Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  /**
    * Title of the target of the URL.
    *
    * Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * URL to link to.
    * This must be a valid UTF-8 string containing between 1 and 2024 characters.
    */
  var url: js.UndefOr[String] = js.undefined
}

object Link {
  @scala.inline
  def apply(thumbnailUrl: String = null, title: String = null, url: String = null): Link = {
    val __obj = js.Dynamic.literal()
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

