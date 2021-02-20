package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAccountManagementGranularInformation extends StObject {
  
  /**
    * **True** if the user can manage account security settings.
    */
  var canManageAccountSecuritySettings: js.UndefOr[String] = js.native
  
  var canManageAccountSecuritySettingsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * **True** if the user can manage account settings.
    */
  var canManageAccountSettings: js.UndefOr[String] = js.native
  
  var canManageAccountSettingsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * **True** if the user can manage administrators.
    */
  var canManageAdmins: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `canManageAdmins` property is editable.
    *
    */
  var canManageAdminsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * **True** if the user can manage reporting.
    */
  var canManageReporting: js.UndefOr[String] = js.native
  
  var canManageReportingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * **True** if the user can manage sharing.
    */
  var canManageSharing: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `canManageSharing` property is editable.
    *
    */
  var canManageSharingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * **True** if the user can manage signing groups.
    */
  var canManageSigningGroups: js.UndefOr[String] = js.native
  
  var canManageSigningGroupsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * **True** if the user can manage users.
    */
  var canManageUsers: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `canManageUsers` property is editable.
    *
    */
  var canManageUsersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object UserAccountManagementGranularInformation {
  
  @scala.inline
  def apply(): UserAccountManagementGranularInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAccountManagementGranularInformation]
  }
  
  @scala.inline
  implicit class UserAccountManagementGranularInformationMutableBuilder[Self <: UserAccountManagementGranularInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanManageAccountSecuritySettings(value: String): Self = StObject.set(x, "canManageAccountSecuritySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageAccountSecuritySettingsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageAccountSecuritySettingsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageAccountSecuritySettingsMetadataUndefined: Self = StObject.set(x, "canManageAccountSecuritySettingsMetadata", js.undefined)
    
    @scala.inline
    def setCanManageAccountSecuritySettingsUndefined: Self = StObject.set(x, "canManageAccountSecuritySettings", js.undefined)
    
    @scala.inline
    def setCanManageAccountSettings(value: String): Self = StObject.set(x, "canManageAccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageAccountSettingsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageAccountSettingsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageAccountSettingsMetadataUndefined: Self = StObject.set(x, "canManageAccountSettingsMetadata", js.undefined)
    
    @scala.inline
    def setCanManageAccountSettingsUndefined: Self = StObject.set(x, "canManageAccountSettings", js.undefined)
    
    @scala.inline
    def setCanManageAdmins(value: String): Self = StObject.set(x, "canManageAdmins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageAdminsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageAdminsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageAdminsMetadataUndefined: Self = StObject.set(x, "canManageAdminsMetadata", js.undefined)
    
    @scala.inline
    def setCanManageAdminsUndefined: Self = StObject.set(x, "canManageAdmins", js.undefined)
    
    @scala.inline
    def setCanManageReporting(value: String): Self = StObject.set(x, "canManageReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageReportingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageReportingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageReportingMetadataUndefined: Self = StObject.set(x, "canManageReportingMetadata", js.undefined)
    
    @scala.inline
    def setCanManageReportingUndefined: Self = StObject.set(x, "canManageReporting", js.undefined)
    
    @scala.inline
    def setCanManageSharing(value: String): Self = StObject.set(x, "canManageSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageSharingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageSharingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageSharingMetadataUndefined: Self = StObject.set(x, "canManageSharingMetadata", js.undefined)
    
    @scala.inline
    def setCanManageSharingUndefined: Self = StObject.set(x, "canManageSharing", js.undefined)
    
    @scala.inline
    def setCanManageSigningGroups(value: String): Self = StObject.set(x, "canManageSigningGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageSigningGroupsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageSigningGroupsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageSigningGroupsMetadataUndefined: Self = StObject.set(x, "canManageSigningGroupsMetadata", js.undefined)
    
    @scala.inline
    def setCanManageSigningGroupsUndefined: Self = StObject.set(x, "canManageSigningGroups", js.undefined)
    
    @scala.inline
    def setCanManageUsers(value: String): Self = StObject.set(x, "canManageUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageUsersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageUsersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageUsersMetadataUndefined: Self = StObject.set(x, "canManageUsersMetadata", js.undefined)
    
    @scala.inline
    def setCanManageUsersUndefined: Self = StObject.set(x, "canManageUsers", js.undefined)
  }
}
