package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TypeString extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Anon_TypeString {
  @scala.inline
  def apply(`type`: String = null): Anon_TypeString = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeString]
  }
}

