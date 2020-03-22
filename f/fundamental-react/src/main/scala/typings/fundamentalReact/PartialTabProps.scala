package typings.fundamentalReact

import typings.fundamentalReact.iconMod.IconGlyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> */
trait PartialTabProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var glyph: js.UndefOr[IconGlyph] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var linkProps: js.UndefOr[js.Any] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var tabContentProps: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialTabProps {
  @scala.inline
  def apply(
    className: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: IconGlyph = null,
    id: String = null,
    index: Int | Double = null,
    linkProps: js.Any = null,
    onClick: /* repeated */ js.Any => _ = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    tabContentProps: js.Any = null,
    title: String = null
  ): PartialTabProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tabContentProps != null) __obj.updateDynamic("tabContentProps")(tabContentProps.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTabProps]
  }
}

