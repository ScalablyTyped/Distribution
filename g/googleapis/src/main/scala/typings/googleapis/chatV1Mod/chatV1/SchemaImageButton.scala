package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image button with an onclick action.
  */
@js.native
trait SchemaImageButton extends js.Object {
  /**
    * The icon specified by an enum that indices to an icon provided by Chat
    * API.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * The icon specified by a URL.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The name of this image_button which will be used for accessibility.
    * Default value will be provided if developers don&#39;t specify.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The onclick action.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
}

object SchemaImageButton {
  @scala.inline
  def apply(): SchemaImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageButton]
  }
  @scala.inline
  implicit class SchemaImageButtonOps[Self <: SchemaImageButton] (val x: Self) extends AnyVal {
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnClick(value: SchemaOnClick): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

