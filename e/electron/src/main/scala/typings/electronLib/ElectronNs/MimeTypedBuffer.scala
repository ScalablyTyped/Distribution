package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimeTypedBuffer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/mime-typed-buffer
  /**
    * The actual Buffer content.
    */
  var data: nodeLib.Buffer
  /**
    * The mimeType of the Buffer that you are sending.
    */
  var mimeType: java.lang.String
}

object MimeTypedBuffer {
  @scala.inline
  def apply(data: nodeLib.Buffer, mimeType: java.lang.String): MimeTypedBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[MimeTypedBuffer]
  }
}

