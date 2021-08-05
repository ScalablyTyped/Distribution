package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabMetadata extends StObject {
  
  /**
    * An optional string that is used to auto-match tabs to strings located in the documents of an envelope.
    */
  var anchor: js.UndefOr[String] = js.undefined
  
  /**
    * This property controls how [anchor tabs][AnchorTabs] are placed. When **true**, the text string in a document must match the case of the `anchorString`
    * property for an anchor tab to be created. The default value is **false**.
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
  var anchorCaseSensitive: js.UndefOr[String] = js.undefined
  
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
    * When set to **true**, this tab is ignored if the `anchorString` is not found in the document.
    */
  var anchorIgnoreIfNotPresent: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the text string in a document must match the value of the `anchorString` property in its entirety for an [anchor tab][AnchorTab]
    * to be created. The default value is **false**.
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
    * Specifies the units of the X and Y offset. Units may be pixels, millimeters, centimeters, or inches.
    */
  var anchorUnits: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the X axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorXOffset: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Y axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorYOffset: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the information in the tab is bold.
    */
  var bold: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible
    * (the characters are hidden by asterisks) to any other signer or the sender.
    *
    * When an envelope is completed the information is only available to the sender through the Form Data link in the DocuSign Console.
    * The information on the downloaded document remains masked by asterisks.
    *
    * This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.
    */
  var concealValueOnDocument: js.UndefOr[String] = js.undefined
  
  /**
    * The user name of the DocuSign user who created this object.
    */
  var createdByDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The userId of the DocuSign user who created this object.
    */
  var createdByUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The DocuSign-generated custom tab id for the custom tab to be applied. This can only be used when adding new tabs for a recipient.
    * When used, the new tab inherits all the custom tab properties.
    */
  var customTabId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data.
    * If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.
    */
  var disableAutoSize: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the custom tab is editable. Otherwise the custom tab cannot be modified.
    */
  var editable: js.UndefOr[String] = js.undefined
  
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
  var font: js.UndefOr[String] = js.undefined
  
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
  var fontColor: js.UndefOr[String] = js.undefined
  
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
  var fontSize: js.UndefOr[String] = js.undefined
  
  /**
    * The height of the tab in pixels.
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the tab is included in e-mails related to the envelope on which it exists. This applies to only specific tabs.
    */
  var includedInEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The original value of the tab.
    */
  var initialValue: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the information in the tab is italic.
    */
  var italic: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The UTC date and time that the comment was last updated.
    *
    * **Note**: This can only be done by the creator.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * The User Name of the DocuSign user who last modified this object.
    */
  var lastModifiedByDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The userId of the DocuSign user who last modified this object.
    */
  var lastModifiedByUserId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the signer cannot change the data of the custom tab.
    */
  var locked: js.UndefOr[String] = js.undefined
  
  var maximumLength: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the information necessary to map the tab to a field in SalesForce.
    */
  var mergeField: js.UndefOr[
    /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
  ] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If the custom tab is for a payment request, this is the external code for the item associated with the charge. For example, this might be your product id.
    *
    * Example: `SHAK1`
    *
    * Maximum Length: 100 characters.
    */
  var paymentItemCode: js.UndefOr[String] = js.undefined
  
  /**
    * If the custom tab is for a payment request, this is the description of the item associated with the charge.
    *
    * Example: `The Danish play by Shakespeare`
    *
    * Maximum Length: 100 characters.
    */
  var paymentItemDescription: js.UndefOr[String] = js.undefined
  
  /**
    * If the custom tab is for a payment request, this is the name of the item associated with the charge.
    *
    * Maximum Length: 100 characters.
    *
    * Example: `Hamlet`
    */
  var paymentItemName: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the signer is required to fill out this tab.
    */
  var required: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the size of the tab. This field accepts values from `0.5` to `1.0`, where `1.0` represents full size and `0.5` is 50% of full size.
    */
  var scaleValue: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the radio button is selected.
    */
  var selected: js.UndefOr[String] = js.undefined
  
  /**
    * When **true**, the tab is shared.
    */
  var shared: js.UndefOr[String] = js.undefined
  
  /**
    * The type of stamp. Valid values are:
    *
    * - `signature`: A signature image. This is the default value.
    * - `stamp`: A stamp image.
    * - null
    */
  var stampType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `stampType` property is editable.
    */
  var stampTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The label associated with the tab. This value may be an empty string.
    * If no value is provided, the tab type is used as the value.
    *
    * Maximum Length: 500 characters.
    *
    */
  var tabLabel: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the information in the tab is underlined.
    */
  var underline: js.UndefOr[String] = js.undefined
  
  /**
    * The message displayed if the custom tab fails input validation (either custom of embedded).
    */
  var validationMessage: js.UndefOr[String] = js.undefined
  
  /**
    * A regular expression used to validate input for the tab.
    */
  var validationPattern: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the tab in pixels.
    */
  var width: js.UndefOr[String] = js.undefined
}
object TabMetadata {
  
