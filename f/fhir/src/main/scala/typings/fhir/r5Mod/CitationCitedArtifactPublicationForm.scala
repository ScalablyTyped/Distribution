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
  
  var _lastPage: js.UndefOr[Element] = js.undefined
  
  var _lastRevisionDate: js.UndefOr[Element] = js.undefined
  
  var _pageCount: js.UndefOr[Element] = js.undefined
  
  var _pageString: js.UndefOr[Element] = js.undefined
  
  /**
    * Entry number or identifier for inclusion in a database.
    */
  var accessionNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The date the article was added to the database, or the date the article was released (which may differ from the journal issue publication date).
    */
  var articleDate: js.UndefOr[String] = js.undefined
  
  /**
    * Copyright notice for the full article or artifact.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Used for isolated representation of first page.
    */
  var firstPage: js.UndefOr[String] = js.undefined
  
  /**
    * Language is provided to support indexing and accessibility (typically, services such as text to speech use the language tag). The html language tag in the narrative applies  to the narrative. The language tag on the resource may be used to specify the language of other presentations generated from the data in the resource. Not all the content has to be in the base language. The Resource.language should not be assumed to apply to the narrative automatically. If a language is specified, it should it also be specified on the div element in the html (see rules in HTML5 for information about the relationship between xml:lang and the html lang attribute).
    */
  var language: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Used for isolated representation of last page.
    */
  var lastPage: js.UndefOr[String] = js.undefined
  
  /**
    * The date the article was last revised or updated in the database.
    */
  var lastRevisionDate: js.UndefOr[String] = js.undefined
  
  /**
    * Actual or approximate number of pages or screens.
    */
  var pageCount: js.UndefOr[String] = js.undefined
  
  /**
    * Used for full display of pagination.
    */
  var pageString: js.UndefOr[String] = js.undefined
  
  /**
    * The specific issue in which the cited article resides.
    */
  var periodicRelease: js.UndefOr[CitationCitedArtifactPublicationFormPeriodicRelease] = js.undefined
  
  /**
    * The collection the cited article or artifact is published in.
    */
  var publishedIn: js.UndefOr[CitationCitedArtifactPublicationFormPublishedIn] = js.undefined
}
object CitationCitedArtifactPublicationForm {
  
  inline def apply(): CitationCitedArtifactPublicationForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactPublicationForm]
  }
  
  extension [Self <: CitationCitedArtifactPublicationForm](x: Self) {
    
    inline def setAccessionNumber(value: String): Self = StObject.set(x, "accessionNumber", value.asInstanceOf[js.Any])
    
    inline def setAccessionNumberUndefined: Self = StObject.set(x, "accessionNumber", js.undefined)
    
    inline def setArticleDate(value: String): Self = StObject.set(x, "articleDate", value.asInstanceOf[js.Any])
    
    inline def setArticleDateUndefined: Self = StObject.set(x, "articleDate", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setFirstPage(value: String): Self = StObject.set(x, "firstPage", value.asInstanceOf[js.Any])
    
    inline def setFirstPageUndefined: Self = StObject.set(x, "firstPage", js.undefined)
    
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
    
    inline def setPeriodicRelease(value: CitationCitedArtifactPublicationFormPeriodicRelease): Self = StObject.set(x, "periodicRelease", value.asInstanceOf[js.Any])
    
    inline def setPeriodicReleaseUndefined: Self = StObject.set(x, "periodicRelease", js.undefined)
    
    inline def setPublishedIn(value: CitationCitedArtifactPublicationFormPublishedIn): Self = StObject.set(x, "publishedIn", value.asInstanceOf[js.Any])
    
    inline def setPublishedInUndefined: Self = StObject.set(x, "publishedIn", js.undefined)
    
    inline def set_accessionNumber(value: Element): Self = StObject.set(x, "_accessionNumber", value.asInstanceOf[js.Any])
    
    inline def set_accessionNumberUndefined: Self = StObject.set(x, "_accessionNumber", js.undefined)
    
    inline def set_articleDate(value: Element): Self = StObject.set(x, "_articleDate", value.asInstanceOf[js.Any])
    
    inline def set_articleDateUndefined: Self = StObject.set(x, "_articleDate", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_firstPage(value: Element): Self = StObject.set(x, "_firstPage", value.asInstanceOf[js.Any])
    
    inline def set_firstPageUndefined: Self = StObject.set(x, "_firstPage", js.undefined)
    
    inline def set_lastPage(value: Element): Self = StObject.set(x, "_lastPage", value.asInstanceOf[js.Any])
    
    inline def set_lastPageUndefined: Self = StObject.set(x, "_lastPage", js.undefined)
    
    inline def set_lastRevisionDate(value: Element): Self = StObject.set(x, "_lastRevisionDate", value.asInstanceOf[js.Any])
    
    inline def set_lastRevisionDateUndefined: Self = StObject.set(x, "_lastRevisionDate", js.undefined)
    
    inline def set_pageCount(value: Element): Self = StObject.set(x, "_pageCount", value.asInstanceOf[js.Any])
    
    inline def set_pageCountUndefined: Self = StObject.set(x, "_pageCount", js.undefined)
    
    inline def set_pageString(value: Element): Self = StObject.set(x, "_pageString", value.asInstanceOf[js.Any])
    
    inline def set_pageStringUndefined: Self = StObject.set(x, "_pageString", js.undefined)
  }
}
