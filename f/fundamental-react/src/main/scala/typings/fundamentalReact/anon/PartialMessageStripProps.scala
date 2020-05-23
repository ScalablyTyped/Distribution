package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> */
trait PartialMessageStripProps extends js.Object {
  var buttonProps: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var dismissible: js.UndefOr[Boolean] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var linkProps: js.UndefOr[js.Any] = js.undefined
  var linkText: js.UndefOr[String] = js.undefined
  var localizedText: js.UndefOr[js.Any] = js.undefined
  var noGlyph: js.UndefOr[Boolean] = js.undefined
  var onCloseClicked: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object PartialMessageStripProps {
  @scala.inline
  def apply(
    buttonProps: js.Any = null,
    className: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    link: String = null,
    linkProps: js.Any = null,
    linkText: String = null,
    localizedText: js.Any = null,
    noGlyph: js.UndefOr[Boolean] = js.undefined,
    onCloseClicked: /* repeated */ js.Any => _ = null,
    `type`: js.Any = null
  ): PartialMessageStripProps = {
    val __obj = js.Dynamic.literal()
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.get.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (linkText != null) __obj.updateDynamic("linkText")(linkText.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (!js.isUndefined(noGlyph)) __obj.updateDynamic("noGlyph")(noGlyph.get.asInstanceOf[js.Any])
    if (onCloseClicked != null) __obj.updateDynamic("onCloseClicked")(js.Any.fromFunction1(onCloseClicked))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMessageStripProps]
  }
}

