package typings
package atFeathersjsAuthenticationDashClientLib.atFeathersjsAuthenticationDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthCredentials
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var strategy: java.lang.String
}

object FeathersAuthCredentials {
  @scala.inline
  def apply(
    strategy: java.lang.String,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): FeathersAuthCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strategy")(strategy)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FeathersAuthCredentials]
  }
}

