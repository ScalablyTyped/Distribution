package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.AnonEncodingFlag
import typings.easyXapiSupertest.AnonEncodingFlagMode
import typings.easyXapiSupertest.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: String, data: js.Any, options: AnonEncodingFlag): Unit = js.native
  def apply(filename: String, data: js.Any, options: AnonEncodingFlagMode): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: AnonEncodingFlagMode,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: AnonEncodingFlag,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

