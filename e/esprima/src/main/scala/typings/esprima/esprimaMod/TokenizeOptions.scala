package typings.esprima.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizeOptions extends js.Object {
  var comment: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var tolerant: js.UndefOr[Boolean] = js.undefined
}

object TokenizeOptions {
  @scala.inline
  def apply(
    comment: js.UndefOr[Boolean] = js.undefined,
    loc: js.UndefOr[Boolean] = js.undefined,
    range: js.UndefOr[Boolean] = js.undefined,
    tolerant: js.UndefOr[Boolean] = js.undefined
  ): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizeOptions]
  }
}

