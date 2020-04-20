package typings.expressRouters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressRoutersMod {
  type RouteConfigAlternative = org.scalablytyped.runtime.StringDictionary[
    (typings.express.mod.RequestHandler[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ]) | (js.Array[
      typings.express.mod.RequestHandler[
        typings.expressServeStaticCore.mod.ParamsDictionary, 
        js.Any, 
        js.Any, 
        typings.expressServeStaticCore.mod.Query
      ]
    ])
  ]
}
