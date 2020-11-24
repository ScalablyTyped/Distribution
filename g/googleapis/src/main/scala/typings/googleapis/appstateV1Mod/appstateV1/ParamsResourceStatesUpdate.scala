package typings.googleapis.appstateV1Mod.appstateV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceStatesUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The version of the app state your application is attempting to update. If
    * this does not match the current version, this method will return a
    * conflict error. If there is no data stored on the server for this key,
    * the update will succeed irrespective of the value of this parameter.
    */
  var currentStateVersion: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateRequest] = js.native
  
  /**
    * The key for the data to be retrieved.
    */
  var stateKey: js.UndefOr[Double] = js.native
}
object ParamsResourceStatesUpdate {
  
  @scala.inline
  def apply(): ParamsResourceStatesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStatesUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceStatesUpdateOps[Self <: ParamsResourceStatesUpdate] (val x: Self) extends AnyVal {
    
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
    def setCurrentStateVersion(value: String): Self = this.set("currentStateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentStateVersion: Self = this.set("currentStateVersion", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaUpdateRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setStateKey(value: Double): Self = this.set("stateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateKey: Self = this.set("stateKey", js.undefined)
  }
}
