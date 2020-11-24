package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.native
  
  /**
    *
    */
  var groupResourceName: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of items to fetch in a request. Defaults to 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the identity source, in the following format:
    * identitysources/{source_id}}
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var userResourceName: js.UndefOr[String] = js.native
}
object ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity {
  
  @scala.inline
  def apply(): ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity]
  }
  
  @scala.inline
  implicit class ParamsResourceDebugIdentitysourcesItemsListforunmappedidentityOps[Self <: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDebugOptionsDotenableDebugging(value: Boolean): Self = this.set("debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugOptionsDotenableDebugging: Self = this.set("debugOptions.enableDebugging", js.undefined)
    
    @scala.inline
    def setGroupResourceName(value: String): Self = this.set("groupResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupResourceName: Self = this.set("groupResourceName", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setUserResourceName(value: String): Self = this.set("userResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserResourceName: Self = this.set("userResourceName", js.undefined)
  }
}
