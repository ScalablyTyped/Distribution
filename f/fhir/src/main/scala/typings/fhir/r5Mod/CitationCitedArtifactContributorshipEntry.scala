package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactContributorshipEntry
  extends StObject
     with BackboneElement {
  
  var _correspondingContact: js.UndefOr[Element] = js.undefined
  
  var _forenameInitials: js.UndefOr[Element] = js.undefined
  
  /**
    * If naming an organization without additional detail or further structured data, the display element within the Reference datatype may be used for a simple string without referencing another resource.
    */
  var affiliation: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Contributions with accounting for time or number.
    */
  var contributionInstance: js.UndefOr[js.Array[CitationCitedArtifactContributorshipEntryContributionInstance]] = js.undefined
  
  /**
    * The CreDiT taxonomy provides a way to encode contribution information. The purpose of CRediT is to provide transparency in contributions to scholarly published work, to enable improved systems of attribution, credit, and accountability.
    */
  var contributionType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If naming a contributor without additional detail or further structured data, the display element within the Reference datatype may be used for a simple string without referencing another resource.
    */
  var contributor: Reference
  
  /**
    * If there are multiple authors and one serves as the corresponding author, then that one would have correspondingContact = true.
    */
  var correspondingContact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This element is used to support a data element used for citations that is not otherwise supported fully by FHIR HumanName datatype. In some citation summary styles (e.g. Medline), authors are presented with full spelling of their last name (family name) and initials for all forenames (first names, middle names, preceding names, given names). As the FHIR HumanName Datatype does not have a specific element for forename initials and this is common in citation usage, the element is added to contributorship.entry directly.
    */
  var forenameInitials: js.UndefOr[String] = js.undefined
  
  /**
    * Used to retain order of authorship as structured data
    */
  var rankingOrder: js.UndefOr[Double] = js.undefined
  
  /**
    * The role of the contributor (e.g. author, editor, reviewer, funder).
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object CitationCitedArtifactContributorshipEntry {
  
  inline def apply(contributor: Reference): CitationCitedArtifactContributorshipEntry = {
    val __obj = js.Dynamic.literal(contributor = contributor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationCitedArtifactContributorshipEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactContributorshipEntry] (val x: Self) extends AnyVal {
    
    inline def setAffiliation(value: js.Array[Reference]): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    inline def setAffiliationVarargs(value: Reference*): Self = StObject.set(x, "affiliation", js.Array(value*))
    
    inline def setContributionInstance(value: js.Array[CitationCitedArtifactContributorshipEntryContributionInstance]): Self = StObject.set(x, "contributionInstance", value.asInstanceOf[js.Any])
    
    inline def setContributionInstanceUndefined: Self = StObject.set(x, "contributionInstance", js.undefined)
    
    inline def setContributionInstanceVarargs(value: CitationCitedArtifactContributorshipEntryContributionInstance*): Self = StObject.set(x, "contributionInstance", js.Array(value*))
    
    inline def setContributionType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "contributionType", value.asInstanceOf[js.Any])
    
    inline def setContributionTypeUndefined: Self = StObject.set(x, "contributionType", js.undefined)
    
    inline def setContributionTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "contributionType", js.Array(value*))
    
    inline def setContributor(value: Reference): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
    
    inline def setCorrespondingContact(value: Boolean): Self = StObject.set(x, "correspondingContact", value.asInstanceOf[js.Any])
    
    inline def setCorrespondingContactUndefined: Self = StObject.set(x, "correspondingContact", js.undefined)
    
    inline def setForenameInitials(value: String): Self = StObject.set(x, "forenameInitials", value.asInstanceOf[js.Any])
    
    inline def setForenameInitialsUndefined: Self = StObject.set(x, "forenameInitials", js.undefined)
    
    inline def setRankingOrder(value: Double): Self = StObject.set(x, "rankingOrder", value.asInstanceOf[js.Any])
    
    inline def setRankingOrderUndefined: Self = StObject.set(x, "rankingOrder", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def set_correspondingContact(value: Element): Self = StObject.set(x, "_correspondingContact", value.asInstanceOf[js.Any])
    
    inline def set_correspondingContactUndefined: Self = StObject.set(x, "_correspondingContact", js.undefined)
    
    inline def set_forenameInitials(value: Element): Self = StObject.set(x, "_forenameInitials", value.asInstanceOf[js.Any])
    
    inline def set_forenameInitialsUndefined: Self = StObject.set(x, "_forenameInitials", js.undefined)
  }
}
