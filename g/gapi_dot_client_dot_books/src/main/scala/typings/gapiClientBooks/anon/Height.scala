package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  /** Height or length of this volume (in cm). */
  var height: js.UndefOr[String] = js.undefined
  /** Thickness of this volume (in cm). */
  var thickness: js.UndefOr[String] = js.undefined
  /** Width of this volume (in cm). */
  var width: js.UndefOr[String] = js.undefined
}

object Height {
  @scala.inline
  def apply(height: String = null, thickness: String = null, width: String = null): Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

