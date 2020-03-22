package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxFileSize extends js.Object {
  var maxFileSize: js.UndefOr[Double] = js.undefined
}

object AnonMaxFileSize {
  @scala.inline
  def apply(maxFileSize: Int | Double = null): AnonMaxFileSize = {
    val __obj = js.Dynamic.literal()
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxFileSize]
  }
}

