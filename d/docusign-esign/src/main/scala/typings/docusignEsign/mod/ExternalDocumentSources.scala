package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalDocumentSources extends StObject {
  
  /**
    * The account is enabled to allow external documents to be attached from BoxNet.
    */
  var boxnetEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `boxnetEnabled` property is editable.
    */
  var boxnetMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The account is enabled to allow external documents to be attached from DropBox.
    */
  var dropboxEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `dropboxEnabled` property is editable.
    */
  var dropboxMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The account is enabled to allow external documents to be attached from Google Drive.
    */
  var googleDriveEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `googleDriveEnabled` property is editable.
    */
  var googleDriveMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The account is enabled to allow external documents to be attached from OneDrive.
    */
  var oneDriveEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `oneDriveEnabled` property is editable.
    */
  var oneDriveMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The account is enabled to allow external documents to be attached from Salesforce.
    */
  var salesforceEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata indicating whether the `salesforceEnabled` property is editable.
    */
  var salesforceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
}
object ExternalDocumentSources {
  
  inline def apply(): ExternalDocumentSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDocumentSources]
  }
  
  extension [Self <: ExternalDocumentSources](x: Self) {
    
    inline def setBoxnetEnabled(value: String): Self = StObject.set(x, "boxnetEnabled", value.asInstanceOf[js.Any])
    
    inline def setBoxnetEnabledUndefined: Self = StObject.set(x, "boxnetEnabled", js.undefined)
    
    inline def setBoxnetMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "boxnetMetadata", value.asInstanceOf[js.Any])
    
    inline def setBoxnetMetadataUndefined: Self = StObject.set(x, "boxnetMetadata", js.undefined)
    
    inline def setDropboxEnabled(value: String): Self = StObject.set(x, "dropboxEnabled", value.asInstanceOf[js.Any])
    
    inline def setDropboxEnabledUndefined: Self = StObject.set(x, "dropboxEnabled", js.undefined)
    
    inline def setDropboxMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "dropboxMetadata", value.asInstanceOf[js.Any])
    
    inline def setDropboxMetadataUndefined: Self = StObject.set(x, "dropboxMetadata", js.undefined)
    
    inline def setGoogleDriveEnabled(value: String): Self = StObject.set(x, "googleDriveEnabled", value.asInstanceOf[js.Any])
    
    inline def setGoogleDriveEnabledUndefined: Self = StObject.set(x, "googleDriveEnabled", js.undefined)
    
    inline def setGoogleDriveMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "googleDriveMetadata", value.asInstanceOf[js.Any])
    
    inline def setGoogleDriveMetadataUndefined: Self = StObject.set(x, "googleDriveMetadata", js.undefined)
    
    inline def setOneDriveEnabled(value: String): Self = StObject.set(x, "oneDriveEnabled", value.asInstanceOf[js.Any])
    
    inline def setOneDriveEnabledUndefined: Self = StObject.set(x, "oneDriveEnabled", js.undefined)
    
    inline def setOneDriveMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "oneDriveMetadata", value.asInstanceOf[js.Any])
    
    inline def setOneDriveMetadataUndefined: Self = StObject.set(x, "oneDriveMetadata", js.undefined)
    
    inline def setSalesforceEnabled(value: String): Self = StObject.set(x, "salesforceEnabled", value.asInstanceOf[js.Any])
    
    inline def setSalesforceEnabledUndefined: Self = StObject.set(x, "salesforceEnabled", js.undefined)
    
    inline def setSalesforceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "salesforceMetadata", value.asInstanceOf[js.Any])
    
    inline def setSalesforceMetadataUndefined: Self = StObject.set(x, "salesforceMetadata", js.undefined)
  }
}
