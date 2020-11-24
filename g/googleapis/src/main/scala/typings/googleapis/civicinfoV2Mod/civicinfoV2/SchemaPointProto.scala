package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPointProto extends js.Object {
  
  var latE7: js.UndefOr[Double] = js.native
  
  var lngE7: js.UndefOr[Double] = js.native
  
  var metadata: js.UndefOr[SchemaFieldMetadataProto] = js.native
  
  var temporaryData: js.UndefOr[SchemaMessageSet] = js.native
}
object SchemaPointProto {
  
  @scala.inline
  def apply(): SchemaPointProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPointProto]
  }
  
  @scala.inline
  implicit class SchemaPointProtoOps[Self <: SchemaPointProto] (val x: Self) extends AnyVal {
    
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
    def setLatE7(value: Double): Self = this.set("latE7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatE7: Self = this.set("latE7", js.undefined)
    
    @scala.inline
    def setLngE7(value: Double): Self = this.set("lngE7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLngE7: Self = this.set("lngE7", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadataProto): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setTemporaryData(value: SchemaMessageSet): Self = this.set("temporaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporaryData: Self = this.set("temporaryData", js.undefined)
  }
}
