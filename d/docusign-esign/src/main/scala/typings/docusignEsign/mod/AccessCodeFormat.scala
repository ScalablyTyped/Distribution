package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessCodeFormat extends StObject {
  
  /**
    * Boolean specifying whether this format configuration is required.
    */
  var formatRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `formatRequired` property is editable.
    */
  var formatRequiredMetadata: js.UndefOr[SettingsMetadata] = js.native
  
  /**
    * Boolean specifying whether alphabetical characters are required in the access code string.
    */
  var letterRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `letterRequired` property is editable.
    */
  var letterRequiredMetadata: js.UndefOr[SettingsMetadata] = js.native
  
  /**
    * Minimum length of the access code string.
    */
  var minimumLength: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `minimumLength` property is editable.
    */
  var minimumLengthMetadata: js.UndefOr[SettingsMetadata] = js.native
  
  /**
    * Boolean specifying whether numerical characters (0-9) are required in the access code string.
    */
  var numberRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `numberRequired` property is editable.
    */
  var numberRequiredMetadata: js.UndefOr[SettingsMetadata] = js.native
  
  /**
    * Boolean specifying whether special characters are required in the access code string. The string cannot contain the special characters '<', '>', '&', or '#'.
    */
  var specialCharacterRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `specialCharacterRequired` property is editable.
    */
  var specialCharacterRequiredMetadata: js.UndefOr[SettingsMetadata] = js.native
}
object AccessCodeFormat {
  
  @scala.inline
  def apply(): AccessCodeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessCodeFormat]
  }
  
  @scala.inline
  implicit class AccessCodeFormatMutableBuilder[Self <: AccessCodeFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatRequired(value: String): Self = StObject.set(x, "formatRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatRequiredMetadata(value: SettingsMetadata): Self = StObject.set(x, "formatRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatRequiredMetadataUndefined: Self = StObject.set(x, "formatRequiredMetadata", js.undefined)
    
    @scala.inline
    def setFormatRequiredUndefined: Self = StObject.set(x, "formatRequired", js.undefined)
    
    @scala.inline
    def setLetterRequired(value: String): Self = StObject.set(x, "letterRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterRequiredMetadata(value: SettingsMetadata): Self = StObject.set(x, "letterRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterRequiredMetadataUndefined: Self = StObject.set(x, "letterRequiredMetadata", js.undefined)
    
    @scala.inline
    def setLetterRequiredUndefined: Self = StObject.set(x, "letterRequired", js.undefined)
    
    @scala.inline
    def setMinimumLength(value: String): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLengthMetadata(value: SettingsMetadata): Self = StObject.set(x, "minimumLengthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLengthMetadataUndefined: Self = StObject.set(x, "minimumLengthMetadata", js.undefined)
    
    @scala.inline
    def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
    
    @scala.inline
    def setNumberRequired(value: String): Self = StObject.set(x, "numberRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberRequiredMetadata(value: SettingsMetadata): Self = StObject.set(x, "numberRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberRequiredMetadataUndefined: Self = StObject.set(x, "numberRequiredMetadata", js.undefined)
    
    @scala.inline
    def setNumberRequiredUndefined: Self = StObject.set(x, "numberRequired", js.undefined)
    
    @scala.inline
    def setSpecialCharacterRequired(value: String): Self = StObject.set(x, "specialCharacterRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialCharacterRequiredMetadata(value: SettingsMetadata): Self = StObject.set(x, "specialCharacterRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialCharacterRequiredMetadataUndefined: Self = StObject.set(x, "specialCharacterRequiredMetadata", js.undefined)
    
    @scala.inline
    def setSpecialCharacterRequiredUndefined: Self = StObject.set(x, "specialCharacterRequired", js.undefined)
  }
}
