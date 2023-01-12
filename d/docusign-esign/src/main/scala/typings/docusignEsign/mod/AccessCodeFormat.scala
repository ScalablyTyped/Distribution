package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessCodeFormat extends StObject {
  
  /**
    * Boolean specifying whether this format configuration is required.
    */
  var formatRequired: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `formatRequired` property is editable.
    */
  var formatRequiredMetadata: js.UndefOr[SettingsMetadata] = js.undefined
  
  /**
    * Boolean specifying whether alphabetical characters are required in the access code string.
    */
  var letterRequired: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `letterRequired` property is editable.
    */
  var letterRequiredMetadata: js.UndefOr[SettingsMetadata] = js.undefined
  
  /**
    * Minimum length of the access code string.
    */
  var minimumLength: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `minimumLength` property is editable.
    */
  var minimumLengthMetadata: js.UndefOr[SettingsMetadata] = js.undefined
  
  /**
    * Boolean specifying whether numerical characters (0-9) are required in the access code string.
    */
  var numberRequired: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `numberRequired` property is editable.
    */
  var numberRequiredMetadata: js.UndefOr[SettingsMetadata] = js.undefined
  
  /**
    * Boolean specifying whether special characters are required in the access code string. The string cannot contain the special characters '<', '>', '&', or '#'.
    */
  var specialCharacterRequired: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `specialCharacterRequired` property is editable.
    */
  var specialCharacterRequiredMetadata: js.UndefOr[SettingsMetadata] = js.undefined
}
object AccessCodeFormat {
  
  inline def apply(): AccessCodeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessCodeFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessCodeFormat] (val x: Self) extends AnyVal {
    
    inline def setFormatRequired(value: String): Self = StObject.set(x, "formatRequired", value.asInstanceOf[js.Any])
    
    inline def setFormatRequiredMetadata(value: SettingsMetadata): Self = StObject.set(x, "formatRequiredMetadata", value.asInstanceOf[js.Any])
    
    inline def setFormatRequiredMetadataUndefined: Self = StObject.set(x, "formatRequiredMetadata", js.undefined)
    
    inline def setFormatRequiredUndefined: Self = StObject.set(x, "formatRequired", js.undefined)
    
    inline def setLetterRequired(value: String): Self = StObject.set(x, "letterRequired", value.asInstanceOf[js.Any])
    
    inline def setLetterRequiredMetadata(value: SettingsMetadata): Self = StObject.set(x, "letterRequiredMetadata", value.asInstanceOf[js.Any])
    
    inline def setLetterRequiredMetadataUndefined: Self = StObject.set(x, "letterRequiredMetadata", js.undefined)
    
    inline def setLetterRequiredUndefined: Self = StObject.set(x, "letterRequired", js.undefined)
    
    inline def setMinimumLength(value: String): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumLengthMetadata(value: SettingsMetadata): Self = StObject.set(x, "minimumLengthMetadata", value.asInstanceOf[js.Any])
    
    inline def setMinimumLengthMetadataUndefined: Self = StObject.set(x, "minimumLengthMetadata", js.undefined)
    
    inline def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
    
    inline def setNumberRequired(value: String): Self = StObject.set(x, "numberRequired", value.asInstanceOf[js.Any])
    
    inline def setNumberRequiredMetadata(value: SettingsMetadata): Self = StObject.set(x, "numberRequiredMetadata", value.asInstanceOf[js.Any])
    
    inline def setNumberRequiredMetadataUndefined: Self = StObject.set(x, "numberRequiredMetadata", js.undefined)
    
    inline def setNumberRequiredUndefined: Self = StObject.set(x, "numberRequired", js.undefined)
    
    inline def setSpecialCharacterRequired(value: String): Self = StObject.set(x, "specialCharacterRequired", value.asInstanceOf[js.Any])
    
    inline def setSpecialCharacterRequiredMetadata(value: SettingsMetadata): Self = StObject.set(x, "specialCharacterRequiredMetadata", value.asInstanceOf[js.Any])
    
    inline def setSpecialCharacterRequiredMetadataUndefined: Self = StObject.set(x, "specialCharacterRequiredMetadata", js.undefined)
    
    inline def setSpecialCharacterRequiredUndefined: Self = StObject.set(x, "specialCharacterRequired", js.undefined)
  }
}
