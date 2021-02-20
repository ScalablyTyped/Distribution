package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipients extends StObject {
  
  /**
    * A list of agent recipients assigned to the documents.
    */
  var agents: js.UndefOr[
    js.Array[
      /* Contains information about an agent recipient. An agent is a recipient who can add name and email information for recipients that appear after the
    agent in routing order. */ Agent
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
    * A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient
    * does not need to sign, initial, date, or add information to any of the documents.
    */
  var certifiedDeliveries: js.UndefOr[js.Array[CertifiedDelivery]] = js.native
  
  /**
    * The routing order of the current recipient. If this value equals a particular signer's routing order, it indicates that the envelope has been sent
    * to that recipient, but he or she has not completed the required actions.
    */
  var currentRoutingOrder: js.UndefOr[String] = js.native
  
  /**
    * A list of users who can edit the envelope.
    */
  var editors: js.UndefOr[
    js.Array[
      /* A complex type defining the management and access rights of a recipient assigned as an editor on the envelope.
    Editors have the same management and access rights for the envelope as the sender. They can make changes to the envelope as if they were using the Correct feature.
    This recipient can add name and email information, add or change the routing order and set authentication options for the remaining recipients.
    Additionally, this recipient can edit signature/initial tabs and text tabs for the remaining recipients. */ Editor
    ]
  ] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction.
    * The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.
    */
  var inPersonSigners: js.UndefOr[js.Array[InPersonSigner]] = js.native
  
  /**
    * Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the
    * routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).
    */
  var intermediaries: js.UndefOr[js.Array[Intermediary]] = js.native
  
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
      /* A complex type containing information about a witness recipient. Witnesses are recipients whose signatures affirm that the identified
    signers have signed the documents in the envelope. */ Witness
    ]
  ] = js.native
}
object Recipients {
  
  @scala.inline
  def apply(): Recipients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipients]
  }
  
  @scala.inline
  implicit class RecipientsMutableBuilder[Self <: Recipients] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgents(
      value: js.Array[
          /* Contains information about an agent recipient. An agent is a recipient who can add name and email information for recipients that appear after the
      agent in routing order. */ Agent
        ]
    ): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
    
    @scala.inline
    def setAgentsVarargs(
      value: (/* Contains information about an agent recipient. An agent is a recipient who can add name and email information for recipients that appear after the
      agent in routing order. */ Agent)*
    ): Self = StObject.set(x, "agents", js.Array(value :_*))
    
    @scala.inline
    def setCarbonCopies(
      value: js.Array[
          /* Contains information about a carbon copy recipient. Carbon copy recipients get a copy of the envelope but don't need to sign, initial,
      date or add information to any of the documents.  */ CarbonCopy
        ]
    ): Self = StObject.set(x, "carbonCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarbonCopiesUndefined: Self = StObject.set(x, "carbonCopies", js.undefined)
    
    @scala.inline
    def setCarbonCopiesVarargs(
      value: (/* Contains information about a carbon copy recipient. Carbon copy recipients get a copy of the envelope but don't need to sign, initial,
      date or add information to any of the documents.  */ CarbonCopy)*
    ): Self = StObject.set(x, "carbonCopies", js.Array(value :_*))
    
    @scala.inline
    def setCertifiedDeliveries(value: js.Array[CertifiedDelivery]): Self = StObject.set(x, "certifiedDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertifiedDeliveriesUndefined: Self = StObject.set(x, "certifiedDeliveries", js.undefined)
    
    @scala.inline
    def setCertifiedDeliveriesVarargs(value: CertifiedDelivery*): Self = StObject.set(x, "certifiedDeliveries", js.Array(value :_*))
    
    @scala.inline
    def setCurrentRoutingOrder(value: String): Self = StObject.set(x, "currentRoutingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRoutingOrderUndefined: Self = StObject.set(x, "currentRoutingOrder", js.undefined)
    
    @scala.inline
    def setEditors(
      value: js.Array[
          /* A complex type defining the management and access rights of a recipient assigned as an editor on the envelope.
      Editors have the same management and access rights for the envelope as the sender. They can make changes to the envelope as if they were using the Correct feature.
      This recipient can add name and email information, add or change the routing order and set authentication options for the remaining recipients.
      Additionally, this recipient can edit signature/initial tabs and text tabs for the remaining recipients. */ Editor
        ]
    ): Self = StObject.set(x, "editors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorsUndefined: Self = StObject.set(x, "editors", js.undefined)
    
    @scala.inline
    def setEditorsVarargs(
      value: (/* A complex type defining the management and access rights of a recipient assigned as an editor on the envelope.
      Editors have the same management and access rights for the envelope as the sender. They can make changes to the envelope as if they were using the Correct feature.
      This recipient can add name and email information, add or change the routing order and set authentication options for the remaining recipients.
      Additionally, this recipient can edit signature/initial tabs and text tabs for the remaining recipients. */ Editor)*
    ): Self = StObject.set(x, "editors", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setInPersonSigners(value: js.Array[InPersonSigner]): Self = StObject.set(x, "inPersonSigners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPersonSignersUndefined: Self = StObject.set(x, "inPersonSigners", js.undefined)
    
    @scala.inline
    def setInPersonSignersVarargs(value: InPersonSigner*): Self = StObject.set(x, "inPersonSigners", js.Array(value :_*))
    
    @scala.inline
    def setIntermediaries(value: js.Array[Intermediary]): Self = StObject.set(x, "intermediaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediariesUndefined: Self = StObject.set(x, "intermediaries", js.undefined)
    
    @scala.inline
    def setIntermediariesVarargs(value: Intermediary*): Self = StObject.set(x, "intermediaries", js.Array(value :_*))
    
    @scala.inline
    def setRecipientCount(value: String): Self = StObject.set(x, "recipientCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientCountUndefined: Self = StObject.set(x, "recipientCount", js.undefined)
    
    @scala.inline
    def setSeals(value: js.Array[SealSign]): Self = StObject.set(x, "seals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSealsUndefined: Self = StObject.set(x, "seals", js.undefined)
    
    @scala.inline
    def setSealsVarargs(value: SealSign*): Self = StObject.set(x, "seals", js.Array(value :_*))
    
    @scala.inline
    def setSigners(value: js.Array[Signer]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignersUndefined: Self = StObject.set(x, "signers", js.undefined)
    
    @scala.inline
    def setSignersVarargs(value: Signer*): Self = StObject.set(x, "signers", js.Array(value :_*))
    
    @scala.inline
    def setWitnesses(
      value: js.Array[
          /* A complex type containing information about a witness recipient. Witnesses are recipients whose signatures affirm that the identified
      signers have signed the documents in the envelope. */ Witness
        ]
    ): Self = StObject.set(x, "witnesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWitnessesUndefined: Self = StObject.set(x, "witnesses", js.undefined)
    
    @scala.inline
    def setWitnessesVarargs(
      value: (/* A complex type containing information about a witness recipient. Witnesses are recipients whose signatures affirm that the identified
      signers have signed the documents in the envelope. */ Witness)*
    ): Self = StObject.set(x, "witnesses", js.Array(value :_*))
  }
}
