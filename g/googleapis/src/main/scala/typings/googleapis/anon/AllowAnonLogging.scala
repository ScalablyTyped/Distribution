package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaVolumeseriesinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowAnonLogging extends StObject {
  
  var allowAnonLogging: js.UndefOr[Boolean] = js.native
  
  var authors: js.UndefOr[js.Array[String]] = js.native
  
  var averageRating: js.UndefOr[Double] = js.native
  
  var canonicalVolumeLink: js.UndefOr[String] = js.native
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var comicsContent: js.UndefOr[Boolean] = js.native
  
  var contentVersion: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var dimensions: js.UndefOr[Thickness] = js.native
  
  var imageLinks: js.UndefOr[ExtraLarge] = js.native
  
  var industryIdentifiers: js.UndefOr[js.Array[Identifier]] = js.native
  
  var infoLink: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var mainCategory: js.UndefOr[String] = js.native
  
  var maturityRating: js.UndefOr[String] = js.native
  
  var pageCount: js.UndefOr[Double] = js.native
  
  var panelizationSummary: js.UndefOr[ContainsEpubBubbles] = js.native
  
  var previewLink: js.UndefOr[String] = js.native
  
  var printType: js.UndefOr[String] = js.native
  
  var printedPageCount: js.UndefOr[Double] = js.native
  
  var publishedDate: js.UndefOr[String] = js.native
  
  var publisher: js.UndefOr[String] = js.native
  
  var ratingsCount: js.UndefOr[Double] = js.native
  
  var readingModes: js.UndefOr[js.Any] = js.native
  
  var samplePageCount: js.UndefOr[Double] = js.native
  
  var seriesInfo: js.UndefOr[SchemaVolumeseriesinfo] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object AllowAnonLogging {
  
  @scala.inline
  def apply(): AllowAnonLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAnonLogging]
  }
  
  @scala.inline
  implicit class AllowAnonLoggingMutableBuilder[Self <: AllowAnonLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAnonLogging(value: Boolean): Self = StObject.set(x, "allowAnonLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAnonLoggingUndefined: Self = StObject.set(x, "allowAnonLogging", js.undefined)
    
    @scala.inline
    def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    @scala.inline
    def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value :_*))
    
    @scala.inline
    def setAverageRating(value: Double): Self = StObject.set(x, "averageRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageRatingUndefined: Self = StObject.set(x, "averageRating", js.undefined)
    
    @scala.inline
    def setCanonicalVolumeLink(value: String): Self = StObject.set(x, "canonicalVolumeLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalVolumeLinkUndefined: Self = StObject.set(x, "canonicalVolumeLink", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setComicsContent(value: Boolean): Self = StObject.set(x, "comicsContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComicsContentUndefined: Self = StObject.set(x, "comicsContent", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDimensions(value: Thickness): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setImageLinks(value: ExtraLarge): Self = StObject.set(x, "imageLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLinksUndefined: Self = StObject.set(x, "imageLinks", js.undefined)
    
    @scala.inline
    def setIndustryIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "industryIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndustryIdentifiersUndefined: Self = StObject.set(x, "industryIdentifiers", js.undefined)
    
    @scala.inline
    def setIndustryIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "industryIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setInfoLink(value: String): Self = StObject.set(x, "infoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoLinkUndefined: Self = StObject.set(x, "infoLink", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMainCategory(value: String): Self = StObject.set(x, "mainCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainCategoryUndefined: Self = StObject.set(x, "mainCategory", js.undefined)
    
    @scala.inline
    def setMaturityRating(value: String): Self = StObject.set(x, "maturityRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaturityRatingUndefined: Self = StObject.set(x, "maturityRating", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    @scala.inline
    def setPanelizationSummary(value: ContainsEpubBubbles): Self = StObject.set(x, "panelizationSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelizationSummaryUndefined: Self = StObject.set(x, "panelizationSummary", js.undefined)
    
    @scala.inline
    def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewLinkUndefined: Self = StObject.set(x, "previewLink", js.undefined)
    
    @scala.inline
    def setPrintType(value: String): Self = StObject.set(x, "printType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintTypeUndefined: Self = StObject.set(x, "printType", js.undefined)
    
    @scala.inline
    def setPrintedPageCount(value: Double): Self = StObject.set(x, "printedPageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintedPageCountUndefined: Self = StObject.set(x, "printedPageCount", js.undefined)
    
    @scala.inline
    def setPublishedDate(value: String): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDateUndefined: Self = StObject.set(x, "publishedDate", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setRatingsCount(value: Double): Self = StObject.set(x, "ratingsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingsCountUndefined: Self = StObject.set(x, "ratingsCount", js.undefined)
    
    @scala.inline
    def setReadingModes(value: js.Any): Self = StObject.set(x, "readingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingModesUndefined: Self = StObject.set(x, "readingModes", js.undefined)
    
    @scala.inline
    def setSamplePageCount(value: Double): Self = StObject.set(x, "samplePageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplePageCountUndefined: Self = StObject.set(x, "samplePageCount", js.undefined)
    
    @scala.inline
    def setSeriesInfo(value: SchemaVolumeseriesinfo): Self = StObject.set(x, "seriesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesInfoUndefined: Self = StObject.set(x, "seriesInfo", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
