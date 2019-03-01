package typings
package gapiDotClientDotDiscoveryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X16 extends js.Object {
  /** The URL of the 16x16 icon. */
  var x16: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the 32x32 icon. */
  var x32: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_X16 {
  @scala.inline
  def apply(x16: java.lang.String = null, x32: java.lang.String = null): Anon_X16 = {
    val __obj = js.Dynamic.literal()
    if (x16 != null) __obj.updateDynamic("x16")(x16)
    if (x32 != null) __obj.updateDynamic("x32")(x32)
    __obj.asInstanceOf[Anon_X16]
  }
}

