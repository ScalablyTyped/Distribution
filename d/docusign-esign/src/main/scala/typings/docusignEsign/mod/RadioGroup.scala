package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioGroup extends StObject {
  
  /**
    * For conditional fields this is the `tabLabel` of the parent tab that controls this tab's visibility.
    */
  var conditionalParentLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `conditionalParentLabel` property is editable.
    */
  var conditionalParentLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * For conditional fields, this is the value of the parent tab that controls the tab's visibility.
    *
    * If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use "on" as the value to show that the parent tab is active.
    *
    */
  var conditionalParentValue: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `conditionalParentValue` property is editable.
    */
  var conditionalParentValueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId`
    * property that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `documentId` property is editable.
    */
  var documentIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The name of the group. The search_text provided in the call automatically performs a wild card search on group_name.
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `groupName` property is editable.
    */
  var groupNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the locations and status for radio buttons that are grouped together.
    */
  var radios: js.UndefOr[js.Array[Radio]] = js.undefined
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.undefined
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `recipientIdGuid` property is editable.
    */
  var recipientIdGuidMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Metadata that indicates whether the `recipientId` property is editable.
    */
  var recipientIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true** and shared is true, information must be entered in this field to complete the envelope.
    */
  var requireAll: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `requireAll` property is editable.
    */
  var requireAllMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
    */
  var requireInitialOnSharedChange: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `requireInitialOnSharedChange` property is editable.
    */
  var requireInitialOnSharedChangeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, this custom tab is shared.
    */
  var shared: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `shared` property is editable.
    */
  var sharedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Indicates the type of tab (for example, `signHere` or `initialHere`).
    */
  var tabType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `tabType` property is editable.
    */
  var tabTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `templateLocked` property is editable.
    */
  var templateLockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `templateRequired` property is editable.
    */
  var templateRequiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The text of a tooltip that appears when a user hovers over a form field or tab.
    */
  var tooltip: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `tooltip` property is editable.
    */
  var tooltipMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
}
object RadioGroup {
  
  inline def apply(): RadioGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioGroup]
  }
  
  extension [Self <: RadioGroup](x: Self) {
    
    inline def setConditionalParentLabel(value: String): Self = StObject.set(x, "conditionalParentLabel", value.asInstanceOf[js.Any])
    
    inline def setConditionalParentLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "conditionalParentLabelMetadata", value.asInstanceOf[js.Any])
    
    inline def setConditionalParentLabelMetadataUndefined: Self = StObject.set(x, "conditionalParentLabelMetadata", js.undefined)
    
    inline def setConditionalParentLabelUndefined: Self = StObject.set(x, "conditionalParentLabel", js.undefined)
    
    inline def setConditionalParentValue(value: String): Self = StObject.set(x, "conditionalParentValue", value.asInstanceOf[js.Any])
    
    inline def setConditionalParentValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "conditionalParentValueMetadata", value.asInstanceOf[js.Any])
    
    inline def setConditionalParentValueMetadataUndefined: Self = StObject.set(x, "conditionalParentValueMetadata", js.undefined)
    
    inline def setConditionalParentValueUndefined: Self = StObject.set(x, "conditionalParentValue", js.undefined)
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "documentIdMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdMetadataUndefined: Self = StObject.set(x, "documentIdMetadata", js.undefined)
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "groupNameMetadata", value.asInstanceOf[js.Any])
    
    inline def setGroupNameMetadataUndefined: Self = StObject.set(x, "groupNameMetadata", js.undefined)
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setRadios(value: js.Array[Radio]): Self = StObject.set(x, "radios", value.asInstanceOf[js.Any])
    
    inline def setRadiosUndefined: Self = StObject.set(x, "radios", js.undefined)
    
    inline def setRadiosVarargs(value: Radio*): Self = StObject.set(x, "radios", js.Array(value :_*))
    
    inline def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdGuid(value: String): Self = StObject.set(x, "recipientIdGuid", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdGuidMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientIdGuidMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdGuidMetadataUndefined: Self = StObject.set(x, "recipientIdGuidMetadata", js.undefined)
    
    inline def setRecipientIdGuidUndefined: Self = StObject.set(x, "recipientIdGuid", js.undefined)
    
    inline def setRecipientIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientIdMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdMetadataUndefined: Self = StObject.set(x, "recipientIdMetadata", js.undefined)
    
    inline def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    inline def setRequireAll(value: String): Self = StObject.set(x, "requireAll", value.asInstanceOf[js.Any])
    
    inline def setRequireAllMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requireAllMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequireAllMetadataUndefined: Self = StObject.set(x, "requireAllMetadata", js.undefined)
    
    inline def setRequireAllUndefined: Self = StObject.set(x, "requireAll", js.undefined)
    
    inline def setRequireInitialOnSharedChange(value: String): Self = StObject.set(x, "requireInitialOnSharedChange", value.asInstanceOf[js.Any])
    
    inline def setRequireInitialOnSharedChangeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requireInitialOnSharedChangeMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequireInitialOnSharedChangeMetadataUndefined: Self = StObject.set(x, "requireInitialOnSharedChangeMetadata", js.undefined)
    
    inline def setRequireInitialOnSharedChangeUndefined: Self = StObject.set(x, "requireInitialOnSharedChange", js.undefined)
    
    inline def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "sharedMetadata", value.asInstanceOf[js.Any])
    
    inline def setSharedMetadataUndefined: Self = StObject.set(x, "sharedMetadata", js.undefined)
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setTabType(value: String): Self = StObject.set(x, "tabType", value.asInstanceOf[js.Any])
    
    inline def setTabTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabTypeMetadata", value.asInstanceOf[js.Any])
    
    inline def setTabTypeMetadataUndefined: Self = StObject.set(x, "tabTypeMetadata", js.undefined)
    
    inline def setTabTypeUndefined: Self = StObject.set(x, "tabType", js.undefined)
    
    inline def setTemplateLocked(value: String): Self = StObject.set(x, "templateLocked", value.asInstanceOf[js.Any])
    
    inline def setTemplateLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "templateLockedMetadata", value.asInstanceOf[js.Any])
    
    inline def setTemplateLockedMetadataUndefined: Self = StObject.set(x, "templateLockedMetadata", js.undefined)
    
    inline def setTemplateLockedUndefined: Self = StObject.set(x, "templateLocked", js.undefined)
    
    inline def setTemplateRequired(value: String): Self = StObject.set(x, "templateRequired", value.asInstanceOf[js.Any])
    
    inline def setTemplateRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "templateRequiredMetadata", value.asInstanceOf[js.Any])
    
    inline def setTemplateRequiredMetadataUndefined: Self = StObject.set(x, "templateRequiredMetadata", js.undefined)
    
    inline def setTemplateRequiredUndefined: Self = StObject.set(x, "templateRequired", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tooltipMetadata", value.asInstanceOf[js.Any])
    
    inline def setTooltipMetadataUndefined: Self = StObject.set(x, "tooltipMetadata", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
