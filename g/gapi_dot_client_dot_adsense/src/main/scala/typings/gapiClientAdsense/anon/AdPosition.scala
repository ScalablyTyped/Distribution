package typings.gapiClientAdsense.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdPosition extends js.Object {
  /** The position of the ads relative to the feed entries. */
  var adPosition: js.UndefOr[String] = js.undefined
  /** The frequency at which ads should appear in the feed (i.e. every N entries). */
  var frequency: js.UndefOr[Double] = js.undefined
  /** The minimum length an entry should be in order to have attached ads. */
  var minimumWordCount: js.UndefOr[Double] = js.undefined
  /** The type of ads which should appear. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AdPosition {
  @scala.inline
  def apply(
    adPosition: String = null,
    frequency: js.UndefOr[Double] = js.undefined,
    minimumWordCount: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): AdPosition = {
    val __obj = js.Dynamic.literal()
    if (adPosition != null) __obj.updateDynamic("adPosition")(adPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumWordCount)) __obj.updateDynamic("minimumWordCount")(minimumWordCount.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdPosition]
  }
}

