package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
}

object Body {
  @scala.inline
  def apply(content: js.Array[StructuralElement] = null): Body = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

