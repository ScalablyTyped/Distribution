package typings.expressSocketIoSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedSessionOptions extends js.Object {
  var autoSave: js.UndefOr[Boolean] = js.undefined
  var saveUninitialized: js.UndefOr[Boolean] = js.undefined
}

object SharedSessionOptions {
  @scala.inline
  def apply(
    autoSave: js.UndefOr[Boolean] = js.undefined,
    saveUninitialized: js.UndefOr[Boolean] = js.undefined
  ): SharedSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(saveUninitialized)) __obj.updateDynamic("saveUninitialized")(saveUninitialized.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedSessionOptions]
  }
}

