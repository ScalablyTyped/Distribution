package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var listId: js.UndefOr[String] = js.undefined
  var nestingLevel: js.UndefOr[js.Object] = js.undefined
}

object List {
  @scala.inline
  def apply(listId: String = null, nestingLevel: js.Object = null): List = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

