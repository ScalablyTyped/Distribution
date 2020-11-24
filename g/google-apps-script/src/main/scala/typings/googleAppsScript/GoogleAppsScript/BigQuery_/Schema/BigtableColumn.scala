package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigtableColumn extends js.Object {
  
  var encoding: js.UndefOr[String] = js.native
  
  var fieldName: js.UndefOr[String] = js.native
  
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  
  var qualifierEncoded: js.UndefOr[String] = js.native
  
  var qualifierString: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object BigtableColumn {
  
  @scala.inline
  def apply(): BigtableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumn]
  }
  
  @scala.inline
  implicit class BigtableColumnOps[Self <: BigtableColumn] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setOnlyReadLatest(value: Boolean): Self = this.set("onlyReadLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyReadLatest: Self = this.set("onlyReadLatest", js.undefined)
    
    @scala.inline
    def setQualifierEncoded(value: String): Self = this.set("qualifierEncoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifierEncoded: Self = this.set("qualifierEncoded", js.undefined)
    
    @scala.inline
    def setQualifierString(value: String): Self = this.set("qualifierString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifierString: Self = this.set("qualifierString", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
