package typings.evernote.anon

import typings.evernote.mod.Types.UserIdentityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongIdentifier extends js.Object {
  var longIdentifier: js.UndefOr[Double] = js.undefined
  var stringIdentifier: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[UserIdentityType] = js.undefined
}

object LongIdentifier {
  @scala.inline
  def apply(
    longIdentifier: js.UndefOr[Double] = js.undefined,
    stringIdentifier: String = null,
    `type`: UserIdentityType = null
  ): LongIdentifier = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(longIdentifier)) __obj.updateDynamic("longIdentifier")(longIdentifier.get.asInstanceOf[js.Any])
    if (stringIdentifier != null) __obj.updateDynamic("stringIdentifier")(stringIdentifier.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongIdentifier]
  }
}

