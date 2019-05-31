package typings
package expressDashWinstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWinstonMod {
  type DynamicLevelFunction = js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* err */ stdLib.Error, 
    java.lang.String
  ]
  type DynamicMetaFunction = js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* err */ stdLib.Error, 
    js.Object
  ]
  type MessageTemplate = java.lang.String | (js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    java.lang.String
  ])
  type RequestFilter = js.Function2[/* req */ FilterRequest, /* propName */ java.lang.String, js.Any]
  type ResponseFilter = js.Function2[/* res */ FilterResponse, /* propName */ java.lang.String, js.Any]
  type RouteFilter = js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    scala.Boolean
  ]
}
