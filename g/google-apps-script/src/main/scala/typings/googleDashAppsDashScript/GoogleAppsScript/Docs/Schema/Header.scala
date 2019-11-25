package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var headerId: js.UndefOr[String] = js.undefined
}

object Header {
  @scala.inline
  def apply(content: js.Array[StructuralElement] = null, headerId: String = null): Header = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (headerId != null) __obj.updateDynamic("headerId")(headerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

