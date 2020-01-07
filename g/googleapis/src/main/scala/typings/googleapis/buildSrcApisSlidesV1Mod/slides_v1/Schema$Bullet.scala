package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the bullet of a paragraph.
  */
@js.native
trait Schema$Bullet extends js.Object {
  /**
    * The paragraph specific text style applied to this bullet.
    */
  var bulletStyle: js.UndefOr[Schema$TextStyle] = js.native
  /**
    * The rendered bullet glyph for this paragraph.
    */
  var glyph: js.UndefOr[String] = js.native
  /**
    * The ID of the list this paragraph belongs to.
    */
  var listId: js.UndefOr[String] = js.native
  /**
    * The nesting level of this paragraph in the list.
    */
  var nestingLevel: js.UndefOr[Double] = js.native
}

object Schema$Bullet {
  @scala.inline
  def apply(
    bulletStyle: Schema$TextStyle = null,
    glyph: String = null,
    listId: String = null,
    nestingLevel: Int | Double = null
  ): Schema$Bullet = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Bullet]
  }
}

