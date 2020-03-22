package typings.errorhandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LoggingCallback = js.Function4[
    /* err */ typings.std.Error, 
    /* str */ java.lang.String, 
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typings.express.mod.Response_[js.Any], 
    scala.Unit
  ]
}
