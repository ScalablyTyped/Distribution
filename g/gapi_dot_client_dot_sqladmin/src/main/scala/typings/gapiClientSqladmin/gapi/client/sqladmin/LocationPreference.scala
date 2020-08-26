package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationPreference extends js.Object {
  /** The AppEngine application to follow, it must be in the same region as the Cloud SQL instance. */
  var followGaeApplication: js.UndefOr[String] = js.native
  /** This is always sql#locationPreference. */
  var kind: js.UndefOr[String] = js.native
  /** The preferred Compute Engine zone (e.g. us-centra1-a, us-central1-b, etc.). */
  var zone: js.UndefOr[String] = js.native
}

object LocationPreference {
  @scala.inline
  def apply(): LocationPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationPreference]
  }
  @scala.inline
  implicit class LocationPreferenceOps[Self <: LocationPreference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFollowGaeApplication(value: String): Self = this.set("followGaeApplication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowGaeApplication: Self = this.set("followGaeApplication", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

