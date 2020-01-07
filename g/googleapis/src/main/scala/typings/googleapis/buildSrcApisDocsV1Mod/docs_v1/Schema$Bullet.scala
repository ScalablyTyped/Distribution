package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the bullet of a paragraph.
  */
@js.native
trait Schema$Bullet extends js.Object {
  /**
    * The ID of the list this paragraph belongs to.
    */
  var listId: js.UndefOr[String] = js.native
  /**
    * The nesting level of this paragraph in the list.
    */
  var nestingLevel: js.UndefOr[Double] = js.native
  /**
    * The paragraph specific text style applied to this bullet.
    */
  var textStyle: js.UndefOr[Schema$TextStyle] = js.native
}

object Schema$Bullet {
  @scala.inline
  def apply(listId: String = null, nestingLevel: Int | Double = null, textStyle: Schema$TextStyle = null): Schema$Bullet = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Bullet]
  }
}

