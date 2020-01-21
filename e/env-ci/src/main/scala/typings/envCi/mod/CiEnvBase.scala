package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CiEnvBase extends js.Object {
  var isCi: `true`
}

object CiEnvBase {
  @scala.inline
  def apply(isCi: `true`): CiEnvBase = {
    val __obj = js.Dynamic.literal(isCi = isCi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CiEnvBase]
  }
}

