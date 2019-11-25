package typings.ejDotWebDotAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuccessEventArgs extends js.Object {
  /** returns the current instance of PivotChart.
    */
  var args: js.UndefOr[js.Any] = js.undefined
}

object RenderSuccessEventArgs {
  @scala.inline
  def apply(args: js.Any = null): RenderSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuccessEventArgs]
  }
}

