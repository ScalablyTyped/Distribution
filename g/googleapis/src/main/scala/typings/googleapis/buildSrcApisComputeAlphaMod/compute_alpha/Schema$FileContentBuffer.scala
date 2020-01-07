package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FileContentBuffer extends js.Object {
  /**
    * The raw content in the secure keys file.
    */
  var content: js.UndefOr[String] = js.native
  var fileType: js.UndefOr[String] = js.native
}

object Schema$FileContentBuffer {
  @scala.inline
  def apply(content: String = null, fileType: String = null): Schema$FileContentBuffer = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileContentBuffer]
  }
}

