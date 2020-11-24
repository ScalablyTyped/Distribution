package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInternalFieldMetadataProto extends js.Object {
  
  var isAuto: js.UndefOr[Boolean] = js.native
  
  var sourceSummary: js.UndefOr[SchemaInternalSourceSummaryProto] = js.native
}
object SchemaInternalFieldMetadataProto {
  
  @scala.inline
  def apply(): SchemaInternalFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalFieldMetadataProto]
  }
  
  @scala.inline
  implicit class SchemaInternalFieldMetadataProtoOps[Self <: SchemaInternalFieldMetadataProto] (val x: Self) extends AnyVal {
    
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
    def setIsAuto(value: Boolean): Self = this.set("isAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAuto: Self = this.set("isAuto", js.undefined)
    
    @scala.inline
    def setSourceSummary(value: SchemaInternalSourceSummaryProto): Self = this.set("sourceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSummary: Self = this.set("sourceSummary", js.undefined)
  }
}
