package typings.from2

import typings.from2.from2Numbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectMode extends js.Object {
  var objectMode: js.UndefOr[`true`] = js.undefined
}

object Anon_ObjectMode {
  @scala.inline
  def apply(objectMode: `true` = null): Anon_ObjectMode = {
    val __obj = js.Dynamic.literal()
    if (objectMode != null) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ObjectMode]
  }
}

