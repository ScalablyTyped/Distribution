package typings.evernote

import typings.evernote.mod.Types.UserIdentityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLongIdentifier extends js.Object {
  var longIdentifier: js.UndefOr[Double] = js.undefined
  var stringIdentifier: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[UserIdentityType] = js.undefined
}

object AnonLongIdentifier {
  @scala.inline
  def apply(
    longIdentifier: Int | Double = null,
    stringIdentifier: String = null,
    `type`: UserIdentityType = null
  ): AnonLongIdentifier = {
    val __obj = js.Dynamic.literal()
    if (longIdentifier != null) __obj.updateDynamic("longIdentifier")(longIdentifier.asInstanceOf[js.Any])
    if (stringIdentifier != null) __obj.updateDynamic("stringIdentifier")(stringIdentifier.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLongIdentifier]
  }
}

