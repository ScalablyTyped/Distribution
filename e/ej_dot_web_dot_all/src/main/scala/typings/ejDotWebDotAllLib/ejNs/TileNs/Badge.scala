package typings
package ejDotWebDotAllLib.ejNs.TileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Badge extends js.Object {
  /** Specifies whether to enable badge or not.
               * @Default {false}
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies maximum value for tile badge.
               * @Default {100}
               */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies minimum value for tile badge.
               * @Default {1}
               */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** Sets position for tile badge.
               * @Default {â€œbottomrightâ€}
               */
  var position: js.UndefOr[BadgePosition | java.lang.String] = js.undefined
  /** Specifies text instead of number for tile badge.
               * @Default {null}
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Sets value for tile badge.
               * @Default {1}
               */
  var value: js.UndefOr[scala.Double] = js.undefined
}

