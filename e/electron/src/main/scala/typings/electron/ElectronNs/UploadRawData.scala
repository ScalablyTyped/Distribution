package typings.electron.ElectronNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRawData extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-raw-data
  /**
    * Data to be uploaded.
    */
  var bytes: Buffer
  /**
    * rawData.
    */
  var `type`: String
}

object UploadRawData {
  @scala.inline
  def apply(bytes: Buffer, `type`: String): UploadRawData = {
    val __obj = js.Dynamic.literal(bytes = bytes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UploadRawData]
  }
}

