package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationPreference extends js.Object {
  /** The AppEngine application to follow, it must be in the same region as the Cloud SQL instance. */
  var followGaeApplication: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#locationPreference. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The preferred Compute Engine zone (e.g. us-centra1-a, us-central1-b, etc.). */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

