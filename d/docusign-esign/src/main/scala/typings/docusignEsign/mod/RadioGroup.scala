package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioGroup extends js.Object {
  
  /**
    * For conditional fields this is the `tabLabel` of the parent tab that controls this tab's visibility.
    */
  var conditionalParentLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `conditionalParentLabel` property is editable.
    */
  var conditionalParentLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * For conditional fields, this is the value of the parent tab that controls the tab's visibility.
    *
    * If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use "on" as the value to show that the parent tab is active.
    *
    */
  var conditionalParentValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `conditionalParentValue` property is editable.
    */
  var conditionalParentValueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId`
    * property that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `documentId` property is editable.
    */
  var documentIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The name of the group. The search_text provided in the call automatically performs a wild card search on group_name.
    */
  var groupName: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `groupName` property is editable.
    */
  var groupNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the locations and status for radio buttons that are grouped together.
    */
  var radios: js.UndefOr[js.Array[Radio]] = js.native
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `recipientIdGuid` property is editable.
    */
  var recipientIdGuidMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Metadata that indicates whether the `recipientId` property is editable.
    */
  var recipientIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true** and shared is true, information must be entered in this field to complete the envelope.
    */
  var requireAll: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `requireAll` property is editable.
    */
  var requireAllMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
    */
  var requireInitialOnSharedChange: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `requireInitialOnSharedChange` property is editable.
    */
  var requireInitialOnSharedChangeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, this custom tab is shared.
    */
  var shared: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `shared` property is editable.
    */
  var sharedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Indicates the type of tab (for example, `signHere` or `initialHere`).
    */
  var tabType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabType` property is editable.
    */
  var tabTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `templateLocked` property is editable.
    */
  var templateLockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `templateRequired` property is editable.
    */
  var templateRequiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The text of a tooltip that appears when a user hovers over a form field or tab.
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tooltip` property is editable.
    */
  var tooltipMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object RadioGroup {
  
  @scala.inline
  def apply(): RadioGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioGroup]
  }
  
  @scala.inline
  implicit class RadioGroupOps[Self <: RadioGroup] (val x: Self) extends AnyVal {
    
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
    def setConditionalParentLabel(value: String): Self = this.set("conditionalParentLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalParentLabel: Self = this.set("conditionalParentLabel", js.undefined)
    
    @scala.inline
    def setConditionalParentLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("conditionalParentLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalParentLabelMetadata: Self = this.set("conditionalParentLabelMetadata", js.undefined)
    
    @scala.inline
    def setConditionalParentValue(value: String): Self = this.set("conditionalParentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalParentValue: Self = this.set("conditionalParentValue", js.undefined)
    
    @scala.inline
    def setConditionalParentValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("conditionalParentValueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalParentValueMetadata: Self = this.set("conditionalParentValueMetadata", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("documentIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentIdMetadata: Self = this.set("documentIdMetadata", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setGroupNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("groupNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupNameMetadata: Self = this.set("groupNameMetadata", js.undefined)
    
    @scala.inline
    def setRadiosVarargs(value: Radio*): Self = this.set("radios", js.Array(value :_*))
    
    @scala.inline
    def setRadios(value: js.Array[Radio]): Self = this.set("radios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadios: Self = this.set("radios", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = this.set("recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("recipientId", js.undefined)
    
    @scala.inline
    def setRecipientIdGuid(value: String): Self = this.set("recipientIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientIdGuid: Self = this.set("recipientIdGuid", js.undefined)
    
    @scala.inline
    def setRecipientIdGuidMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("recipientIdGuidMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientIdGuidMetadata: Self = this.set("recipientIdGuidMetadata", js.undefined)
    
    @scala.inline
    def setRecipientIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("recipientIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientIdMetadata: Self = this.set("recipientIdMetadata", js.undefined)
    
    @scala.inline
    def setRequireAll(value: String): Self = this.set("requireAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireAll: Self = this.set("requireAll", js.undefined)
    
    @scala.inline
    def setRequireAllMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("requireAllMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireAllMetadata: Self = this.set("requireAllMetadata", js.undefined)
    
    @scala.inline
    def setRequireInitialOnSharedChange(value: String): Self = this.set("requireInitialOnSharedChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireInitialOnSharedChange: Self = this.set("requireInitialOnSharedChange", js.undefined)
    
    @scala.inline
    def setRequireInitialOnSharedChangeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("requireInitialOnSharedChangeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireInitialOnSharedChangeMetadata: Self = this.set("requireInitialOnSharedChangeMetadata", js.undefined)
    
    @scala.inline
    def setShared(value: String): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setSharedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("sharedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedMetadata: Self = this.set("sharedMetadata", js.undefined)
    
    @scala.inline
    def setTabType(value: String): Self = this.set("tabType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabType: Self = this.set("tabType", js.undefined)
    
    @scala.inline
    def setTabTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("tabTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabTypeMetadata: Self = this.set("tabTypeMetadata", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = this.set("templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateLocked: Self = this.set("templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("templateLockedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateLockedMetadata: Self = this.set("templateLockedMetadata", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = this.set("templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateRequired: Self = this.set("templateRequired", js.undefined)
    
    @scala.inline
    def setTemplateRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("templateRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateRequiredMetadata: Self = this.set("templateRequiredMetadata", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("tooltipMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipMetadata: Self = this.set("tooltipMetadata", js.undefined)
  }
}
