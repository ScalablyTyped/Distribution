package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchingShares extends js.Object {
  var matchingShares: js.UndefOr[js.Array[SharedNotebook]] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object MatchingShares {
  @scala.inline
  def apply(
    matchingShares: js.Array[SharedNotebook] = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined
  ): MatchingShares = {
    val __obj = js.Dynamic.literal()
    if (matchingShares != null) __obj.updateDynamic("matchingShares")(matchingShares.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchingShares]
  }
}

