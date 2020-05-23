package typings.eslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeComments extends js.Object {
  var includeComments: js.UndefOr[Boolean] = js.undefined
}

object IncludeComments {
  @scala.inline
  def apply(includeComments: js.UndefOr[Boolean] = js.undefined): IncludeComments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeComments]
  }
}

