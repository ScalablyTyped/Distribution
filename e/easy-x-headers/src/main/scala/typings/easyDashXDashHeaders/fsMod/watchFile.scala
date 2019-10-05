package typings.easyDashXDashHeaders.fsMod

import typings.easyDashXDashHeaders.Anon_Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "watchFile")
@js.native
object watchFile extends js.Object {
  def apply(filename: String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  def apply(
    filename: String,
    options: Anon_Interval,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
}

