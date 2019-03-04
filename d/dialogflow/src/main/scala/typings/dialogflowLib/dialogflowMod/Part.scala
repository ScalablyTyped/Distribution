package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Part extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var entityType: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var userDefined: js.UndefOr[scala.Boolean] = js.undefined
}

object Part {
  @scala.inline
  def apply(
    text: java.lang.String,
    alias: java.lang.String = null,
    entityType: java.lang.String = null,
    userDefined: js.UndefOr[scala.Boolean] = js.undefined
  ): Part = {
    val __obj = js.Dynamic.literal(text = text)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (entityType != null) __obj.updateDynamic("entityType")(entityType)
    if (!js.isUndefined(userDefined)) __obj.updateDynamic("userDefined")(userDefined)
    __obj.asInstanceOf[Part]
  }
}

