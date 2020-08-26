package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> */
@js.native
trait PartialMessageStripProps extends js.Object {
  var buttonProps: js.UndefOr[js.Any] = js.native
  var className: js.UndefOr[String] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var dismissible: js.UndefOr[Boolean] = js.native
  var link: js.UndefOr[String] = js.native
  var linkProps: js.UndefOr[js.Any] = js.native
  var linkText: js.UndefOr[String] = js.native
  var localizedText: js.UndefOr[js.Any] = js.native
  var noGlyph: js.UndefOr[Boolean] = js.native
  var onCloseClicked: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var `type`: js.UndefOr[js.Any] = js.native
}

object PartialMessageStripProps {
  @scala.inline
  def apply(): PartialMessageStripProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageStripProps]
  }
  @scala.inline
  implicit class PartialMessageStripPropsOps[Self <: PartialMessageStripProps] (val x: Self) extends AnyVal {
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
    def setButtonProps(value: js.Any): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setLinkProps(value: js.Any): Self = this.set("linkProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkProps: Self = this.set("linkProps", js.undefined)
    @scala.inline
    def setLinkText(value: String): Self = this.set("linkText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
    @scala.inline
    def setLocalizedText(value: js.Any): Self = this.set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedText: Self = this.set("localizedText", js.undefined)
    @scala.inline
    def setNoGlyph(value: Boolean): Self = this.set("noGlyph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoGlyph: Self = this.set("noGlyph", js.undefined)
    @scala.inline
    def setOnCloseClicked(value: /* repeated */ js.Any => _): Self = this.set("onCloseClicked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCloseClicked: Self = this.set("onCloseClicked", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

