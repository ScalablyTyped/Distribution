package typings
package gapiDotClientDotAdsenseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdPosition extends js.Object {
  /** The position of the ads relative to the feed entries. */
  var adPosition: js.UndefOr[java.lang.String] = js.undefined
  /** The frequency at which ads should appear in the feed (i.e. every N entries). */
  var frequency: js.UndefOr[scala.Double] = js.undefined
  /** The minimum length an entry should be in order to have attached ads. */
  var minimumWordCount: js.UndefOr[scala.Double] = js.undefined
  /** The type of ads which should appear. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AdPosition {
  @scala.inline
  def apply(
    adPosition: java.lang.String = null,
    frequency: scala.Int | scala.Double = null,
    minimumWordCount: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): Anon_AdPosition = {
    val __obj = js.Dynamic.literal()
    if (adPosition != null) __obj.updateDynamic("adPosition")(adPosition)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (minimumWordCount != null) __obj.updateDynamic("minimumWordCount")(minimumWordCount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AdPosition]
  }
}

