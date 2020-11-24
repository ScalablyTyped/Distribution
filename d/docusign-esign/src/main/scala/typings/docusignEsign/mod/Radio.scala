package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Radio extends js.Object {
  
  var anchorAllowWhiteSpaceInCharacters: js.UndefOr[String] = js.native
  
  var anchorAllowWhiteSpaceInCharactersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
    * When set to **true**, the information in the tab is italic.
    */
  var italic: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `italic` property is editable.
    */
  var italicMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the signer cannot change the data of the custom tab.
    */
  var locked: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `locked` property is editable.
    */
  var lockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the page number on which the tab is located.
    * Must be 1 for supplemental documents.
    *
    */
  var pageNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `pageNumber` property is editable.
    */
  var pageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the signer is required to fill out this tab.
    */
  var required: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `required` property is editable.
    */
  var requiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the radio button is selected.
    */
  var selected: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `selected` property is editable.
    */
  var selectedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `status` property is editable.
    */
  var statusMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabId` property is editable.
    */
  var tabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
    * When set to **true**, the information in the tab is underlined.
    */
  var underline: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `underline` property is editable.
    */
  var underlineMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the value of the tab.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `value` property is editable.
    */
  var valueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
object Radio {
  
  @scala.inline
  def apply(): Radio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radio]
  }
  
  @scala.inline
  implicit class RadioOps[Self <: Radio] (val x: Self) extends AnyVal {
    
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
    def setItalic(value: String): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setItalicMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("italicMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalicMetadata: Self = this.set("italicMetadata", js.undefined)
    
    @scala.inline
    def setLocked(value: String): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("lockedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedMetadata: Self = this.set("lockedMetadata", js.undefined)
    
    @scala.inline
    def setPageNumber(value: String): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    
    @scala.inline
    def setPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("pageNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumberMetadata: Self = this.set("pageNumberMetadata", js.undefined)
    
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("requiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredMetadata: Self = this.set("requiredMetadata", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("selectedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedMetadata: Self = this.set("selectedMetadata", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("statusMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMetadata: Self = this.set("statusMetadata", js.undefined)
    
    @scala.inline
    def setTabId(value: String): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    
    @scala.inline
    def setTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("tabIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIdMetadata: Self = this.set("tabIdMetadata", js.undefined)
    
    @scala.inline
    def setTabOrder(value: String): Self = this.set("tabOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabOrder: Self = this.set("tabOrder", js.undefined)
    
    @scala.inline
    def setTabOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("tabOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabOrderMetadata: Self = this.set("tabOrderMetadata", js.undefined)
    
    @scala.inline
    def setUnderline(value: String): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    
    @scala.inline
    def setUnderlineMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("underlineMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineMetadata: Self = this.set("underlineMetadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("valueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMetadata: Self = this.set("valueMetadata", js.undefined)
    
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
