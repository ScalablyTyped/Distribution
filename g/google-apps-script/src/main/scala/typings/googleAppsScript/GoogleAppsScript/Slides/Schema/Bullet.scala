package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bullet extends js.Object {
  var bulletStyle: js.UndefOr[TextStyle] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  var listId: js.UndefOr[String] = js.undefined
  var nestingLevel: js.UndefOr[Double] = js.undefined
}

object Bullet {
  @scala.inline
  def apply(
    bulletStyle: TextStyle = null,
    glyph: String = null,
    listId: String = null,
    nestingLevel: js.UndefOr[Double] = js.undefined
  ): Bullet = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (!js.isUndefined(nestingLevel)) __obj.updateDynamic("nestingLevel")(nestingLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bullet]
  }
}

