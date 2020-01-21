package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonData extends js.Object {
  var data: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var mime_type: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AnonData {
  @scala.inline
  def apply(
    data: String = null,
    height: Int | Double = null,
    mime_type: String = null,
    width: Int | Double = null
  ): AnonData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

