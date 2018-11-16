package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Datafeed extends js.Object {
  /** The two-letter ISO 639-1 language in which the attributes are defined in the data feed. */
  var attributeLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [DEPRECATED] Please use target.language instead. The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for
               * targetCountry.
               */
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The type of data feed. For product inventory feeds, only feeds for local stores, not online stores, are supported. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** Fetch schedule for the feed file. */
  var fetchSchedule: js.UndefOr[DatafeedFetchSchedule] = js.undefined
  /** The filename of the feed. All feeds must have a unique file name. */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** Format of the feed file. */
  var format: js.UndefOr[DatafeedFormat] = js.undefined
  /** The ID of the data feed. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [DEPRECATED] Please use target.includedDestination instead. The list of intended destinations (corresponds to checked check boxes in Merchant Center). */
  var intendedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeed". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A descriptive name of the data feed. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [DEPRECATED] Please use target.country instead. The country where the items in the feed will be included in the search index, represented as a CLDR
               * territory code.
               */
  var targetCountry: js.UndefOr[java.lang.String] = js.undefined
  /** The targets this feed should apply to (country, language, destinations). */
  var targets: js.UndefOr[js.Array[DatafeedTarget]] = js.undefined
}

