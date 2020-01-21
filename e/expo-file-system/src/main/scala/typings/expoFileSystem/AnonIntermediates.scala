package typings.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntermediates extends js.Object {
  var intermediates: js.UndefOr[Boolean] = js.undefined
}

object AnonIntermediates {
  @scala.inline
  def apply(intermediates: js.UndefOr[Boolean] = js.undefined): AnonIntermediates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intermediates)) __obj.updateDynamic("intermediates")(intermediates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntermediates]
  }
}

