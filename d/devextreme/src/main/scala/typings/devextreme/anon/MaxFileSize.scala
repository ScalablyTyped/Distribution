package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxFileSize extends js.Object {
  var maxFileSize: js.UndefOr[Double] = js.undefined
}

object MaxFileSize {
  @scala.inline
  def apply(maxFileSize: js.UndefOr[Double] = js.undefined): MaxFileSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxFileSize]
  }
}

