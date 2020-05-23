package typings.firebaseFirestore.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOptions extends js.Object {
  var hasCommittedMutations: js.UndefOr[Boolean] = js.undefined
  var hasLocalMutations: js.UndefOr[Boolean] = js.undefined
}

object DocumentOptions {
  @scala.inline
  def apply(
    hasCommittedMutations: js.UndefOr[Boolean] = js.undefined,
    hasLocalMutations: js.UndefOr[Boolean] = js.undefined
  ): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasCommittedMutations)) __obj.updateDynamic("hasCommittedMutations")(hasCommittedMutations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLocalMutations)) __obj.updateDynamic("hasLocalMutations")(hasLocalMutations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOptions]
  }
}

