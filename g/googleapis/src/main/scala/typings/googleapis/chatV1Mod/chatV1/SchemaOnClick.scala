package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An onclick action (e.g. open a link).
  */
@js.native
trait SchemaOnClick extends js.Object {
  /**
    * A form action will be trigger by this onclick if specified.
    */
  var action: js.UndefOr[SchemaFormAction] = js.native
  /**
    * This onclick triggers an open link action if specified.
    */
  var openLink: js.UndefOr[SchemaOpenLink] = js.native
}

object SchemaOnClick {
  @scala.inline
  def apply(): SchemaOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnClick]
  }
  @scala.inline
  implicit class SchemaOnClickOps[Self <: SchemaOnClick] (val x: Self) extends AnyVal {
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
    def setAction(value: SchemaFormAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setOpenLink(value: SchemaOpenLink): Self = this.set("openLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenLink: Self = this.set("openLink", js.undefined)
  }
  
}

