package typings.firebaseComponent

import typings.firebaseComponent.firebaseComponentBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentifier extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var optional: `true`
}

object AnonIdentifier {
  @scala.inline
  def apply(optional: `true`, identifier: String = null): AnonIdentifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdentifier]
  }
}

