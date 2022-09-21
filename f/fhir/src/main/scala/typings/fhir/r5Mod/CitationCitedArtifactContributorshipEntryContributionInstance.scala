package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactContributorshipEntryContributionInstance
  extends StObject
     with BackboneElement {
  
  var _time: js.UndefOr[Element] = js.undefined
  
  /**
    * The time that the contribution was made.
    */
  var time: js.UndefOr[String] = js.undefined
  
  /**
    * The specific contribution.
    */
  var `type`: CodeableConcept
}
object CitationCitedArtifactContributorshipEntryContributionInstance {
  
  inline def apply(`type`: CodeableConcept): CitationCitedArtifactContributorshipEntryContributionInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationCitedArtifactContributorshipEntryContributionInstance]
  }
  
  extension [Self <: CitationCitedArtifactContributorshipEntryContributionInstance](x: Self) {
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    inline def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
  }
}
