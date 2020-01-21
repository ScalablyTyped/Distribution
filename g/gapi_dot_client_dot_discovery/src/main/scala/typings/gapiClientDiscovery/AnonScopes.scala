package typings.gapiClientDiscovery

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopes extends js.Object {
  /** Available OAuth 2.0 scopes. */
  var scopes: js.UndefOr[Record[String, AnonDescriptionString]] = js.undefined
}

object AnonScopes {
  @scala.inline
  def apply(scopes: Record[String, AnonDescriptionString] = null): AnonScopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopes]
  }
}

