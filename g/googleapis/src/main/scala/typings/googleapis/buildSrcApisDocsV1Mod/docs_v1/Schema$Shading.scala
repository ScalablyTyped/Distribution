package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The shading of a paragraph.
  */
@js.native
trait Schema$Shading extends js.Object {
  /**
    * The background color of this paragraph shading.
    */
  var backgroundColor: js.UndefOr[Schema$OptionalColor] = js.native
}

object Schema$Shading {
  @scala.inline
  def apply(backgroundColor: Schema$OptionalColor = null): Schema$Shading = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Shading]
  }
}

