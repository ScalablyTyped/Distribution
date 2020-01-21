package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkData extends js.Object {
  /**
    * the last byte of the current chunk
    */
  var endByte: Double
  /**
    * the 0-based index of the associated partition
    */
  var partIndex: Double
  /**
    * the byte offset of the current chunk
    */
  var startByte: Double
  /**
    * the total number of partitions associated with the `File` or `Blob`
    */
  var totalParts: Double
}

object ChunkData {
  @scala.inline
  def apply(endByte: Double, partIndex: Double, startByte: Double, totalParts: Double): ChunkData = {
    val __obj = js.Dynamic.literal(endByte = endByte.asInstanceOf[js.Any], partIndex = partIndex.asInstanceOf[js.Any], startByte = startByte.asInstanceOf[js.Any], totalParts = totalParts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChunkData]
  }
}

