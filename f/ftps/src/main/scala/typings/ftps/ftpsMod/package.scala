package typings.ftps

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ftpsMod {
  type FTPCallbackFunction = js.Function2[/* err */ Error | Null, /* results */ FTPResults, js.Any]
}
