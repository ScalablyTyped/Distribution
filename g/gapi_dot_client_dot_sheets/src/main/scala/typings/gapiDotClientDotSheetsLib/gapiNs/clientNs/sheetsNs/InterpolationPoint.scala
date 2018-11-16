package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InterpolationPoint extends js.Object {
  /** The color this interpolation point should use. */
  var color: js.UndefOr[Color] = js.undefined
  /** How the value should be interpreted. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The value this interpolation point uses.  May be a formula.
               * Unused if type is MIN or
               * MAX.
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

