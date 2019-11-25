package typings.gapiDotClientDotCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  /** Title of the source; for example a title of a web page or an email subject. */
  var title: js.UndefOr[String] = js.undefined
  /** URL of the source pointing to a resource. The URL scheme must be HTTP or HTTPS. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Title {
  @scala.inline
  def apply(title: String = null, url: String = null): Anon_Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Title]
  }
}

