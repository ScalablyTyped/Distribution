package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  /** The magnitude. */
  var magnitude: js.UndefOr[scala.Double] = js.undefined
  /** The units for magnitude. */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(magnitude: scala.Int | scala.Double = null, unit: java.lang.String = null): Dimension = {
    val __obj = js.Dynamic.literal()
    if (magnitude != null) __obj.updateDynamic("magnitude")(magnitude.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Dimension]
  }
}

