package typings.expressBunyanLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatFunction = js.Function1[/* meta */ js.Any, java.lang.String]
  type IncludesFunction = js.Function2[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typings.express.mod.Response_[js.Any], 
    js.Any
  ]
  type LevelFunction = js.Function3[
    /* status */ scala.Double, 
    /* err */ typings.std.Error | scala.Null, 
    /* meta */ js.Any, 
    java.lang.String
  ]
  type RequestIdGenFunction = js.Function1[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    java.lang.String
  ]
}
