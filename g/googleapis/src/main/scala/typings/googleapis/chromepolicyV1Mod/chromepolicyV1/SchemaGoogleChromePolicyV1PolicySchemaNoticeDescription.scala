package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1PolicySchemaNoticeDescription extends StObject {
  
  /**
    * Output only. Whether the user needs to acknowledge the notice message before the value can be set.
    */
  var acknowledgementRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The field name associated with the notice.
    */
  var field: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The notice message associate with the value of the field.
    */
  var noticeMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The value of the field that has a notice. When setting the field to this value, the user may be required to acknowledge the notice message in order for the value to be set.
    */
  var noticeValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1PolicySchemaNoticeDescription {
  
  inline def apply(): SchemaGoogleChromePolicyV1PolicySchemaNoticeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1PolicySchemaNoticeDescription]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1PolicySchemaNoticeDescription](x: Self) {
    
    inline def setAcknowledgementRequired(value: Boolean): Self = StObject.set(x, "acknowledgementRequired", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgementRequiredNull: Self = StObject.set(x, "acknowledgementRequired", null)
    
    inline def setAcknowledgementRequiredUndefined: Self = StObject.set(x, "acknowledgementRequired", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setNoticeMessage(value: String): Self = StObject.set(x, "noticeMessage", value.asInstanceOf[js.Any])
    
    inline def setNoticeMessageNull: Self = StObject.set(x, "noticeMessage", null)
    
    inline def setNoticeMessageUndefined: Self = StObject.set(x, "noticeMessage", js.undefined)
    
    inline def setNoticeValue(value: String): Self = StObject.set(x, "noticeValue", value.asInstanceOf[js.Any])
    
    inline def setNoticeValueNull: Self = StObject.set(x, "noticeValue", null)
    
    inline def setNoticeValueUndefined: Self = StObject.set(x, "noticeValue", js.undefined)
  }
}
