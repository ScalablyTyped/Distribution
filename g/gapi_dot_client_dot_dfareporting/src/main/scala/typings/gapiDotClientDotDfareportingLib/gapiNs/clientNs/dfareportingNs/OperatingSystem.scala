package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystem extends js.Object {
  /** DART ID of this operating system. This is the ID used for targeting. */
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this operating system is for desktop. */
  var desktop: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystem". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this operating system is for mobile. */
  var mobile: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of this operating system. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object OperatingSystem {
  @scala.inline
  def apply(
    dartId: java.lang.String = null,
    desktop: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    mobile: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OperatingSystem]
  }
}

