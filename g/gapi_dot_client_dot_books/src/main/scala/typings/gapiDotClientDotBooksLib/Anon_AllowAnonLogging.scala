package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowAnonLogging extends js.Object {
  /** Whether anonymous logging should be allowed. */
  var allowAnonLogging: js.UndefOr[scala.Boolean] = js.undefined
  /** The names of the authors and/or editors for this volume. (In LITE projection) */
  var authors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The mean review rating for this volume. (min = 1.0, max = 5.0) */
  var averageRating: js.UndefOr[scala.Double] = js.undefined
  /** Canonical URL for a volume. (In LITE projection.) */
  var canonicalVolumeLink: js.UndefOr[java.lang.String] = js.undefined
  /** A list of subject categories, such as "Fiction", "Suspense", etc. */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** An identifier for the version of the volume content (text & images). (In LITE projection) */
  var contentVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A synopsis of the volume. The text of the description is formatted in HTML and includes simple formatting elements, such as b, i, and br tags. (In LITE
    * projection.)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Physical dimensions of this volume. */
  var dimensions: js.UndefOr[Anon_Height] = js.undefined
  /** A list of image links for all the sizes that are available. (In LITE projection.) */
  var imageLinks: js.UndefOr[Anon_ExtraLarge] = js.undefined
  /** Industry standard identifiers for this volume. */
  var industryIdentifiers: js.UndefOr[js.Array[Anon_Identifier]] = js.undefined
  /** URL to view information about this volume on the Google Books site. (In LITE projection) */
  var infoLink: js.UndefOr[java.lang.String] = js.undefined
  /** Best language for this volume (based on content). It is the two-letter ISO 639-1 code such as 'fr', 'en', etc. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The main category to which this volume belongs. It will be the category from the categories list returned below that has the highest weight. */
  var mainCategory: js.UndefOr[java.lang.String] = js.undefined
  var maturityRating: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of pages as per publisher metadata. */
  var pageCount: js.UndefOr[scala.Double] = js.undefined
  /** A top-level summary of the panelization info in this volume. */
  var panelizationSummary: js.UndefOr[Anon_ContainsEpubBubbles] = js.undefined
  /** URL to preview this volume on the Google Books site. */
  var previewLink: js.UndefOr[java.lang.String] = js.undefined
  /** Type of publication of this volume. Possible values are BOOK or MAGAZINE. */
  var printType: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of printed pages in generated pdf representation. */
  var printedPageCount: js.UndefOr[scala.Double] = js.undefined
  /** Date of publication. (In LITE projection.) */
  var publishedDate: js.UndefOr[java.lang.String] = js.undefined
  /** Publisher of this volume. (In LITE projection.) */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /** The number of review ratings for this volume. */
  var ratingsCount: js.UndefOr[scala.Double] = js.undefined
  /** The reading modes available for this volume. */
  var readingModes: js.UndefOr[js.Any] = js.undefined
  /** Total number of sample pages as per publisher metadata. */
  var samplePageCount: js.UndefOr[scala.Double] = js.undefined
  var seriesInfo: js.UndefOr[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.Volumeseriesinfo] = js.undefined
  /** Volume subtitle. (In LITE projection.) */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /** Volume title. (In LITE projection.) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AllowAnonLogging {
  @scala.inline
  def apply(
    allowAnonLogging: js.UndefOr[scala.Boolean] = js.undefined,
    authors: js.Array[java.lang.String] = null,
    averageRating: scala.Int | scala.Double = null,
    canonicalVolumeLink: java.lang.String = null,
    categories: js.Array[java.lang.String] = null,
    contentVersion: java.lang.String = null,
    description: java.lang.String = null,
    dimensions: Anon_Height = null,
    imageLinks: Anon_ExtraLarge = null,
    industryIdentifiers: js.Array[Anon_Identifier] = null,
    infoLink: java.lang.String = null,
    language: java.lang.String = null,
    mainCategory: java.lang.String = null,
    maturityRating: java.lang.String = null,
    pageCount: scala.Int | scala.Double = null,
    panelizationSummary: Anon_ContainsEpubBubbles = null,
    previewLink: java.lang.String = null,
    printType: java.lang.String = null,
    printedPageCount: scala.Int | scala.Double = null,
    publishedDate: java.lang.String = null,
    publisher: java.lang.String = null,
    ratingsCount: scala.Int | scala.Double = null,
    readingModes: js.Any = null,
    samplePageCount: scala.Int | scala.Double = null,
    seriesInfo: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.Volumeseriesinfo = null,
    subtitle: java.lang.String = null,
    title: java.lang.String = null
  ): Anon_AllowAnonLogging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnonLogging)) __obj.updateDynamic("allowAnonLogging")(allowAnonLogging)
    if (authors != null) __obj.updateDynamic("authors")(authors)
    if (averageRating != null) __obj.updateDynamic("averageRating")(averageRating.asInstanceOf[js.Any])
    if (canonicalVolumeLink != null) __obj.updateDynamic("canonicalVolumeLink")(canonicalVolumeLink)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (imageLinks != null) __obj.updateDynamic("imageLinks")(imageLinks)
    if (industryIdentifiers != null) __obj.updateDynamic("industryIdentifiers")(industryIdentifiers)
    if (infoLink != null) __obj.updateDynamic("infoLink")(infoLink)
    if (language != null) __obj.updateDynamic("language")(language)
    if (mainCategory != null) __obj.updateDynamic("mainCategory")(mainCategory)
    if (maturityRating != null) __obj.updateDynamic("maturityRating")(maturityRating)
    if (pageCount != null) __obj.updateDynamic("pageCount")(pageCount.asInstanceOf[js.Any])
    if (panelizationSummary != null) __obj.updateDynamic("panelizationSummary")(panelizationSummary)
    if (previewLink != null) __obj.updateDynamic("previewLink")(previewLink)
    if (printType != null) __obj.updateDynamic("printType")(printType)
    if (printedPageCount != null) __obj.updateDynamic("printedPageCount")(printedPageCount.asInstanceOf[js.Any])
    if (publishedDate != null) __obj.updateDynamic("publishedDate")(publishedDate)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (ratingsCount != null) __obj.updateDynamic("ratingsCount")(ratingsCount.asInstanceOf[js.Any])
    if (readingModes != null) __obj.updateDynamic("readingModes")(readingModes)
    if (samplePageCount != null) __obj.updateDynamic("samplePageCount")(samplePageCount.asInstanceOf[js.Any])
    if (seriesInfo != null) __obj.updateDynamic("seriesInfo")(seriesInfo)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_AllowAnonLogging]
  }
}

