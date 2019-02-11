package typings
package expressDashWinstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWinstonMod {
  type DynamicLevelFunction = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* err */ nodeLib.Error, 
    java.lang.String
  ]
  type DynamicMetaFunction = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* err */ nodeLib.Error, 
    js.Object
  ]
  type ErrorLoggerOptions = ErrorLoggerOptionsWithTransports | ErrorLoggerOptionsWithWinstonInstance
  type LoggerOptions = LoggerOptionsWithTransports | LoggerOptionsWithWinstonInstance
  type RequestFilter = js.Function2[/* req */ FilterRequest, /* propName */ java.lang.String, js.Any]
  type ResponseFilter = js.Function2[/* res */ FilterResponse, /* propName */ java.lang.String, js.Any]
  type RouteFilter = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    scala.Boolean
  ]
}
