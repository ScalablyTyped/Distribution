package typings.expressDashServeDashStaticDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashServeDashStaticDashCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.rangeDashParser.rangeDashParserMod.Ranges
  import typings.std.Error
  import typings.std.RegExp

  type ApplicationRequestHandler[T] = IRouterHandler[T] with IRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary, _, _], T])
  type Dictionary[T] = StringDictionary[T]
  type Errback = js.Function1[/* err */ Error, Unit]
  type ErrorRequestHandler[P /* <: Params */, ResBody, ReqBody] = js.Function4[
    /* err */ js.Any, 
    /* req */ Request[P, ResBody, ReqBody], 
    /* res */ Response[ResBody], 
    /* next */ NextFunction, 
    js.Any
  ]
  type Handler = RequestHandler[ParamsDictionary, js.Any, js.Any]
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  type Params = ParamsDictionary | ParamsArray
  type ParamsArray = js.Array[String]
  type ParamsDictionary = StringDictionary[String]
  type PathParams = String | RegExp | (js.Array[String | RegExp])
  type RequestHandler[P /* <: Params */, ResBody, ReqBody] = js.Function3[
    /* req */ Request[P, ResBody, ReqBody], 
    /* res */ Response[ResBody], 
    /* next */ NextFunction, 
    js.Any
  ]
  type RequestHandlerParams[P /* <: Params */, ResBody, ReqBody] = (RequestHandler[P, ResBody, ReqBody]) | (ErrorRequestHandler[P, ResBody, ReqBody]) | (js.Array[(RequestHandler[P, js.Any, js.Any]) | (ErrorRequestHandler[P, js.Any, js.Any])])
  type RequestParamHandler = js.Function5[
    /* req */ Request[ParamsDictionary, js.Any, js.Any], 
    /* res */ Response[js.Any], 
    /* next */ NextFunction, 
    /* value */ js.Any, 
    /* name */ String, 
    js.Any
  ]
  type RequestRanges = Ranges
  type Router = IRouter
  type Send[ResBody, T] = js.Function1[/* body */ js.UndefOr[ResBody], T]
}
