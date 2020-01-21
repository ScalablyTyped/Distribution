package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFileContentBuffer extends js.Object {
  /**
    * The raw content in the secure keys file.
    */
  var content: js.UndefOr[String] = js.native
  var fileType: js.UndefOr[String] = js.native
}

object SchemaFileContentBuffer {
  @scala.inline
  def apply(content: String = null, fileType: String = null): SchemaFileContentBuffer = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFileContentBuffer]
  }
}

