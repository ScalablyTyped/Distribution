package typings.ecmarkdown.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseFragmentOpts extends js.Object {
  var inList: js.UndefOr[Boolean] = js.undefined
}

object ParseFragmentOpts {
  @scala.inline
  def apply(inList: js.UndefOr[Boolean] = js.undefined): ParseFragmentOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inList)) __obj.updateDynamic("inList")(inList.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseFragmentOpts]
  }
}

