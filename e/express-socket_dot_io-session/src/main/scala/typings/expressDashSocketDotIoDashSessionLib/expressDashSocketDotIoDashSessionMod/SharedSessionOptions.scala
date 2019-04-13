package typings
package expressDashSocketDotIoDashSessionLib.expressDashSocketDotIoDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedSessionOptions extends js.Object {
  var autoSave: js.UndefOr[scala.Boolean] = js.undefined
  var saveUninitialized: js.UndefOr[scala.Boolean] = js.undefined
}

object SharedSessionOptions {
  @scala.inline
  def apply(
    autoSave: js.UndefOr[scala.Boolean] = js.undefined,
    saveUninitialized: js.UndefOr[scala.Boolean] = js.undefined
  ): SharedSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave)
    if (!js.isUndefined(saveUninitialized)) __obj.updateDynamic("saveUninitialized")(saveUninitialized)
    __obj.asInstanceOf[SharedSessionOptions]
  }
}

