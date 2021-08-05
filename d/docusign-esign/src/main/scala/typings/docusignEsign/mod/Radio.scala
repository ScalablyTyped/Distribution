package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radio extends StObject {
  
  var anchorAllowWhiteSpaceInCharacters: js.UndefOr[String] = js.undefined
  
  var anchorAllowWhiteSpaceInCharactersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
    * When set to **true**, the information in the tab is bold.
    */
  var bold: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `bold` property is editable.
    */
  var boldMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
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
    * Metadata that indicates whether the `fontColor` property is editable.
    */
  var fontColorMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Metadata that indicates whether the `font` property is editable.
    */
  var fontMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
    * Metadata that indicates whether the `fontSize` property is editable.
    */
  var fontSizeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the information in the tab is italic.
    */
  var italic: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `italic` property is editable.
    */
  var italicMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the signer cannot change the data of the custom tab.
    */
  var locked: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `locked` property is editable.
    */
  var lockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the page number on which the tab is located.
    * Must be 1 for supplemental documents.
    *
    */
  var pageNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `pageNumber` property is editable.
    */
  var pageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the signer is required to fill out this tab.
    */
  var required: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `required` property is editable.
    */
  var requiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the radio button is selected.
    */
  var selected: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `selected` property is editable.
    */
  var selectedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `status` property is editable.
    */
  var statusMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `tabId` property is editable.
    */
  var tabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
    * When set to **true**, the information in the tab is underlined.
    */
  var underline: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `underline` property is editable.
    */
  var underlineMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the value of the tab.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `value` property is editable.
    */
  var valueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
object Radio {
  
  inline def apply(): Radio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radio]
  }
  
  extension [Self <: Radio](x: Self) {
    
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
    
    inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "boldMetadata", value.asInstanceOf[js.Any])
    
    inline def setBoldMetadataUndefined: Self = StObject.set(x, "boldMetadata", js.undefined)
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "fontColorMetadata", value.asInstanceOf[js.Any])
    
    inline def setFontColorMetadataUndefined: Self = StObject.set(x, "fontColorMetadata", js.undefined)
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "fontMetadata", value.asInstanceOf[js.Any])
    
    inline def setFontMetadataUndefined: Self = StObject.set(x, "fontMetadata", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "fontSizeMetadata", value.asInstanceOf[js.Any])
    
    inline def setFontSizeMetadataUndefined: Self = StObject.set(x, "fontSizeMetadata", js.undefined)
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setItalic(value: String): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "italicMetadata", value.asInstanceOf[js.Any])
    
    inline def setItalicMetadataUndefined: Self = StObject.set(x, "italicMetadata", js.undefined)
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setLocked(value: String): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "lockedMetadata", value.asInstanceOf[js.Any])
    
    inline def setLockedMetadataUndefined: Self = StObject.set(x, "lockedMetadata", js.undefined)
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setPageNumber(value: String): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "pageNumberMetadata", value.asInstanceOf[js.Any])
    
    inline def setPageNumberMetadataUndefined: Self = StObject.set(x, "pageNumberMetadata", js.undefined)
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requiredMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequiredMetadataUndefined: Self = StObject.set(x, "requiredMetadata", js.undefined)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "selectedMetadata", value.asInstanceOf[js.Any])
    
    inline def setSelectedMetadataUndefined: Self = StObject.set(x, "selectedMetadata", js.undefined)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "statusMetadata", value.asInstanceOf[js.Any])
    
    inline def setStatusMetadataUndefined: Self = StObject.set(x, "statusMetadata", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabIdMetadata", value.asInstanceOf[js.Any])
    
    inline def setTabIdMetadataUndefined: Self = StObject.set(x, "tabIdMetadata", js.undefined)
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setTabOrder(value: String): Self = StObject.set(x, "tabOrder", value.asInstanceOf[js.Any])
    
    inline def setTabOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabOrderMetadata", value.asInstanceOf[js.Any])
    
    inline def setTabOrderMetadataUndefined: Self = StObject.set(x, "tabOrderMetadata", js.undefined)
    
    inline def setTabOrderUndefined: Self = StObject.set(x, "tabOrder", js.undefined)
    
    inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "underlineMetadata", value.asInstanceOf[js.Any])
    
    inline def setUnderlineMetadataUndefined: Self = StObject.set(x, "underlineMetadata", js.undefined)
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "valueMetadata", value.asInstanceOf[js.Any])
    
    inline def setValueMetadataUndefined: Self = StObject.set(x, "valueMetadata", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
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
