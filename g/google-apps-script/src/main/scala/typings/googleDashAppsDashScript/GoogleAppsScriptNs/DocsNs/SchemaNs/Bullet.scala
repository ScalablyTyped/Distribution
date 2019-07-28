package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bullet extends js.Object {
  var listId: js.UndefOr[String] = js.undefined
  var nestingLevel: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object Bullet {
  @scala.inline
  def apply(listId: String = null, nestingLevel: Int | Double = null, textStyle: TextStyle = null): Bullet = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId)
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[Bullet]
  }
}

