package typings
package gapiDotClientDotDiscoveryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scopes extends js.Object {
  /** Available OAuth 2.0 scopes. */
  var scopes: js.UndefOr[stdLib.Record[java.lang.String, Anon_DescriptionString]] = js.undefined
}

object Anon_Scopes {
  @scala.inline
  def apply(scopes: stdLib.Record[java.lang.String, Anon_DescriptionString] = null): Anon_Scopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[Anon_Scopes]
  }
}

