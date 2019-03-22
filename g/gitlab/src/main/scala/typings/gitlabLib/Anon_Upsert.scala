package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Upsert extends js.Object {
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Upsert {
  @scala.inline
  def apply(upsert: js.UndefOr[scala.Boolean] = js.undefined): Anon_Upsert = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[Anon_Upsert]
  }
}

