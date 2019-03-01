package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFloatingActionButtonCollapseReason extends js.Object {
  var API: java.lang.String
  var ActionItem: java.lang.String
  var CollapseButton: java.lang.String
}

object ASPxClientFloatingActionButtonCollapseReason {
  @scala.inline
  def apply(API: java.lang.String, ActionItem: java.lang.String, CollapseButton: java.lang.String): ASPxClientFloatingActionButtonCollapseReason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("API")(API)
    __obj.updateDynamic("ActionItem")(ActionItem)
    __obj.updateDynamic("CollapseButton")(CollapseButton)
    __obj.asInstanceOf[ASPxClientFloatingActionButtonCollapseReason]
  }
}

