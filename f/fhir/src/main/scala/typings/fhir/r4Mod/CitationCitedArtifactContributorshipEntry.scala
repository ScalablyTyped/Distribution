package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactContributorshipEntry
  extends StObject
     with BackboneElement {
  
  var _collectiveName: js.UndefOr[Element] = js.undefined
  
  var _correspondingContact: js.UndefOr[Element] = js.undefined
  
  var _initials: js.UndefOr[Element] = js.undefined
  
  /**
    * Physical mailing address for the author or contributor.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * Organization affiliated with the entity.
    */
  var affiliationInfo: js.UndefOr[js.Array[CitationCitedArtifactContributorshipEntryAffiliationInfo]] = js.undefined
  
  /**
    * This element is used in Medline based citations, but not supported fully by FHIR HumanName datatype.
    */
  var collectiveName: js.UndefOr[String] = js.undefined
  
  /**
    * Contributions with accounting for time or number.
    */
  var contributionInstance: js.UndefOr[js.Array[CitationCitedArtifactContributorshipEntryContributionInstance]] = js.undefined
  
  /**
    * The CreDiT taxonomy provides a way to encode contribution information inside article XML files. The purpose of CRediT is to provide transparency in contributions to scholarly published work, to enable improved systems of attribution, credit, and accountability.
    */
  var contributionType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indication of which contributor is the corresponding contributor for the role.
    */
  var correspondingContact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Avoids needing to disambiguate common last names or changes of name. ORCID is commonly used as author identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This element is used in Medline based citations, but not supported fully by FHIR HumanName datatype.
    */
  var initials: js.UndefOr[String] = js.undefined
  
  /**
    * Used to code order of authors.
    */
  var listOrder: js.UndefOr[Double] = js.undefined
  
  /**
    * humanName.family can match MEDLINE-based lastName (used for surname or single name), humanName.given can match MEDLINE-based forename (used for remainder of name except for suffix), humanName.suffix can match MEDLINE-based suffix (eg 2nd, 3rd, Jr, Sr).
    */
  var name: js.UndefOr[HumanName] = js.undefined
  
  /**
    * The role of the contributor (e.g. author, editor, reviewer).
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Email or telephone contact methods for the author or contributor.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object CitationCitedArtifactContributorshipEntry {
  
  inline def apply(): CitationCitedArtifactContributorshipEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactContributorshipEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactContributorshipEntry] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setAffiliationInfo(value: js.Array[CitationCitedArtifactContributorshipEntryAffiliationInfo]): Self = StObject.set(x, "affiliationInfo", value.asInstanceOf[js.Any])
    
    inline def setAffiliationInfoUndefined: Self = StObject.set(x, "affiliationInfo", js.undefined)
    
    inline def setAffiliationInfoVarargs(value: CitationCitedArtifactContributorshipEntryAffiliationInfo*): Self = StObject.set(x, "affiliationInfo", js.Array(value*))
    
    inline def setCollectiveName(value: String): Self = StObject.set(x, "collectiveName", value.asInstanceOf[js.Any])
    
    inline def setCollectiveNameUndefined: Self = StObject.set(x, "collectiveName", js.undefined)
    
    inline def setContributionInstance(value: js.Array[CitationCitedArtifactContributorshipEntryContributionInstance]): Self = StObject.set(x, "contributionInstance", value.asInstanceOf[js.Any])
    
    inline def setContributionInstanceUndefined: Self = StObject.set(x, "contributionInstance", js.undefined)
    
    inline def setContributionInstanceVarargs(value: CitationCitedArtifactContributorshipEntryContributionInstance*): Self = StObject.set(x, "contributionInstance", js.Array(value*))
    
    inline def setContributionType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "contributionType", value.asInstanceOf[js.Any])
    
    inline def setContributionTypeUndefined: Self = StObject.set(x, "contributionType", js.undefined)
    
    inline def setContributionTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "contributionType", js.Array(value*))
    
    inline def setCorrespondingContact(value: Boolean): Self = StObject.set(x, "correspondingContact", value.asInstanceOf[js.Any])
    
    inline def setCorrespondingContactUndefined: Self = StObject.set(x, "correspondingContact", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInitials(value: String): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
    
    inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
    
    inline def setListOrder(value: Double): Self = StObject.set(x, "listOrder", value.asInstanceOf[js.Any])
    
    inline def setListOrderUndefined: Self = StObject.set(x, "listOrder", js.undefined)
    
    inline def setName(value: HumanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def set_collectiveName(value: Element): Self = StObject.set(x, "_collectiveName", value.asInstanceOf[js.Any])
    
    inline def set_collectiveNameUndefined: Self = StObject.set(x, "_collectiveName", js.undefined)
    
    inline def set_correspondingContact(value: Element): Self = StObject.set(x, "_correspondingContact", value.asInstanceOf[js.Any])
    
    inline def set_correspondingContactUndefined: Self = StObject.set(x, "_correspondingContact", js.undefined)
    
    inline def set_initials(value: Element): Self = StObject.set(x, "_initials", value.asInstanceOf[js.Any])
    
    inline def set_initialsUndefined: Self = StObject.set(x, "_initials", js.undefined)
  }
}
