package typings.expressWinston.mod

import typings.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressWinston.mod.LoggerOptionsWithTransports
  - typings.expressWinston.mod.LoggerOptionsWithWinstonInstance
*/
trait LoggerOptions extends js.Object

object LoggerOptions {
  @scala.inline
  def LoggerOptionsWithTransports(transports: js.Array[typings.winstonTransport.mod.^]): LoggerOptions = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  def LoggerOptionsWithWinstonInstance(winstonInstance: Logger): LoggerOptions = {
    val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

