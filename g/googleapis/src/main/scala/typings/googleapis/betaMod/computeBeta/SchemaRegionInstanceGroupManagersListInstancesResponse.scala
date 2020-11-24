package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionInstanceGroupManagersListInstancesResponse extends js.Object {
  
  /**
    * A list of managed instances.
    */
  var managedInstances: js.UndefOr[js.Array[SchemaManagedInstance]] = js.native
  
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaRegionInstanceGroupManagersListInstancesResponse {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersListInstancesResponse]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersListInstancesResponseOps[Self <: SchemaRegionInstanceGroupManagersListInstancesResponse] (val x: Self) extends AnyVal {
    
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
    def setManagedInstancesVarargs(value: SchemaManagedInstance*): Self = this.set("managedInstances", js.Array(value :_*))
    
    @scala.inline
    def setManagedInstances(value: js.Array[SchemaManagedInstance]): Self = this.set("managedInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedInstances: Self = this.set("managedInstances", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
