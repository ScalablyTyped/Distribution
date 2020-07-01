package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scopes extends js.Object {
  var scopes: js.UndefOr[StringDictionary[DescriptionString]] = js.native
}

object Scopes {
  @scala.inline
  def apply(scopes: StringDictionary[DescriptionString] = null): Scopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopes]
  }
}

