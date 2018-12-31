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

