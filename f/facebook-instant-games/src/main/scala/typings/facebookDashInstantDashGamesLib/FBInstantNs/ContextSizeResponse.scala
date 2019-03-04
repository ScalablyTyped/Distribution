package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The answer field is true if the current context size is between the minSize and maxSize values that are specified in the object, and false otherwise.
  */
trait ContextSizeResponse extends js.Object {
  var answer: scala.Boolean
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
}

object ContextSizeResponse {
  @scala.inline
  def apply(
    answer: scala.Boolean,
    maxSize: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null
  ): ContextSizeResponse = {
    val __obj = js.Dynamic.literal(answer = answer)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSizeResponse]
  }
}

