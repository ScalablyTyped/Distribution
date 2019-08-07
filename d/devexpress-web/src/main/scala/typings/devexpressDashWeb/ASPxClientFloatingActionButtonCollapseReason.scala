package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists values specifying whether the user action or APIs has collapsed the action group.
  */
@JSGlobal("ASPxClientFloatingActionButtonCollapseReason")
@js.native
class ASPxClientFloatingActionButtonCollapseReason () extends js.Object {
  /**
    * The action group is collapsed using APIs.
    */
  var API: String = js.native
  /**
    * The action group is collapsed by clicking on the action item.
    */
  var ActionItem: String = js.native
  /**
    * The action group is collapsed using the collapse button.
    */
  var CollapseButton: String = js.native
}

