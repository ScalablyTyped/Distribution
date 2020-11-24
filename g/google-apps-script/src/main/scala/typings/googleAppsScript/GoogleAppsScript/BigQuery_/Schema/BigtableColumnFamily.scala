package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigtableColumnFamily extends js.Object {
  
  var columns: js.UndefOr[js.Array[BigtableColumn]] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var familyId: js.UndefOr[String] = js.native
  
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object BigtableColumnFamily {
  
  @scala.inline
  def apply(): BigtableColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumnFamily]
  }
  
  @scala.inline
  implicit class BigtableColumnFamilyOps[Self <: BigtableColumnFamily] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: BigtableColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[BigtableColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFamilyId(value: String): Self = this.set("familyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyId: Self = this.set("familyId", js.undefined)
    
    @scala.inline
    def setOnlyReadLatest(value: Boolean): Self = this.set("onlyReadLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyReadLatest: Self = this.set("onlyReadLatest", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
