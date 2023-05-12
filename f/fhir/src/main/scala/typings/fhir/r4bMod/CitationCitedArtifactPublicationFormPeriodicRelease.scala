package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactPublicationFormPeriodicRelease
  extends StObject
     with BackboneElement {
  
  var _issue: js.UndefOr[Element] = js.undefined
  
  var _volume: js.UndefOr[Element] = js.undefined
  
  /**
    * National Library of Medicine uses the codes "Internet" or "Print".
    */
  var citedMedium: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Defining the date on which the issue of the journal was published.
    */
  var dateOfPublication: js.UndefOr[CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication] = js.undefined
  
  /**
    * Issue, part or supplement of journal in which the article is published.
    */
  var issue: js.UndefOr[String] = js.undefined
  
  /**
    * Volume number of journal in which the article is published.
    */
  var volume: js.UndefOr[String] = js.undefined
}
object CitationCitedArtifactPublicationFormPeriodicRelease {
  
  inline def apply(): CitationCitedArtifactPublicationFormPeriodicRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactPublicationFormPeriodicRelease]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactPublicationFormPeriodicRelease] (val x: Self) extends AnyVal {
    
    inline def setCitedMedium(value: CodeableConcept): Self = StObject.set(x, "citedMedium", value.asInstanceOf[js.Any])
    
    inline def setCitedMediumUndefined: Self = StObject.set(x, "citedMedium", js.undefined)
    
    inline def setDateOfPublication(value: CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication): Self = StObject.set(x, "dateOfPublication", value.asInstanceOf[js.Any])
    
    inline def setDateOfPublicationUndefined: Self = StObject.set(x, "dateOfPublication", js.undefined)
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    inline def set_issue(value: Element): Self = StObject.set(x, "_issue", value.asInstanceOf[js.Any])
    
    inline def set_issueUndefined: Self = StObject.set(x, "_issue", js.undefined)
    
    inline def set_volume(value: Element): Self = StObject.set(x, "_volume", value.asInstanceOf[js.Any])
    
    inline def set_volumeUndefined: Self = StObject.set(x, "_volume", js.undefined)
  }
}
