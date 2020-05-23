package typings.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intermediates extends js.Object {
  var intermediates: js.UndefOr[Boolean] = js.undefined
}

object Intermediates {
  @scala.inline
  def apply(intermediates: js.UndefOr[Boolean] = js.undefined): Intermediates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intermediates)) __obj.updateDynamic("intermediates")(intermediates.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intermediates]
  }
}

