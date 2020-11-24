package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsBlob extends js.Object {
  
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
object TabsBlob {
  
  @scala.inline
  def apply(): TabsBlob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsBlob]
  }
  
  @scala.inline
  implicit class TabsBlobOps[Self <: TabsBlob] (val x: Self) extends AnyVal {
    
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
    def setAllowTabOrder(value: String): Self = this.set("allowTabOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTabOrder: Self = this.set("allowTabOrder", js.undefined)
    
    @scala.inline
    def setAllowTabOrderMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowTabOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTabOrderMetadata: Self = this.set("allowTabOrderMetadata", js.undefined)
    
    @scala.inline
    def setApproveDeclineTabsEnabled(value: String): Self = this.set("approveDeclineTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproveDeclineTabsEnabled: Self = this.set("approveDeclineTabsEnabled", js.undefined)
    
    @scala.inline
    def setApproveDeclineTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("approveDeclineTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproveDeclineTabsMetadata: Self = this.set("approveDeclineTabsMetadata", js.undefined)
    
    @scala.inline
    def setCalculatedFieldsEnabled(value: String): Self = this.set("calculatedFieldsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculatedFieldsEnabled: Self = this.set("calculatedFieldsEnabled", js.undefined)
    
    @scala.inline
    def setCalculatedFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("calculatedFieldsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculatedFieldsMetadata: Self = this.set("calculatedFieldsMetadata", js.undefined)
    
    @scala.inline
    def setCheckBoxTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("checkBoxTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBoxTabsMetadata: Self = this.set("checkBoxTabsMetadata", js.undefined)
    
    @scala.inline
    def setCheckboxTabsEnabled(value: String): Self = this.set("checkboxTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxTabsEnabled: Self = this.set("checkboxTabsEnabled", js.undefined)
    
    @scala.inline
    def setDataFieldRegexEnabled(value: String): Self = this.set("dataFieldRegexEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFieldRegexEnabled: Self = this.set("dataFieldRegexEnabled", js.undefined)
    
    @scala.inline
    def setDataFieldRegexMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("dataFieldRegexMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFieldRegexMetadata: Self = this.set("dataFieldRegexMetadata", js.undefined)
    
    @scala.inline
    def setDataFieldSizeEnabled(value: String): Self = this.set("dataFieldSizeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFieldSizeEnabled: Self = this.set("dataFieldSizeEnabled", js.undefined)
    
    @scala.inline
    def setDataFieldSizeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("dataFieldSizeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFieldSizeMetadata: Self = this.set("dataFieldSizeMetadata", js.undefined)
    
    @scala.inline
    def setDrawTabsEnabled(value: String): Self = this.set("drawTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawTabsEnabled: Self = this.set("drawTabsEnabled", js.undefined)
    
    @scala.inline
    def setDrawTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("drawTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawTabsMetadata: Self = this.set("drawTabsMetadata", js.undefined)
    
    @scala.inline
    def setFirstLastEmailTabsEnabled(value: String): Self = this.set("firstLastEmailTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLastEmailTabsEnabled: Self = this.set("firstLastEmailTabsEnabled", js.undefined)
    
    @scala.inline
    def setFirstLastEmailTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("firstLastEmailTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLastEmailTabsMetadata: Self = this.set("firstLastEmailTabsMetadata", js.undefined)
    
    @scala.inline
    def setListTabsEnabled(value: String): Self = this.set("listTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListTabsEnabled: Self = this.set("listTabsEnabled", js.undefined)
    
    @scala.inline
    def setListTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("listTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListTabsMetadata: Self = this.set("listTabsMetadata", js.undefined)
    
    @scala.inline
    def setNoteTabsEnabled(value: String): Self = this.set("noteTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteTabsEnabled: Self = this.set("noteTabsEnabled", js.undefined)
    
    @scala.inline
    def setNoteTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("noteTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteTabsMetadata: Self = this.set("noteTabsMetadata", js.undefined)
    
    @scala.inline
    def setRadioTabsEnabled(value: String): Self = this.set("radioTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioTabsEnabled: Self = this.set("radioTabsEnabled", js.undefined)
    
    @scala.inline
    def setRadioTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("radioTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioTabsMetadata: Self = this.set("radioTabsMetadata", js.undefined)
    
    @scala.inline
    def setSavingCustomTabsEnabled(value: String): Self = this.set("savingCustomTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingCustomTabsEnabled: Self = this.set("savingCustomTabsEnabled", js.undefined)
    
    @scala.inline
    def setSavingCustomTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("savingCustomTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingCustomTabsMetadata: Self = this.set("savingCustomTabsMetadata", js.undefined)
    
    @scala.inline
    def setSenderToChangeTabAssignmentsEnabled(value: String): Self = this.set("senderToChangeTabAssignmentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderToChangeTabAssignmentsEnabled: Self = this.set("senderToChangeTabAssignmentsEnabled", js.undefined)
    
    @scala.inline
    def setSenderToChangeTabAssignmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("senderToChangeTabAssignmentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderToChangeTabAssignmentsMetadata: Self = this.set("senderToChangeTabAssignmentsMetadata", js.undefined)
    
    @scala.inline
    def setSharedCustomTabsEnabled(value: String): Self = this.set("sharedCustomTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedCustomTabsEnabled: Self = this.set("sharedCustomTabsEnabled", js.undefined)
    
    @scala.inline
    def setSharedCustomTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("sharedCustomTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedCustomTabsMetadata: Self = this.set("sharedCustomTabsMetadata", js.undefined)
    
    @scala.inline
    def setTabDataLabelEnabled(value: String): Self = this.set("tabDataLabelEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabDataLabelEnabled: Self = this.set("tabDataLabelEnabled", js.undefined)
    
    @scala.inline
    def setTabDataLabelMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("tabDataLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabDataLabelMetadata: Self = this.set("tabDataLabelMetadata", js.undefined)
    
    @scala.inline
    def setTabLocationEnabled(value: String): Self = this.set("tabLocationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLocationEnabled: Self = this.set("tabLocationEnabled", js.undefined)
    
    @scala.inline
    def setTabLocationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("tabLocationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLocationMetadata: Self = this.set("tabLocationMetadata", js.undefined)
    
    @scala.inline
    def setTabLockingEnabled(value: String): Self = this.set("tabLockingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLockingEnabled: Self = this.set("tabLockingEnabled", js.undefined)
    
    @scala.inline
    def setTabLockingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("tabLockingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLockingMetadata: Self = this.set("tabLockingMetadata", js.undefined)
    
    @scala.inline
    def setTabScaleEnabled(value: String): Self = this.set("tabScaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabScaleEnabled: Self = this.set("tabScaleEnabled", js.undefined)
    
    @scala.inline
    def setTabScaleMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("tabScaleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabScaleMetadata: Self = this.set("tabScaleMetadata", js.undefined)
    
    @scala.inline
    def setTabTextFormattingEnabled(value: String): Self = this.set("tabTextFormattingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabTextFormattingEnabled: Self = this.set("tabTextFormattingEnabled", js.undefined)
    
    @scala.inline
    def setTabTextFormattingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("tabTextFormattingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabTextFormattingMetadata: Self = this.set("tabTextFormattingMetadata", js.undefined)
    
    @scala.inline
    def setTextTabsEnabled(value: String): Self = this.set("textTabsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTabsEnabled: Self = this.set("textTabsEnabled", js.undefined)
    
    @scala.inline
    def setTextTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("textTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTabsMetadata: Self = this.set("textTabsMetadata", js.undefined)
  }
}
