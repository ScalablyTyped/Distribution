package typings.expressValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSaveContext extends js.Object {
  var saveContext: js.UndefOr[Boolean] = js.undefined
}

object AnonSaveContext {
  @scala.inline
  def apply(saveContext: js.UndefOr[Boolean] = js.undefined): AnonSaveContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(saveContext)) __obj.updateDynamic("saveContext")(saveContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSaveContext]
  }
}

