package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for BigtableInstanceAdmin.ListAppProfiles.
  */
@js.native
trait SchemaListAppProfilesResponse extends js.Object {
  
  /**
    * The list of requested app profiles.
    */
  var appProfiles: js.UndefOr[js.Array[SchemaAppProfile]] = js.native
  
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
object SchemaListAppProfilesResponse {
  
  @scala.inline
  def apply(): SchemaListAppProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAppProfilesResponse]
  }
  
  @scala.inline
  implicit class SchemaListAppProfilesResponseOps[Self <: SchemaListAppProfilesResponse] (val x: Self) extends AnyVal {
    
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
    def setAppProfilesVarargs(value: SchemaAppProfile*): Self = this.set("appProfiles", js.Array(value :_*))
    
    @scala.inline
    def setAppProfiles(value: js.Array[SchemaAppProfile]): Self = this.set("appProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppProfiles: Self = this.set("appProfiles", js.undefined)
    
    @scala.inline
    def setFailedLocationsVarargs(value: String*): Self = this.set("failedLocations", js.Array(value :_*))
    
    @scala.inline
    def setFailedLocations(value: js.Array[String]): Self = this.set("failedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedLocations: Self = this.set("failedLocations", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
