package typings.globalNpm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalNPM extends js.Object {
  var GLOBAL_NPM_BIN: String
  var GLOBAL_NPM_PATH: String
}

object GlobalNPM {
  @scala.inline
  def apply(GLOBAL_NPM_BIN: String, GLOBAL_NPM_PATH: String): GlobalNPM = {
    val __obj = js.Dynamic.literal(GLOBAL_NPM_BIN = GLOBAL_NPM_BIN.asInstanceOf[js.Any], GLOBAL_NPM_PATH = GLOBAL_NPM_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalNPM]
  }
}

