package typings.devextreme

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.standard
import typings.devextreme.devextremeStrings.virtual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUseNative extends js.Object {
  var mode: js.UndefOr[standard | virtual] = js.undefined
  var useNative: js.UndefOr[Boolean | auto] = js.undefined
}

object AnonUseNative {
  @scala.inline
  def apply(mode: standard | virtual = null, useNative: Boolean | auto = null): AnonUseNative = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (useNative != null) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUseNative]
  }
}

