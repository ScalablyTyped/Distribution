package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/ListGroup/ListGroup.ListGroupItemCheckboxProps> */
trait WeakValidationMapListGrouInputProps extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var inputProps: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var labelProps: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
}

object WeakValidationMapListGrouInputProps {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    inputProps: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    labelProps: Validator[js.UndefOr[Null | StringDictionary[_]]] = null
  ): WeakValidationMapListGrouInputProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapListGrouInputProps]
  }
}

