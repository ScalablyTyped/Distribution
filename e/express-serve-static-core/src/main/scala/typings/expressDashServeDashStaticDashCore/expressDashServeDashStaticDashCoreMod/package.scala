package typings.expressDashServeDashStaticDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashServeDashStaticDashCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.rangeDashParser.rangeDashParserMod.Ranges
  import typings.std.Error
  import typings.std.RegExp

  type ApplicationRequestHandler[T] = IRouterHandler[T] with IRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams, T])
  type Dictionary[T] = StringDictionary[T]
  type Errback = js.Function1[/* err */ Error, Unit]
  type ErrorRequestHandler = js.Function4[/* err */ js.Any, /* req */ Request, /* res */ Response, /* next */ NextFunction, js.Any]
  type Handler = RequestHandler
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  type Params = ParamsDictionary | ParamsArray
  type ParamsArray = js.Array[String]
  type ParamsDictionary = Dictionary[String]
  type PathParams = String | RegExp | (js.Array[String | RegExp])
  type RequestHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, js.Any]
  type RequestHandlerParams = RequestHandler | ErrorRequestHandler | (js.Array[RequestHandler | ErrorRequestHandler])
  type RequestParamHandler = js.Function5[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    /* value */ js.Any, 
    /* name */ String, 
    js.Any
  ]
  type RequestRanges = Ranges
  type Router = IRouter
  type Send = js.Function1[/* body */ js.UndefOr[js.Any], Response]
}
