package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobConfigurationTableCopy extends js.Object {
  
  var createDisposition: js.UndefOr[String] = js.native
  
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  
  var destinationTable: js.UndefOr[TableReference] = js.native
  
  var sourceTable: js.UndefOr[TableReference] = js.native
  
  var sourceTables: js.UndefOr[js.Array[TableReference]] = js.native
  
  var writeDisposition: js.UndefOr[String] = js.native
}
object JobConfigurationTableCopy {
  
  @scala.inline
  def apply(): JobConfigurationTableCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationTableCopy]
  }
  
  @scala.inline
  implicit class JobConfigurationTableCopyOps[Self <: JobConfigurationTableCopy] (val x: Self) extends AnyVal {
    
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
    def setCreateDisposition(value: String): Self = this.set("createDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDisposition: Self = this.set("createDisposition", js.undefined)
    
    @scala.inline
    def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationEncryptionConfiguration: Self = this.set("destinationEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDestinationTable(value: TableReference): Self = this.set("destinationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationTable: Self = this.set("destinationTable", js.undefined)
    
    @scala.inline
    def setSourceTable(value: TableReference): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
    
    @scala.inline
    def setSourceTablesVarargs(value: TableReference*): Self = this.set("sourceTables", js.Array(value :_*))
    
    @scala.inline
    def setSourceTables(value: js.Array[TableReference]): Self = this.set("sourceTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTables: Self = this.set("sourceTables", js.undefined)
    
    @scala.inline
    def setWriteDisposition(value: String): Self = this.set("writeDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteDisposition: Self = this.set("writeDisposition", js.undefined)
  }
}
