package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bullet extends js.Object {
  /** The paragraph specific text style applied to this bullet. */
  var bulletStyle: js.UndefOr[TextStyle] = js.undefined
  /** The rendered bullet glyph for this paragraph. */
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the list this paragraph belongs to. */
  var listId: js.UndefOr[java.lang.String] = js.undefined
  /** The nesting level of this paragraph in the list. */
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

