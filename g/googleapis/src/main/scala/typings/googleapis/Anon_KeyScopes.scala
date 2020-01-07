package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_KeyScopes extends js.Object {
  var scopes: js.UndefOr[StringDictionary[Anon_DescriptionString]] = js.native
}

object Anon_KeyScopes {
  @scala.inline
  def apply(scopes: StringDictionary[Anon_DescriptionString] = null): Anon_KeyScopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyScopes]
  }
}

