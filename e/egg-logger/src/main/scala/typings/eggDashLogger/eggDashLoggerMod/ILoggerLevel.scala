package typings.eggDashLogger.eggDashLoggerMod

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
    val __obj = js.Dynamic.literal(ALL = ALL, DEBUG = DEBUG, ERROR = ERROR, INFO = INFO, NONE = NONE, WARN = WARN)
  
    __obj.asInstanceOf[ILoggerLevel]
  }
}

