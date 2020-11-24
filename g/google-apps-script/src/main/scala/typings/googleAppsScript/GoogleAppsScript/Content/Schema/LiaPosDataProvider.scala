package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiaPosDataProvider extends js.Object {
  
  var posDataProviderId: js.UndefOr[String] = js.native
  
  var posExternalAccountId: js.UndefOr[String] = js.native
}
object LiaPosDataProvider {
  
  @scala.inline
  def apply(): LiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaPosDataProvider]
  }
  
  @scala.inline
  implicit class LiaPosDataProviderOps[Self <: LiaPosDataProvider] (val x: Self) extends AnyVal {
    
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
    def setPosDataProviderId(value: String): Self = this.set("posDataProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosDataProviderId: Self = this.set("posDataProviderId", js.undefined)
    
    @scala.inline
    def setPosExternalAccountId(value: String): Self = this.set("posExternalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosExternalAccountId: Self = this.set("posExternalAccountId", js.undefined)
  }
}
