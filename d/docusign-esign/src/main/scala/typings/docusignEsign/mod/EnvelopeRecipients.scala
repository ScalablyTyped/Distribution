package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeRecipients extends js.Object {
  
  /**
    * A list of agent recipients assigned to the documents.
    */
  var agents: js.UndefOr[
    js.Array[
      /* Contains information about an agent recipient. An agent is a recipient who can add name and email information for recipients that appear after
    the agent in routing order. */ Agent
    ]
  ] = js.native
  
  /**
    * A list of carbon copy recipients assigned to the documents.
    */
  var carbonCopies: js.UndefOr[
    js.Array[
      /* Contains information about a carbon copy recipient. Carbon copy recipients get a copy of the envelope but don't need to sign, initial,
    date or add information to any of the documents.  */ CarbonCopy
    ]
  ] = js.native
  
  /**
    * A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does
    * not need to sign, initial, date, or add information to any of the documents.
    */
  var certifiedDeliveries: js.UndefOr[
    js.Array[
      /* Contains information about a certified delivery recipient. Certified delivery recipients must receive the completed documents
    for the envelope to be completed. However, they don't need to sign, initial, date or add information to any of the documents. */ CertifiedDelivery
    ]
  ] = js.native
  
  /**
    * The routing order of the current recipient. If this value equals a particular signer's routing order, it indicates that the envelope has been sent to that recipient,
    * but he or she has not completed the required actions.
    */
  var currentRoutingOrder: js.UndefOr[String] = js.native
  
  /**
    * A list of users who can edit the envelope.
    */
  var editors: js.UndefOr[
    js.Array[
      /* A complex type defining the management and access rights of a recipient assigned as an editor on the envelope. Editors have the same management
    and access rights for the envelope as the sender. They can make changes to the envelope as if they were using the Correct feature. This recipient can add name
    and email information, add or change the routing order and set authentication options for the remaining recipients. Additionally, this recipient can edit
    signature/initial tabs and text tabs for the remaining recipients. */ Editor
    ]
  ] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing
    * Host and new separate Signer Name field appears after Sign in person is selected.
    */
  var inPersonSigners: js.UndefOr[js.Array[InPersonSigner]] = js.native
  
  /**
    * Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent
    * Agents, Editors or Intermediaries recipient types are added).
    */
  var intermediaries: js.UndefOr[
    js.Array[
      /* Contains information about an intermediary recipient. An intermediary is a recipient who can, but is not required to, add name and email information for
    recipients at the same or subsequent level in the routing order, unless subsequent agents, editors or intermediaries are added. */ Intermediary
    ]
  ] = js.native
  
  /**
    * The number of recipients in the envelope.
    */
  var recipientCount: js.UndefOr[String] = js.native
  
  /**
    * A list of electronic seals to apply to documents.
    */
  var seals: js.UndefOr[js.Array[SealSign]] = js.native
  
  /**
    * A list of signers on the envelope.
    */
  var signers: js.UndefOr[js.Array[Signer]] = js.native
  
  /**
    * A list of signers who act as witnesses on the envelope.
    */
  var witnesses: js.UndefOr[
    js.Array[
      /* A complex type containing information about a witness recipient. Witnesses are recipients whose signatures affirm that the identified signers have signed the
    documents in the envelope. */ Witness
    ]
  ] = js.native
}
object EnvelopeRecipients {
  
