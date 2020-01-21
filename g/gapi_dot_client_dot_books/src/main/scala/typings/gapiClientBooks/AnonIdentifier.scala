package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentifier extends js.Object {
  /** Industry specific volume identifier. */
  var identifier: js.UndefOr[String] = js.undefined
  /** Identifier type. Possible values are ISBN_10, ISBN_13, ISSN and OTHER. */
  var `type`: js.UndefOr[String] = js.undefined
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

