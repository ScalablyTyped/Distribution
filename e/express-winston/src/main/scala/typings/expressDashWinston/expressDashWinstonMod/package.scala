package typings.expressDashWinston

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWinstonMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.std.Error

  type DynamicLevelFunction = js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* err */ Error, String]
  type DynamicMetaFunction = js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* err */ Error, js.Object]
  type MessageTemplate = String | (js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, String])
  type RequestFilter = js.Function2[/* req */ FilterRequest, /* propName */ String, js.Any]
  type ResponseFilter = js.Function2[/* res */ FilterResponse, /* propName */ String, js.Any]
  type RouteFilter = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean]
}
