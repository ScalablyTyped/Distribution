package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The answer field is true if the current context size is between the minSize and maxSize values that are specified in the object, and false otherwise.
  */
trait ContextSizeResponse extends js.Object {
  var answer: Boolean
  var maxSize: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
}

object ContextSizeResponse {
  @scala.inline
  def apply(
    answer: Boolean,
    maxSize: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined
  ): ContextSizeResponse = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSizeResponse]
  }
}

