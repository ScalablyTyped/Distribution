package typings.findDashJavaDashHome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowJre extends js.Object {
  var allowJre: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowJre {
  @scala.inline
  def apply(allowJre: js.UndefOr[Boolean] = js.undefined): Anon_AllowJre = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowJre)) __obj.updateDynamic("allowJre")(allowJre)
    __obj.asInstanceOf[Anon_AllowJre]
  }
}

