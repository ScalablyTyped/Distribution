package typings.ejDotWebDotAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadEventArgs extends js.Object {
  /** returns the HTML element of PivotSchemaDesigner control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object LoadEventArgs {
  @scala.inline
  def apply(element: js.Any = null): LoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[LoadEventArgs]
  }
}

