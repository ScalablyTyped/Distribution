package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  /**
    * URL of a thumbnail image of the target URL.
    *
    * Read-only.
    */
  var thumbnailUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title of the target of the URL.
    *
    * Read-only.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to link to.
    * This must be a valid UTF-8 string containing between 1 and 2024 characters.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    thumbnailUrl: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Link]
  }
}

