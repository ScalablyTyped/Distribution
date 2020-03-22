package typings.easyXHeaders.fsMod

import typings.easyXHeaders.AnonEncodingFlag
import typings.easyXHeaders.AnonMode
import typings.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: String, data: js.Any, options: AnonEncodingFlag): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: AnonEncodingFlag,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(filename: String, data: js.Any, options: AnonMode): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: AnonMode,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

