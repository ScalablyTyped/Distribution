package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preferred location. This specifies where a Cloud SQL instance should
  * preferably be located, either in a specific Compute Engine zone, or
  * co-located with an App Engine application. Note that if the preferred
  * location is not available, the instance will be located as close as
  * possible within the region. Only one location may be specified.
  */
@js.native
trait Schema$LocationPreference extends js.Object {
  /**
    * The AppEngine application to follow, it must be in the same region as the
    * Cloud SQL instance.
    */
  var followGaeApplication: js.UndefOr[String] = js.native
  /**
    * This is always sql#locationPreference.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The preferred Compute Engine zone (e.g. us-central1-a, us-central1-b,
    * etc.).
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$LocationPreference {
  @scala.inline
  def apply(followGaeApplication: String = null, kind: String = null, zone: String = null): Schema$LocationPreference = {
    val __obj = js.Dynamic.literal()
    if (followGaeApplication != null) __obj.updateDynamic("followGaeApplication")(followGaeApplication.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocationPreference]
  }
}

