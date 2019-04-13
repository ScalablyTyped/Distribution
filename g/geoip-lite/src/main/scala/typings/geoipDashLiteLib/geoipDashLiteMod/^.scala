package typings
package geoipDashLiteLib.geoipDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geoip-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def lookup(ip: java.lang.String): Lookup = js.native
  def pretty(ip: scala.Double): java.lang.String = js.native
  def startWatchingDataUpdate(): scala.Unit = js.native
  def stopWatchingDataUpdate(): scala.Unit = js.native
}

