package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.NodeJS.ErrnoException
import typings.easyXapiSupertest.anon.Flag
import typings.easyXapiSupertest.anon.`1`
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
    options: Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    options: `1`,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
}

