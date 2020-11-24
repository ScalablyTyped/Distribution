package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg-logger", "Transport")
@js.native
class Transport[T /* <: TransportOptions */] () extends js.Object {
  def this(options: T) = this()
  
  def close(): Unit = js.native
  
  def enable(): Unit = js.native
  
  val enabled: Boolean = js.native
  
  def end(): Unit = js.native
  
  var level: LoggerLevel = js.native
  
  def log(level: LoggerLevel, args: js.Array[_], meta: js.Object): Unit = js.native
  
  def reload(): Unit = js.native
  
  def shouldLog(level: LoggerLevel): Boolean = js.native
}
