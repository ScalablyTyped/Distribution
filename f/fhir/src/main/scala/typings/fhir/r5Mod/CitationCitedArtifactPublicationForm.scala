package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactPublicationForm
  extends StObject
     with BackboneElement {
  
  var _accessionNumber: js.UndefOr[Element] = js.undefined
  
  var _articleDate: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _firstPage: js.UndefOr[Element] = js.undefined
  
  var _issue: js.UndefOr[Element] = js.undefined
  
  var _lastPage: js.UndefOr[Element] = js.undefined
  
  var _lastRevisionDate: js.UndefOr[Element] = js.undefined
  
  var _pageCount: js.UndefOr[Element] = js.undefined
  
  var _pageString: js.UndefOr[Element] = js.undefined
  
  var _publicationDateSeason: js.UndefOr[Element] = js.undefined
  
  var _publicationDateText: js.UndefOr[Element] = js.undefined
  
  var _volume: js.UndefOr[Element] = js.undefined
  
  /**
    * Accession numbers may be used instead of or in addition to page numbers.  Accession numbers are functionally identifiers when coupled with the identity of the database for which they are accession numbers. Accession numbers which are used for indexing citations in a dataset of citations should NOT be entered in Citation.citedArtifact.publicationForm.accessionNumber -- this use would be a type of Citation.identifier for the citation record itself.
    */
  var accessionNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The articleDate is the preferred element for expressing the publication date as structured data.
    */
  var articleDate: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the form of the medium cited. Common codes are "Internet" or "Print". The CitedMedium value set has 6 codes. The codes internet, print, and offline-digital-storage are the common codes for a typical publication form, though internet and print are more common for study citations. Three additional codes (each appending one of the primary codes with "-without-issue" are used for situations when a study is published both within an issue (of a periodical release as commonly done for journals) AND is published separately from the issue (as commonly done with early online publication), to represent specific identification of the publication form not associated with the issue.
    */
  var citedMedium: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * It is possible that different publication forms have different copyright notices.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Used for isolated representation of first page.
    */
  var firstPage: js.UndefOr[String] = js.undefined
  
  /**
    * Issue, part or supplement of journal or other collection in which the article is published.
    */
  var issue: js.UndefOr[String] = js.undefined
  
  /**
    * The language or languages in which this form of the article is published.
    */
  var language: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Used for isolated representation of last page.
    */
  var lastPage: js.UndefOr[String] = js.undefined
  
  /**
    * The lastRevisionDate is used for the cited article and not the date the Citation Resource is last revised.
    */
  var lastRevisionDate: js.UndefOr[String] = js.undefined
  
  /**
    * Actual or approximate number of pages or screens. Distinct from reporting the page numbers.
    */
  var pageCount: js.UndefOr[String] = js.undefined
  
  /**
    * Used for full display of pagination.
    */
  var pageString: js.UndefOr[String] = js.undefined
  
  /**
    * Spring, Summer, Fall/Autumn, Winter.
    */
  var publicationDateSeason: js.UndefOr[String] = js.undefined
  
  /**
    * The publicationDateText element is prefererntially used when a date is not represented in a form that can be handled as structured data in other elements.
    */
  var publicationDateText: js.UndefOr[String] = js.undefined
  
  /**
    * The collection the cited article or artifact is published in.
    */
  var publishedIn: js.UndefOr[CitationCitedArtifactPublicationFormPublishedIn] = js.undefined
  
  /**
    * Volume number of journal or other collection in which the article is published.
    */
  var volume: js.UndefOr[String] = js.undefined
}
object CitationCitedArtifactPublicationForm {
  
  inline def apply(): CitationCitedArtifactPublicationForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactPublicationForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactPublicationForm] (val x: Self) extends AnyVal {
    
    inline def setAccessionNumber(value: String): Self = StObject.set(x, "accessionNumber", value.asInstanceOf[js.Any])
    
    inline def setAccessionNumberUndefined: Self = StObject.set(x, "accessionNumber", js.undefined)
    
    inline def setArticleDate(value: String): Self = StObject.set(x, "articleDate", value.asInstanceOf[js.Any])
    
    inline def setArticleDateUndefined: Self = StObject.set(x, "articleDate", js.undefined)
    
    inline def setCitedMedium(value: CodeableConcept): Self = StObject.set(x, "citedMedium", value.asInstanceOf[js.Any])
    
    inline def setCitedMediumUndefined: Self = StObject.set(x, "citedMedium", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setFirstPage(value: String): Self = StObject.set(x, "firstPage", value.asInstanceOf[js.Any])
    
    inline def setFirstPageUndefined: Self = StObject.set(x, "firstPage", js.undefined)
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setLanguage(value: js.Array[CodeableConcept]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLanguageVarargs(value: CodeableConcept*): Self = StObject.set(x, "language", js.Array(value*))
    
    inline def setLastPage(value: String): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
    
    inline def setLastPageUndefined: Self = StObject.set(x, "lastPage", js.undefined)
    
    inline def setLastRevisionDate(value: String): Self = StObject.set(x, "lastRevisionDate", value.asInstanceOf[js.Any])
    
    inline def setLastRevisionDateUndefined: Self = StObject.set(x, "lastRevisionDate", js.undefined)
    
    inline def setPageCount(value: String): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    inline def setPageString(value: String): Self = StObject.set(x, "pageString", value.asInstanceOf[js.Any])
    
    inline def setPageStringUndefined: Self = StObject.set(x, "pageString", js.undefined)
    
    inline def setPublicationDateSeason(value: String): Self = StObject.set(x, "publicationDateSeason", value.asInstanceOf[js.Any])
    
    inline def setPublicationDateSeasonUndefined: Self = StObject.set(x, "publicationDateSeason", js.undefined)
    
    inline def setPublicationDateText(value: String): Self = StObject.set(x, "publicationDateText", value.asInstanceOf[js.Any])
    
    inline def setPublicationDateTextUndefined: Self = StObject.set(x, "publicationDateText", js.undefined)
    
    inline def setPublishedIn(value: CitationCitedArtifactPublicationFormPublishedIn): Self = StObject.set(x, "publishedIn", value.asInstanceOf[js.Any])
    
    inline def setPublishedInUndefined: Self = StObject.set(x, "publishedIn", js.undefined)
    
    inline def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    inline def set_accessionNumber(value: Element): Self = StObject.set(x, "_accessionNumber", value.asInstanceOf[js.Any])
    
    inline def set_accessionNumberUndefined: Self = StObject.set(x, "_accessionNumber", js.undefined)
    
    inline def set_articleDate(value: Element): Self = StObject.set(x, "_articleDate", value.asInstanceOf[js.Any])
    
    inline def set_articleDateUndefined: Self = StObject.set(x, "_articleDate", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_firstPage(value: Element): Self = StObject.set(x, "_firstPage", value.asInstanceOf[js.Any])
    
    inline def set_firstPageUndefined: Self = StObject.set(x, "_firstPage", js.undefined)
    
    inline def set_issue(value: Element): Self = StObject.set(x, "_issue", value.asInstanceOf[js.Any])
    
    inline def set_issueUndefined: Self = StObject.set(x, "_issue", js.undefined)
    
    inline def set_lastPage(value: Element): Self = StObject.set(x, "_lastPage", value.asInstanceOf[js.Any])
    
    inline def set_lastPageUndefined: Self = StObject.set(x, "_lastPage", js.undefined)
    
    inline def set_lastRevisionDate(value: Element): Self = StObject.set(x, "_lastRevisionDate", value.asInstanceOf[js.Any])
    
    inline def set_lastRevisionDateUndefined: Self = StObject.set(x, "_lastRevisionDate", js.undefined)
    
    inline def set_pageCount(value: Element): Self = StObject.set(x, "_pageCount", value.asInstanceOf[js.Any])
    
    inline def set_pageCountUndefined: Self = StObject.set(x, "_pageCount", js.undefined)
    
    inline def set_pageString(value: Element): Self = StObject.set(x, "_pageString", value.asInstanceOf[js.Any])
    
    inline def set_pageStringUndefined: Self = StObject.set(x, "_pageString", js.undefined)
    
    inline def set_publicationDateSeason(value: Element): Self = StObject.set(x, "_publicationDateSeason", value.asInstanceOf[js.Any])
    
    inline def set_publicationDateSeasonUndefined: Self = StObject.set(x, "_publicationDateSeason", js.undefined)
    
    inline def set_publicationDateText(value: Element): Self = StObject.set(x, "_publicationDateText", value.asInstanceOf[js.Any])
    
    inline def set_publicationDateTextUndefined: Self = StObject.set(x, "_publicationDateText", js.undefined)
    
    inline def set_volume(value: Element): Self = StObject.set(x, "_volume", value.asInstanceOf[js.Any])
    
    inline def set_volumeUndefined: Self = StObject.set(x, "_volume", js.undefined)
  }
}
