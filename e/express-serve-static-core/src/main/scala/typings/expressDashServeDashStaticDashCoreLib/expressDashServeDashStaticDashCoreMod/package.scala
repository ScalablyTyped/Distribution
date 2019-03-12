package typings
package expressDashServeDashStaticDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashServeDashStaticDashCoreMod {
  type ApplicationRequestHandler[T] = IRouterHandler[T] with IRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams, T])
  type Errback = js.Function1[/* err */ stdLib.Error, scala.Unit]
  type ErrorRequestHandler = js.Function4[/* err */ js.Any, /* req */ Request, /* res */ Response, /* next */ NextFunction, js.Any]
  type Handler = RequestHandler
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type PathParams = java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])
  type RequestHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, js.Any]
  type RequestHandlerParams = RequestHandler | ErrorRequestHandler | (js.Array[RequestHandler | ErrorRequestHandler])
  type RequestParamHandler = js.Function5[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    /* value */ js.Any, 
    /* name */ java.lang.String, 
    js.Any
  ]
  type RequestRanges = rangeDashParserLib.rangeDashParserMod.RangeParserNs.Ranges
  type Router = IRouter
  type Send = js.Function1[/* body */ js.UndefOr[js.Any], Response]
}
