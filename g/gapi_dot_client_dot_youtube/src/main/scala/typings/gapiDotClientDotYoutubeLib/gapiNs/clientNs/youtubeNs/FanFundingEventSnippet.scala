package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanFundingEventSnippet extends js.Object {
  /** The amount of funding in micros of fund_currency. e.g., 1 is represented */
  var amountMicros: js.UndefOr[java.lang.String] = js.undefined
  /** Channel id where the funding event occurred. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** The text contents of the comment left by the user. */
  var commentText: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time when the funding occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var createdAt: js.UndefOr[java.lang.String] = js.undefined
  /** The currency in which the fund was made. ISO 4217. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** A rendered string that displays the fund amount and currency (e.g., "$1.00"). The string is rendered for the given language. */
  var displayString: js.UndefOr[java.lang.String] = js.undefined
  /** Details about the supporter. Only filled if the event was made public by the user. */
  var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}

