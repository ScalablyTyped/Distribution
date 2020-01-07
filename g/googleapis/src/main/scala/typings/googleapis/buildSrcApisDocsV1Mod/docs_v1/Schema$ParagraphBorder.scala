package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A border around a paragraph.
  */
@js.native
trait Schema$ParagraphBorder extends js.Object {
  /**
    * The color of the border.
    */
  var color: js.UndefOr[Schema$OptionalColor] = js.native
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The padding of the border.
    */
  var padding: js.UndefOr[Schema$Dimension] = js.native
  /**
    * The width of the border.
    */
  var width: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$ParagraphBorder {
  @scala.inline
  def apply(
    color: Schema$OptionalColor = null,
    dashStyle: String = null,
    padding: Schema$Dimension = null,
    width: Schema$Dimension = null
  ): Schema$ParagraphBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ParagraphBorder]
  }
}

