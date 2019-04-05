package typings
package elasticDashApmDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Name]
  }
}

