package typings.eslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeComments extends js.Object {
  var includeComments: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeComments {
  @scala.inline
  def apply(includeComments: js.UndefOr[Boolean] = js.undefined): Anon_IncludeComments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments)
    __obj.asInstanceOf[Anon_IncludeComments]
  }
}

