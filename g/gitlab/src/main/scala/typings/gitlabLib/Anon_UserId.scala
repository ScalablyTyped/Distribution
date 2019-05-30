package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UserId extends js.Object {
  var userId: js.UndefOr[UserId] = js.undefined
}

object Anon_UserId {
  @scala.inline
  def apply(userId: js.UndefOr[UserId] = js.undefined): Anon_UserId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(userId)) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Anon_UserId]
  }
}

