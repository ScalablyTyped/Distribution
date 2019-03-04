package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportParameters extends js.Object {
  var fileId: java.lang.String
  var mimeType: java.lang.String
}

object ExportParameters {
  @scala.inline
  def apply(fileId: java.lang.String, mimeType: java.lang.String): ExportParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId, mimeType = mimeType)
  
    __obj.asInstanceOf[ExportParameters]
  }
}

