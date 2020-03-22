package typings.fundamentalReact

import typings.fundamentalReact.iconMod.IconGlyph
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> */
trait WeakValidationMapTabProps extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var glyph: js.UndefOr[Validator[js.UndefOr[IconGlyph | Null]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var index: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var linkProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.undefined
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var tabContentProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

object WeakValidationMapTabProps {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    glyph: Validator[js.UndefOr[IconGlyph | Null]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    index: Validator[js.UndefOr[Double | Null]] = null,
    linkProps: Validator[js.UndefOr[_ | Null]] = null,
    onClick: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]] = null,
    selected: Validator[js.UndefOr[Boolean | Null]] = null,
    tabContentProps: Validator[js.UndefOr[_ | Null]] = null,
    title: Validator[js.UndefOr[Null | String]] = null
  ): WeakValidationMapTabProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tabContentProps != null) __obj.updateDynamic("tabContentProps")(tabContentProps.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTabProps]
  }
}

