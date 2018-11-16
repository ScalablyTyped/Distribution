package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Tier extends js.Object {
  /** The maximum disk size of this tier in bytes. */
  var DiskQuota: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum RAM usage of this tier in bytes. */
  var RAM: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#tier. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The applicable regions for this tier. */
  var region: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** An identifier for the service tier, for example D1, D2 etc. For related information, see Pricing. */
  var tier: js.UndefOr[java.lang.String] = js.undefined
}

