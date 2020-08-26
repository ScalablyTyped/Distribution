package typings.expressWinston.mod

import typings.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressWinston.mod.ErrorLoggerOptionsWithTransports
  - typings.expressWinston.mod.ErrorLoggerOptionsWithWinstonInstance
*/
trait ErrorLoggerOptions extends js.Object

object ErrorLoggerOptions {
  @scala.inline
  def ErrorLoggerOptionsWithTransports(transports: js.Array[typings.winstonTransport.mod.^]): ErrorLoggerOptions = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLoggerOptions]
  }
  @scala.inline
  def ErrorLoggerOptionsWithWinstonInstance(winstonInstance: Logger): ErrorLoggerOptions = {
    val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLoggerOptions]
  }
}

