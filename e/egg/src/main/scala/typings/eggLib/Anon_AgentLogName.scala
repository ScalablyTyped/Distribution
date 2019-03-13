package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentLogName extends js.Object {
  var agentLogName: java.lang.String
  var allowDebugAtProd: scala.Boolean
  var appLogName: java.lang.String
  var buffer: scala.Boolean
  var consoleLevel: eggLib.eggMod.LoggerLevel
  var coreLogName: java.lang.String
  var coreLogger: js.Any
  var dir: java.lang.String
  var disableConsoleAfterReady: scala.Boolean
  var encoding: java.lang.String
  var env: eggLib.eggMod.EggEnvType
  var errorLogName: java.lang.String
  var level: eggLib.eggMod.LoggerLevel
  var outputJSON: scala.Boolean
}

object Anon_AgentLogName {
  @scala.inline
  def apply(
    agentLogName: java.lang.String,
    allowDebugAtProd: scala.Boolean,
    appLogName: java.lang.String,
    buffer: scala.Boolean,
    consoleLevel: eggLib.eggMod.LoggerLevel,
    coreLogName: java.lang.String,
    coreLogger: js.Any,
    dir: java.lang.String,
    disableConsoleAfterReady: scala.Boolean,
    encoding: java.lang.String,
    env: eggLib.eggMod.EggEnvType,
    errorLogName: java.lang.String,
    level: eggLib.eggMod.LoggerLevel,
    outputJSON: scala.Boolean
  ): Anon_AgentLogName = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName, allowDebugAtProd = allowDebugAtProd, appLogName = appLogName, buffer = buffer, consoleLevel = consoleLevel, coreLogName = coreLogName, coreLogger = coreLogger, dir = dir, disableConsoleAfterReady = disableConsoleAfterReady, encoding = encoding, env = env.asInstanceOf[js.Any], errorLogName = errorLogName, level = level, outputJSON = outputJSON)
  
    __obj.asInstanceOf[Anon_AgentLogName]
  }
}

