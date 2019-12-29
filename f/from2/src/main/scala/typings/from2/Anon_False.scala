package typings.from2

import typings.from2.from2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var objectMode: js.UndefOr[`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(objectMode: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (objectMode != null) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

