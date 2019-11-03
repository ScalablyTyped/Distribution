package typings.expressDashServeDashStaticDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashServeDashStaticDashCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.rangeDashParser.rangeDashParserMod.Ranges
  import typings.std.Error
  import typings.std.RegExp

  type ApplicationRequestHandler[T] = IRouterHandler[T] with IRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary], T])
  type Dictionary[T] = StringDictionary[T]
  type Errback = js.Function1[/* err */ Error, Unit]
  type ErrorRequestHandler[P /* <: Params */] = js.Function4[
    /* err */ js.Any, 
    /* req */ Request[P], 
    /* res */ Response, 
    /* next */ NextFunction, 
    js.Any
  ]
  type Handler = RequestHandler[ParamsDictionary]
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  type Params = ParamsDictionary | ParamsArray
  type ParamsArray = js.Array[String]
  type ParamsDictionary = StringDictionary[String]
  type PathParams = String | RegExp | (js.Array[String | RegExp])
  type RequestHandler[P /* <: Params */] = js.Function3[/* req */ Request[P], /* res */ Response, /* next */ NextFunction, js.Any]
  type RequestHandlerParams[P /* <: Params */] = RequestHandler[P] | ErrorRequestHandler[P] | (js.Array[RequestHandler[P] | ErrorRequestHandler[P]])
  type RequestParamHandler = js.Function5[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* next */ NextFunction, 
    /* value */ js.Any, 
    /* name */ String, 
    js.Any
  ]
  type RequestRanges = Ranges
  type Router = IRouter
  type Send[T] = js.Function1[/* body */ js.UndefOr[js.Any], T]
}
