package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPointProto extends StObject {
  
  var latE7: js.UndefOr[Double] = js.undefined
  
  var lngE7: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[SchemaFieldMetadataProto] = js.undefined
  
  var temporaryData: js.UndefOr[SchemaMessageSet] = js.undefined
}
object SchemaPointProto {
  
  @scala.inline
  def apply(): SchemaPointProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPointProto]
  }
  
  @scala.inline
  implicit class SchemaPointProtoMutableBuilder[Self <: SchemaPointProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatE7(value: Double): Self = StObject.set(x, "latE7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatE7Undefined: Self = StObject.set(x, "latE7", js.undefined)
    
    @scala.inline
    def setLngE7(value: Double): Self = StObject.set(x, "lngE7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngE7Undefined: Self = StObject.set(x, "lngE7", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadataProto): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setTemporaryData(value: SchemaMessageSet): Self = StObject.set(x, "temporaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporaryDataUndefined: Self = StObject.set(x, "temporaryData", js.undefined)
  }
}
