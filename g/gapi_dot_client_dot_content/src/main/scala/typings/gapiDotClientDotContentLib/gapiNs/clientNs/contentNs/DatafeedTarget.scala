package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedTarget extends js.Object {
  /** The country where the items in the feed will be included in the search index, represented as a  CLDR territory code. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The list of destinations to exclude for this target (corresponds to unchecked check boxes in Merchant Center). */
  var excludedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The list of destinations to include for this target (corresponds to checked check boxes in Merchant Center). Default destinations are always included
    * unless provided in the excluded_destination field.
    */
  var includedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for targets[].country. */
  var language: js.UndefOr[java.lang.String] = js.undefined
}

