package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  /** Height or length of this volume (in cm). */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Thickness of this volume (in cm). */
  var thickness: js.UndefOr[java.lang.String] = js.undefined
  /** Width of this volume (in cm). */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: java.lang.String = null,
    thickness: java.lang.String = null,
    width: java.lang.String = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Height]
  }
}

