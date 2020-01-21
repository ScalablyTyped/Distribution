package typings.gapiClientCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  /** Title of the source; for example a title of a web page or an email subject. */
  var title: js.UndefOr[String] = js.undefined
  /** URL of the source pointing to a resource. The URL scheme must be HTTP or HTTPS. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonTitle {
  @scala.inline
  def apply(title: String = null, url: String = null): AnonTitle = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

