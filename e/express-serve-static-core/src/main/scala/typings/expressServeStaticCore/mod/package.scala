package typings.expressServeStaticCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ApplicationRequestHandler[T] = typings.expressServeStaticCore.mod.IRouterHandler[T] with (typings.expressServeStaticCore.mod.IRouterMatcher[T, _]) with (js.Function1[
    /* repeated */ typings.expressServeStaticCore.mod.RequestHandlerParams[typings.expressServeStaticCore.mod.ParamsDictionary, _, _, typings.qs.mod.ParsedQs], 
    T
  ])
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Errback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  
  type ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery] = js.Function4[
    /* err */ js.Any, 
    /* req */ typings.expressServeStaticCore.mod.Request[P, ResBody, ReqBody, ReqQuery], 
    /* res */ typings.expressServeStaticCore.mod.Response[ResBody, scala.Double], 
    /* next */ typings.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  
  type Handler = typings.expressServeStaticCore.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    js.Any, 
    js.Any, 
    typings.qs.mod.ParsedQs
  ]
  
  type Params = typings.expressServeStaticCore.mod.ParamsDictionary | typings.expressServeStaticCore.mod.ParamsArray
  
  type ParamsArray = js.Array[java.lang.String]
  
  type ParamsDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type PathParams = java.lang.String | typings.std.RegExp | (js.Array[java.lang.String | typings.std.RegExp])
  
  type Query = typings.qs.mod.ParsedQs
  
  type RequestHandler[P, ResBody, ReqBody, ReqQuery] = js.Function3[
    /* req */ typings.expressServeStaticCore.mod.Request[P, ResBody, ReqBody, ReqQuery], 
    /* res */ typings.expressServeStaticCore.mod.Response[ResBody, scala.Double], 
    /* next */ typings.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  
  type RequestHandlerParams[P, ResBody, ReqBody, ReqQuery] = (typings.expressServeStaticCore.mod.RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (typings.expressServeStaticCore.mod.ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery]) | (js.Array[
    (typings.expressServeStaticCore.mod.RequestHandler[P, js.Any, js.Any, typings.qs.mod.ParsedQs]) | (typings.expressServeStaticCore.mod.ErrorRequestHandler[P, js.Any, js.Any, typings.qs.mod.ParsedQs])
  ])
  
  type RequestParamHandler = js.Function5[
    /* req */ typings.expressServeStaticCore.mod.Request[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.qs.mod.ParsedQs
    ], 
    /* res */ typings.expressServeStaticCore.mod.Response[js.Any, scala.Double], 
    /* next */ typings.expressServeStaticCore.mod.NextFunction, 
    /* value */ js.Any, 
    /* name */ java.lang.String, 
    js.Any
  ]
  
  type RequestRanges = typings.rangeParser.mod.Ranges
  
  type Router = typings.expressServeStaticCore.mod.IRouter
  
  type Send[ResBody, T] = js.Function1[/* body */ js.UndefOr[ResBody], T]
}
