package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for aggregate stats.
  */
@js.native
trait Schema$AggregateStats extends js.Object {
  /**
    * The number of messages sent between a pair of peers.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#aggregateStats.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum amount.
    */
  var max: js.UndefOr[String] = js.native
  /**
    * The minimum amount.
    */
  var min: js.UndefOr[String] = js.native
  /**
    * The total number of bytes sent for messages between a pair of peers.
    */
  var sum: js.UndefOr[String] = js.native
}

object Schema$AggregateStats {
  @scala.inline
  def apply(
    count: String = null,
    kind: String = null,
    max: String = null,
    min: String = null,
    sum: String = null
  ): Schema$AggregateStats = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AggregateStats]
  }
}

