package typings.geoipDashLite.geoipDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geoip-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def lookup(ip: String): Lookup = js.native
  def pretty(ip: Double): String = js.native
  def startWatchingDataUpdate(): Unit = js.native
  def stopWatchingDataUpdate(): Unit = js.native
}

