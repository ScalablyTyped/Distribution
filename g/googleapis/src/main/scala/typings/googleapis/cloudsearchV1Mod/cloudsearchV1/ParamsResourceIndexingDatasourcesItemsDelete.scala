package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceIndexingDatasourcesItemsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
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
    * Required. The RequestMode for this request.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Required. Name of the item to delete. Format:
    * datasources/{source_id}/items/{item_id}
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The incremented version of the item to delete from the index.
    * The indexing system stores the version from the datasource as a byte
    * string and compares the Item version in the index to the version of the
    * queued Item using lexical ordering. <br /><br /> Cloud Search Indexing
    * won't delete any queued item with a version value that is less than or
    * equal to the version of the currently indexed item. The maximum length
    * for this field is 1024 bytes.
    */
  var version: js.UndefOr[String] = js.native
}

object ParamsResourceIndexingDatasourcesItemsDelete {
  @scala.inline
  def apply(): ParamsResourceIndexingDatasourcesItemsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsDelete]
  }
  @scala.inline
  implicit class ParamsResourceIndexingDatasourcesItemsDeleteOps[Self <: ParamsResourceIndexingDatasourcesItemsDelete] (val x: Self) extends AnyVal {
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
    def setConnectorName(value: String): Self = this.set("connectorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorName: Self = this.set("connectorName", js.undefined)
    @scala.inline
    def setDebugOptionsDotenableDebugging(value: Boolean): Self = this.set("debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugOptionsDotenableDebugging: Self = this.set("debugOptions.enableDebugging", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

