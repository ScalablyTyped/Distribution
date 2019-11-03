package typings.expressDashUseragent.expressDashUseragentMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-useragent", "express")
@js.native
object express extends js.Object {
  def apply(): js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* next */ js.UndefOr[NextFunction], 
    Unit
  ] = js.native
}

