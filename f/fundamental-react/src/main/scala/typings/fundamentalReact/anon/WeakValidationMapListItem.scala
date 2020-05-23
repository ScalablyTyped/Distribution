package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListItemProps> */
trait WeakValidationMapListItem extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.undefined
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapListItem {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    onClick: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]] = null,
    selected: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapListItem = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapListItem]
  }
}

