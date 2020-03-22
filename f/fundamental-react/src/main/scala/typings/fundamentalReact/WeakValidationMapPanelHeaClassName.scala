package typings.fundamentalReact

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Panel/Panel.PanelHeaderProps> */
trait WeakValidationMapPanelHeaClassName extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

object WeakValidationMapPanelHeaClassName {
  @scala.inline
  def apply(className: Validator[js.UndefOr[Null | String]] = null): WeakValidationMapPanelHeaClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapPanelHeaClassName]
  }
}

