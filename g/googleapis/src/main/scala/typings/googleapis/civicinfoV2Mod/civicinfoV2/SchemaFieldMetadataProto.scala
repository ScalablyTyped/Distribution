package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFieldMetadataProto extends StObject {
  
  var internal: js.UndefOr[SchemaInternalFieldMetadataProto] = js.native
}
object SchemaFieldMetadataProto {
  
  @scala.inline
  def apply(): SchemaFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMetadataProto]
  }
  
  @scala.inline
  implicit class SchemaFieldMetadataProtoMutableBuilder[Self <: SchemaFieldMetadataProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInternal(value: SchemaInternalFieldMetadataProto): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
  }
}
