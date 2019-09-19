package typings.googleDashAppsDashScript

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  var max: js.UndefOr[Integer] = js.undefined
  var start: js.UndefOr[Integer] = js.undefined
}

object Anon_Max {
  @scala.inline
  def apply(max: js.UndefOr[Integer] = js.undefined, start: js.UndefOr[Integer] = js.undefined): Anon_Max = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_Max]
  }
}

