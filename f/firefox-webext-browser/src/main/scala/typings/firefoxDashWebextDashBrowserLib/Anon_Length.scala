package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
  var offset: scala.Double
  /** The style type */
  var `type`: firefoxDashWebextDashBrowserLib.browserNs.omniboxNs.DescriptionStyleType
}

object Anon_Length {
  @scala.inline
  def apply(
    offset: scala.Double,
    `type`: firefoxDashWebextDashBrowserLib.browserNs.omniboxNs.DescriptionStyleType,
    length: scala.Int | scala.Double = null
  ): Anon_Length = {
    val __obj = js.Dynamic.literal(offset = offset)
    __obj.updateDynamic("type")(`type`)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Length]
  }
}

