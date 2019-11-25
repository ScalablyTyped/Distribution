package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metro extends js.Object {
  /** Country code of the country to which this metro region belongs. */
  var countryCode: js.UndefOr[String] = js.undefined
  /** DART ID of the country to which this metro region belongs. */
  var countryDartId: js.UndefOr[String] = js.undefined
  /** DART ID of this metro region. */
  var dartId: js.UndefOr[String] = js.undefined
  /** DMA ID of this metro region. This is the ID used for targeting and generating reports, and is equivalent to metro_code. */
  var dmaId: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#metro". */
  var kind: js.UndefOr[String] = js.undefined
  /** Metro code of this metro region. This is equivalent to dma_id. */
  var metroCode: js.UndefOr[String] = js.undefined
  /** Name of this metro region. */
  var name: js.UndefOr[String] = js.undefined
}

object Metro {
  @scala.inline
  def apply(
    countryCode: String = null,
    countryDartId: String = null,
    dartId: String = null,
    dmaId: String = null,
    kind: String = null,
    metroCode: String = null,
    name: String = null
  ): Metro = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId.asInstanceOf[js.Any])
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (dmaId != null) __obj.updateDynamic("dmaId")(dmaId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metroCode != null) __obj.updateDynamic("metroCode")(metroCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metro]
  }
}

