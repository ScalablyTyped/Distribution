package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draw extends StObject {
  
  var allowSignerUpload: js.UndefOr[String] = js.undefined
  
  var anchorAllowWhiteSpaceInCharacters: js.UndefOr[String] = js.undefined
  
  var anchorAllowWhiteSpaceInCharactersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * This property controls how [anchor tabs][AnchorTabs] are placed. When **true**, the text string in a document must match the case of the `anchorString`
    * property for an anchor tab to be created. The default value is **false**.
    *
    * For example, when set to **true**, if the anchor string is `DocuSign`, then `DocuSign` will match but `Docusign`, `docusign`, `DoCuSiGn`, etc.
    * will not match. When set to **false**, `DocuSign`, `Docusign`, `docusign`, `DoCuSiGn`, etc. will all match.
    *
    * This functionality uses the following rules:
    *
    * - Unless punctuation is specified in the `anchorString`, this functionality ignores punctuation and the following characters:
    *
    *   $~><|^+=
    *
    *   For example, the `anchorString` `water` will match on the string `Fetch a pail of water.`
    *
    * - Strings embedded in other strings are ignored during the matching process.
    *
    * - In words that have dashes, the parts separated by dashes are treated as distinct words.
    *
    *   Example: If the anchor string is `forget`, then an anchor tab is placed on the `forget` in `forget-me-not`, even when `anchorMatchWholeWord` is set to **true**.
    *
    * - Letters with accent marks are treated as distinct characters from their unaccented counterparts.
    *
    * - For single-character anchor strings, if the two characters appear right next to each other in the document, a single anchor tab is placed for both of them.
    *
    *   Example: If the anchor string is `i`, then only one anchor tab is placed in `skiing`.
    *
    * - Unlike punctuation, numbers are not ignored when finding anchor words.
    *
    *   Example: If the anchor string is `cat`, then `-cat-` is matched but `1cat2` is not when `anchorMatchWholeWord` is set to **true** (its default value).
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTabs]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    */
  var anchorCaseSensitive: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorCaseSensitive` property is editable.
    */
  var anchorCaseSensitiveMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * This property controls how [anchor tabs][AnchorTabs] are aligned in relation to the anchor text. Possible values are :
    *
    * - `left`: Aligns the left side of the tab with the beginning of the first character of the matching anchor word. This is the default value.
    * - `right`: Aligns the tab’s left side with the last character of the matching anchor word.
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTabs]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    *
    */
  var anchorHorizontalAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorHorizontalAlignment` property is editable.
    */
  var anchorHorizontalAlignmentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, this tab is ignored if the `anchorString` is not found in the document.
    */
  var anchorIgnoreIfNotPresent: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is editable.
    */
  var anchorIgnoreIfNotPresentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the text string in a document must match the value of the `anchorString` property in its entirety for an [anchor tab][AnchorTab] to be created.
    * The default value is **false**.
    *
    * For example, when set to **true**, if the input is `man` then `man` will match but `manpower`, `fireman`, and `penmanship` will not. When set to **false**,
    * if the input is `man` then `man`, `manpower`, `fireman`, and `penmanship` will all match.
    *
    * This functionality uses the following rules:
    *
    * - Unless punctuation is specified in the `anchorString`, this functionality ignores punctuation and the following characters:
    *
    *   $~><|^+=
    *
    *   For example, the `anchorString` `water` will match on the string `Fetch a pail of water.`
    *
    * - Strings embedded in other strings are ignored during the matching process.
    *
    * - In words that have dashes, the parts separated by dashes are treated as distinct words.
    *
    *   Example: If the anchor string is `forget`, then an anchor tab is placed on the `forget` in `forget-me-not`, even when `anchorMatchWholeWord` is set to **true**.
    *
    * - Letters with accent marks are treated as distinct characters from their unaccented counterparts.
    *
    * - For single-character anchor strings, if the two characters appear right next to each other in the document, a single anchor tab is placed for both of them.
    *
    *   Example: If the anchor string is `i`, then only one anchor tab is placed in `skiing`.
    *
    * - Unlike punctuation, numbers are not ignored when finding anchor words.
    *
    *   Example: If the anchor string is `cat`, then `-cat-` is matched but `1cat2` is not when `anchorMatchWholeWord` is set to **true** (its default value).
    *
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTab]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    *
    */
  var anchorMatchWholeWord: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorMatchWholeWord` property is editable.
    */
  var anchorMatchWholeWordMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the string to find in the document and use as the basis for tab placement.
    */
  var anchorString: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorString` property is editable.
    */
  var anchorStringMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var anchorTabProcessorVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var anchorTabProcessorVersionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the units of the X and Y offset. Units may be pixels, millimeters, centimeters, or inches.
    */
  var anchorUnits: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorUnits` property is editable.
    */
  var anchorUnitsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the X axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorXOffset: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorXOffset` property is editable.
    */
  var anchorXOffsetMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the Y axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorYOffset: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorYOffset` property is editable.
    */
  var anchorYOffsetMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
    * The DocuSign-generated custom tab id for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab
    * inherits all the custom tab properties.
    */
  var customTabId: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `customTabId` property is editable.
    */
  var customTabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * An integer specifying the order in which the guided form HTML should render. The order is relative to the `formPageLabel`, the group by which to place the guided form HTML block.
    */
  var formOrder: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `formOrder` property is editable.
    */
  var formOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * A string specifying the group in which to place the guided form HTML. Each group displays as a separate guided forms page in the signing experience.
    */
  var formPageLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `formPageLabel` property is editable.
    */
  var formPageLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * An integer specifying the order in which to present the guided form pages.
    */
  var formPageNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `fromPageNumber` property is editable.
    */
  var formPageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The height of the tab in pixels.
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `height` property is editable.
    */
  var heightMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the signer cannot change the data of the custom tab.
    */
  var locked: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `locked` property is editable.
    */
  var lockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Contains the information necessary to map the tab to a field in SalesForce.
    */
  var mergeField: js.UndefOr[
    /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
  ] = js.undefined
  
  var mergeFieldXml: js.UndefOr[String] = js.undefined
  
  /**
    * The page number being accessed.
    */
  var pageNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `pageNumber` property is editable.
    */
  var pageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
    * When set to **true**, the signer is required to fill out this tab.
    */
  var required: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `required` property is editable.
    */
  var requiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When **true**, the tab is shared.
    */
  var shared: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `shared` property is editable.
    */
  var sharedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  var smartContractInformation: js.UndefOr[SmartContractInformation] = js.undefined
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `status` property is editable.
    */
  var statusMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * An array of tab group labels that uniquely identify tab groups. To assign a tab to a `tabGroup`, you assign the `TabGroupLabel` to the `Tab.TabGroupLabels` array.
    */
  var tabGroupLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Metadata that indicates whether the `tabGroupLabels` property is editable.
    */
  var tabGroupLabelsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `tabId` property is editable.
    */
  var tabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Metadata that indicates whether the `tabLabel` property is editable.
    */
  var tabLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * A positive integer that sets the order the tab is navigated to during signing.
    *
    * Tabs on a page are navigated to in ascending order, starting with the lowest number and moving to the highest.
    * If two or more tabs have the same `tabOrder` value, the normal auto-navigation setting behavior for the envelope is used.
    */
  var tabOrder: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `tabOrder` property is editable.
    */
  var tabOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
    * Metadata that indicates whether the `toolTip` property is editable.
    */
  var toolTipMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The text of a tooltip that appears when a user hovers over a form field or tab.
    */
  var tooltip: js.UndefOr[String] = js.undefined
  
  var useBackgroundAsCanvas: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the tab in pixels.
    */
  var width: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `width` property is editable.
    */
  var widthMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * This property indicates the horizontal offset of the object on the page.
    * DocuSign uses 72 DPI when determining position.
    * Required. May be zero.
    *
    */
  var xPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `xPosition` property is editable.
    */
  var xPositionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
    */
  var yPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `yPosition` property is editable.
    */
  var yPositionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
}
object Draw {
  
  inline def apply(): Draw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Draw]
  }
  
  extension [Self <: Draw](x: Self) {
    
    inline def setAllowSignerUpload(value: String): Self = StObject.set(x, "allowSignerUpload", value.asInstanceOf[js.Any])
    
    inline def setAllowSignerUploadUndefined: Self = StObject.set(x, "allowSignerUpload", js.undefined)
    
    inline def setAnchorAllowWhiteSpaceInCharacters(value: String): Self = StObject.set(x, "anchorAllowWhiteSpaceInCharacters", value.asInstanceOf[js.Any])
    
    inline def setAnchorAllowWhiteSpaceInCharactersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorAllowWhiteSpaceInCharactersMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorAllowWhiteSpaceInCharactersMetadataUndefined: Self = StObject.set(x, "anchorAllowWhiteSpaceInCharactersMetadata", js.undefined)
    
    inline def setAnchorAllowWhiteSpaceInCharactersUndefined: Self = StObject.set(x, "anchorAllowWhiteSpaceInCharacters", js.undefined)
    
    inline def setAnchorCaseSensitive(value: String): Self = StObject.set(x, "anchorCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setAnchorCaseSensitiveMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorCaseSensitiveMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorCaseSensitiveMetadataUndefined: Self = StObject.set(x, "anchorCaseSensitiveMetadata", js.undefined)
    
    inline def setAnchorCaseSensitiveUndefined: Self = StObject.set(x, "anchorCaseSensitive", js.undefined)
    
    inline def setAnchorHorizontalAlignment(value: String): Self = StObject.set(x, "anchorHorizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setAnchorHorizontalAlignmentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorHorizontalAlignmentMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorHorizontalAlignmentMetadataUndefined: Self = StObject.set(x, "anchorHorizontalAlignmentMetadata", js.undefined)
    
    inline def setAnchorHorizontalAlignmentUndefined: Self = StObject.set(x, "anchorHorizontalAlignment", js.undefined)
    
    inline def setAnchorIgnoreIfNotPresent(value: String): Self = StObject.set(x, "anchorIgnoreIfNotPresent", value.asInstanceOf[js.Any])
    
    inline def setAnchorIgnoreIfNotPresentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorIgnoreIfNotPresentMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorIgnoreIfNotPresentMetadataUndefined: Self = StObject.set(x, "anchorIgnoreIfNotPresentMetadata", js.undefined)
    
    inline def setAnchorIgnoreIfNotPresentUndefined: Self = StObject.set(x, "anchorIgnoreIfNotPresent", js.undefined)
    
    inline def setAnchorMatchWholeWord(value: String): Self = StObject.set(x, "anchorMatchWholeWord", value.asInstanceOf[js.Any])
    
    inline def setAnchorMatchWholeWordMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorMatchWholeWordMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorMatchWholeWordMetadataUndefined: Self = StObject.set(x, "anchorMatchWholeWordMetadata", js.undefined)
    
    inline def setAnchorMatchWholeWordUndefined: Self = StObject.set(x, "anchorMatchWholeWord", js.undefined)
    
    inline def setAnchorString(value: String): Self = StObject.set(x, "anchorString", value.asInstanceOf[js.Any])
    
    inline def setAnchorStringMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorStringMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorStringMetadataUndefined: Self = StObject.set(x, "anchorStringMetadata", js.undefined)
    
    inline def setAnchorStringUndefined: Self = StObject.set(x, "anchorString", js.undefined)
    
    inline def setAnchorTabProcessorVersion(value: String): Self = StObject.set(x, "anchorTabProcessorVersion", value.asInstanceOf[js.Any])
    
    inline def setAnchorTabProcessorVersionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorTabProcessorVersionMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorTabProcessorVersionMetadataUndefined: Self = StObject.set(x, "anchorTabProcessorVersionMetadata", js.undefined)
    
    inline def setAnchorTabProcessorVersionUndefined: Self = StObject.set(x, "anchorTabProcessorVersion", js.undefined)
    
    inline def setAnchorUnits(value: String): Self = StObject.set(x, "anchorUnits", value.asInstanceOf[js.Any])
    
    inline def setAnchorUnitsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorUnitsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorUnitsMetadataUndefined: Self = StObject.set(x, "anchorUnitsMetadata", js.undefined)
    
    inline def setAnchorUnitsUndefined: Self = StObject.set(x, "anchorUnits", js.undefined)
    
    inline def setAnchorXOffset(value: String): Self = StObject.set(x, "anchorXOffset", value.asInstanceOf[js.Any])
    
    inline def setAnchorXOffsetMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorXOffsetMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorXOffsetMetadataUndefined: Self = StObject.set(x, "anchorXOffsetMetadata", js.undefined)
    
    inline def setAnchorXOffsetUndefined: Self = StObject.set(x, "anchorXOffset", js.undefined)
    
    inline def setAnchorYOffset(value: String): Self = StObject.set(x, "anchorYOffset", value.asInstanceOf[js.Any])
    
    inline def setAnchorYOffsetMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorYOffsetMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorYOffsetMetadataUndefined: Self = StObject.set(x, "anchorYOffsetMetadata", js.undefined)
    
    inline def setAnchorYOffsetUndefined: Self = StObject.set(x, "anchorYOffset", js.undefined)
    
    inline def setConditionalParentLabel(value: String): Self = StObject.set(x, "conditionalParentLabel", value.asInstanceOf[js.Any])
    
    inline def setConditionalParentLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "conditionalParentLabelMetadata", value.asInstanceOf[js.Any])
    
    inline def setConditionalParentLabelMetadataUndefined: Self = StObject.set(x, "conditionalParentLabelMetadata", js.undefined)
    
    inline def setConditionalParentLabelUndefined: Self = StObject.set(x, "conditionalParentLabel", js.undefined)
    
    inline def setConditionalParentValue(value: String): Self = StObject.set(x, "conditionalParentValue", value.asInstanceOf[js.Any])
    
    inline def setConditionalParentValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "conditionalParentValueMetadata", value.asInstanceOf[js.Any])
    
    inline def setConditionalParentValueMetadataUndefined: Self = StObject.set(x, "conditionalParentValueMetadata", js.undefined)
    
    inline def setConditionalParentValueUndefined: Self = StObject.set(x, "conditionalParentValue", js.undefined)
    
    inline def setCustomTabId(value: String): Self = StObject.set(x, "customTabId", value.asInstanceOf[js.Any])
    
    inline def setCustomTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "customTabIdMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomTabIdMetadataUndefined: Self = StObject.set(x, "customTabIdMetadata", js.undefined)
    
    inline def setCustomTabIdUndefined: Self = StObject.set(x, "customTabId", js.undefined)
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "documentIdMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdMetadataUndefined: Self = StObject.set(x, "documentIdMetadata", js.undefined)
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setFormOrder(value: String): Self = StObject.set(x, "formOrder", value.asInstanceOf[js.Any])
    
    inline def setFormOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formOrderMetadata", value.asInstanceOf[js.Any])
    
    inline def setFormOrderMetadataUndefined: Self = StObject.set(x, "formOrderMetadata", js.undefined)
    
    inline def setFormOrderUndefined: Self = StObject.set(x, "formOrder", js.undefined)
    
    inline def setFormPageLabel(value: String): Self = StObject.set(x, "formPageLabel", value.asInstanceOf[js.Any])
    
    inline def setFormPageLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formPageLabelMetadata", value.asInstanceOf[js.Any])
    
    inline def setFormPageLabelMetadataUndefined: Self = StObject.set(x, "formPageLabelMetadata", js.undefined)
    
    inline def setFormPageLabelUndefined: Self = StObject.set(x, "formPageLabel", js.undefined)
    
    inline def setFormPageNumber(value: String): Self = StObject.set(x, "formPageNumber", value.asInstanceOf[js.Any])
    
    inline def setFormPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formPageNumberMetadata", value.asInstanceOf[js.Any])
    
    inline def setFormPageNumberMetadataUndefined: Self = StObject.set(x, "formPageNumberMetadata", js.undefined)
    
    inline def setFormPageNumberUndefined: Self = StObject.set(x, "formPageNumber", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "heightMetadata", value.asInstanceOf[js.Any])
    
    inline def setHeightMetadataUndefined: Self = StObject.set(x, "heightMetadata", js.undefined)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLocked(value: String): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "lockedMetadata", value.asInstanceOf[js.Any])
    
    inline def setLockedMetadataUndefined: Self = StObject.set(x, "lockedMetadata", js.undefined)
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setMergeField(
      value: /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
    ): Self = StObject.set(x, "mergeField", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldUndefined: Self = StObject.set(x, "mergeField", js.undefined)
    
    inline def setMergeFieldXml(value: String): Self = StObject.set(x, "mergeFieldXml", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldXmlUndefined: Self = StObject.set(x, "mergeFieldXml", js.undefined)
    
    inline def setPageNumber(value: String): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "pageNumberMetadata", value.asInstanceOf[js.Any])
    
    inline def setPageNumberMetadataUndefined: Self = StObject.set(x, "pageNumberMetadata", js.undefined)
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdGuid(value: String): Self = StObject.set(x, "recipientIdGuid", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdGuidMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientIdGuidMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdGuidMetadataUndefined: Self = StObject.set(x, "recipientIdGuidMetadata", js.undefined)
    
    inline def setRecipientIdGuidUndefined: Self = StObject.set(x, "recipientIdGuid", js.undefined)
    
    inline def setRecipientIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientIdMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdMetadataUndefined: Self = StObject.set(x, "recipientIdMetadata", js.undefined)
    
    inline def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requiredMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequiredMetadataUndefined: Self = StObject.set(x, "requiredMetadata", js.undefined)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "sharedMetadata", value.asInstanceOf[js.Any])
    
    inline def setSharedMetadataUndefined: Self = StObject.set(x, "sharedMetadata", js.undefined)
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setSmartContractInformation(value: SmartContractInformation): Self = StObject.set(x, "smartContractInformation", value.asInstanceOf[js.Any])
    
    inline def setSmartContractInformationUndefined: Self = StObject.set(x, "smartContractInformation", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "statusMetadata", value.asInstanceOf[js.Any])
    
    inline def setStatusMetadataUndefined: Self = StObject.set(x, "statusMetadata", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTabGroupLabels(value: js.Array[String]): Self = StObject.set(x, "tabGroupLabels", value.asInstanceOf[js.Any])
    
    inline def setTabGroupLabelsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabGroupLabelsMetadata", value.asInstanceOf[js.Any])
    
    inline def setTabGroupLabelsMetadataUndefined: Self = StObject.set(x, "tabGroupLabelsMetadata", js.undefined)
    
    inline def setTabGroupLabelsUndefined: Self = StObject.set(x, "tabGroupLabels", js.undefined)
    
    inline def setTabGroupLabelsVarargs(value: String*): Self = StObject.set(x, "tabGroupLabels", js.Array(value :_*))
    
    inline def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabIdMetadata", value.asInstanceOf[js.Any])
    
    inline def setTabIdMetadataUndefined: Self = StObject.set(x, "tabIdMetadata", js.undefined)
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setTabLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabLabelMetadata", value.asInstanceOf[js.Any])
    
    inline def setTabLabelMetadataUndefined: Self = StObject.set(x, "tabLabelMetadata", js.undefined)
    
    inline def setTabOrder(value: String): Self = StObject.set(x, "tabOrder", value.asInstanceOf[js.Any])
    
    inline def setTabOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabOrderMetadata", value.asInstanceOf[js.Any])
    
    inline def setTabOrderMetadataUndefined: Self = StObject.set(x, "tabOrderMetadata", js.undefined)
    
    inline def setTabOrderUndefined: Self = StObject.set(x, "tabOrder", js.undefined)
    
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
    
    inline def setToolTipMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "toolTipMetadata", value.asInstanceOf[js.Any])
    
    inline def setToolTipMetadataUndefined: Self = StObject.set(x, "toolTipMetadata", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setUseBackgroundAsCanvas(value: String): Self = StObject.set(x, "useBackgroundAsCanvas", value.asInstanceOf[js.Any])
    
    inline def setUseBackgroundAsCanvasUndefined: Self = StObject.set(x, "useBackgroundAsCanvas", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "widthMetadata", value.asInstanceOf[js.Any])
    
    inline def setWidthMetadataUndefined: Self = StObject.set(x, "widthMetadata", js.undefined)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXPosition(value: String): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    inline def setXPositionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "xPositionMetadata", value.asInstanceOf[js.Any])
    
    inline def setXPositionMetadataUndefined: Self = StObject.set(x, "xPositionMetadata", js.undefined)
    
    inline def setXPositionUndefined: Self = StObject.set(x, "xPosition", js.undefined)
    
    inline def setYPosition(value: String): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
    
    inline def setYPositionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "yPositionMetadata", value.asInstanceOf[js.Any])
    
    inline def setYPositionMetadataUndefined: Self = StObject.set(x, "yPositionMetadata", js.undefined)
    
    inline def setYPositionUndefined: Self = StObject.set(x, "yPosition", js.undefined)
  }
}
