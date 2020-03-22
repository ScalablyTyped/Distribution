package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScopes extends js.Object {
  var scopes: js.UndefOr[StringDictionary[AnonDescriptionString]] = js.native
}

object AnonScopes {
  @scala.inline
  def apply(scopes: StringDictionary[AnonDescriptionString] = null): AnonScopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopes]
  }
}

