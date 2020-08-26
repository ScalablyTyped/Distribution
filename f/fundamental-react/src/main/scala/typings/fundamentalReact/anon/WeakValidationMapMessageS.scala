package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> */
@js.native
trait WeakValidationMapMessageS extends js.Object {
  var buttonProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var dismissible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var link: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var linkProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var linkText: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var localizedText: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var noGlyph: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var onCloseClicked: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.native
  var `type`: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
}

object WeakValidationMapMessageS {
  @scala.inline
  def apply(): WeakValidationMapMessageS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapMessageS]
  }
  @scala.inline
  implicit class WeakValidationMapMessageSOps[Self <: WeakValidationMapMessageS] (val x: Self) extends AnyVal {
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
    def setButtonProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setDismissible(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    @scala.inline
    def setLink(value: Validator[js.UndefOr[Null | String]]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setLinkProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("linkProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkProps: Self = this.set("linkProps", js.undefined)
    @scala.inline
    def setLinkText(value: Validator[js.UndefOr[Null | String]]): Self = this.set("linkText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
    @scala.inline
    def setLocalizedText(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedText: Self = this.set("localizedText", js.undefined)
    @scala.inline
    def setNoGlyph(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("noGlyph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoGlyph: Self = this.set("noGlyph", js.undefined)
    @scala.inline
    def setOnCloseClicked(value: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]): Self = this.set("onCloseClicked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCloseClicked: Self = this.set("onCloseClicked", js.undefined)
    @scala.inline
    def setType(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

