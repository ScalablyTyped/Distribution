package typings.electron.Electron

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimeTypedBuffer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/mime-typed-buffer
  /**
    * The actual Buffer content.
    */
  var data: Buffer
  /**
    * The mimeType of the Buffer that you are sending.
    */
  var mimeType: String
}

object MimeTypedBuffer {
  @scala.inline
  def apply(data: Buffer, mimeType: String): MimeTypedBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeTypedBuffer]
  }
}

