package typings.atFirebaseComponent

import typings.atFirebaseComponent.atFirebaseComponentBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identifier extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var optional: `true`
}

object Anon_Identifier {
  @scala.inline
  def apply(optional: `true`, identifier: String = null): Anon_Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Identifier]
  }
}

