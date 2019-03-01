package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightPreserveAspectRatio extends js.Object {
  var height: scala.Double
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
  var width: scala.Double
}

object Anon_HeightPreserveAspectRatio {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    preserveAspectRatio: java.lang.String = null,
    viewBox: java.lang.String = null
  ): Anon_HeightPreserveAspectRatio = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[Anon_HeightPreserveAspectRatio]
  }
}

