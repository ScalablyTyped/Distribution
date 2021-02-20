package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTabSettings extends StObject {
  
  /**
    * When set to **true**, account users can set a tab order for the signing process.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowTabOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowTabOrder` property is editable.
    *
    */
  var allowTabOrderMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, approve and decline tabs are enabled.
    */
  var approveDeclineTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `approveDeclineTabs` property is editable.
    *
    */
  var approveDeclineTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, [calculated fields](https://support.docusign.com/en/guides/ndse-user-guide-calculated-fields) are enabled for tabs.
    */
  var calculatedFieldsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `calculatedFields` property is editable.
    *
    */
  var calculatedFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Metadata that indicates whether the `checkBoxTabs` property is editable.
    */
  var checkBoxTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, checkbox tabs are enabled.
    */
  var checkboxTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * When **true**, regular expressions are enabled for tabs that contain data fields.
    */
  var dataFieldRegexEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `dataFieldRegex` property is editable.
    *
    */
  var dataFieldRegexMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, setting character limits for input fields is enabled.
    */
  var dataFieldSizeEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `dataFieldSize` property is editable.
    *
    */
  var dataFieldSizeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var drawTabsEnabled: js.UndefOr[String] = js.native
  
  var drawTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var firstLastEmailTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var firstLastEmailTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, list tabs are enabled.
    */
  var listTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `listTabs` property is editable.
    *
    */
  var listTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, note tabs are enabled.
    */
  var noteTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `noteTabs` property is editable.
    *
    */
  var noteTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, radio button tabs are enabled.
    */
  var radioTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `radioTabs` property is editable.
    *
    */
  var radioTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, saving custom tabs is enabled.
    */
  var savingCustomTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `savingCustomTabs` property is editable.
    *
    */
  var savingCustomTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var senderToChangeTabAssignmentsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var senderToChangeTabAssignmentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, shared custom tabs are enabled.
    */
  var sharedCustomTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `sharedCustomTabs` property is editable.
    *
    */
  var sharedCustomTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, [data
    * labels](https://support.docusign.com/en/videos/Data-Labels) are enabled.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var tabDataLabelEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabDataLabel` property is editable.
    *
    */
  var tabDataLabelMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var tabLocationEnabled: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var tabLocationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, tab locking is enabled.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var tabLockingEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabLocking` property is editable.
    *
    */
  var tabLockingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var tabScaleEnabled: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var tabScaleMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, text formatting (such as font type, font size,
    * font color, bold, italic, and underline) is enabled for tabs that
    * support formatting.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var tabTextFormattingEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabTextFormatting` property is editable.
    *
    */
  var tabTextFormattingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, text tabs are enabled.
    */
  var textTabsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `textTabs` property is editable.
    *
    */
  var textTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object AccountTabSettings {
  
  @scala.inline
  def apply(): AccountTabSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTabSettings]
  }
  
  @scala.inline
  implicit class AccountTabSettingsMutableBuilder[Self <: AccountTabSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTabOrder(value: String): Self = StObject.set(x, "allowTabOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTabOrderMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowTabOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTabOrderMetadataUndefined: Self = StObject.set(x, "allowTabOrderMetadata", js.undefined)
    
    @scala.inline
    def setAllowTabOrderUndefined: Self = StObject.set(x, "allowTabOrder", js.undefined)
    
    @scala.inline
    def setApproveDeclineTabsEnabled(value: String): Self = StObject.set(x, "approveDeclineTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveDeclineTabsEnabledUndefined: Self = StObject.set(x, "approveDeclineTabsEnabled", js.undefined)
    
    @scala.inline
    def setApproveDeclineTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "approveDeclineTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveDeclineTabsMetadataUndefined: Self = StObject.set(x, "approveDeclineTabsMetadata", js.undefined)
    
    @scala.inline
    def setCalculatedFieldsEnabled(value: String): Self = StObject.set(x, "calculatedFieldsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFieldsEnabledUndefined: Self = StObject.set(x, "calculatedFieldsEnabled", js.undefined)
    
    @scala.inline
    def setCalculatedFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "calculatedFieldsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFieldsMetadataUndefined: Self = StObject.set(x, "calculatedFieldsMetadata", js.undefined)
    
    @scala.inline
    def setCheckBoxTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "checkBoxTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBoxTabsMetadataUndefined: Self = StObject.set(x, "checkBoxTabsMetadata", js.undefined)
    
    @scala.inline
    def setCheckboxTabsEnabled(value: String): Self = StObject.set(x, "checkboxTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxTabsEnabledUndefined: Self = StObject.set(x, "checkboxTabsEnabled", js.undefined)
    
    @scala.inline
    def setDataFieldRegexEnabled(value: String): Self = StObject.set(x, "dataFieldRegexEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldRegexEnabledUndefined: Self = StObject.set(x, "dataFieldRegexEnabled", js.undefined)
    
    @scala.inline
    def setDataFieldRegexMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "dataFieldRegexMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldRegexMetadataUndefined: Self = StObject.set(x, "dataFieldRegexMetadata", js.undefined)
    
    @scala.inline
    def setDataFieldSizeEnabled(value: String): Self = StObject.set(x, "dataFieldSizeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldSizeEnabledUndefined: Self = StObject.set(x, "dataFieldSizeEnabled", js.undefined)
    
    @scala.inline
    def setDataFieldSizeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "dataFieldSizeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldSizeMetadataUndefined: Self = StObject.set(x, "dataFieldSizeMetadata", js.undefined)
    
    @scala.inline
    def setDrawTabsEnabled(value: String): Self = StObject.set(x, "drawTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawTabsEnabledUndefined: Self = StObject.set(x, "drawTabsEnabled", js.undefined)
    
    @scala.inline
    def setDrawTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "drawTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawTabsMetadataUndefined: Self = StObject.set(x, "drawTabsMetadata", js.undefined)
    
    @scala.inline
    def setFirstLastEmailTabsEnabled(value: String): Self = StObject.set(x, "firstLastEmailTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLastEmailTabsEnabledUndefined: Self = StObject.set(x, "firstLastEmailTabsEnabled", js.undefined)
    
    @scala.inline
    def setFirstLastEmailTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "firstLastEmailTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLastEmailTabsMetadataUndefined: Self = StObject.set(x, "firstLastEmailTabsMetadata", js.undefined)
    
    @scala.inline
    def setListTabsEnabled(value: String): Self = StObject.set(x, "listTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTabsEnabledUndefined: Self = StObject.set(x, "listTabsEnabled", js.undefined)
    
    @scala.inline
    def setListTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "listTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTabsMetadataUndefined: Self = StObject.set(x, "listTabsMetadata", js.undefined)
    
    @scala.inline
    def setNoteTabsEnabled(value: String): Self = StObject.set(x, "noteTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteTabsEnabledUndefined: Self = StObject.set(x, "noteTabsEnabled", js.undefined)
    
    @scala.inline
    def setNoteTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "noteTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteTabsMetadataUndefined: Self = StObject.set(x, "noteTabsMetadata", js.undefined)
    
    @scala.inline
    def setRadioTabsEnabled(value: String): Self = StObject.set(x, "radioTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioTabsEnabledUndefined: Self = StObject.set(x, "radioTabsEnabled", js.undefined)
    
    @scala.inline
    def setRadioTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "radioTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioTabsMetadataUndefined: Self = StObject.set(x, "radioTabsMetadata", js.undefined)
    
    @scala.inline
    def setSavingCustomTabsEnabled(value: String): Self = StObject.set(x, "savingCustomTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingCustomTabsEnabledUndefined: Self = StObject.set(x, "savingCustomTabsEnabled", js.undefined)
    
    @scala.inline
    def setSavingCustomTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "savingCustomTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingCustomTabsMetadataUndefined: Self = StObject.set(x, "savingCustomTabsMetadata", js.undefined)
    
    @scala.inline
    def setSenderToChangeTabAssignmentsEnabled(value: String): Self = StObject.set(x, "senderToChangeTabAssignmentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderToChangeTabAssignmentsEnabledUndefined: Self = StObject.set(x, "senderToChangeTabAssignmentsEnabled", js.undefined)
    
    @scala.inline
    def setSenderToChangeTabAssignmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "senderToChangeTabAssignmentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderToChangeTabAssignmentsMetadataUndefined: Self = StObject.set(x, "senderToChangeTabAssignmentsMetadata", js.undefined)
    
    @scala.inline
    def setSharedCustomTabsEnabled(value: String): Self = StObject.set(x, "sharedCustomTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedCustomTabsEnabledUndefined: Self = StObject.set(x, "sharedCustomTabsEnabled", js.undefined)
    
    @scala.inline
    def setSharedCustomTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "sharedCustomTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedCustomTabsMetadataUndefined: Self = StObject.set(x, "sharedCustomTabsMetadata", js.undefined)
    
    @scala.inline
    def setTabDataLabelEnabled(value: String): Self = StObject.set(x, "tabDataLabelEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabDataLabelEnabledUndefined: Self = StObject.set(x, "tabDataLabelEnabled", js.undefined)
    
    @scala.inline
    def setTabDataLabelMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "tabDataLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabDataLabelMetadataUndefined: Self = StObject.set(x, "tabDataLabelMetadata", js.undefined)
    
    @scala.inline
    def setTabLocationEnabled(value: String): Self = StObject.set(x, "tabLocationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLocationEnabledUndefined: Self = StObject.set(x, "tabLocationEnabled", js.undefined)
    
    @scala.inline
    def setTabLocationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "tabLocationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLocationMetadataUndefined: Self = StObject.set(x, "tabLocationMetadata", js.undefined)
    
    @scala.inline
    def setTabLockingEnabled(value: String): Self = StObject.set(x, "tabLockingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLockingEnabledUndefined: Self = StObject.set(x, "tabLockingEnabled", js.undefined)
    
    @scala.inline
    def setTabLockingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "tabLockingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLockingMetadataUndefined: Self = StObject.set(x, "tabLockingMetadata", js.undefined)
    
    @scala.inline
    def setTabScaleEnabled(value: String): Self = StObject.set(x, "tabScaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabScaleEnabledUndefined: Self = StObject.set(x, "tabScaleEnabled", js.undefined)
    
    @scala.inline
    def setTabScaleMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "tabScaleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabScaleMetadataUndefined: Self = StObject.set(x, "tabScaleMetadata", js.undefined)
    
    @scala.inline
    def setTabTextFormattingEnabled(value: String): Self = StObject.set(x, "tabTextFormattingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTextFormattingEnabledUndefined: Self = StObject.set(x, "tabTextFormattingEnabled", js.undefined)
    
    @scala.inline
    def setTabTextFormattingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "tabTextFormattingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTextFormattingMetadataUndefined: Self = StObject.set(x, "tabTextFormattingMetadata", js.undefined)
    
    @scala.inline
    def setTextTabsEnabled(value: String): Self = StObject.set(x, "textTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTabsEnabledUndefined: Self = StObject.set(x, "textTabsEnabled", js.undefined)
    
    @scala.inline
    def setTextTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "textTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTabsMetadataUndefined: Self = StObject.set(x, "textTabsMetadata", js.undefined)
  }
}
