package typings
package from2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectMode extends js.Object {
  var objectMode: js.UndefOr[from2Lib.from2LibNumbers.`true`] = js.undefined
}

object Anon_ObjectMode {
  @scala.inline
  def apply(objectMode: from2Lib.from2LibNumbers.`true` = null): Anon_ObjectMode = {
    val __obj = js.Dynamic.literal()
    if (objectMode != null) __obj.updateDynamic("objectMode")(objectMode)
    __obj.asInstanceOf[Anon_ObjectMode]
  }
}

