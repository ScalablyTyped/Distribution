package typings.expressWinston

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DynamicLevelFunction = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* res */ typings.express.mod.Response_[js.Any], 
    /* err */ typings.std.Error, 
    java.lang.String
  ]
  type DynamicMetaFunction = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* res */ typings.express.mod.Response_[js.Any], 
    /* err */ typings.std.Error, 
    js.Object
  ]
  type ErrorRouteFilter = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* res */ typings.express.mod.Response_[js.Any], 
    /* err */ typings.std.Error, 
    scala.Boolean
  ]
  type ExceptionToMetaFunction = js.Function1[/* err */ typings.std.Error, js.Object]
  type MessageTemplate = java.lang.String | (js.Function2[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* res */ typings.express.mod.Response_[js.Any], 
    java.lang.String
  ])
  type RequestFilter = js.Function2[
    /* req */ typings.expressWinston.mod.FilterRequest, 
    /* propName */ java.lang.String, 
    js.Any
  ]
  type ResponseFilter = js.Function2[
    /* res */ typings.expressWinston.mod.FilterResponse, 
    /* propName */ java.lang.String, 
    js.Any
  ]
  type RouteFilter = js.Function2[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* res */ typings.express.mod.Response_[js.Any], 
    scala.Boolean
  ]
}
