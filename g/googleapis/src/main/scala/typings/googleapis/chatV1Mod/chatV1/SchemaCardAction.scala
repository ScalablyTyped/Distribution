package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A card action is the action associated with the card. For an invoice card,
  * a typical action would be: delete invoice, email invoice or open the
  * invoice in browser.
  */
@js.native
trait SchemaCardAction extends js.Object {
  /**
    * The label used to be displayed in the action menu item.
    */
  var actionLabel: js.UndefOr[String] = js.native
  /**
    * The onclick action for this action item.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
}

object SchemaCardAction {
  @scala.inline
  def apply(actionLabel: String = null, onClick: SchemaOnClick = null): SchemaCardAction = {
    val __obj = js.Dynamic.literal()
    if (actionLabel != null) __obj.updateDynamic("actionLabel")(actionLabel.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCardAction]
  }
}

