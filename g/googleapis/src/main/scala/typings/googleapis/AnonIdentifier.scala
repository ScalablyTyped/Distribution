package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIdentifier extends js.Object {
  var identifier: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonIdentifier {
  @scala.inline
  def apply(identifier: String = null, `type`: String = null): AnonIdentifier = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdentifier]
  }
}

