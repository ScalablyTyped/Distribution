package typings.evernote

import typings.evernote.mod.Types.SharedNotebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatchingShares extends js.Object {
  var matchingShares: js.UndefOr[js.Array[SharedNotebook]] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object AnonMatchingShares {
  @scala.inline
  def apply(matchingShares: js.Array[SharedNotebook] = null, updateSequenceNum: Int | Double = null): AnonMatchingShares = {
    val __obj = js.Dynamic.literal()
    if (matchingShares != null) __obj.updateDynamic("matchingShares")(matchingShares.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatchingShares]
  }
}

