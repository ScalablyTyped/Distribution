package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FamilySize extends js.Object {
  var family: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
}

object Anon_FamilySize {
  @scala.inline
  def apply(family: String = null, size: String = null): Anon_FamilySize = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FamilySize]
  }
}

