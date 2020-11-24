package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaMessageSet extends js.Object {
  
  var recordMessageSetExt: js.UndefOr[SchemaLivegraphBacktraceRecordInfo] = js.native
}
object SchemaMessageSet {
  
  @scala.inline
  def apply(): SchemaMessageSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageSet]
  }
  
  @scala.inline
  implicit class SchemaMessageSetOps[Self <: SchemaMessageSet] (val x: Self) extends AnyVal {
    
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
    def setRecordMessageSetExt(value: SchemaLivegraphBacktraceRecordInfo): Self = this.set("recordMessageSetExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordMessageSetExt: Self = this.set("recordMessageSetExt", js.undefined)
  }
}