  @scala.inline
  def apply(): EnvelopeRecipients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeRecipients]
  }
  
  @scala.inline
  implicit class EnvelopeRecipientsOps[Self <: EnvelopeRecipients] (val x: Self) extends AnyVal {
    
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
    def setAgentsVarargs(
      value: (/* Contains information about an agent recipient. An agent is a recipient who can add name and email information for recipients that appear after
      the agent in routing order. */ Agent)*
    ): Self = this.set("agents", js.Array(value :_*))
    
    @scala.inline
    def setAgents(
      value: js.Array[
          /* Contains information about an agent recipient. An agent is a recipient who can add name and email information for recipients that appear after
      the agent in routing order. */ Agent
        ]
    ): Self = this.set("agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgents: Self = this.set("agents", js.undefined)
    
    @scala.inline
    def setCarbonCopiesVarargs(
      value: (/* Contains information about a carbon copy recipient. Carbon copy recipients get a copy of the envelope but don't need to sign, initial,
      date or add information to any of the documents.  */ CarbonCopy)*
    ): Self = this.set("carbonCopies", js.Array(value :_*))
    
    @scala.inline
    def setCarbonCopies(
      value: js.Array[
          /* Contains information about a carbon copy recipient. Carbon copy recipients get a copy of the envelope but don't need to sign, initial,
      date or add information to any of the documents.  */ CarbonCopy
        ]
    ): Self = this.set("carbonCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarbonCopies: Self = this.set("carbonCopies", js.undefined)
    
    @scala.inline
    def setCertifiedDeliveriesVarargs(
      value: (/* Contains information about a certified delivery recipient. Certified delivery recipients must receive the completed documents
      for the envelope to be completed. However, they don't need to sign, initial, date or add information to any of the documents. */ CertifiedDelivery)*
    ): Self = this.set("certifiedDeliveries", js.Array(value :_*))
    
    @scala.inline
    def setCertifiedDeliveries(
      value: js.Array[
          /* Contains information about a certified delivery recipient. Certified delivery recipients must receive the completed documents
      for the envelope to be completed. However, they don't need to sign, initial, date or add information to any of the documents. */ CertifiedDelivery
        ]
    ): Self = this.set("certifiedDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertifiedDeliveries: Self = this.set("certifiedDeliveries", js.undefined)
    
    @scala.inline
    def setCurrentRoutingOrder(value: String): Self = this.set("currentRoutingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentRoutingOrder: Self = this.set("currentRoutingOrder", js.undefined)
    
    @scala.inline
    def setEditorsVarargs(
      value: (/* A complex type defining the management and access rights of a recipient assigned as an editor on the envelope. Editors have the same management
      and access rights for the envelope as the sender. They can make changes to the envelope as if they were using the Correct feature. This recipient can add name
      and email information, add or change the routing order and set authentication options for the remaining recipients. Additionally, this recipient can edit
      signature/initial tabs and text tabs for the remaining recipients. */ Editor)*
    ): Self = this.set("editors", js.Array(value :_*))
    
    @scala.inline
    def setEditors(
      value: js.Array[
          /* A complex type defining the management and access rights of a recipient assigned as an editor on the envelope. Editors have the same management
      and access rights for the envelope as the sender. They can make changes to the envelope as if they were using the Correct feature. This recipient can add name
      and email information, add or change the routing order and set authentication options for the remaining recipients. Additionally, this recipient can edit
      signature/initial tabs and text tabs for the remaining recipients. */ Editor
        ]
    ): Self = this.set("editors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditors: Self = this.set("editors", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setInPersonSignersVarargs(value: InPersonSigner*): Self = this.set("inPersonSigners", js.Array(value :_*))
    
    @scala.inline
    def setInPersonSigners(value: js.Array[InPersonSigner]): Self = this.set("inPersonSigners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPersonSigners: Self = this.set("inPersonSigners", js.undefined)
    
    @scala.inline
    def setIntermediariesVarargs(
      value: (/* Contains information about an intermediary recipient. An intermediary is a recipient who can, but is not required to, add name and email information for
      recipients at the same or subsequent level in the routing order, unless subsequent agents, editors or intermediaries are added. */ Intermediary)*
    ): Self = this.set("intermediaries", js.Array(value :_*))
    
    @scala.inline
    def setIntermediaries(
      value: js.Array[
          /* Contains information about an intermediary recipient. An intermediary is a recipient who can, but is not required to, add name and email information for
      recipients at the same or subsequent level in the routing order, unless subsequent agents, editors or intermediaries are added. */ Intermediary
        ]
    ): Self = this.set("intermediaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntermediaries: Self = this.set("intermediaries", js.undefined)
    
    @scala.inline
    def setRecipientCount(value: String): Self = this.set("recipientCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientCount: Self = this.set("recipientCount", js.undefined)
    
    @scala.inline
    def setSealsVarargs(value: SealSign*): Self = this.set("seals", js.Array(value :_*))
    
    @scala.inline
    def setSeals(value: js.Array[SealSign]): Self = this.set("seals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeals: Self = this.set("seals", js.undefined)
    
    @scala.inline
    def setSignersVarargs(value: Signer*): Self = this.set("signers", js.Array(value :_*))
    
    @scala.inline
    def setSigners(value: js.Array[Signer]): Self = this.set("signers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigners: Self = this.set("signers", js.undefined)
    
    @scala.inline
    def setWitnessesVarargs(
      value: (/* A complex type containing information about a witness recipient. Witnesses are recipients whose signatures affirm that the identified signers have signed the
      documents in the envelope. */ Witness)*
    ): Self = this.set("witnesses", js.Array(value :_*))
    
    @scala.inline
    def setWitnesses(
      value: js.Array[
          /* A complex type containing information about a witness recipient. Witnesses are recipients whose signatures affirm that the identified signers have signed the
      documents in the envelope. */ Witness
        ]
    ): Self = this.set("witnesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWitnesses: Self = this.set("witnesses", js.undefined)
  }
}
