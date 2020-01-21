package typings.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiscriminant extends js.Object {
  /** The name of the type discriminant property. */
  var discriminant: js.UndefOr[String] = js.undefined
  /** The map of discriminant value to schema to use for parsing.. */
  var map: js.UndefOr[js.Array[AnonRef]] = js.undefined
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

