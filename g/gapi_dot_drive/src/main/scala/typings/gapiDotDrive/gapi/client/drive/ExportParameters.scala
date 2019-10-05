package typings.gapiDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportParameters extends js.Object {
  var fileId: String
  var mimeType: String
}

object ExportParameters {
  @scala.inline
  def apply(fileId: String, mimeType: String): ExportParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId, mimeType = mimeType)
  
    __obj.asInstanceOf[ExportParameters]
  }
}

