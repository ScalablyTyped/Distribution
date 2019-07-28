package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datafeed extends js.Object {
  /** The two-letter ISO 639-1 language in which the attributes are defined in the data feed. */
  var attributeLanguage: js.UndefOr[String] = js.undefined
  /**
    * [DEPRECATED] Please use target.language instead. The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for
    * targetCountry.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  /** The type of data feed. For product inventory feeds, only feeds for local stores, not online stores, are supported. */
  var contentType: js.UndefOr[String] = js.undefined
  /** Fetch schedule for the feed file. */
  var fetchSchedule: js.UndefOr[DatafeedFetchSchedule] = js.undefined
  /** The filename of the feed. All feeds must have a unique file name. */
  var fileName: js.UndefOr[String] = js.undefined
  /** Format of the feed file. */
  var format: js.UndefOr[DatafeedFormat] = js.undefined
  /** The ID of the data feed. */
  var id: js.UndefOr[String] = js.undefined
  /** [DEPRECATED] Please use target.includedDestination instead. The list of intended destinations (corresponds to checked check boxes in Merchant Center). */
  var intendedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeed". */
  var kind: js.UndefOr[String] = js.undefined
  /** A descriptive name of the data feed. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * [DEPRECATED] Please use target.country instead. The country where the items in the feed will be included in the search index, represented as a CLDR
    * territory code.
    */
  var targetCountry: js.UndefOr[String] = js.undefined
  /** The targets this feed should apply to (country, language, destinations). */
  var targets: js.UndefOr[js.Array[DatafeedTarget]] = js.undefined
}

object Datafeed {
  @scala.inline
  def apply(
    attributeLanguage: String = null,
    contentLanguage: String = null,
    contentType: String = null,
    fetchSchedule: DatafeedFetchSchedule = null,
    fileName: String = null,
    format: DatafeedFormat = null,
    id: String = null,
    intendedDestinations: js.Array[String] = null,
    kind: String = null,
    name: String = null,
    targetCountry: String = null,
    targets: js.Array[DatafeedTarget] = null
  ): Datafeed = {
    val __obj = js.Dynamic.literal()
    if (attributeLanguage != null) __obj.updateDynamic("attributeLanguage")(attributeLanguage)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (fetchSchedule != null) __obj.updateDynamic("fetchSchedule")(fetchSchedule)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (intendedDestinations != null) __obj.updateDynamic("intendedDestinations")(intendedDestinations)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[Datafeed]
  }
}

