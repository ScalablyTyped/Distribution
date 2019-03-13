package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-logger", "Transport")
@js.native
class Transport[T /* <: TransportOptions */] () extends js.Object {
  def this(options: T) = this()
  val enabled: scala.Boolean = js.native
  var level: LoggerLevel = js.native
  def close(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def log(level: LoggerLevel, args: js.Array[_], meta: js.Object): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def shouldLog(level: LoggerLevel): scala.Boolean = js.native
}

