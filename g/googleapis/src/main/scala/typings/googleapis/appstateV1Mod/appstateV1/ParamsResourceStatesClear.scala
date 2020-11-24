package typings.googleapis.appstateV1Mod.appstateV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceStatesClear extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The version of the data to be cleared. Version strings are returned by
    * the server.
    */
  var currentDataVersion: js.UndefOr[String] = js.native
  
  /**
    * The key for the data to be retrieved.
    */
  var stateKey: js.UndefOr[Double] = js.native
}
object ParamsResourceStatesClear {
  
  @scala.inline
  def apply(): ParamsResourceStatesClear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStatesClear]
  }
  
  @scala.inline
  implicit class ParamsResourceStatesClearOps[Self <: ParamsResourceStatesClear] (val x: Self) extends AnyVal {
    
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
    def setCurrentDataVersion(value: String): Self = this.set("currentDataVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDataVersion: Self = this.set("currentDataVersion", js.undefined)
    
    @scala.inline
    def setStateKey(value: Double): Self = this.set("stateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateKey: Self = this.set("stateKey", js.undefined)
  }
}
