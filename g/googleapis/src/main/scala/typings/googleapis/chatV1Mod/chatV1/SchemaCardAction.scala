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
  def apply(): SchemaCardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardAction]
  }
  @scala.inline
  implicit class SchemaCardActionOps[Self <: SchemaCardAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionLabel(value: String): Self = this.set("actionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionLabel: Self = this.set("actionLabel", js.undefined)
    @scala.inline
    def setOnClick(value: SchemaOnClick): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

