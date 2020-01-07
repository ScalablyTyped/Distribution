package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

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
  var opaqueColor: js.UndefOr[Schema$OpaqueColor] = js.native
}

object Schema$OptionalColor {
  @scala.inline
  def apply(opaqueColor: Schema$OpaqueColor = null): Schema$OptionalColor = {
    val __obj = js.Dynamic.literal()
    if (opaqueColor != null) __obj.updateDynamic("opaqueColor")(opaqueColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OptionalColor]
  }
}