  inline def apply(): TabMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabMetadata]
  }
  
  extension [Self <: TabMetadata](x: Self) {
    
    inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorCaseSensitive(value: String): Self = StObject.set(x, "anchorCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setAnchorCaseSensitiveUndefined: Self = StObject.set(x, "anchorCaseSensitive", js.undefined)
    
    inline def setAnchorHorizontalAlignment(value: String): Self = StObject.set(x, "anchorHorizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setAnchorHorizontalAlignmentUndefined: Self = StObject.set(x, "anchorHorizontalAlignment", js.undefined)
    
    inline def setAnchorIgnoreIfNotPresent(value: String): Self = StObject.set(x, "anchorIgnoreIfNotPresent", value.asInstanceOf[js.Any])
    
    inline def setAnchorIgnoreIfNotPresentUndefined: Self = StObject.set(x, "anchorIgnoreIfNotPresent", js.undefined)
    
    inline def setAnchorMatchWholeWord(value: String): Self = StObject.set(x, "anchorMatchWholeWord", value.asInstanceOf[js.Any])
    
    inline def setAnchorMatchWholeWordUndefined: Self = StObject.set(x, "anchorMatchWholeWord", js.undefined)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAnchorUnits(value: String): Self = StObject.set(x, "anchorUnits", value.asInstanceOf[js.Any])
    
    inline def setAnchorUnitsUndefined: Self = StObject.set(x, "anchorUnits", js.undefined)
    
    inline def setAnchorXOffset(value: String): Self = StObject.set(x, "anchorXOffset", value.asInstanceOf[js.Any])
    
    inline def setAnchorXOffsetUndefined: Self = StObject.set(x, "anchorXOffset", js.undefined)
    
    inline def setAnchorYOffset(value: String): Self = StObject.set(x, "anchorYOffset", value.asInstanceOf[js.Any])
    
    inline def setAnchorYOffsetUndefined: Self = StObject.set(x, "anchorYOffset", js.undefined)
    
    inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setConcealValueOnDocument(value: String): Self = StObject.set(x, "concealValueOnDocument", value.asInstanceOf[js.Any])
    
    inline def setConcealValueOnDocumentUndefined: Self = StObject.set(x, "concealValueOnDocument", js.undefined)
    
    inline def setCreatedByDisplayName(value: String): Self = StObject.set(x, "createdByDisplayName", value.asInstanceOf[js.Any])
    
    inline def setCreatedByDisplayNameUndefined: Self = StObject.set(x, "createdByDisplayName", js.undefined)
    
    inline def setCreatedByUserId(value: String): Self = StObject.set(x, "createdByUserId", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUserIdUndefined: Self = StObject.set(x, "createdByUserId", js.undefined)
    
    inline def setCustomTabId(value: String): Self = StObject.set(x, "customTabId", value.asInstanceOf[js.Any])
    
    inline def setCustomTabIdUndefined: Self = StObject.set(x, "customTabId", js.undefined)
    
    inline def setDisableAutoSize(value: String): Self = StObject.set(x, "disableAutoSize", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoSizeUndefined: Self = StObject.set(x, "disableAutoSize", js.undefined)
    
    inline def setEditable(value: String): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIncludedInEmail(value: String): Self = StObject.set(x, "includedInEmail", value.asInstanceOf[js.Any])
    
    inline def setIncludedInEmailUndefined: Self = StObject.set(x, "includedInEmail", js.undefined)
    
    inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setItalic(value: String): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByDisplayName(value: String): Self = StObject.set(x, "lastModifiedByDisplayName", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByDisplayNameUndefined: Self = StObject.set(x, "lastModifiedByDisplayName", js.undefined)
    
    inline def setLastModifiedByUserId(value: String): Self = StObject.set(x, "lastModifiedByUserId", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUserIdUndefined: Self = StObject.set(x, "lastModifiedByUserId", js.undefined)
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLocked(value: String): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setMaximumLength(value: String): Self = StObject.set(x, "maximumLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumLengthUndefined: Self = StObject.set(x, "maximumLength", js.undefined)
    
    inline def setMergeField(
      value: /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
    ): Self = StObject.set(x, "mergeField", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldUndefined: Self = StObject.set(x, "mergeField", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaymentItemCode(value: String): Self = StObject.set(x, "paymentItemCode", value.asInstanceOf[js.Any])
    
    inline def setPaymentItemCodeUndefined: Self = StObject.set(x, "paymentItemCode", js.undefined)
    
    inline def setPaymentItemDescription(value: String): Self = StObject.set(x, "paymentItemDescription", value.asInstanceOf[js.Any])
    
    inline def setPaymentItemDescriptionUndefined: Self = StObject.set(x, "paymentItemDescription", js.undefined)
    
    inline def setPaymentItemName(value: String): Self = StObject.set(x, "paymentItemName", value.asInstanceOf[js.Any])
    
    inline def setPaymentItemNameUndefined: Self = StObject.set(x, "paymentItemName", js.undefined)
    
    inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setScaleValue(value: String): Self = StObject.set(x, "scaleValue", value.asInstanceOf[js.Any])
    
    inline def setScaleValueUndefined: Self = StObject.set(x, "scaleValue", js.undefined)
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setStampType(value: String): Self = StObject.set(x, "stampType", value.asInstanceOf[js.Any])
    
    inline def setStampTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "stampTypeMetadata", value.asInstanceOf[js.Any])
    
    inline def setStampTypeMetadataUndefined: Self = StObject.set(x, "stampTypeMetadata", js.undefined)
    
    inline def setStampTypeUndefined: Self = StObject.set(x, "stampType", js.undefined)
    
    inline def setTabLabel(value: String): Self = StObject.set(x, "tabLabel", value.asInstanceOf[js.Any])
    
    inline def setTabLabelUndefined: Self = StObject.set(x, "tabLabel", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setValidationMessage(value: String): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
    
    inline def setValidationPattern(value: String): Self = StObject.set(x, "validationPattern", value.asInstanceOf[js.Any])
    
    inline def setValidationPatternUndefined: Self = StObject.set(x, "validationPattern", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
