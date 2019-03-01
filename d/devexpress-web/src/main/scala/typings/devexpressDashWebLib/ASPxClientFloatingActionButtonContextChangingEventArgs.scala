package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFloatingActionButtonContextChangingEventArgs extends ASPxClientEventArgs {
  var action: ASPxClientFABAction
}

object ASPxClientFloatingActionButtonContextChangingEventArgs {
  @scala.inline
  def apply(action: ASPxClientFABAction): ASPxClientFloatingActionButtonContextChangingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[ASPxClientFloatingActionButtonContextChangingEventArgs]
  }
}

