package typings
package diDashLiteLib.DiLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def invokeStmt(args: js.Any, op: java.lang.String): java.lang.String
}

object Utils {
  @scala.inline
  def apply(invokeStmt: (js.Any, java.lang.String) => java.lang.String): Utils = {
    val __obj = js.Dynamic.literal(invokeStmt = js.Any.fromFunction2(invokeStmt))
  
    __obj.asInstanceOf[Utils]
  }
}

