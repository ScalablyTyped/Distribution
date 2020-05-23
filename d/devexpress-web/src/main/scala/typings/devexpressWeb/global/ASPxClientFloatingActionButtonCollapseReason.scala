package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists values specifying whether the user action or APIs has collapsed the action group.
  */
@JSGlobal("ASPxClientFloatingActionButtonCollapseReason")
@js.native
class ASPxClientFloatingActionButtonCollapseReason ()
  extends typings.devexpressWeb.ASPxClientFloatingActionButtonCollapseReason {
  /**
    * The action group is collapsed using APIs.
    */
  /* CompleteClass */
  override var API: String = js.native
  /**
    * The action group is collapsed by clicking on the action item.
    */
  /* CompleteClass */
  override var ActionItem: String = js.native
  /**
    * The action group is collapsed using the collapse button.
    */
  /* CompleteClass */
  override var CollapseButton: String = js.native
}

