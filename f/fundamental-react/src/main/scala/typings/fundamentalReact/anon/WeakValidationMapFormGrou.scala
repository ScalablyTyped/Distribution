package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> */
trait WeakValidationMapFormGrou extends js.Object {
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapFormGrou {
  @scala.inline
  def apply(disableStyles: Validator[js.UndefOr[Boolean | Null]] = null): WeakValidationMapFormGrou = {
    val __obj = js.Dynamic.literal()
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapFormGrou]
  }
}

