package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  /** Position is a byte offset. */
  var byteOffset: js.UndefOr[String] = js.undefined
  /** CloudPosition is a concat position. */
  var concatPosition: js.UndefOr[ConcatPosition] = js.undefined
  /**
    * Position is past all other positions. Also useful for the end
    * position of an unbounded range.
    */
  var end: js.UndefOr[Boolean] = js.undefined
  /** Position is a string key, ordered lexicographically. */
  var key: js.UndefOr[String] = js.undefined
  /** Position is a record index. */
  var recordIndex: js.UndefOr[String] = js.undefined
  /**
    * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED
    * sharding).
    */
  var shufflePosition: js.UndefOr[String] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    byteOffset: String = null,
    concatPosition: ConcatPosition = null,
    end: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    recordIndex: String = null,
    shufflePosition: String = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (byteOffset != null) __obj.updateDynamic("byteOffset")(byteOffset.asInstanceOf[js.Any])
    if (concatPosition != null) __obj.updateDynamic("concatPosition")(concatPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (shufflePosition != null) __obj.updateDynamic("shufflePosition")(shufflePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

