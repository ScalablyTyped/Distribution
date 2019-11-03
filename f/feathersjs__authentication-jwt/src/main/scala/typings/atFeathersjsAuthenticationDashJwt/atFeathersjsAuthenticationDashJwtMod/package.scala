package typings.atFeathersjsAuthenticationDashJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsAuthenticationDashJwtMod {
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type JwtFromRequestFunction = js.Function1[/* req */ Request[ParamsDictionary], String | Null]
}
