package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessCodeFormat extends js.Object {
  
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
  implicit class AccessCodeFormatOps[Self <: AccessCodeFormat] (val x: Self) extends AnyVal {
    
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
    def setFormatRequired(value: String): Self = this.set("formatRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatRequired: Self = this.set("formatRequired", js.undefined)
    
    @scala.inline
    def setFormatRequiredMetadata(value: SettingsMetadata): Self = this.set("formatRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatRequiredMetadata: Self = this.set("formatRequiredMetadata", js.undefined)
    
    @scala.inline
    def setLetterRequired(value: String): Self = this.set("letterRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterRequired: Self = this.set("letterRequired", js.undefined)
    
    @scala.inline
    def setLetterRequiredMetadata(value: SettingsMetadata): Self = this.set("letterRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterRequiredMetadata: Self = this.set("letterRequiredMetadata", js.undefined)
    
    @scala.inline
    def setMinimumLength(value: String): Self = this.set("minimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumLength: Self = this.set("minimumLength", js.undefined)
    
    @scala.inline
    def setMinimumLengthMetadata(value: SettingsMetadata): Self = this.set("minimumLengthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumLengthMetadata: Self = this.set("minimumLengthMetadata", js.undefined)
    
    @scala.inline
    def setNumberRequired(value: String): Self = this.set("numberRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberRequired: Self = this.set("numberRequired", js.undefined)
    
    @scala.inline
    def setNumberRequiredMetadata(value: SettingsMetadata): Self = this.set("numberRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberRequiredMetadata: Self = this.set("numberRequiredMetadata", js.undefined)
    
    @scala.inline
    def setSpecialCharacterRequired(value: String): Self = this.set("specialCharacterRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialCharacterRequired: Self = this.set("specialCharacterRequired", js.undefined)
    
    @scala.inline
    def setSpecialCharacterRequiredMetadata(value: SettingsMetadata): Self = this.set("specialCharacterRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialCharacterRequiredMetadata: Self = this.set("specialCharacterRequiredMetadata", js.undefined)
  }
}
