package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Effective extends js.Object {
  var effective: js.UndefOr[js.Array[String]] = js.native
}

object Anon_Effective {
  @scala.inline
  def apply(effective: js.Array[String] = null): Anon_Effective = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Effective]
  }
}

