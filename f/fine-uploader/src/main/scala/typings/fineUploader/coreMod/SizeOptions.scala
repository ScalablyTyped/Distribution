package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeOptions extends js.Object {
  /**
    * maximum size
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * name property will be appended to the file name of the scaled file
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * MIME type
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SizeOptions {
  @scala.inline
  def apply(maxSize: js.UndefOr[Double] = js.undefined, name: String = null, `type`: String = null): SizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeOptions]
  }
}

