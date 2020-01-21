package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentifier extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object AnonIdentifier {
  @scala.inline
  def apply(identifier: String = null, key: String = null): AnonIdentifier = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdentifier]
  }
}

