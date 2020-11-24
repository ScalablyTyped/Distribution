package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Aggregation of items by status code as of the specified date.
  */
@js.native
trait SchemaDataSourceIndexStats extends js.Object {
  
  /**
    * Date for which index stats were calculated. If the date of request is not
    * the current date then stats calculated on the next day are returned.
    * Stats are calculated close to mid night in this case. If date of request
    * is current date, then real time stats are returned.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  
  /**
    * Number of items aggregrated by status code.
    */
  var itemCountByStatus: js.UndefOr[js.Array[SchemaItemCountByStatus]] = js.native
}
object SchemaDataSourceIndexStats {
  
  @scala.inline
  def apply(): SchemaDataSourceIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceIndexStats]
  }
  
  @scala.inline
  implicit class SchemaDataSourceIndexStatsOps[Self <: SchemaDataSourceIndexStats] (val x: Self) extends AnyVal {
    
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
    def setDate(value: SchemaDate): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setItemCountByStatusVarargs(value: SchemaItemCountByStatus*): Self = this.set("itemCountByStatus", js.Array(value :_*))
    
    @scala.inline
    def setItemCountByStatus(value: js.Array[SchemaItemCountByStatus]): Self = this.set("itemCountByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCountByStatus: Self = this.set("itemCountByStatus", js.undefined)
  }
}
