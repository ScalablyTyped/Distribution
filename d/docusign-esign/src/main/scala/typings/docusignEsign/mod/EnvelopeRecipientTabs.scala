package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeRecipientTabs extends js.Object {
  
  /**
    * A list of
    * [Approve tabs][approve].
    *
    * An Approve tab enables
    * the recipient to approve documents without
    * placing a signature or initials on the document. If the
    * recipient clicks the tab during the signing process, the
    * recipient is considered to have signed the document. No
    * information is shown on the document of the approval, but it
    * is recorded as a signature in the envelope history.
    * The value of an approve tab can't be set.
    *
    * [approve]:		      https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/approve
    *
    */
  var approveTabs: js.UndefOr[js.Array[Approve]] = js.native
  
  /**
    * A list of
    * [Checkbox tabs][checkbox].
    *
    *
    * A Checkbox tab enables the recipient to select a yes/no (on/off) option. This value can be set.
    *
    *
    * [checkbox]:  https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/checkbox
    *
    */
  var checkboxTabs: js.UndefOr[js.Array[Checkbox]] = js.native
  
  /**
    * An array of tabs that represents a collection of comments in a comment thread. For example, if a recipient has questions about the content of a document,
    * they can add a comment to the document and control who else can see the comment. This value can't be set.
    */
  var commentThreadTabs: js.UndefOr[js.Array[CommentThread]] = js.native
  
  /**
    * A list of
    * [Company tabs][company].
    *
    *
    * A Company tab displays a field for the name of the recipient's company. This value can't be set.
    *
    *
    *
    * [company]: https://developers.docusign.com/esign-rest-api/reference/EnvelopeRecipientTabs/create/#/definitions/company
    *
    */
  var companyTabs: js.UndefOr[js.Array[Company]] = js.native
  
  /**
    * A list of
    * [Date Signed tabs][dateSigned].
    *
    *
    * A Date Signed tab displays the date that the recipient signed the document. This value can't be set.
    *
    * [dateSigned]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/dateSigned
    *
    */
  var dateSignedTabs: js.UndefOr[js.Array[DateSigned]] = js.native
  
  /**
    * A list of
    * [Date tabs][date].
    *
    * A Date tab enables the recipient to enter a date. This value can't be set. The tooltip for this tab recommends the date format MM/DD/YYYY, but this format is not enforced.
    * The system retains the format that the recipient enters.
    *
    * **Note**: If you need to enforce a specific date format, we recommend that you use a Text tab with a validation pattern and validation message.
    *
    *
    * [date]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/date
    *
    */
  var dateTabs: js.UndefOr[js.Array[Date]] = js.native
  
  /**
    * A list of
    * [Decline tabs][decline].
    *
    * A Decline tab enables the recipient to decline the envelope. If the recipient clicks the tab during the signing process, the envelope is voided. The value of this tab can't be set.
    *
    *
    * [decline]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/decline
    *
    */
  var declineTabs: js.UndefOr[js.Array[Decline]] = js.native
  
  var drawTabs: js.UndefOr[js.Array[Draw]] = js.native
  
  /**
    * A list of
    * [Email Address tabs][emailAddress].
    *
    * An Email Address tab displays the recipient's email as entered in the recipient information. This value can't be set.
    *
    *
    * [emailAddress]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/emailAddress
    *
    */
  var emailAddressTabs: js.UndefOr[js.Array[EmailAddress]] = js.native
  
  /**
    * A list of
    * [Email tabs][email].
    *
    * An Email tab enables the recipient to enter an email address.
    * This is a one-line field that checks that a valid email
    * address is entered. It uses the same parameters as a Text
    * tab, with the validation message and pattern set for email
    * information. This value can be set.
    *
    * When getting information that includes
    * this tab type, the original value of the tab when the
    * associated envelope was sent is included in the response.
    *
    * [email]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/email
    *
    */
  var emailTabs: js.UndefOr[js.Array[Email]] = js.native
  
  /**
    * A list of
    * [Envelope ID tabs][envelopeId].
    *
    * An Envelope ID tab  displays the envelope ID. Recipients cannot enter or change the information in this tab. This value can't be set.
    *
    *
    * [envelopeId]: https://developers.docusign.com/esign-rest-api/reference/EnvelopeRecipientTabs/create/#/definitions/envelopeId
    *
    */
  var envelopeIdTabs: js.UndefOr[js.Array[EnvelopeId]] = js.native
  
  /**
    * A list of
    * [First Name tabs][firstName].
    *
    * A First Name tab displays the recipient's first name. The system automatically populates this field by splitting the name in the recipient information on spaces.
    * This value can't be set.
    *
    *
    * [firstName]: https://developers.docusign.com/esign-rest-api/reference/EnvelopeRecipientTabs/create/#/definitions/firstName
    *
    */
  var firstNameTabs: js.UndefOr[js.Array[FirstName]] = js.native
  
  /**
    * A list of [Formula tabs][formulaTab].
    *
    * The value of a Formula tab is calculated from the values of other number or date tabs in the document. When the recipient completes the underlying fields,
    * the Formula tab calculates and displays the result. This value can be set.
    *
    * The `formula` property of the tab contains the references to the underlying tabs. To learn more about formulas, see [Calculated Fields][calculatedfields].
    *
    * If a Formula tab contains a `paymentDetails` property, the tab is considered a payment item. To learn more about payments, see
    * [Requesting Payments Along with Signatures][paymentguide].
    *
    * [calculatedfields]: https://support.docusign.com/en/guides/ndse-user-guide-calculated-fields
    * [paymentguide]:     https://support.docusign.com/en/guides/requesting-payments-along-with-signatures
    * [formulaTab]:	    	https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/formulaTab
    *
    */
  var formulaTabs: js.UndefOr[js.Array[FormulaTab]] = js.native
  
  /**
    * A list of
    * [Full Name tabs][fullName].
    *
    * A Full Name tab displays the recipient's full name. This value can't be set.
    *
    *
    * [fullName]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/fullName
    *
    */
  var fullNameTabs: js.UndefOr[js.Array[FullName]] = js.native
  
  /**
    * A list of
    * [Initial Here tabs][initialHere].
    *
    * This type of tab enables the recipient to initial the document. May be optional. This value can't be set.
    *
    * [initialHere]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/initialHere
    *
    */
  var initialHereTabs: js.UndefOr[js.Array[InitialHere]] = js.native
  
  /**
    * A list of
    * [Last Name tabs][lastName].
    *
    * A Last Name tab displays the recipient's last name. The system automatically populates this field by splitting the name in the recipient information on spaces. This value can't be set.
    *
    *
    * [lastName]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/lastName
    *
    */
  var lastNameTabs: js.UndefOr[js.Array[LastName]] = js.native
  
  /**
    * A list of [List tabs][list].
    * A List tab enables the recipient to choose from a list of options. You specify the options in the `listItems` property. This value can't be set.
    * [list]: https://developers.docusign.com/esign-rest-api/reference/EnvelopeRecipientTabs/create/#/definitions/list
    */
  var listTabs: js.UndefOr[js.Array[List]] = js.native
  
  /**
    * A list of  [Notarize tabs][notarize].
    *
    * A Notarize tab alerts notary recipients that they must take action on the page. This value can be set.
    *
    * **Note**: Only one notarize tab can appear on a page.
    *
    * [notarize]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/notarize
    *
    */
  var notarizeTabs: js.UndefOr[js.Array[Notarize]] = js.native
  
  /**
    * A list of
    * [Note tabs][note].
    *
    * A Note tab displays additional information to the recipient in the form of a note. This value can be set.
    *
    * [note]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/note
    *
    */
  var noteTabs: js.UndefOr[js.Array[Note]] = js.native
  
  /**
    * A list of
    * [Number tabs][number].
    * A Number tab enables the recipient to enter numbers and decimal points (.). This value can be set.
    * [number]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/number
    */
  // tslint:disable-next-line: ban-types
  var numberTabs: js.UndefOr[js.Array[Number]] = js.native
  
  /**
    * This type of tab enables the recipient to strike through document text. This value can't be set.
    */
  var polyLineOverlayTabs: js.UndefOr[js.Array[PolyLineOverlay]] = js.native
  
  /**
    * A list of [Radio Group tabs][radioGroup].
    * A Radio Group tab places a group of radio buttons on a document. The `radios` property is used to add and place the radio
    * buttons associated with the group. Only one radio button can be selected in a group. This value can be set.
    * [radioGroup]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/radioGroup
    */
  var radioGroupTabs: js.UndefOr[js.Array[RadioGroup]] = js.native
  
  /**
    * A list of
    * [Sign Here tabs][signHere].
    *
    * This type of tab enables the recipient to sign a document. May be optional. This value can't be set.
    *
    * [signHere]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/signHere
    *
    */
  var signHereTabs: js.UndefOr[js.Array[SignHere]] = js.native
  
  /**
    * A list of
    * [Signer Attachment tabs][signerAttachment].
    *
    * This type of tab enables the recipient to attach supporting documents to an envelope. This value can't be set.
    *
    *
    * [signerAttachment]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/signerAttachment
    *
    */
  var signerAttachmentTabs: js.UndefOr[js.Array[SignerAttachment]] = js.native
  
  /**
    * A list of [Smart Section](https://www.docusign.com/blog/dsdev-deep-dive-responsive-smart-sections/) tabs.
    *
    * Smart Section tabs enhance responsive signing on mobile devices by enabling collapsible sections, page breaks, custom formatting options, and other advanced functionality.
    *
    * **Note**: Smart Sections are a premium feature. Responsive signing must also be enabled for your account.
    */
  var smartSectionTabs: js.UndefOr[js.Array[SmartSection]] = js.native
  
  /**
    * A list of
    * [SSN tabs][ssn].
    *
    * An SSN tab contains a one-line field that enables the recipient to enter a Social Security Number (SSN) with or without
    * dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information. This value can be set.
    *
    *
    * [ssn]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/ssn
    *
    */
  var ssnTabs: js.UndefOr[js.Array[Ssn]] = js.native
  
  /**
    * An array of `tabGroup` items that contain information about tab groups. To assign a tab to a `tabGroup`, you assign the `tabGroupLabel` to the `Tab.TabGroupLabels` array.
    */
  var tabGroups: js.UndefOr[js.Array[TabGroup]] = js.native
  
  /**
    * A list of
    * [Text tabs][text].
    *
    * A text tab enables the recipient to enter free text. This value can be set.
    *
    * [text]: https://developers.docusign.com/esign-rest-api/reference/EnvelopeRecipientTabs/create/#/definitions/text
    *
    */
  var textTabs: js.UndefOr[js.Array[Text]] = js.native
  
  /**
    * A list of
    * [Title tabs][title].
    *
    * A Title tab displays the recipient's title.  This value can't be set.
    *
    *
    * [title]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/title
    *
    */
  var titleTabs: js.UndefOr[js.Array[Title]] = js.native
  
  /**
    * A list of
    * [View tabs][view].
    *
    * A View tab is used with an Approve tab to handle supplemental documents.  This value can be set.
    *
    * [view]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/view
    *
    */
  var viewTabs: js.UndefOr[
    js.Array[
      /* This tab is used with the Approve tab to handle supplemental documents. */ View
    ]
  ] = js.native
  
  /**
    * A list of
    * [Zip tabs][zip].
    *
    * A Zip tab enables the recipient to enter a ZIP code. The ZIP code can be five digits or nine digits ( in ZIP+4 format), and can be entered with or without dashes.
    * It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  This value can be set.
    *
    *
    * [zip]: https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipientTabs/create/#/definitions/zip
    *
    */
  var zipTabs: js.UndefOr[js.Array[Zip]] = js.native
}
object EnvelopeRecipientTabs {
  
