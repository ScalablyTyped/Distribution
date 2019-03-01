package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation extends js.Object {
  var path: java.lang.String
}

object BaseOperation {
  @scala.inline
  def apply(path: java.lang.String): BaseOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[BaseOperation]
  }
}

