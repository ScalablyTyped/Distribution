package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  /** Position is a byte offset. */
  var byteOffset: js.UndefOr[String] = js.native
  /** CloudPosition is a concat position. */
  var concatPosition: js.UndefOr[ConcatPosition] = js.native
  /**
    * Position is past all other positions. Also useful for the end
    * position of an unbounded range.
    */
  var end: js.UndefOr[Boolean] = js.native
  /** Position is a string key, ordered lexicographically. */
  var key: js.UndefOr[String] = js.native
  /** Position is a record index. */
  var recordIndex: js.UndefOr[String] = js.native
  /**
    * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED
    * sharding).
    */
  var shufflePosition: js.UndefOr[String] = js.native
}

object Position {
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setByteOffset(value: String): Self = this.set("byteOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteOffset: Self = this.set("byteOffset", js.undefined)
    @scala.inline
    def setConcatPosition(value: ConcatPosition): Self = this.set("concatPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcatPosition: Self = this.set("concatPosition", js.undefined)
    @scala.inline
    def setEnd(value: Boolean): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setRecordIndex(value: String): Self = this.set("recordIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordIndex: Self = this.set("recordIndex", js.undefined)
    @scala.inline
    def setShufflePosition(value: String): Self = this.set("shufflePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShufflePosition: Self = this.set("shufflePosition", js.undefined)
  }
  
}

