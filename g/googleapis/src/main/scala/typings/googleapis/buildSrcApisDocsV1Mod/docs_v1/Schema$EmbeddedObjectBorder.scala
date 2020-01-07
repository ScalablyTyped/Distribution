package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A border around an EmbeddedObject.
  */
@js.native
trait Schema$EmbeddedObjectBorder extends js.Object {
  /**
    * The color of the border.
    */
  var color: js.UndefOr[Schema$OptionalColor] = js.native
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The property state of the border property.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * The width of the border.
    */
  var width: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$EmbeddedObjectBorder {
  @scala.inline
  def apply(
    color: Schema$OptionalColor = null,
    dashStyle: String = null,
    propertyState: String = null,
    width: Schema$Dimension = null
  ): Schema$EmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EmbeddedObjectBorder]
  }
}

