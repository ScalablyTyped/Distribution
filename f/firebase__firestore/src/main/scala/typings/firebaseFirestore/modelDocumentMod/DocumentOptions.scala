package typings.firebaseFirestore.modelDocumentMod

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
    if (!js.isUndefined(hasCommittedMutations)) __obj.updateDynamic("hasCommittedMutations")(hasCommittedMutations.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLocalMutations)) __obj.updateDynamic("hasLocalMutations")(hasLocalMutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOptions]
  }
}

