package typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationPreference extends js.Object {
  /** The AppEngine application to follow, it must be in the same region as the Cloud SQL instance. */
  var followGaeApplication: js.UndefOr[String] = js.undefined
  /** This is always sql#locationPreference. */
  var kind: js.UndefOr[String] = js.undefined
  /** The preferred Compute Engine zone (e.g. us-centra1-a, us-central1-b, etc.). */
  var zone: js.UndefOr[String] = js.undefined
}

object LocationPreference {
  @scala.inline
  def apply(followGaeApplication: String = null, kind: String = null, zone: String = null): LocationPreference = {
    val __obj = js.Dynamic.literal()
    if (followGaeApplication != null) __obj.updateDynamic("followGaeApplication")(followGaeApplication)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[LocationPreference]
  }
}

