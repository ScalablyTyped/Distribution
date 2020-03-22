package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Panel/Panel.PanelProps> */
trait WeakValidationMapPanelPro extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var colSpan: js.UndefOr[Validator[js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | Null]]] = js.undefined
  var customStyles: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapPanelPro {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    colSpan: Validator[js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | Null]] = null,
    customStyles: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapPanelPro = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapPanelPro]
  }
}

