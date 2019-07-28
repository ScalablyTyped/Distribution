package typings.diDashLite.DiLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def invokeStmt(args: js.Any, op: String): String
}

object Utils {
  @scala.inline
  def apply(invokeStmt: (js.Any, String) => String): Utils = {
    val __obj = js.Dynamic.literal(invokeStmt = js.Any.fromFunction2(invokeStmt))
  
    __obj.asInstanceOf[Utils]
  }
}

