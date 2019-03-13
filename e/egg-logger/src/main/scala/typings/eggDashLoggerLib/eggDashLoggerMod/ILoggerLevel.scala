package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoggerLevel extends js.Object {
  var ALL: scala.Double
  var DEBUG: scala.Double
  var ERROR: scala.Double
  var INFO: scala.Double
  var NONE: scala.Double
  var WARN: scala.Double
}

object ILoggerLevel {
  @scala.inline
  def apply(
    ALL: scala.Double,
    DEBUG: scala.Double,
    ERROR: scala.Double,
    INFO: scala.Double,
    NONE: scala.Double,
    WARN: scala.Double
  ): ILoggerLevel = {
    val __obj = js.Dynamic.literal(ALL = ALL, DEBUG = DEBUG, ERROR = ERROR, INFO = INFO, NONE = NONE, WARN = WARN)
  
    __obj.asInstanceOf[ILoggerLevel]
  }
}

