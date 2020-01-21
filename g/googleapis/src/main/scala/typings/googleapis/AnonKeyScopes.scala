package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyScopes extends js.Object {
  var scopes: js.UndefOr[StringDictionary[AnonDescriptionString]] = js.native
}

object AnonKeyScopes {
  @scala.inline
  def apply(scopes: StringDictionary[AnonDescriptionString] = null): AnonKeyScopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyScopes]
  }
}

