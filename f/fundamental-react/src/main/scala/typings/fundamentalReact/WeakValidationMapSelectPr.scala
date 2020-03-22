package typings.fundamentalReact

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Select/Select.SelectProps> */
trait WeakValidationMapSelectPr extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.undefined
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var validationState: js.UndefOr[Validator[js.UndefOr[AnonState | Null]]] = js.undefined
}

object WeakValidationMapSelectPr {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    compact: Validator[js.UndefOr[Boolean | Null]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    onClick: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]] = null,
    placeholder: Validator[js.UndefOr[Null | String]] = null,
    validationState: Validator[js.UndefOr[AnonState | Null]] = null
  ): WeakValidationMapSelectPr = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapSelectPr]
  }
}

