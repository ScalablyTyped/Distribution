package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1PolicySchemaFieldKnownValueDescription extends StObject {
  
  /**
    * Output only. Additional description for this value.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The string represenstation of the value that can be set for the field.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1PolicySchemaFieldKnownValueDescription {
  
  inline def apply(): SchemaGoogleChromePolicyV1PolicySchemaFieldKnownValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1PolicySchemaFieldKnownValueDescription]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1PolicySchemaFieldKnownValueDescription](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
