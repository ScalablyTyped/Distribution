package typings.expressDashWinston

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWinstonMod {
  type DynamicLevelFunction = js.Function3[/* req */ Request, /* res */ Response, /* err */ Error, String]
  type DynamicMetaFunction = js.Function3[/* req */ Request, /* res */ Response, /* err */ Error, js.Object]
  type MessageTemplate = String | (js.Function2[/* req */ Request, /* res */ Response, String])
  type RequestFilter = js.Function2[/* req */ FilterRequest, /* propName */ String, js.Any]
  type ResponseFilter = js.Function2[/* res */ FilterResponse, /* propName */ String, js.Any]
  type RouteFilter = js.Function2[/* req */ Request, /* res */ Response, Boolean]
}
