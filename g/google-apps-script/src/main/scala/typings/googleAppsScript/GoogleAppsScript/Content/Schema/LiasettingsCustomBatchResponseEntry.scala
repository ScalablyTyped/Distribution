package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsCustomBatchResponseEntry extends js.Object {
  
  var batchId: js.UndefOr[Double] = js.native
  
  var errors: js.UndefOr[Errors] = js.native
  
  var gmbAccounts: js.UndefOr[GmbAccounts] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var liaSettings: js.UndefOr[LiaSettings] = js.native
  
  var posDataProviders: js.UndefOr[js.Array[PosDataProviders]] = js.native
}
object LiasettingsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): LiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class LiasettingsCustomBatchResponseEntryOps[Self <: LiasettingsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setGmbAccounts(value: GmbAccounts): Self = this.set("gmbAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGmbAccounts: Self = this.set("gmbAccounts", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLiaSettings(value: LiaSettings): Self = this.set("liaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiaSettings: Self = this.set("liaSettings", js.undefined)
    
    @scala.inline
    def setPosDataProvidersVarargs(value: PosDataProviders*): Self = this.set("posDataProviders", js.Array(value :_*))
    
    @scala.inline
    def setPosDataProviders(value: js.Array[PosDataProviders]): Self = this.set("posDataProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosDataProviders: Self = this.set("posDataProviders", js.undefined)
  }
}
