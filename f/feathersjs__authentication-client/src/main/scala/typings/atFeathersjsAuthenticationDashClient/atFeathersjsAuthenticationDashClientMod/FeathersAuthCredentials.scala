package typings.atFeathersjsAuthenticationDashClient.atFeathersjsAuthenticationDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthCredentials
  extends /* index */ StringDictionary[js.Any] {
  var strategy: String
}

object FeathersAuthCredentials {
  @scala.inline
  def apply(strategy: String, StringDictionary: /* index */ StringDictionary[js.Any] = null): FeathersAuthCredentials = {
    val __obj = js.Dynamic.literal(strategy = strategy)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FeathersAuthCredentials]
  }
}

