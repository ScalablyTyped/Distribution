package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends js.Object {
  
  var anchorAllowWhiteSpaceInCharacters: js.UndefOr[String] = js.native
  
  var anchorAllowWhiteSpaceInCharactersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This property controls how [anchor tabs][AnchorTabs] are placed. When **true**, the text string in a document must match the case of the `anchorString` property
    * for an anchor tab to be created. The default value is **false**.
    *
    * For example, when set to **true**, if the anchor string is `DocuSign`, then `DocuSign` will match but `Docusign`, `docusign`, `DoCuSiGn`, etc. will not match.
    * When set to **false**, `DocuSign`, `Docusign`, `docusign`, `DoCuSiGn`, etc. will all match.
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
  var anchorCaseSensitive: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorCaseSensitive` property is editable.
    */
  var anchorCaseSensitiveMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
  var anchorHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorHorizontalAlignment` property is editable.
    */
  var anchorHorizontalAlignmentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, this tab is ignored if the `anchorString` is not found in the document.
    */
  var anchorIgnoreIfNotPresent: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is editable.
    */
  var anchorIgnoreIfNotPresentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
  var anchorMatchWholeWord: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorMatchWholeWord` property is editable.
    */
  var anchorMatchWholeWordMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the string to find in the document and use as the basis for tab placement.
    */
  var anchorString: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorString` property is editable.
    */
  var anchorStringMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var anchorTabProcessorVersion: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var anchorTabProcessorVersionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the units of the X and Y offset. Units may be pixels, millimeters, centimeters, or inches.
    */
  var anchorUnits: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorUnits` property is editable.
    */
  var anchorUnitsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the X axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorXOffset: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorXOffset` property is editable.
    */
  var anchorXOffsetMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the Y axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorYOffset: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorYOffset` property is editable.
    */
  var anchorYOffsetMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the information in the tab is bold.
    */
  var bold: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `bold` property is editable.
    */
  var boldMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are
    * hidden by asterisks) to any other signer or the sender.
    *
    * When an envelope is completed the information is only available to the sender through the Form Data link in the DocuSign Console. The information on the downloaded document
    * remains masked by asterisks.
    *
    * This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.
    */
  var concealValueOnDocument: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `concealValueOnDocument` property is editable.
    */
  var concealValueOnDocumentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
    * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the
    * custom tab properties.
    */
  var customTabId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `customTabId` property is editable.
    */
  var customTabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as
    * much data as the text box can hold. By default this is false. This property only affects single line text boxes.
    */
  var disableAutoSize: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableAutoSize` property is editable.
    */
  var disableAutoSizeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId` property that
    * specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `documentId` property is editable.
    */
  var documentIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The font to be used for the tab value. Supported fonts include:
    *
    * - Default
    * - Arial
    * - ArialNarrow
    * - Calibri
    * - CourierNew
    * - Garamond
    * - Georgia
    * - Helvetica
    * - LucidaConsole
    * - MSGothic
    * - MSMincho
    * - OCR-A
    * - Tahoma
    * - TimesNewRoman
    * - Trebuchet
    * - Verdana
    *
    */
  var font: js.UndefOr[String] = js.native
  
  /**
    * The font color to use for the information in the tab. Possible values are:
    *
    * - Black
    * - BrightBlue
    * - BrightRed
    * - DarkGreen
    * - DarkRed
    * - Gold
    * - Green
    * - NavyBlue
    * - Purple
    * - White
    *
    */
  var fontColor: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `fontColor` property is editable.
    */
  var fontColorMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Metadata that indicates whether the `font` property is editable.
    */
  var fontMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The font size used for the information in the tab. Possible values are:
    *
    * - Size7
    * - Size8
    * - Size9
    * - Size10
    * - Size11
    * - Size12
    * - Size14
    * - Size16
    * - Size18
    * - Size20
    * - Size22
    * - Size24
    * - Size26
    * - Size28
    * - Size36
    * - Size48
    * - Size72
    */
  var fontSize: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `fontSize` property is editable.
    */
  var fontSizeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An integer specifying the order in which the guided form HTML should render. The order is relative to the `formPageLabel`, the group by which to place the guided form HTML block.
    */
  var formOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `formOrder` property is editable.
    */
  var formOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A string specifying the group in which to place the guided form HTML. Each group displays as a separate guided forms page in the signing experience.
    */
  var formPageLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `formPageLabel` property is editable.
    */
  var formPageLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An integer specifying the order in which to present the guided form pages.
    */
  var formPageNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `fromPageNumber` property is editable.
    */
  var formPageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Contains the formula
    * for calculating the value of
    * this tab.
    *
    * Use a tab's `tabLabel`,
    * enclosed in brackets,
    * to refer to it.
    *
    * For example,
    * you want to present the total cost
    * of two items, tax included.
    *
    * The cost of each item is stored
    * in number tabs labeled Item1 and Item2.
    * The tax rate is in a number tab
    * labeled TaxRate.
    *
    * The formula string for this property
    * would be:
    * `([Item1] + [Item2]) * (1 + [TaxRate])`
    *
    * See [Calculated Fields][calculatedfields]
    * in the DocuSign Support Center
    * to learn more about formulas.
    *
    * Maximum Length: 2000 characters
    *
    * [calculatedfields]: https://support.docusign.com/en/guides/ndse-user-guide-calculated-fields
    *
    */
  var formula: js.UndefOr[String] = js.native
  
  /**
    * Metadata indicating if the sender can edit the `formula` property.
    */
  var formulaMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The height of the tab in pixels.
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `height` property is editable.
    */
  var heightMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, sets this as a payment tab. Can only be used with Text, Number, Formula, or List tabs. The value of the tab must be a number.
    */
  var isPaymentAmount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `isPaymentAmount` property is editable.
    */
  var isPaymentAmountMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the information in the tab is italic.
    */
  var italic: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `italic` property is editable.
    */
  var italicMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var localePolicy: js.UndefOr[LocalePolicyTab] = js.native
  
  /**
    * When set to **true**, the signer cannot change the data of the custom tab.
    */
  var locked: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `locked` property is editable.
    */
  var lockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An optional value that describes the maximum length of the property when the property is a string.
    */
  var maxLength: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `maxLength` property is editable.
    */
  var maxLengthMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Contains the information necessary to map the tab to a field in SalesForce.
    */
  var mergeField: js.UndefOr[
    /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
  ] = js.native
  
  var mergeFieldXml: js.UndefOr[String] = js.native
  
  /**
    * The name of the tab. For example, `Sign Here` or `Initial Here`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `name` property is editable. Read only.
    */
  var nameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The initial value of the tab when it was sent to the recipient.
    */
  var originalValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `originalValue` property is editable.
    */
  var originalValueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The page number on which the tab is located. For supplemental documents, this value must be `1`.
    *
    */
  var pageNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `pageNumber` property is editable.
    */
  var pageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
    * When set to **true**, the signer is required to fill out this tab.
    */
  var required: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `required` property is editable.
    */
  var requiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the sender must populate the tab before an envelope can be sent using the template.
    *
    * This value tab can only be changed by modifying (PUT) the template.
    *
    * Tabs with a `senderRequired` value of true cannot be deleted from an envelope.
    */
  var senderRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `senderRequired` property is editable.
    */
  var senderRequiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, this custom tab is shared.
    */
  var shared: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `shared` property is editable.
    */
  var sharedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  var smartContractInformation: js.UndefOr[SmartContractInformation] = js.native
  
  /**
    * The status of the tab. Possible values are:
    *
    * - `active`: The tab is active, but the recipient has not yet interacted with it.
    * - `signed`: The recipient signed the tab.
    * - `declined`: The recipient declined the envelope.
    * - `na`: Used when the `status` property is not applicable to the tab type. (For example, a tab that has the `tabType` `SignerAttachmentOptional`).
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `status` property is editable.
    */
  var statusMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An array of tab group labels that uniquely identify tab groups. To assign a tab to a `tabGroup`, you assign the `TabGroupLabel` to the `Tab.TabGroupLabels` array.
    */
  var tabGroupLabels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Metadata that indicates whether the `tabGroupLabels` property is editable.
    */
  var tabGroupLabelsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabId` property is editable.
    */
  var tabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The label associated with the tab. This value may be an empty string.
    * If no value is provided, the tab type is used as the value.
    *
    * Maximum Length: 500 characters.
    *
    */
  var tabLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabLabel` property is editable.
    */
  var tabLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A positive integer that sets the order the tab is navigated to during signing.
    *
    * Tabs on a page are navigated to in ascending order, starting with the lowest number and moving to the highest.
    * If two or more tabs have the same `tabOrder` value, the normal auto-navigation setting behavior for the envelope is used.
    */
  var tabOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabOrder` property is editable.
    */
  var tabOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
    * Metadata that indicates whether the `toolTip` property is editable.
    */
  var toolTipMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The text of a tooltip that appears when a user hovers over a form field or tab.
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the information in the tab is underlined.
    */
  var underline: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `underline` property is editable.
    */
  var underlineMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The message displayed if the custom tab fails input validation (either custom of embedded).
    */
  var validationMessage: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationMessage` property is editable.
    */
  var validationMessageMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A regular expression used to validate input for the tab.
    */
  var validationPattern: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationPattern` property is editable.
    */
  var validationPatternMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the value of the tab.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `value` property is editable.
    */
  var valueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The width of the tab in pixels.
    */
  var width: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `width` property is editable.
    */
  var widthMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This property indicates the horizontal offset of the object on the page.
    * DocuSign uses 72 DPI when determining position.
    * Required. May be zero.
    *
    */
  var xPosition: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `xPosition` property is editable.
    */
  var xPositionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
    */
  var yPosition: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `yPosition` property is editable.
    */
  var yPositionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object Number {
  
  @scala.inline
  def apply(): Number = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit class NumberOps[Self <: Number] (val x: Self) extends AnyVal {
    
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
    def setAnchorAllowWhiteSpaceInCharacters(value: String): Self = this.set("anchorAllowWhiteSpaceInCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorAllowWhiteSpaceInCharacters: Self = this.set("anchorAllowWhiteSpaceInCharacters", js.undefined)
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharactersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorAllowWhiteSpaceInCharactersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorAllowWhiteSpaceInCharactersMetadata: Self = this.set("anchorAllowWhiteSpaceInCharactersMetadata", js.undefined)
    
    @scala.inline
    def setAnchorCaseSensitive(value: String): Self = this.set("anchorCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorCaseSensitive: Self = this.set("anchorCaseSensitive", js.undefined)
    
    @scala.inline
    def setAnchorCaseSensitiveMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorCaseSensitiveMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorCaseSensitiveMetadata: Self = this.set("anchorCaseSensitiveMetadata", js.undefined)
    
    @scala.inline
    def setAnchorHorizontalAlignment(value: String): Self = this.set("anchorHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorHorizontalAlignment: Self = this.set("anchorHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setAnchorHorizontalAlignmentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorHorizontalAlignmentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorHorizontalAlignmentMetadata: Self = this.set("anchorHorizontalAlignmentMetadata", js.undefined)
    
    @scala.inline
    def setAnchorIgnoreIfNotPresent(value: String): Self = this.set("anchorIgnoreIfNotPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorIgnoreIfNotPresent: Self = this.set("anchorIgnoreIfNotPresent", js.undefined)
    
    @scala.inline
    def setAnchorIgnoreIfNotPresentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorIgnoreIfNotPresentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorIgnoreIfNotPresentMetadata: Self = this.set("anchorIgnoreIfNotPresentMetadata", js.undefined)
    
    @scala.inline
    def setAnchorMatchWholeWord(value: String): Self = this.set("anchorMatchWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorMatchWholeWord: Self = this.set("anchorMatchWholeWord", js.undefined)
    
    @scala.inline
    def setAnchorMatchWholeWordMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorMatchWholeWordMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorMatchWholeWordMetadata: Self = this.set("anchorMatchWholeWordMetadata", js.undefined)
    
    @scala.inline
    def setAnchorString(value: String): Self = this.set("anchorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorString: Self = this.set("anchorString", js.undefined)
    
    @scala.inline
    def setAnchorStringMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorStringMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorStringMetadata: Self = this.set("anchorStringMetadata", js.undefined)
    
    @scala.inline
    def setAnchorTabProcessorVersion(value: String): Self = this.set("anchorTabProcessorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorTabProcessorVersion: Self = this.set("anchorTabProcessorVersion", js.undefined)
    
    @scala.inline
    def setAnchorTabProcessorVersionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorTabProcessorVersionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorTabProcessorVersionMetadata: Self = this.set("anchorTabProcessorVersionMetadata", js.undefined)
    
    @scala.inline
    def setAnchorUnits(value: String): Self = this.set("anchorUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorUnits: Self = this.set("anchorUnits", js.undefined)
    
    @scala.inline
    def setAnchorUnitsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorUnitsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorUnitsMetadata: Self = this.set("anchorUnitsMetadata", js.undefined)
    
    @scala.inline
    def setAnchorXOffset(value: String): Self = this.set("anchorXOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorXOffset: Self = this.set("anchorXOffset", js.undefined)
    
    @scala.inline
    def setAnchorXOffsetMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorXOffsetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorXOffsetMetadata: Self = this.set("anchorXOffsetMetadata", js.undefined)
    
    @scala.inline
    def setAnchorYOffset(value: String): Self = this.set("anchorYOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorYOffset: Self = this.set("anchorYOffset", js.undefined)
    
    @scala.inline
    def setAnchorYOffsetMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("anchorYOffsetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorYOffsetMetadata: Self = this.set("anchorYOffsetMetadata", js.undefined)
    
    @scala.inline
    def setBold(value: String): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setBoldMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("boldMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoldMetadata: Self = this.set("boldMetadata", js.undefined)
    
    @scala.inline
    def setConcealValueOnDocument(value: String): Self = this.set("concealValueOnDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcealValueOnDocument: Self = this.set("concealValueOnDocument", js.undefined)
    
    @scala.inline
    def setConcealValueOnDocumentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("concealValueOnDocumentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcealValueOnDocumentMetadata: Self = this.set("concealValueOnDocumentMetadata", js.undefined)
    
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
    def setCustomTabId(value: String): Self = this.set("customTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTabId: Self = this.set("customTabId", js.undefined)
    
    @scala.inline
    def setCustomTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("customTabIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTabIdMetadata: Self = this.set("customTabIdMetadata", js.undefined)
    
    @scala.inline
    def setDisableAutoSize(value: String): Self = this.set("disableAutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutoSize: Self = this.set("disableAutoSize", js.undefined)
    
    @scala.inline
    def setDisableAutoSizeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("disableAutoSizeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutoSizeMetadata: Self = this.set("disableAutoSizeMetadata", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("documentIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentIdMetadata: Self = this.set("documentIdMetadata", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontColorMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("fontColorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColorMetadata: Self = this.set("fontColorMetadata", js.undefined)
    
    @scala.inline
    def setFontMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("fontMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontMetadata: Self = this.set("fontMetadata", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("fontSizeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeMetadata: Self = this.set("fontSizeMetadata", js.undefined)
    
    @scala.inline
    def setFormOrder(value: String): Self = this.set("formOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormOrder: Self = this.set("formOrder", js.undefined)
    
    @scala.inline
    def setFormOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("formOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormOrderMetadata: Self = this.set("formOrderMetadata", js.undefined)
    
    @scala.inline
    def setFormPageLabel(value: String): Self = this.set("formPageLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormPageLabel: Self = this.set("formPageLabel", js.undefined)
    
    @scala.inline
    def setFormPageLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("formPageLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormPageLabelMetadata: Self = this.set("formPageLabelMetadata", js.undefined)
    
    @scala.inline
    def setFormPageNumber(value: String): Self = this.set("formPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormPageNumber: Self = this.set("formPageNumber", js.undefined)
    
    @scala.inline
    def setFormPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("formPageNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormPageNumberMetadata: Self = this.set("formPageNumberMetadata", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setFormulaMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("formulaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulaMetadata: Self = this.set("formulaMetadata", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("heightMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightMetadata: Self = this.set("heightMetadata", js.undefined)
    
    @scala.inline
    def setIsPaymentAmount(value: String): Self = this.set("isPaymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPaymentAmount: Self = this.set("isPaymentAmount", js.undefined)
    
    @scala.inline
    def setIsPaymentAmountMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("isPaymentAmountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPaymentAmountMetadata: Self = this.set("isPaymentAmountMetadata", js.undefined)
    
    @scala.inline
    def setItalic(value: String): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setItalicMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("italicMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalicMetadata: Self = this.set("italicMetadata", js.undefined)
    
    @scala.inline
    def setLocalePolicy(value: LocalePolicyTab): Self = this.set("localePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalePolicy: Self = this.set("localePolicy", js.undefined)
    
    @scala.inline
    def setLocked(value: String): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("lockedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedMetadata: Self = this.set("lockedMetadata", js.undefined)
    
    @scala.inline
    def setMaxLength(value: String): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxLengthMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("maxLengthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLengthMetadata: Self = this.set("maxLengthMetadata", js.undefined)
    
    @scala.inline
    def setMergeField(
      value: /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
    ): Self = this.set("mergeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeField: Self = this.set("mergeField", js.undefined)
    
    @scala.inline
    def setMergeFieldXml(value: String): Self = this.set("mergeFieldXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeFieldXml: Self = this.set("mergeFieldXml", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("nameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameMetadata: Self = this.set("nameMetadata", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: String): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    
    @scala.inline
    def setOriginalValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("originalValueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalValueMetadata: Self = this.set("originalValueMetadata", js.undefined)
    
    @scala.inline
    def setPageNumber(value: String): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    
    @scala.inline
    def setPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("pageNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumberMetadata: Self = this.set("pageNumberMetadata", js.undefined)
    
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
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("requiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredMetadata: Self = this.set("requiredMetadata", js.undefined)
    
    @scala.inline
    def setSenderRequired(value: String): Self = this.set("senderRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderRequired: Self = this.set("senderRequired", js.undefined)
    
    @scala.inline
    def setSenderRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("senderRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderRequiredMetadata: Self = this.set("senderRequiredMetadata", js.undefined)
    
    @scala.inline
    def setShared(value: String): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setSharedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("sharedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedMetadata: Self = this.set("sharedMetadata", js.undefined)
    
    @scala.inline
    def setSmartContractInformation(value: SmartContractInformation): Self = this.set("smartContractInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartContractInformation: Self = this.set("smartContractInformation", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("statusMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMetadata: Self = this.set("statusMetadata", js.undefined)
    
    @scala.inline
    def setTabGroupLabelsVarargs(value: String*): Self = this.set("tabGroupLabels", js.Array(value :_*))
    
    @scala.inline
    def setTabGroupLabels(value: js.Array[String]): Self = this.set("tabGroupLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabGroupLabels: Self = this.set("tabGroupLabels", js.undefined)
    
    @scala.inline
    def setTabGroupLabelsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("tabGroupLabelsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabGroupLabelsMetadata: Self = this.set("tabGroupLabelsMetadata", js.undefined)
    
    @scala.inline
    def setTabId(value: String): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    
    @scala.inline
    def setTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("tabIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIdMetadata: Self = this.set("tabIdMetadata", js.undefined)
    
    @scala.inline
    def setTabLabel(value: String): Self = this.set("tabLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLabel: Self = this.set("tabLabel", js.undefined)
    
    @scala.inline
    def setTabLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("tabLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLabelMetadata: Self = this.set("tabLabelMetadata", js.undefined)
    
    @scala.inline
    def setTabOrder(value: String): Self = this.set("tabOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabOrder: Self = this.set("tabOrder", js.undefined)
    
    @scala.inline
    def setTabOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("tabOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabOrderMetadata: Self = this.set("tabOrderMetadata", js.undefined)
    
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
    def setToolTipMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("toolTipMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTipMetadata: Self = this.set("toolTipMetadata", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setUnderline(value: String): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    
    @scala.inline
    def setUnderlineMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("underlineMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineMetadata: Self = this.set("underlineMetadata", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: String): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setValidationMessageMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("validationMessageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessageMetadata: Self = this.set("validationMessageMetadata", js.undefined)
    
    @scala.inline
    def setValidationPattern(value: String): Self = this.set("validationPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationPattern: Self = this.set("validationPattern", js.undefined)
    
    @scala.inline
    def setValidationPatternMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("validationPatternMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationPatternMetadata: Self = this.set("validationPatternMetadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("valueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMetadata: Self = this.set("valueMetadata", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("widthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthMetadata: Self = this.set("widthMetadata", js.undefined)
    
    @scala.inline
    def setXPosition(value: String): Self = this.set("xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXPosition: Self = this.set("xPosition", js.undefined)
    
    @scala.inline
    def setXPositionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("xPositionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXPositionMetadata: Self = this.set("xPositionMetadata", js.undefined)
    
    @scala.inline
    def setYPosition(value: String): Self = this.set("yPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYPosition: Self = this.set("yPosition", js.undefined)
    
    @scala.inline
    def setYPositionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("yPositionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYPositionMetadata: Self = this.set("yPositionMetadata", js.undefined)
  }
}
