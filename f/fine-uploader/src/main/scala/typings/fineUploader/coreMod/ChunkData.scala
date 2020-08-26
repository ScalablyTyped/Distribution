package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkData extends js.Object {
  /**
    * the last byte of the current chunk
    */
  var endByte: Double = js.native
  /**
    * the 0-based index of the associated partition
    */
  var partIndex: Double = js.native
  /**
    * the byte offset of the current chunk
    */
  var startByte: Double = js.native
  /**
    * the total number of partitions associated with the `File` or `Blob`
    */
  var totalParts: Double = js.native
}

object ChunkData {
  @scala.inline
  def apply(endByte: Double, partIndex: Double, startByte: Double, totalParts: Double): ChunkData = {
    val __obj = js.Dynamic.literal(endByte = endByte.asInstanceOf[js.Any], partIndex = partIndex.asInstanceOf[js.Any], startByte = startByte.asInstanceOf[js.Any], totalParts = totalParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkData]
  }
  @scala.inline
  implicit class ChunkDataOps[Self <: ChunkData] (val x: Self) extends AnyVal {
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
    def setEndByte(value: Double): Self = this.set("endByte", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartIndex(value: Double): Self = this.set("partIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartByte(value: Double): Self = this.set("startByte", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalParts(value: Double): Self = this.set("totalParts", value.asInstanceOf[js.Any])
  }
  
}

