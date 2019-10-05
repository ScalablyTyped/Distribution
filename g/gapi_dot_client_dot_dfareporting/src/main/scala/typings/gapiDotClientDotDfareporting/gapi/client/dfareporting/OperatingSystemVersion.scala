package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersion extends js.Object {
  /** ID of this operating system version. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemVersion". */
  var kind: js.UndefOr[String] = js.undefined
  /** Major version (leftmost number) of this operating system version. */
  var majorVersion: js.UndefOr[String] = js.undefined
  /** Minor version (number after the first dot) of this operating system version. */
  var minorVersion: js.UndefOr[String] = js.undefined
  /** Name of this operating system version. */
  var name: js.UndefOr[String] = js.undefined
  /** Operating system of this operating system version. */
  var operatingSystem: js.UndefOr[OperatingSystem] = js.undefined
}

object OperatingSystemVersion {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    majorVersion: String = null,
    minorVersion: String = null,
    name: String = null,
    operatingSystem: OperatingSystem = null
  ): OperatingSystemVersion = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (majorVersion != null) __obj.updateDynamic("majorVersion")(majorVersion)
    if (minorVersion != null) __obj.updateDynamic("minorVersion")(minorVersion)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem)
    __obj.asInstanceOf[OperatingSystemVersion]
  }
}

