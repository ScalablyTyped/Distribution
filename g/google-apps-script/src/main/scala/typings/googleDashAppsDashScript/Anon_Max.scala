package typings.googleDashAppsDashScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  var max: js.UndefOr[Integer] = js.undefined
  var start: js.UndefOr[Integer] = js.undefined
}

object Anon_Max {
  @scala.inline
  def apply(max: Int | Double = null, start: Int | Double = null): Anon_Max = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Max]
  }
}

