package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalColor extends js.Object {
  /**
    * If set, this will be used as an opaque color. If unset, this represents
    * a transparent color.
    */
  var opaqueColor: js.UndefOr[OpaqueColor] = js.undefined
}

object OptionalColor {
  @scala.inline
  def apply(opaqueColor: OpaqueColor = null): OptionalColor = {
    val __obj = js.Dynamic.literal()
    if (opaqueColor != null) __obj.updateDynamic("opaqueColor")(opaqueColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalColor]
  }
}

