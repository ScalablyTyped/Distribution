package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshOptions extends js.Object {
  
  var eagerRefreshThresholdMillis: js.UndefOr[Double] = js.native
  
  var forceRefreshOnFailure: js.UndefOr[Boolean] = js.native
}
object RefreshOptions {
  
  @scala.inline
  def apply(): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshOptions]
  }
  
  @scala.inline
  implicit class RefreshOptionsOps[Self <: RefreshOptions] (val x: Self) extends AnyVal {
    
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
    def setEagerRefreshThresholdMillis(value: Double): Self = this.set("eagerRefreshThresholdMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEagerRefreshThresholdMillis: Self = this.set("eagerRefreshThresholdMillis", js.undefined)
    
    @scala.inline
    def setForceRefreshOnFailure(value: Boolean): Self = this.set("forceRefreshOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRefreshOnFailure: Self = this.set("forceRefreshOnFailure", js.undefined)
  }
}
