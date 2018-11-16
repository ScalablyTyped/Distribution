package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Metro extends js.Object {
  /** Country code of the country to which this metro region belongs. */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** DART ID of the country to which this metro region belongs. */
  var countryDartId: js.UndefOr[java.lang.String] = js.undefined
  /** DART ID of this metro region. */
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  /** DMA ID of this metro region. This is the ID used for targeting and generating reports, and is equivalent to metro_code. */
  var dmaId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#metro". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Metro code of this metro region. This is equivalent to dma_id. */
  var metroCode: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this metro region. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

