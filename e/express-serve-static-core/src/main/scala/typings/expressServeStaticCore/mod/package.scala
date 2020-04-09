package typings.expressServeStaticCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ApplicationRequestHandler[T] = typings.expressServeStaticCore.mod.IRouterHandler[T] with (typings.expressServeStaticCore.mod.IRouterMatcher[T, _]) with (js.Function1[
    /* repeated */ typings.expressServeStaticCore.mod.RequestHandlerParams[typings.expressServeStaticCore.mod.ParamsDictionary, _, _], 
    T
  ])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Errback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  type ErrorRequestHandler[P /* <: typings.expressServeStaticCore.mod.Params */, ResBody, ReqBody] = js.Function4[
    /* err */ js.Any, 
    /* req */ typings.expressServeStaticCore.mod.Request[P, ResBody, ReqBody], 
    /* res */ typings.expressServeStaticCore.mod.Response[ResBody], 
    /* next */ typings.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  type Handler = typings.expressServeStaticCore.mod.RequestHandler[typings.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any]
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type Params = typings.expressServeStaticCore.mod.ParamsDictionary | typings.expressServeStaticCore.mod.ParamsArray
  type ParamsArray = js.Array[java.lang.String]
  type ParamsDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type PathParams = java.lang.String | typings.std.RegExp | (js.Array[java.lang.String | typings.std.RegExp])
  type RequestHandler[P /* <: typings.expressServeStaticCore.mod.Params */, ResBody, ReqBody] = js.Function3[
    /* req */ typings.expressServeStaticCore.mod.Request[P, ResBody, ReqBody], 
    /* res */ typings.expressServeStaticCore.mod.Response[ResBody], 
    /* next */ typings.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  type RequestHandlerParams[P /* <: typings.expressServeStaticCore.mod.Params */, ResBody, ReqBody] = (typings.expressServeStaticCore.mod.RequestHandler[P, ResBody, ReqBody]) | (typings.expressServeStaticCore.mod.ErrorRequestHandler[P, ResBody, ReqBody]) | (js.Array[
    (typings.expressServeStaticCore.mod.RequestHandler[P, js.Any, js.Any]) | (typings.expressServeStaticCore.mod.ErrorRequestHandler[P, js.Any, js.Any])
  ])
  type RequestParamHandler = js.Function5[
    /* req */ typings.expressServeStaticCore.mod.Request[typings.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], 
    /* res */ typings.expressServeStaticCore.mod.Response[js.Any], 
    /* next */ typings.expressServeStaticCore.mod.NextFunction, 
    /* value */ js.Any, 
    /* name */ java.lang.String, 
    js.Any
  ]
  type RequestRanges = typings.rangeParser.mod.Ranges
  type Router = typings.expressServeStaticCore.mod.IRouter
  type Send[ResBody, T] = js.Function1[/* body */ js.UndefOr[ResBody], T]
}
