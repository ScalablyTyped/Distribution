package typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCount extends js.Object {
  var count: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object StringCount {
  @scala.inline
  def apply(count: String = null, id: String = null): StringCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringCount]
  }
}

