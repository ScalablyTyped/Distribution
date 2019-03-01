package typings
package dialogflowLib.dialogflowMod.longrunningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation extends js.Object {
  var done: scala.Boolean
  var metadata: js.Any
  var name: java.lang.String
}

object BaseOperation {
  @scala.inline
  def apply(done: scala.Boolean, metadata: js.Any, name: java.lang.String): BaseOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BaseOperation]
  }
}

