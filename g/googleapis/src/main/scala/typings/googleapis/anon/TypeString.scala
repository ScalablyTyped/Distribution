package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeString extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object TypeString {
  @scala.inline
  def apply(`type`: String = null): TypeString = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeString]
  }
}

