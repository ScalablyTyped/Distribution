package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompile extends js.Object {
  var compile: js.UndefOr[js.Function] = js.undefined
  var render: js.UndefOr[js.Function] = js.undefined
}

object AnonCompile {
  @scala.inline
  def apply(compile: js.Function = null, render: js.Function = null): AnonCompile = {
    val __obj = js.Dynamic.literal()
    if (compile != null) __obj.updateDynamic("compile")(compile.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompile]
  }
}

