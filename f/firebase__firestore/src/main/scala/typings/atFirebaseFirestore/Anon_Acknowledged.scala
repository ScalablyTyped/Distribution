package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acknowledged extends js.Object {
  var acknowledged: js.UndefOr[js.Array[String]] = js.undefined
  var rejected: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Acknowledged {
  @scala.inline
  def apply(acknowledged: js.Array[String] = null, rejected: js.Array[String] = null): Anon_Acknowledged = {
    val __obj = js.Dynamic.literal()
    if (acknowledged != null) __obj.updateDynamic("acknowledged")(acknowledged.asInstanceOf[js.Any])
    if (rejected != null) __obj.updateDynamic("rejected")(rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Acknowledged]
  }
}

