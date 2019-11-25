package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateStats extends js.Object {
  /** The number of messages sent between a pair of peers. */
  var count: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#aggregateStats. */
  var kind: js.UndefOr[String] = js.undefined
  /** The maximum amount. */
  var max: js.UndefOr[String] = js.undefined
  /** The minimum amount. */
  var min: js.UndefOr[String] = js.undefined
  /** The total number of bytes sent for messages between a pair of peers. */
  var sum: js.UndefOr[String] = js.undefined
}

object AggregateStats {
  @scala.inline
  def apply(
    count: String = null,
    kind: String = null,
    max: String = null,
    min: String = null,
    sum: String = null
  ): AggregateStats = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateStats]
  }
}

