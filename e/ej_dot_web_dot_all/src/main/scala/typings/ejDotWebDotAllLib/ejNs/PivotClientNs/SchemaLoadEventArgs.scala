package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaLoadEventArgs extends js.Object {
  /** returns the current action of PivotSchemaDesigner control.
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
}

object SchemaLoadEventArgs {
  @scala.inline
  def apply(action: java.lang.String = null): SchemaLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[SchemaLoadEventArgs]
  }
}

