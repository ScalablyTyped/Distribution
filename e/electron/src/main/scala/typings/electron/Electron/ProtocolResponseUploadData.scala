package typings.electron.Electron

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolResponseUploadData extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/protocol-response-upload-data
  /**
    * MIME type of the content.
    */
  var contentType: String
  /**
    * Content to be sent.
    */
  var data: String | Buffer
}

object ProtocolResponseUploadData {
  @scala.inline
  def apply(contentType: String, data: String | Buffer): ProtocolResponseUploadData = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProtocolResponseUploadData]
  }
}

