package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoggerLevel extends js.Object {
  var ALL: Double
  var DEBUG: Double
  var ERROR: Double
  var INFO: Double
  var NONE: Double
  var WARN: Double
}

object ILoggerLevel {
  @scala.inline
  def apply(ALL: Double, DEBUG: Double, ERROR: Double, INFO: Double, NONE: Double, WARN: Double): ILoggerLevel = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILoggerLevel]
  }
}

