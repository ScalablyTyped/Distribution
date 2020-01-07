package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BigtableInstanceAdmin.ListAppProfiles.
  */
@js.native
trait Schema$ListAppProfilesResponse extends js.Object {
  /**
    * The list of requested app profiles.
    */
  var appProfiles: js.UndefOr[js.Array[Schema$AppProfile]] = js.native
  /**
    * Locations from which AppProfile information could not be retrieved, due
    * to an outage or some other transient condition. AppProfiles from these
    * locations may be missing from `app_profiles`. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set if not all app profiles could be returned in a single response. Pass
    * this value to `page_token` in another request to get the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAppProfilesResponse {
  @scala.inline
  def apply(
    appProfiles: js.Array[Schema$AppProfile] = null,
    failedLocations: js.Array[String] = null,
    nextPageToken: String = null
  ): Schema$ListAppProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (appProfiles != null) __obj.updateDynamic("appProfiles")(appProfiles.asInstanceOf[js.Any])
    if (failedLocations != null) __obj.updateDynamic("failedLocations")(failedLocations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAppProfilesResponse]
  }
}

