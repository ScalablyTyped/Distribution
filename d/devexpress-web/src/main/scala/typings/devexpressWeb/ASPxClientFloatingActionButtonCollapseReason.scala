package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists values specifying whether the user action or APIs has collapsed the action group.
  */
trait ASPxClientFloatingActionButtonCollapseReason extends js.Object {
  /**
    * The action group is collapsed using APIs.
    */
  var API: String
  /**
    * The action group is collapsed by clicking on the action item.
    */
  var ActionItem: String
  /**
    * The action group is collapsed using the collapse button.
    */
  var CollapseButton: String
}

object ASPxClientFloatingActionButtonCollapseReason {
  @scala.inline
  def apply(API: String, ActionItem: String, CollapseButton: String): ASPxClientFloatingActionButtonCollapseReason = {
    val __obj = js.Dynamic.literal(API = API.asInstanceOf[js.Any], ActionItem = ActionItem.asInstanceOf[js.Any], CollapseButton = CollapseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonCollapseReason]
  }
}

