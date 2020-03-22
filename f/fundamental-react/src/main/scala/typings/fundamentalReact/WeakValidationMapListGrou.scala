package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/ListGroup/ListGroup.ListGroupProps> */
trait WeakValidationMapListGrou extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var customStyles: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapListGrou {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    customStyles: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapListGrou = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapListGrou]
  }
}

