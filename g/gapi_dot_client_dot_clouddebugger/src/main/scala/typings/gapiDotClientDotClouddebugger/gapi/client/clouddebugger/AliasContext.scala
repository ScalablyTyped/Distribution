package typings.gapiDotClientDotClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasContext extends js.Object {
  /** The alias kind. */
  var kind: js.UndefOr[String] = js.undefined
  /** The alias name. */
  var name: js.UndefOr[String] = js.undefined
}

object AliasContext {
  @scala.inline
  def apply(kind: String = null, name: String = null): AliasContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasContext]
  }
}

