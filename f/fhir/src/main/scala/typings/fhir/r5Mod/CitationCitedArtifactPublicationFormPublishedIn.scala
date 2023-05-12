package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactPublicationFormPublishedIn
  extends StObject
     with BackboneElement {
  
  var _publisherLocation: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Journal identifiers include ISSN, ISO Abbreviation and NLMuniqueID; Book identifiers include ISBN.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Name of or resource describing the publisher.
    */
  var publisher: js.UndefOr[Reference] = js.undefined
  
  /**
    * Geographic location of the publisher.
    */
  var publisherLocation: js.UndefOr[String] = js.undefined
  
  /**
    * ClinicalTrials.gov is a name of a database.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Journals and newspapers are coded as Periodical.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object CitationCitedArtifactPublicationFormPublishedIn {
  
  inline def apply(): CitationCitedArtifactPublicationFormPublishedIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactPublicationFormPublishedIn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactPublicationFormPublishedIn] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPublisher(value: Reference): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherLocation(value: String): Self = StObject.set(x, "publisherLocation", value.asInstanceOf[js.Any])
    
    inline def setPublisherLocationUndefined: Self = StObject.set(x, "publisherLocation", js.undefined)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_publisherLocation(value: Element): Self = StObject.set(x, "_publisherLocation", value.asInstanceOf[js.Any])
    
    inline def set_publisherLocationUndefined: Self = StObject.set(x, "_publisherLocation", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
