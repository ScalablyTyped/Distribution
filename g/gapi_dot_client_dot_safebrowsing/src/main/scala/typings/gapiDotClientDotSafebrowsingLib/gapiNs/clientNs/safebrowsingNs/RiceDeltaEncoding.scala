package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RiceDeltaEncoding extends js.Object {
  /** The encoded deltas that are encoded using the Golomb-Rice coder. */
  var encodedData: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The offset of the first entry in the encoded data, or, if only a single
               * integer was encoded, that single integer's value.
               */
  var firstValue: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The number of entries that are delta encoded in the encoded data. If only a
               * single integer was encoded, this will be zero and the single value will be
               * stored in `first_value`.
               */
  var numEntries: js.UndefOr[scala.Double] = js.undefined
  /**
               * The Golomb-Rice parameter, which is a number between 2 and 28. This field
               * is missing (that is, zero) if `num_entries` is zero.
               */
  var riceParameter: js.UndefOr[scala.Double] = js.undefined
}

