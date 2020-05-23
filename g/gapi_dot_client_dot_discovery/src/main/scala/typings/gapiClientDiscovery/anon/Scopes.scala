package typings.gapiClientDiscovery.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scopes extends js.Object {
  /** Available OAuth 2.0 scopes. */
  var scopes: js.UndefOr[Record[String, DescriptionString]] = js.undefined
}

object Scopes {
  @scala.inline
  def apply(scopes: Record[String, DescriptionString] = null): Scopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopes]
  }
}

