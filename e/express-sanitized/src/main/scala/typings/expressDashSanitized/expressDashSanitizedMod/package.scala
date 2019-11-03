package typings.expressDashSanitized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashSanitizedMod {
  import typings.express.expressMod.NextFunction
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type e = js.Function0[
    js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit]
  ]
}
