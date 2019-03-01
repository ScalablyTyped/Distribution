package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  /** Position is a byte offset. */
  var byteOffset: js.UndefOr[java.lang.String] = js.undefined
  /** CloudPosition is a concat position. */
  var concatPosition: js.UndefOr[ConcatPosition] = js.undefined
  /**
    * Position is past all other positions. Also useful for the end
    * position of an unbounded range.
    */
  var end: js.UndefOr[scala.Boolean] = js.undefined
  /** Position is a string key, ordered lexicographically. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Position is a record index. */
  var recordIndex: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED
    * sharding).
    */
  var shufflePosition: js.UndefOr[java.lang.String] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    byteOffset: java.lang.String = null,
    concatPosition: ConcatPosition = null,
    end: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    recordIndex: java.lang.String = null,
    shufflePosition: java.lang.String = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (byteOffset != null) __obj.updateDynamic("byteOffset")(byteOffset)
    if (concatPosition != null) __obj.updateDynamic("concatPosition")(concatPosition)
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (key != null) __obj.updateDynamic("key")(key)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex)
    if (shufflePosition != null) __obj.updateDynamic("shufflePosition")(shufflePosition)
    __obj.asInstanceOf[Position]
  }
}

