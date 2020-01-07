package typings.googleapis

import typings.googleapis.buildSrcApisBooksV1Mod.books_v1.Schema$Volumeseriesinfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AllowAnonLogging extends js.Object {
  var allowAnonLogging: js.UndefOr[Boolean] = js.native
  var authors: js.UndefOr[js.Array[String]] = js.native
  var averageRating: js.UndefOr[Double] = js.native
  var canonicalVolumeLink: js.UndefOr[String] = js.native
  var categories: js.UndefOr[js.Array[String]] = js.native
  var comicsContent: js.UndefOr[Boolean] = js.native
  var contentVersion: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var dimensions: js.UndefOr[Anon_HeightThickness] = js.native
  var imageLinks: js.UndefOr[Anon_ExtraLarge] = js.native
  var industryIdentifiers: js.UndefOr[js.Array[Anon_Identifier]] = js.native
  var infoLink: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var mainCategory: js.UndefOr[String] = js.native
  var maturityRating: js.UndefOr[String] = js.native
  var pageCount: js.UndefOr[Double] = js.native
  var panelizationSummary: js.UndefOr[Anon_ContainsEpubBubbles] = js.native
  var previewLink: js.UndefOr[String] = js.native
  var printType: js.UndefOr[String] = js.native
  var printedPageCount: js.UndefOr[Double] = js.native
  var publishedDate: js.UndefOr[String] = js.native
  var publisher: js.UndefOr[String] = js.native
  var ratingsCount: js.UndefOr[Double] = js.native
  var readingModes: js.UndefOr[js.Any] = js.native
  var samplePageCount: js.UndefOr[Double] = js.native
  var seriesInfo: js.UndefOr[Schema$Volumeseriesinfo] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Anon_AllowAnonLogging {
  @scala.inline
  def apply(
    allowAnonLogging: js.UndefOr[Boolean] = js.undefined,
    authors: js.Array[String] = null,
    averageRating: Int | Double = null,
    canonicalVolumeLink: String = null,
    categories: js.Array[String] = null,
    comicsContent: js.UndefOr[Boolean] = js.undefined,
    contentVersion: String = null,
    description: String = null,
    dimensions: Anon_HeightThickness = null,
    imageLinks: Anon_ExtraLarge = null,
    industryIdentifiers: js.Array[Anon_Identifier] = null,
    infoLink: String = null,
    language: String = null,
    mainCategory: String = null,
    maturityRating: String = null,
    pageCount: Int | Double = null,
    panelizationSummary: Anon_ContainsEpubBubbles = null,
    previewLink: String = null,
    printType: String = null,
    printedPageCount: Int | Double = null,
    publishedDate: String = null,
    publisher: String = null,
    ratingsCount: Int | Double = null,
    readingModes: js.Any = null,
    samplePageCount: Int | Double = null,
    seriesInfo: Schema$Volumeseriesinfo = null,
    subtitle: String = null,
    title: String = null
  ): Anon_AllowAnonLogging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnonLogging)) __obj.updateDynamic("allowAnonLogging")(allowAnonLogging.asInstanceOf[js.Any])
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (averageRating != null) __obj.updateDynamic("averageRating")(averageRating.asInstanceOf[js.Any])
    if (canonicalVolumeLink != null) __obj.updateDynamic("canonicalVolumeLink")(canonicalVolumeLink.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(comicsContent)) __obj.updateDynamic("comicsContent")(comicsContent.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (imageLinks != null) __obj.updateDynamic("imageLinks")(imageLinks.asInstanceOf[js.Any])
    if (industryIdentifiers != null) __obj.updateDynamic("industryIdentifiers")(industryIdentifiers.asInstanceOf[js.Any])
    if (infoLink != null) __obj.updateDynamic("infoLink")(infoLink.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (mainCategory != null) __obj.updateDynamic("mainCategory")(mainCategory.asInstanceOf[js.Any])
    if (maturityRating != null) __obj.updateDynamic("maturityRating")(maturityRating.asInstanceOf[js.Any])
    if (pageCount != null) __obj.updateDynamic("pageCount")(pageCount.asInstanceOf[js.Any])
    if (panelizationSummary != null) __obj.updateDynamic("panelizationSummary")(panelizationSummary.asInstanceOf[js.Any])
    if (previewLink != null) __obj.updateDynamic("previewLink")(previewLink.asInstanceOf[js.Any])
    if (printType != null) __obj.updateDynamic("printType")(printType.asInstanceOf[js.Any])
    if (printedPageCount != null) __obj.updateDynamic("printedPageCount")(printedPageCount.asInstanceOf[js.Any])
    if (publishedDate != null) __obj.updateDynamic("publishedDate")(publishedDate.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (ratingsCount != null) __obj.updateDynamic("ratingsCount")(ratingsCount.asInstanceOf[js.Any])
    if (readingModes != null) __obj.updateDynamic("readingModes")(readingModes.asInstanceOf[js.Any])
    if (samplePageCount != null) __obj.updateDynamic("samplePageCount")(samplePageCount.asInstanceOf[js.Any])
    if (seriesInfo != null) __obj.updateDynamic("seriesInfo")(seriesInfo.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowAnonLogging]
  }
}

