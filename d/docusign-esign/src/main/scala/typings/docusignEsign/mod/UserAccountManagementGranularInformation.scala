package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAccountManagementGranularInformation extends js.Object {
  
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
  implicit class UserAccountManagementGranularInformationOps[Self <: UserAccountManagementGranularInformation] (val x: Self) extends AnyVal {
    
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
    def setCanManageAccountSecuritySettings(value: String): Self = this.set("canManageAccountSecuritySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageAccountSecuritySettings: Self = this.set("canManageAccountSecuritySettings", js.undefined)
    
    @scala.inline
    def setCanManageAccountSecuritySettingsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageAccountSecuritySettingsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageAccountSecuritySettingsMetadata: Self = this.set("canManageAccountSecuritySettingsMetadata", js.undefined)
    
    @scala.inline
    def setCanManageAccountSettings(value: String): Self = this.set("canManageAccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageAccountSettings: Self = this.set("canManageAccountSettings", js.undefined)
    
    @scala.inline
    def setCanManageAccountSettingsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageAccountSettingsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageAccountSettingsMetadata: Self = this.set("canManageAccountSettingsMetadata", js.undefined)
    
    @scala.inline
    def setCanManageAdmins(value: String): Self = this.set("canManageAdmins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageAdmins: Self = this.set("canManageAdmins", js.undefined)
    
    @scala.inline
    def setCanManageAdminsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageAdminsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageAdminsMetadata: Self = this.set("canManageAdminsMetadata", js.undefined)
    
    @scala.inline
    def setCanManageReporting(value: String): Self = this.set("canManageReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageReporting: Self = this.set("canManageReporting", js.undefined)
    
    @scala.inline
    def setCanManageReportingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageReportingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageReportingMetadata: Self = this.set("canManageReportingMetadata", js.undefined)
    
    @scala.inline
    def setCanManageSharing(value: String): Self = this.set("canManageSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageSharing: Self = this.set("canManageSharing", js.undefined)
    
    @scala.inline
    def setCanManageSharingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageSharingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageSharingMetadata: Self = this.set("canManageSharingMetadata", js.undefined)
    
    @scala.inline
    def setCanManageSigningGroups(value: String): Self = this.set("canManageSigningGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageSigningGroups: Self = this.set("canManageSigningGroups", js.undefined)
    
    @scala.inline
    def setCanManageSigningGroupsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageSigningGroupsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageSigningGroupsMetadata: Self = this.set("canManageSigningGroupsMetadata", js.undefined)
    
    @scala.inline
    def setCanManageUsers(value: String): Self = this.set("canManageUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageUsers: Self = this.set("canManageUsers", js.undefined)
    
    @scala.inline
    def setCanManageUsersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageUsersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageUsersMetadata: Self = this.set("canManageUsersMetadata", js.undefined)
  }
}
