package typings.eggLogger.mod

import typings.eggLogger.anon.Excludes
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg-logger", "Logger")
@js.native
class Logger[T /* <: LoggerOptions */] protected () extends Map[String, Transport[TransportOptions]] {
  def this(options: T) = this()
  
  /**
    * End all transports
    */
  def close(): Unit = js.native
  
  def debug(msg: js.Any, args: js.Any*): Unit = js.native
  
  /**
    * disable a transport
    * @param {String} name - transport name
    */
  def disable(name: String): Unit = js.native
  
  /**
    * Duplicate specify level log to the other logger
    * @param {String} level - log level
    * @param {Logger} logger - target logger instance
    * @param {Object} [options] - { excludes: [] }
    */
  def duplicate(level: LoggerLevel, logger: Logger[LoggerOptions]): Unit = js.native
  def duplicate(level: LoggerLevel, logger: Logger[LoggerOptions], options: Excludes): Unit = js.native
  
  /**
    * enable a transport
    * @param {String} name - transport name
    */
  def enable(name: String): Unit = js.native
  
  def error(msg: js.Any, args: js.Any*): Unit = js.native
  
  def info(msg: js.Any, args: js.Any*): Unit = js.native
  
  /**
    * Send log to all transports.
    * It's proxy to {@link Transport}'s log method.'
    * @param {String} level - log level
    * @param {Array} args - log arguments
    * @param {Object} meta - log meta
    */
  def log(level: LoggerLevel, args: js.Array[_], meta: js.Object): Unit = js.native
  
  /**
    * Redirect specify level log to the other logger
    * @param {String} level - log level
    * @param {Logger} logger - target logger instance
    */
  def redirect(level: LoggerLevel, logger: Logger[LoggerOptions]): Unit = js.native
  
  /**
    * Reload all transports
    */
  def reload(): Unit = js.native
  
  /**
    * Un-duplicate specify level log
    * @param {String} level - log level
    */
  def unduplicate(level: LoggerLevel): Unit = js.native
  
  /**
    * Un-redirect specify level log
    * @param {String} level - log level
    */
  def unredirect(level: LoggerLevel): Unit = js.native
  
  def warn(msg: js.Any, args: js.Any*): Unit = js.native
  
  /**
    * write raw log to all transports
    * @param {String} msg - log message
    */
  def write(msg: String): Unit = js.native
}
