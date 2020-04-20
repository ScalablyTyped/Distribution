package typings.expressSanitized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type e = js.Function0[
    js.Function3[
      /* req */ typings.express.mod.Request_[
        typings.expressServeStaticCore.mod.ParamsDictionary, 
        js.Any, 
        js.Any, 
        typings.expressServeStaticCore.mod.Query
      ], 
      /* res */ typings.express.mod.Response_[js.Any], 
      /* next */ typings.express.mod.NextFunction, 
      scala.Unit
    ]
  ]
}