  @scala.inline
  def apply(): EnvelopeRecipientTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeRecipientTabs]
  }
  
  @scala.inline
  implicit class EnvelopeRecipientTabsOps[Self <: EnvelopeRecipientTabs] (val x: Self) extends AnyVal {
    
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
    def setApproveTabsVarargs(value: Approve*): Self = this.set("approveTabs", js.Array(value :_*))
    
    @scala.inline
    def setApproveTabs(value: js.Array[Approve]): Self = this.set("approveTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproveTabs: Self = this.set("approveTabs", js.undefined)
    
    @scala.inline
    def setCheckboxTabsVarargs(value: Checkbox*): Self = this.set("checkboxTabs", js.Array(value :_*))
    
    @scala.inline
    def setCheckboxTabs(value: js.Array[Checkbox]): Self = this.set("checkboxTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxTabs: Self = this.set("checkboxTabs", js.undefined)
    
    @scala.inline
    def setCommentThreadTabsVarargs(value: CommentThread*): Self = this.set("commentThreadTabs", js.Array(value :_*))
    
    @scala.inline
    def setCommentThreadTabs(value: js.Array[CommentThread]): Self = this.set("commentThreadTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentThreadTabs: Self = this.set("commentThreadTabs", js.undefined)
    
    @scala.inline
    def setCompanyTabsVarargs(value: Company*): Self = this.set("companyTabs", js.Array(value :_*))
    
    @scala.inline
    def setCompanyTabs(value: js.Array[Company]): Self = this.set("companyTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyTabs: Self = this.set("companyTabs", js.undefined)
    
    @scala.inline
    def setDateSignedTabsVarargs(value: DateSigned*): Self = this.set("dateSignedTabs", js.Array(value :_*))
    
    @scala.inline
    def setDateSignedTabs(value: js.Array[DateSigned]): Self = this.set("dateSignedTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateSignedTabs: Self = this.set("dateSignedTabs", js.undefined)
    
    @scala.inline
    def setDateTabsVarargs(value: Date*): Self = this.set("dateTabs", js.Array(value :_*))
    
    @scala.inline
    def setDateTabs(value: js.Array[Date]): Self = this.set("dateTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTabs: Self = this.set("dateTabs", js.undefined)
    
    @scala.inline
    def setDeclineTabsVarargs(value: Decline*): Self = this.set("declineTabs", js.Array(value :_*))
    
    @scala.inline
    def setDeclineTabs(value: js.Array[Decline]): Self = this.set("declineTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclineTabs: Self = this.set("declineTabs", js.undefined)
    
    @scala.inline
    def setDrawTabsVarargs(value: Draw*): Self = this.set("drawTabs", js.Array(value :_*))
    
    @scala.inline
    def setDrawTabs(value: js.Array[Draw]): Self = this.set("drawTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawTabs: Self = this.set("drawTabs", js.undefined)
    
    @scala.inline
    def setEmailAddressTabsVarargs(value: EmailAddress*): Self = this.set("emailAddressTabs", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddressTabs(value: js.Array[EmailAddress]): Self = this.set("emailAddressTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddressTabs: Self = this.set("emailAddressTabs", js.undefined)
    
    @scala.inline
    def setEmailTabsVarargs(value: Email*): Self = this.set("emailTabs", js.Array(value :_*))
    
    @scala.inline
    def setEmailTabs(value: js.Array[Email]): Self = this.set("emailTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailTabs: Self = this.set("emailTabs", js.undefined)
    
    @scala.inline
    def setEnvelopeIdTabsVarargs(value: EnvelopeId*): Self = this.set("envelopeIdTabs", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeIdTabs(value: js.Array[EnvelopeId]): Self = this.set("envelopeIdTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIdTabs: Self = this.set("envelopeIdTabs", js.undefined)
    
    @scala.inline
    def setFirstNameTabsVarargs(value: FirstName*): Self = this.set("firstNameTabs", js.Array(value :_*))
    
    @scala.inline
    def setFirstNameTabs(value: js.Array[FirstName]): Self = this.set("firstNameTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstNameTabs: Self = this.set("firstNameTabs", js.undefined)
    
    @scala.inline
    def setFormulaTabsVarargs(value: FormulaTab*): Self = this.set("formulaTabs", js.Array(value :_*))
    
    @scala.inline
    def setFormulaTabs(value: js.Array[FormulaTab]): Self = this.set("formulaTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulaTabs: Self = this.set("formulaTabs", js.undefined)
    
    @scala.inline
    def setFullNameTabsVarargs(value: FullName*): Self = this.set("fullNameTabs", js.Array(value :_*))
    
    @scala.inline
    def setFullNameTabs(value: js.Array[FullName]): Self = this.set("fullNameTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullNameTabs: Self = this.set("fullNameTabs", js.undefined)
    
    @scala.inline
    def setInitialHereTabsVarargs(value: InitialHere*): Self = this.set("initialHereTabs", js.Array(value :_*))
    
    @scala.inline
    def setInitialHereTabs(value: js.Array[InitialHere]): Self = this.set("initialHereTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialHereTabs: Self = this.set("initialHereTabs", js.undefined)
    
    @scala.inline
    def setLastNameTabsVarargs(value: LastName*): Self = this.set("lastNameTabs", js.Array(value :_*))
    
    @scala.inline
    def setLastNameTabs(value: js.Array[LastName]): Self = this.set("lastNameTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastNameTabs: Self = this.set("lastNameTabs", js.undefined)
    
    @scala.inline
    def setListTabsVarargs(value: List*): Self = this.set("listTabs", js.Array(value :_*))
    
    @scala.inline
    def setListTabs(value: js.Array[List]): Self = this.set("listTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListTabs: Self = this.set("listTabs", js.undefined)
    
    @scala.inline
    def setNotarizeTabsVarargs(value: Notarize*): Self = this.set("notarizeTabs", js.Array(value :_*))
    
    @scala.inline
    def setNotarizeTabs(value: js.Array[Notarize]): Self = this.set("notarizeTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotarizeTabs: Self = this.set("notarizeTabs", js.undefined)
    
    @scala.inline
    def setNoteTabsVarargs(value: Note*): Self = this.set("noteTabs", js.Array(value :_*))
    
    @scala.inline
    def setNoteTabs(value: js.Array[Note]): Self = this.set("noteTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteTabs: Self = this.set("noteTabs", js.undefined)
    
    @scala.inline
    def setNumberTabsVarargs(value: Number*): Self = this.set("numberTabs", js.Array(value :_*))
    
    @scala.inline
    def setNumberTabs(value: js.Array[Number]): Self = this.set("numberTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberTabs: Self = this.set("numberTabs", js.undefined)
    
    @scala.inline
    def setPolyLineOverlayTabsVarargs(value: PolyLineOverlay*): Self = this.set("polyLineOverlayTabs", js.Array(value :_*))
    
    @scala.inline
    def setPolyLineOverlayTabs(value: js.Array[PolyLineOverlay]): Self = this.set("polyLineOverlayTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolyLineOverlayTabs: Self = this.set("polyLineOverlayTabs", js.undefined)
    
    @scala.inline
    def setRadioGroupTabsVarargs(value: RadioGroup*): Self = this.set("radioGroupTabs", js.Array(value :_*))
    
    @scala.inline
    def setRadioGroupTabs(value: js.Array[RadioGroup]): Self = this.set("radioGroupTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroupTabs: Self = this.set("radioGroupTabs", js.undefined)
    
    @scala.inline
    def setSignHereTabsVarargs(value: SignHere*): Self = this.set("signHereTabs", js.Array(value :_*))
    
    @scala.inline
    def setSignHereTabs(value: js.Array[SignHere]): Self = this.set("signHereTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignHereTabs: Self = this.set("signHereTabs", js.undefined)
    
    @scala.inline
    def setSignerAttachmentTabsVarargs(value: SignerAttachment*): Self = this.set("signerAttachmentTabs", js.Array(value :_*))
    
    @scala.inline
    def setSignerAttachmentTabs(value: js.Array[SignerAttachment]): Self = this.set("signerAttachmentTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerAttachmentTabs: Self = this.set("signerAttachmentTabs", js.undefined)
    
    @scala.inline
    def setSmartSectionTabsVarargs(value: SmartSection*): Self = this.set("smartSectionTabs", js.Array(value :_*))
    
    @scala.inline
    def setSmartSectionTabs(value: js.Array[SmartSection]): Self = this.set("smartSectionTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartSectionTabs: Self = this.set("smartSectionTabs", js.undefined)
    
    @scala.inline
    def setSsnTabsVarargs(value: Ssn*): Self = this.set("ssnTabs", js.Array(value :_*))
    
    @scala.inline
    def setSsnTabs(value: js.Array[Ssn]): Self = this.set("ssnTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsnTabs: Self = this.set("ssnTabs", js.undefined)
    
    @scala.inline
    def setTabGroupsVarargs(value: TabGroup*): Self = this.set("tabGroups", js.Array(value :_*))
    
    @scala.inline
    def setTabGroups(value: js.Array[TabGroup]): Self = this.set("tabGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabGroups: Self = this.set("tabGroups", js.undefined)
    
    @scala.inline
    def setTextTabsVarargs(value: Text*): Self = this.set("textTabs", js.Array(value :_*))
    
    @scala.inline
    def setTextTabs(value: js.Array[Text]): Self = this.set("textTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTabs: Self = this.set("textTabs", js.undefined)
    
    @scala.inline
    def setTitleTabsVarargs(value: Title*): Self = this.set("titleTabs", js.Array(value :_*))
    
    @scala.inline
    def setTitleTabs(value: js.Array[Title]): Self = this.set("titleTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTabs: Self = this.set("titleTabs", js.undefined)
    
    @scala.inline
    def setViewTabsVarargs(value: (/* This tab is used with the Approve tab to handle supplemental documents. */ View)*): Self = this.set("viewTabs", js.Array(value :_*))
    
    @scala.inline
    def setViewTabs(
      value: js.Array[
          /* This tab is used with the Approve tab to handle supplemental documents. */ View
        ]
    ): Self = this.set("viewTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewTabs: Self = this.set("viewTabs", js.undefined)
    
    @scala.inline
    def setZipTabsVarargs(value: Zip*): Self = this.set("zipTabs", js.Array(value :_*))
    
    @scala.inline
    def setZipTabs(value: js.Array[Zip]): Self = this.set("zipTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipTabs: Self = this.set("zipTabs", js.undefined)
  }
}
