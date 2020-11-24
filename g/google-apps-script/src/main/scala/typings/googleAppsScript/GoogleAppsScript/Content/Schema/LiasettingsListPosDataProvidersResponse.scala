package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsListPosDataProvidersResponse extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var posDataProviders: js.UndefOr[js.Array[PosDataProviders]] = js.native
}
object LiasettingsListPosDataProvidersResponse {
  
  @scala.inline
  def apply(): LiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsListPosDataProvidersResponse]
  }
  
  @scala.inline
  implicit class LiasettingsListPosDataProvidersResponseOps[Self <: LiasettingsListPosDataProvidersResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPosDataProvidersVarargs(value: PosDataProviders*): Self = this.set("posDataProviders", js.Array(value :_*))
    
    @scala.inline
    def setPosDataProviders(value: js.Array[PosDataProviders]): Self = this.set("posDataProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosDataProviders: Self = this.set("posDataProviders", js.undefined)
  }
}
