package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListTextProps> */
trait WeakValidationMapListText extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var noWrap: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var secondary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapListText {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    noWrap: Validator[js.UndefOr[Boolean | Null]] = null,
    secondary: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapListText = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (noWrap != null) __obj.updateDynamic("noWrap")(noWrap.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapListText]
  }
}

