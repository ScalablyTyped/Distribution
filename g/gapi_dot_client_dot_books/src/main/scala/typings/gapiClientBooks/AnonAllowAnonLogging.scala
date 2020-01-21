package typings.gapiClientBooks

import typings.gapiClientBooks.gapi.client.books.Volumeseriesinfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowAnonLogging extends js.Object {
  /** Whether anonymous logging should be allowed. */
  var allowAnonLogging: js.UndefOr[Boolean] = js.undefined
  /** The names of the authors and/or editors for this volume. (In LITE projection) */
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  /** The mean review rating for this volume. (min = 1.0, max = 5.0) */
  var averageRating: js.UndefOr[Double] = js.undefined
  /** Canonical URL for a volume. (In LITE projection.) */
  var canonicalVolumeLink: js.UndefOr[String] = js.undefined
  /** A list of subject categories, such as "Fiction", "Suspense", etc. */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /** An identifier for the version of the volume content (text & images). (In LITE projection) */
  var contentVersion: js.UndefOr[String] = js.undefined
  /**
    * A synopsis of the volume. The text of the description is formatted in HTML and includes simple formatting elements, such as b, i, and br tags. (In LITE
    * projection.)
    */
  var description: js.UndefOr[String] = js.undefined
  /** Physical dimensions of this volume. */
  var dimensions: js.UndefOr[AnonHeight] = js.undefined
  /** A list of image links for all the sizes that are available. (In LITE projection.) */
  var imageLinks: js.UndefOr[AnonExtraLarge] = js.undefined
  /** Industry standard identifiers for this volume. */
  var industryIdentifiers: js.UndefOr[js.Array[AnonIdentifier]] = js.undefined
  /** URL to view information about this volume on the Google Books site. (In LITE projection) */
  var infoLink: js.UndefOr[String] = js.undefined
  /** Best language for this volume (based on content). It is the two-letter ISO 639-1 code such as 'fr', 'en', etc. */
  var language: js.UndefOr[String] = js.undefined
  /** The main category to which this volume belongs. It will be the category from the categories list returned below that has the highest weight. */
  var mainCategory: js.UndefOr[String] = js.undefined
  var maturityRating: js.UndefOr[String] = js.undefined
  /** Total number of pages as per publisher metadata. */
  var pageCount: js.UndefOr[Double] = js.undefined
  /** A top-level summary of the panelization info in this volume. */
  var panelizationSummary: js.UndefOr[AnonContainsEpubBubbles] = js.undefined
  /** URL to preview this volume on the Google Books site. */
  var previewLink: js.UndefOr[String] = js.undefined
  /** Type of publication of this volume. Possible values are BOOK or MAGAZINE. */
  var printType: js.UndefOr[String] = js.undefined
  /** Total number of printed pages in generated pdf representation. */
  var printedPageCount: js.UndefOr[Double] = js.undefined
  /** Date of publication. (In LITE projection.) */
  var publishedDate: js.UndefOr[String] = js.undefined
  /** Publisher of this volume. (In LITE projection.) */
  var publisher: js.UndefOr[String] = js.undefined
  /** The number of review ratings for this volume. */
  var ratingsCount: js.UndefOr[Double] = js.undefined
  /** The reading modes available for this volume. */
  var readingModes: js.UndefOr[js.Any] = js.undefined
  /** Total number of sample pages as per publisher metadata. */
  var samplePageCount: js.UndefOr[Double] = js.undefined
  var seriesInfo: js.UndefOr[Volumeseriesinfo] = js.undefined
  /** Volume subtitle. (In LITE projection.) */
  var subtitle: js.UndefOr[String] = js.undefined
  /** Volume title. (In LITE projection.) */
  var title: js.UndefOr[String] = js.undefined
}

object AnonAllowAnonLogging {
  @scala.inline
  def apply(
    allowAnonLogging: js.UndefOr[Boolean] = js.undefined,
    authors: js.Array[String] = null,
    averageRating: Int | Double = null,
    canonicalVolumeLink: String = null,
    categories: js.Array[String] = null,
    contentVersion: String = null,
    description: String = null,
    dimensions: AnonHeight = null,
    imageLinks: AnonExtraLarge = null,
    industryIdentifiers: js.Array[AnonIdentifier] = null,
    infoLink: String = null,
    language: String = null,
    mainCategory: String = null,
    maturityRating: String = null,
    pageCount: Int | Double = null,
    panelizationSummary: AnonContainsEpubBubbles = null,
    previewLink: String = null,
    printType: String = null,
    printedPageCount: Int | Double = null,
    publishedDate: String = null,
    publisher: String = null,
    ratingsCount: Int | Double = null,
    readingModes: js.Any = null,
    samplePageCount: Int | Double = null,
    seriesInfo: Volumeseriesinfo = null,
    subtitle: String = null,
    title: String = null
  ): AnonAllowAnonLogging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnonLogging)) __obj.updateDynamic("allowAnonLogging")(allowAnonLogging.asInstanceOf[js.Any])
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (averageRating != null) __obj.updateDynamic("averageRating")(averageRating.asInstanceOf[js.Any])
    if (canonicalVolumeLink != null) __obj.updateDynamic("canonicalVolumeLink")(canonicalVolumeLink.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AnonAllowAnonLogging]
  }
}

