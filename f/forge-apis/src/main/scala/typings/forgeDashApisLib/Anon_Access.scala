package typings
package forgeDashApisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Access extends js.Object {
  var access: java.lang.String
  var authId: java.lang.String
}

object Anon_Access {
  @scala.inline
  def apply(access: java.lang.String, authId: java.lang.String): Anon_Access = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access")(access)
    __obj.updateDynamic("authId")(authId)
    __obj.asInstanceOf[Anon_Access]
  }
}

