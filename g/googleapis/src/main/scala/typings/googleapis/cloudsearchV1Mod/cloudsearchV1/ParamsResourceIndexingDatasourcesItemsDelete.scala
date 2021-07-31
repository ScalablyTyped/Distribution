package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIndexingDatasourcesItemsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of connector making this call. <br />Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The RequestMode for this request.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the item to delete. Format:
    * datasources/{source_id}/items/{item_id}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The incremented version of the item to delete from the index.
    * The indexing system stores the version from the datasource as a byte
    * string and compares the Item version in the index to the version of the
    * queued Item using lexical ordering. <br /><br /> Cloud Search Indexing
    * won't delete any queued item with a version value that is less than or
    * equal to the version of the currently indexed item. The maximum length
    * for this field is 1024 bytes.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ParamsResourceIndexingDatasourcesItemsDelete {
  
  @scala.inline
  def apply(): ParamsResourceIndexingDatasourcesItemsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceIndexingDatasourcesItemsDeleteMutableBuilder[Self <: ParamsResourceIndexingDatasourcesItemsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "debugOptions.enableDebugging", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
