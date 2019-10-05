package typings.easyDashXDashHeaders.fsMod

import typings.easyDashXDashHeaders.Anon_EncodingFlag
import typings.easyDashXDashHeaders.Anon_EncodingFlagMode
import typings.easyDashXDashHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: String, data: js.Any, options: Anon_EncodingFlag): Unit = js.native
  def apply(filename: String, data: js.Any, options: Anon_EncodingFlagMode): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: Anon_EncodingFlagMode,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: Anon_EncodingFlag,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

