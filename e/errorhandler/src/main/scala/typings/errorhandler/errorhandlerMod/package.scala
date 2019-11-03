package typings.errorhandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object errorhandlerMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.std.Error

  type LoggingCallback = js.Function4[
    /* err */ Error, 
    /* str */ String, 
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    Unit
  ]
}
