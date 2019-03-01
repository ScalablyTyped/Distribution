package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFloatingActionButtonActionCollapsingEventArgs extends ASPxClientEventArgs {
  var collapseReason: ASPxClientFloatingActionButtonCollapseReason
  var contextName: java.lang.String
}

object ASPxClientFloatingActionButtonActionCollapsingEventArgs {
  @scala.inline
  def apply(collapseReason: ASPxClientFloatingActionButtonCollapseReason, contextName: java.lang.String): ASPxClientFloatingActionButtonActionCollapsingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapseReason")(collapseReason)
    __obj.updateDynamic("contextName")(contextName)
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionCollapsingEventArgs]
  }
}

