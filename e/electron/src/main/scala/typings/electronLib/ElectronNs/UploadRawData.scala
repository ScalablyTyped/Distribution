package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRawData extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-raw-data
  /**
    * Data to be uploaded.
    */
  var bytes: nodeLib.Buffer
  /**
    * rawData.
    */
  var `type`: java.lang.String
}

object UploadRawData {
  @scala.inline
  def apply(bytes: nodeLib.Buffer, `type`: java.lang.String): UploadRawData = {
    val __obj = js.Dynamic.literal(bytes = bytes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UploadRawData]
  }
}

