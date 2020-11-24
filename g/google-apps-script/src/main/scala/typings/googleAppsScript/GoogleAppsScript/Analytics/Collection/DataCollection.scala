package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.GaCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.McfCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.RealtimeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCollection extends js.Object {
  
  var Ga: js.UndefOr[GaCollection] = js.native
  
  var Mcf: js.UndefOr[McfCollection] = js.native
  
  var Realtime: js.UndefOr[RealtimeCollection] = js.native
}
object DataCollection {
  
  @scala.inline
  def apply(): DataCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCollection]
  }
  
  @scala.inline
  implicit class DataCollectionOps[Self <: DataCollection] (val x: Self) extends AnyVal {
    
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
    def setGa(value: GaCollection): Self = this.set("Ga", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGa: Self = this.set("Ga", js.undefined)
    
    @scala.inline
    def setMcf(value: McfCollection): Self = this.set("Mcf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMcf: Self = this.set("Mcf", js.undefined)
    
    @scala.inline
    def setRealtime(value: RealtimeCollection): Self = this.set("Realtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtime: Self = this.set("Realtime", js.undefined)
  }
}
