package typings.eslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeComments extends js.Object {
  var includeComments: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeComments {
  @scala.inline
  def apply(includeComments: js.UndefOr[Boolean] = js.undefined): AnonIncludeComments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeComments]
  }
}

