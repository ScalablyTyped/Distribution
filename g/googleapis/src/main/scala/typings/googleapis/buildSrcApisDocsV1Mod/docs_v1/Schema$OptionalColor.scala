package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color that can either be fully opaque or fully transparent.
  */
@js.native
trait Schema$OptionalColor extends js.Object {
  /**
    * If set, this will be used as an opaque color. If unset, this represents a
    * transparent color.
    */
  var color: js.UndefOr[Schema$Color] = js.native
}

object Schema$OptionalColor {
  @scala.inline
  def apply(color: Schema$Color = null): Schema$OptionalColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OptionalColor]
  }
}

