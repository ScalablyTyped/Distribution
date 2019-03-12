package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, validateOnChange: js.UndefOr[scala.Boolean] = js.undefined): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange)
    __obj.asInstanceOf[Anon_Name]
  }
}

