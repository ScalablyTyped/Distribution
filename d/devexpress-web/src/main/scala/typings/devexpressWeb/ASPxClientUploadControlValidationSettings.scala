package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that relate to the ASPxClientUploadControl.ValidationErrorOccurred client event.
  */
@js.native
trait ASPxClientUploadControlValidationSettings extends StObject {
  
  /**
    * Gets the allowed file extensions.
    */
  var allowedFileExtensions: js.Array[String] = js.native
  
  /**
    * Gets which characters in a file name are not allowed.
    */
  var invalidFileNameCharacters: js.Array[String] = js.native
  
  /**
    * Gets the maximum count of files that can be selected for uploading at once.
    */
  var maxFileCount: Double = js.native
  
  /**
    * Gets the maximum file size.
    */
  var maxFileSize: Double = js.native
}
object ASPxClientUploadControlValidationSettings {
  
  @scala.inline
  def apply(
    allowedFileExtensions: js.Array[String],
    invalidFileNameCharacters: js.Array[String],
    maxFileCount: Double,
    maxFileSize: Double
  ): ASPxClientUploadControlValidationSettings = {
    val __obj = js.Dynamic.literal(allowedFileExtensions = allowedFileExtensions.asInstanceOf[js.Any], invalidFileNameCharacters = invalidFileNameCharacters.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], maxFileSize = maxFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlValidationSettings]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlValidationSettingsMutableBuilder[Self <: ASPxClientUploadControlValidationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedFileExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setInvalidFileNameCharacters(value: js.Array[String]): Self = StObject.set(x, "invalidFileNameCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidFileNameCharactersVarargs(value: String*): Self = StObject.set(x, "invalidFileNameCharacters", js.Array(value :_*))
    
    @scala.inline
    def setMaxFileCount(value: Double): Self = StObject.set(x, "maxFileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
  }
}
