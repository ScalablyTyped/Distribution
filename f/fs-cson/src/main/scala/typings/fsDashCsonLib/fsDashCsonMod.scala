package typings
package fsDashCsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-cson", JSImport.Namespace)
@js.native
object fsDashCsonMod extends js.Object {
  def readFile(
    filePath: java.lang.String,
    done: js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def readFileSync(filePath: java.lang.String): js.Any = js.native
  def register(): scala.Unit = js.native
  def updateFile(
    filePath: java.lang.String,
    updater: js.Function1[/* data */ js.Any, _],
    done: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def updateFileSync(filePath: java.lang.String, updater: js.Function1[/* data */ js.Any, _]): scala.Unit = js.native
  def writeFile(
    filePath: java.lang.String,
    data: js.Any,
    done: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFileSafe(
    filePath: java.lang.String,
    data: js.Any,
    done: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFileSafeSync(filePath: java.lang.String, data: js.Any): scala.Unit = js.native
  def writeFileSync(filePath: java.lang.String, data: js.Any): scala.Unit = js.native
}

