package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTabs extends js.Object {
  
  /**
    * An optional string that is used to auto-match tabs to strings located in the documents of an envelope.
    */
  var anchor: js.UndefOr[String] = js.native
  
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
    * When set to **true**, this tab is ignored if the `anchorString` is not found in the document.
    */
  var anchorIgnoreIfNotPresent: js.UndefOr[String] = js.native
  
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
    * Specifies the units of the X and Y offset. Units may be pixels, millimeters, centimeters, or inches.
    */
  var anchorUnits: js.UndefOr[String] = js.native
  
  /**
    * Specifies the X axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorXOffset: js.UndefOr[String] = js.native
  
  /**
    * Specifies the Y axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorYOffset: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the information in the tab is bold.
    */
  var bold: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters
    * are hidden by asterisks) to any other signer or the sender.
    *
    * When an envelope is completed the information is only available to the sender through the Form Data link in the DocuSign Console. The information on the downloaded
    * document remains masked by asterisks.
    *
    * This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.
    */
  var concealValueOnDocument: js.UndefOr[String] = js.native
  
  /**
    * The user name of the DocuSign user who created this object.
    */
  var createdByDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The userId of the DocuSign user who created this object.
    */
  var createdByUserId: js.UndefOr[String] = js.native
  
  /**
    * The DocuSign-generated custom tab ID for the custom tab to be applied. This property can only be used when adding new tabs for a recipient. When used, the new tab
    * inherits all of the custom tab properties.
    */
  var customTabId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter
    * as much data as the text box can hold. By default this is false. This property only affects single line text boxes.
    */
  var disableAutoSize: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the custom tab is editable. Otherwise the custom tab cannot be modified.
    */
  var editable: js.UndefOr[String] = js.native
  
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
    * The height of the tab in pixels.
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the tab is included in e-mails related to the envelope on which it exists. This applies to only specific tabs.
    */
  var includedInEmail: js.UndefOr[String] = js.native
  
  /**
    * The original value of the tab.
    */
  var initialValue: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the information in the tab is italic.
    */
  var italic: js.UndefOr[String] = js.native
  
  /**
    * If the tab is a list, this represents the values that are possible for the tab.
    */
  var items: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The UTC DateTime this object was last modified. This is in ISO8601 format.
    */
  var lastModified: js.UndefOr[String] = js.native
  
  /**
    * The User Name of the DocuSign user who last modified this object.
    */
  var lastModifiedByDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The userId of the DocuSign user who last modified this object.
    */
  var lastModifiedByUserId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the signer cannot change the data of the custom tab.
    */
  var locked: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of entry characters supported by the custom tab.
    */
  var maximumLength: js.UndefOr[String] = js.native
  
  /**
    * Contains the information necessary to map the tab to a field in SalesForce.
    */
  var mergeField: js.UndefOr[
    /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
  ] = js.native
  
  /**
    * The name of the custom tab.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If the custom tab is for a payment request, this is the external code for the item associated with the charge. For example, this might be your product id.
    *
    * Example: `SHAK1`
    *
    * Maximum Length: 100 characters.
    */
  var paymentItemCode: js.UndefOr[String] = js.native
  
  /**
    * If the custom tab is for a payment request, this is the description of the item associated with the charge.
    *
    * Example: `The Danish play by Shakespeare`
    *
    * Maximum Length: 100 characters.
    */
  var paymentItemDescription: js.UndefOr[String] = js.native
  
  /**
    * If the custom tab is for a payment request, this is the name of the item associated with the charge.
    *
    * Maximum Length: 100 characters.
    *
    * Example: `Hamlet`
    */
  var paymentItemName: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the signer is required to fill out this tab.
    */
  var required: js.UndefOr[String] = js.native
  
  /**
    * Sets the size of the tab. This field accepts values from `0.5` to `1.0`, where `1.0` represents full size and `0.5` is 50% of full size.
    */
  var scaleValue: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the radio button is selected.
    */
  var selected: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, this custom tab is shared.
    */
  var shared: js.UndefOr[String] = js.native
  
  /**
    * The type of stamp. Valid values are:
    *
    * - `signature`: A signature image. This is the default value.
    * - `stamp`: A stamp image.
    * - null
    */
  var stampType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `stampType` property is editable.
    *
    */
  var stampTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The label associated with the tab. This value may be an empty string.
    * If no value is provided, the tab type is used as the value.
    *
    * Maximum Length: 500 characters.
    *
    */
  var tabLabel: js.UndefOr[String] = js.native
  
  /**
    * The type of this tab. Values are:
    *
    * - Approve
    * - CheckBox
    * - Company
    * - Date
    * - DateSigned,	Decline
    * - Email,	EmailAddress
    * - EnvelopeId
    * - FirstName
    * - Formula
    * - FullName,	InitialHere
    * - InitialHereOptional
    * - LastName
    * - List
    * - Note
    * - Number
    * - Radio
    * - SignerAttachment
    * - SignHere
    * - SignHereOptional
    * - Ssn
    * - Text
    * - Title
    * - Zip5
    * - Zip5Dash4
    *
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the information in the tab is underlined.
    */
  var underline: js.UndefOr[String] = js.native
  
  /**
    * The message displayed if the custom tab fails input validation (either custom of embedded).
    */
  var validationMessage: js.UndefOr[String] = js.native
  
  /**
    * A regular expression used to validate input for the tab.
    */
  var validationPattern: js.UndefOr[String] = js.native
  
  /**
    * The width of the tab in pixels.
    */
  var width: js.UndefOr[String] = js.native
}
object CustomTabs {
  
