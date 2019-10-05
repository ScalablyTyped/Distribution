package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaAboutPageSettings extends js.Object {
  var status: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object LiaAboutPageSettings {
  @scala.inline
  def apply(status: String = null, url: String = null): LiaAboutPageSettings = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LiaAboutPageSettings]
  }
}

