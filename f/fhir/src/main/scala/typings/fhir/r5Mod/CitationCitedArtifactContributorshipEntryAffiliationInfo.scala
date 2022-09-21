package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactContributorshipEntryAffiliationInfo
  extends StObject
     with BackboneElement {
  
  var _affiliation: js.UndefOr[Element] = js.undefined
  
  var _role: js.UndefOr[Element] = js.undefined
  
  /**
    * Display for the organization.
    */
  var affiliation: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the organization.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Role within the organization, such as professional title.
    */
  var role: js.UndefOr[String] = js.undefined
}
object CitationCitedArtifactContributorshipEntryAffiliationInfo {
  
  inline def apply(): CitationCitedArtifactContributorshipEntryAffiliationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactContributorshipEntryAffiliationInfo]
  }
  
  extension [Self <: CitationCitedArtifactContributorshipEntryAffiliationInfo](x: Self) {
    
    inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def set_affiliation(value: Element): Self = StObject.set(x, "_affiliation", value.asInstanceOf[js.Any])
    
    inline def set_affiliationUndefined: Self = StObject.set(x, "_affiliation", js.undefined)
    
    inline def set_role(value: Element): Self = StObject.set(x, "_role", value.asInstanceOf[js.Any])
    
    inline def set_roleUndefined: Self = StObject.set(x, "_role", js.undefined)
  }
}
