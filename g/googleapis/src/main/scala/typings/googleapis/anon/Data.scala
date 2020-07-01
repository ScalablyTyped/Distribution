package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var mime_type: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Data {
  @scala.inline
  def apply(
    data: String = null,
    height: js.UndefOr[Double] = js.undefined,
    mime_type: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

