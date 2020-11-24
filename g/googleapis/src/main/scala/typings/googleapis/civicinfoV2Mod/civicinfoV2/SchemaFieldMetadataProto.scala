package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFieldMetadataProto extends js.Object {
  
  var internal: js.UndefOr[SchemaInternalFieldMetadataProto] = js.native
}
object SchemaFieldMetadataProto {
  
  @scala.inline
  def apply(): SchemaFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMetadataProto]
  }
  
  @scala.inline
  implicit class SchemaFieldMetadataProtoOps[Self <: SchemaFieldMetadataProto] (val x: Self) extends AnyVal {
    
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
    def setInternal(value: SchemaInternalFieldMetadataProto): Self = this.set("internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
  }
}
