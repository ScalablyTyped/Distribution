package typings.ftps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FTPCallbackFunction = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* results */ typings.ftps.mod.FTPResults, 
    js.Any
  ]
}
