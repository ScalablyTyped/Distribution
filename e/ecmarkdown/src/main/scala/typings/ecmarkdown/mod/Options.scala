package typings.ecmarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var trackPositions: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(trackPositions: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(trackPositions)) __obj.updateDynamic("trackPositions")(trackPositions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

