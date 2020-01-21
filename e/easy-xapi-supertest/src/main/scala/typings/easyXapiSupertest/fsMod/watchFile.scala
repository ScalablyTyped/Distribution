package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.AnonInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "watchFile")
@js.native
object watchFile extends js.Object {
  def apply(filename: String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  def apply(
    filename: String,
    options: AnonInterval,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
}

