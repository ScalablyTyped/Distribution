package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalDocumentSources extends js.Object {
  
  /**
    * The account is enabled to allow external documents to be attached from BoxNet.
    */
  var boxnetEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `boxnetEnabled` property is editable.
    */
  var boxnetMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The account is enabled to allow external documents to be attached from DropBox.
    */
  var dropboxEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `dropboxEnabled` property is editable.
    */
  var dropboxMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The account is enabled to allow external documents to be attached from Google Drive.
    */
  var googleDriveEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `googleDriveEnabled` property is editable.
    */
  var googleDriveMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The account is enabled to allow external documents to be attached from OneDrive.
    */
  var oneDriveEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `oneDriveEnabled` property is editable.
    */
  var oneDriveMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The account is enabled to allow external documents to be attached from Salesforce.
    */
  var salesforceEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating whether the `salesforceEnabled` property is editable.
    */
  var salesforceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object ExternalDocumentSources {
  
  @scala.inline
  def apply(): ExternalDocumentSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDocumentSources]
  }
  
  @scala.inline
  implicit class ExternalDocumentSourcesOps[Self <: ExternalDocumentSources] (val x: Self) extends AnyVal {
    
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
    def setBoxnetEnabled(value: String): Self = this.set("boxnetEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxnetEnabled: Self = this.set("boxnetEnabled", js.undefined)
    
    @scala.inline
    def setBoxnetMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("boxnetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxnetMetadata: Self = this.set("boxnetMetadata", js.undefined)
    
    @scala.inline
    def setDropboxEnabled(value: String): Self = this.set("dropboxEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropboxEnabled: Self = this.set("dropboxEnabled", js.undefined)
    
    @scala.inline
    def setDropboxMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("dropboxMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropboxMetadata: Self = this.set("dropboxMetadata", js.undefined)
    
    @scala.inline
    def setGoogleDriveEnabled(value: String): Self = this.set("googleDriveEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleDriveEnabled: Self = this.set("googleDriveEnabled", js.undefined)
    
    @scala.inline
    def setGoogleDriveMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("googleDriveMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleDriveMetadata: Self = this.set("googleDriveMetadata", js.undefined)
    
    @scala.inline
    def setOneDriveEnabled(value: String): Self = this.set("oneDriveEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneDriveEnabled: Self = this.set("oneDriveEnabled", js.undefined)
    
    @scala.inline
    def setOneDriveMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("oneDriveMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneDriveMetadata: Self = this.set("oneDriveMetadata", js.undefined)
    
    @scala.inline
    def setSalesforceEnabled(value: String): Self = this.set("salesforceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforceEnabled: Self = this.set("salesforceEnabled", js.undefined)
    
    @scala.inline
    def setSalesforceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("salesforceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforceMetadata: Self = this.set("salesforceMetadata", js.undefined)
  }
}
