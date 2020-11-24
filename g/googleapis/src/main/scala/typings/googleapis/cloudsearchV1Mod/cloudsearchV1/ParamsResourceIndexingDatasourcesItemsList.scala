package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceIndexingDatasourcesItemsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * When set to true, the indexing system only populates the following
    * fields: name, version, metadata.hash, structured_data.hash, content.hash.
    * <br />If this value is false, then all the fields are populated in Item.
    */
  var brief: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of connector making this call. <br />Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.native
  
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the Data Source to list Items.  Format: datasources/{source_id}
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of items to fetch in a request. The max value is 1000 when
    * brief is true.  The max value is 10 if brief is false. <br />The default
    * value is 10
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceIndexingDatasourcesItemsList {
  
  @scala.inline
  def apply(): ParamsResourceIndexingDatasourcesItemsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsList]
  }
  
  @scala.inline
  implicit class ParamsResourceIndexingDatasourcesItemsListOps[Self <: ParamsResourceIndexingDatasourcesItemsList] (val x: Self) extends AnyVal {
    
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
    def setBrief(value: Boolean): Self = this.set("brief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrief: Self = this.set("brief", js.undefined)
    
    @scala.inline
    def setConnectorName(value: String): Self = this.set("connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorName: Self = this.set("connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptionsDotenableDebugging(value: Boolean): Self = this.set("debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugOptionsDotenableDebugging: Self = this.set("debugOptions.enableDebugging", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
