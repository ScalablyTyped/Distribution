package typings.ejDotWebDotAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaLoadEventArgs extends js.Object {
  /** returns the current action of PivotSchemaDesigner control.
    */
  var action: js.UndefOr[String] = js.undefined
}

object SchemaLoadEventArgs {
  @scala.inline
  def apply(action: String = null): SchemaLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLoadEventArgs]
  }
}

