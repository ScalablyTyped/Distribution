package typings.easyDashXapiDashSupertest.fsMod

import typings.easyDashXapiDashSupertest.Anon_Encoding
import typings.easyDashXapiDashSupertest.Anon_Flag
import typings.easyDashXapiDashSupertest.NodeJS.ErrnoException
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(filename: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    filename: String,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    options: Anon_Encoding,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    options: Anon_Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
}

