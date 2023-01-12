package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifact
  extends StObject
     with BackboneElement {
  
  var _dateAccessed: js.UndefOr[Element] = js.undefined
  
  /**
    * Summary of the article or artifact.
    */
  var `abstract`: js.UndefOr[js.Array[CitationCitedArtifactAbstract]] = js.undefined
  
  /**
    * The assignment to an organizing scheme.
    */
  var classification: js.UndefOr[js.Array[CitationCitedArtifactClassification]] = js.undefined
  
  /**
    * This element is used to list authors and other contributors, their contact information, specific contributions, and summary statements.
    */
  var contributorship: js.UndefOr[CitationCitedArtifactContributorship] = js.undefined
  
  /**
    * The status of the cited artifact.
    */
  var currentState: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * When the cited artifact was accessed.
    */
  var dateAccessed: js.UndefOr[String] = js.undefined
  
  /**
    * May include DOI, PMID, PMCID, etc. This element will contain unique identifiers that support de-duplication of citations. This identifier can be valid for only one citation resource.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Any additional information or content for the article or artifact.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The component of the article or artifact.
    */
  var part: js.UndefOr[CitationCitedArtifactPart] = js.undefined
  
  /**
    * A common use is a journal article with a publication date and pagination for a print version and a different publication date for the online version of the same article.
    */
  var publicationForm: js.UndefOr[js.Array[CitationCitedArtifactPublicationForm]] = js.undefined
  
  /**
    * May include trial registry identifiers, e.g. NCT04372602 from clinicaltrials.gov. This identifier can be valid for multiple citation resources.
    */
  var relatedIdentifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The artifact related to the cited artifact.
    */
  var relatesTo: js.UndefOr[js.Array[CitationCitedArtifactRelatesTo]] = js.undefined
  
  /**
    * An effective date or period for a status of the cited artifact.
    */
  var statusDate: js.UndefOr[js.Array[CitationCitedArtifactStatusDate]] = js.undefined
  
  /**
    * The title details of the article or artifact.
    */
  var title: js.UndefOr[js.Array[CitationCitedArtifactTitle]] = js.undefined
  
  /**
    * The defined version of the cited artifact.
    */
  var version: js.UndefOr[CitationCitedArtifactVersion] = js.undefined
  
  /**
    * Used for any URL for the article or artifact cited.
    */
  var webLocation: js.UndefOr[js.Array[CitationCitedArtifactWebLocation]] = js.undefined
}
object CitationCitedArtifact {
  
  inline def apply(): CitationCitedArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifact] (val x: Self) extends AnyVal {
    
    inline def setAbstract(value: js.Array[CitationCitedArtifactAbstract]): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    inline def setAbstractVarargs(value: CitationCitedArtifactAbstract*): Self = StObject.set(x, "abstract", js.Array(value*))
    
    inline def setClassification(value: js.Array[CitationCitedArtifactClassification]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setClassificationVarargs(value: CitationCitedArtifactClassification*): Self = StObject.set(x, "classification", js.Array(value*))
    
    inline def setContributorship(value: CitationCitedArtifactContributorship): Self = StObject.set(x, "contributorship", value.asInstanceOf[js.Any])
    
    inline def setContributorshipUndefined: Self = StObject.set(x, "contributorship", js.undefined)
    
    inline def setCurrentState(value: js.Array[CodeableConcept]): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setCurrentStateVarargs(value: CodeableConcept*): Self = StObject.set(x, "currentState", js.Array(value*))
    
    inline def setDateAccessed(value: String): Self = StObject.set(x, "dateAccessed", value.asInstanceOf[js.Any])
    
    inline def setDateAccessedUndefined: Self = StObject.set(x, "dateAccessed", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPart(value: CitationCitedArtifactPart): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPublicationForm(value: js.Array[CitationCitedArtifactPublicationForm]): Self = StObject.set(x, "publicationForm", value.asInstanceOf[js.Any])
    
    inline def setPublicationFormUndefined: Self = StObject.set(x, "publicationForm", js.undefined)
    
    inline def setPublicationFormVarargs(value: CitationCitedArtifactPublicationForm*): Self = StObject.set(x, "publicationForm", js.Array(value*))
    
    inline def setRelatedIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "relatedIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRelatedIdentifierUndefined: Self = StObject.set(x, "relatedIdentifier", js.undefined)
    
    inline def setRelatedIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "relatedIdentifier", js.Array(value*))
    
    inline def setRelatesTo(value: js.Array[CitationCitedArtifactRelatesTo]): Self = StObject.set(x, "relatesTo", value.asInstanceOf[js.Any])
    
    inline def setRelatesToUndefined: Self = StObject.set(x, "relatesTo", js.undefined)
    
    inline def setRelatesToVarargs(value: CitationCitedArtifactRelatesTo*): Self = StObject.set(x, "relatesTo", js.Array(value*))
    
    inline def setStatusDate(value: js.Array[CitationCitedArtifactStatusDate]): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusDateVarargs(value: CitationCitedArtifactStatusDate*): Self = StObject.set(x, "statusDate", js.Array(value*))
    
    inline def setTitle(value: js.Array[CitationCitedArtifactTitle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: CitationCitedArtifactTitle*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setVersion(value: CitationCitedArtifactVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWebLocation(value: js.Array[CitationCitedArtifactWebLocation]): Self = StObject.set(x, "webLocation", value.asInstanceOf[js.Any])
    
    inline def setWebLocationUndefined: Self = StObject.set(x, "webLocation", js.undefined)
    
    inline def setWebLocationVarargs(value: CitationCitedArtifactWebLocation*): Self = StObject.set(x, "webLocation", js.Array(value*))
    
    inline def set_dateAccessed(value: Element): Self = StObject.set(x, "_dateAccessed", value.asInstanceOf[js.Any])
    
    inline def set_dateAccessedUndefined: Self = StObject.set(x, "_dateAccessed", js.undefined)
  }
}
