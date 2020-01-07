package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Discriminant extends js.Object {
  var discriminant: js.UndefOr[String] = js.native
  var map: js.UndefOr[js.Array[Anon_Ref]] = js.native
}

object Anon_Discriminant {
  @scala.inline
  def apply(discriminant: String = null, map: js.Array[Anon_Ref] = null): Anon_Discriminant = {
    val __obj = js.Dynamic.literal()
    if (discriminant != null) __obj.updateDynamic("discriminant")(discriminant.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Discriminant]
  }
}

