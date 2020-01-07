package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Identifier extends js.Object {
  var identifier: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Anon_Identifier {
  @scala.inline
  def apply(identifier: String = null, `type`: String = null): Anon_Identifier = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Identifier]
  }
}

