package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bullet extends js.Object {
  var bulletStyle: js.UndefOr[TextStyle] = js.undefined
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  var listId: js.UndefOr[java.lang.String] = js.undefined
  var nestingLevel: js.UndefOr[scala.Double] = js.undefined
}

object Bullet {
  @scala.inline
  def apply(
    bulletStyle: TextStyle = null,
    glyph: java.lang.String = null,
    listId: java.lang.String = null,
    nestingLevel: scala.Int | scala.Double = null
  ): Bullet = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle)
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (listId != null) __obj.updateDynamic("listId")(listId)
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bullet]
  }
}

