package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message resulting from reading an image file.
  */
@js.native
trait Schema$ImageError extends js.Object {
  /**
    * The type of image error encountered. Optional for older image errors.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The file path in the import of the image that was rejected.
    */
  var filePath: js.UndefOr[String] = js.native
}

object Schema$ImageError {
  @scala.inline
  def apply(code: String = null, filePath: String = null): Schema$ImageError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageError]
  }
}

