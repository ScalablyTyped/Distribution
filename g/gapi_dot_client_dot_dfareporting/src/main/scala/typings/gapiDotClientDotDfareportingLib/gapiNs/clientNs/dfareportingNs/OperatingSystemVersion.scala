package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersion extends js.Object {
  /** ID of this operating system version. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemVersion". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Major version (leftmost number) of this operating system version. */
  var majorVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Minor version (number after the first dot) of this operating system version. */
  var minorVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this operating system version. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Operating system of this operating system version. */
  var operatingSystem: js.UndefOr[OperatingSystem] = js.undefined
}

