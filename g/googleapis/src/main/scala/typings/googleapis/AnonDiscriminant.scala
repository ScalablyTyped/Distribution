package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiscriminant extends js.Object {
  var discriminant: js.UndefOr[String] = js.native
  var map: js.UndefOr[js.Array[AnonRef]] = js.native
}

object AnonDiscriminant {
  @scala.inline
  def apply(discriminant: String = null, map: js.Array[AnonRef] = null): AnonDiscriminant = {
    val __obj = js.Dynamic.literal()
    if (discriminant != null) __obj.updateDynamic("discriminant")(discriminant.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiscriminant]
  }
}