  @scala.inline
  def apply(): CustomTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTabs]
  }
  
  @scala.inline
  implicit class CustomTabsOps[Self <: CustomTabs] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorCaseSensitive(value: String): Self = this.set("anchorCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorCaseSensitive: Self = this.set("anchorCaseSensitive", js.undefined)
    
    @scala.inline
    def setAnchorHorizontalAlignment(value: String): Self = this.set("anchorHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorHorizontalAlignment: Self = this.set("anchorHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setAnchorIgnoreIfNotPresent(value: String): Self = this.set("anchorIgnoreIfNotPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorIgnoreIfNotPresent: Self = this.set("anchorIgnoreIfNotPresent", js.undefined)
    
    @scala.inline
    def setAnchorMatchWholeWord(value: String): Self = this.set("anchorMatchWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorMatchWholeWord: Self = this.set("anchorMatchWholeWord", js.undefined)
    
    @scala.inline
    def setAnchorUnits(value: String): Self = this.set("anchorUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorUnits: Self = this.set("anchorUnits", js.undefined)
    
    @scala.inline
    def setAnchorXOffset(value: String): Self = this.set("anchorXOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorXOffset: Self = this.set("anchorXOffset", js.undefined)
    
    @scala.inline
    def setAnchorYOffset(value: String): Self = this.set("anchorYOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorYOffset: Self = this.set("anchorYOffset", js.undefined)
    
    @scala.inline
    def setBold(value: String): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setConcealValueOnDocument(value: String): Self = this.set("concealValueOnDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcealValueOnDocument: Self = this.set("concealValueOnDocument", js.undefined)
    
    @scala.inline
    def setCreatedByDisplayName(value: String): Self = this.set("createdByDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByDisplayName: Self = this.set("createdByDisplayName", js.undefined)
    
    @scala.inline
    def setCreatedByUserId(value: String): Self = this.set("createdByUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByUserId: Self = this.set("createdByUserId", js.undefined)
    
    @scala.inline
    def setCustomTabId(value: String): Self = this.set("customTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTabId: Self = this.set("customTabId", js.undefined)
    
    @scala.inline
    def setDisableAutoSize(value: String): Self = this.set("disableAutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutoSize: Self = this.set("disableAutoSize", js.undefined)
    
    @scala.inline
    def setEditable(value: String): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIncludedInEmail(value: String): Self = this.set("includedInEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedInEmail: Self = this.set("includedInEmail", js.undefined)
    
    @scala.inline
    def setInitialValue(value: String): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    
    @scala.inline
    def setItalic(value: String): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setLastModifiedByDisplayName(value: String): Self = this.set("lastModifiedByDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedByDisplayName: Self = this.set("lastModifiedByDisplayName", js.undefined)
    
    @scala.inline
    def setLastModifiedByUserId(value: String): Self = this.set("lastModifiedByUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedByUserId: Self = this.set("lastModifiedByUserId", js.undefined)
    
    @scala.inline
    def setLocked(value: String): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setMaximumLength(value: String): Self = this.set("maximumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumLength: Self = this.set("maximumLength", js.undefined)
    
    @scala.inline
    def setMergeField(
      value: /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
    ): Self = this.set("mergeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeField: Self = this.set("mergeField", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPaymentItemCode(value: String): Self = this.set("paymentItemCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentItemCode: Self = this.set("paymentItemCode", js.undefined)
    
    @scala.inline
    def setPaymentItemDescription(value: String): Self = this.set("paymentItemDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentItemDescription: Self = this.set("paymentItemDescription", js.undefined)
    
    @scala.inline
    def setPaymentItemName(value: String): Self = this.set("paymentItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentItemName: Self = this.set("paymentItemName", js.undefined)
    
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setScaleValue(value: String): Self = this.set("scaleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleValue: Self = this.set("scaleValue", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShared(value: String): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setStampType(value: String): Self = this.set("stampType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStampType: Self = this.set("stampType", js.undefined)
    
    @scala.inline
    def setStampTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("stampTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStampTypeMetadata: Self = this.set("stampTypeMetadata", js.undefined)
    
    @scala.inline
    def setTabLabel(value: String): Self = this.set("tabLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLabel: Self = this.set("tabLabel", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderline(value: String): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: String): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setValidationPattern(value: String): Self = this.set("validationPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationPattern: Self = this.set("validationPattern", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
