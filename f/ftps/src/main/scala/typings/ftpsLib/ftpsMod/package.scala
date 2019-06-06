package typings
package ftpsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ftpsMod {
  type FTPCallbackFunction = js.Function2[/* err */ stdLib.Error | scala.Null, /* results */ FTPResults, js.Any]
}
