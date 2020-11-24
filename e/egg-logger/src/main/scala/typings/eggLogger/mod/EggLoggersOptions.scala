package typings.eggLogger.mod

import typings.eggLogger.eggLoggerStrings.duplicate
import typings.eggLogger.eggLoggerStrings.ignore
import typings.eggLogger.eggLoggerStrings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EggLoggersOptions extends js.Object {
  
  var agentLogName: String = js.native
  
  var appLogName: String = js.native
  
  var buffer: js.UndefOr[Boolean] = js.native
  
  // whether write error logger to common-error.log, `duplicate` / `redirect` / `ignore`, default to `duplicate`
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
  
  var consoleLevel: js.UndefOr[LoggerLevel] = js.native
  
  var coreLogName: String = js.native
  
  var dir: String = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var eol: js.UndefOr[String] = js.native
  
  var errorLogName: String = js.native
  
  var level: js.UndefOr[LoggerLevel] = js.native
  
  var outputJSON: js.UndefOr[Boolean] = js.native
  
  var `type`: String = js.native
}
object EggLoggersOptions {
  
  @scala.inline
  def apply(
    agentLogName: String,
    appLogName: String,
    coreLogName: String,
    dir: String,
    errorLogName: String,
    `type`: String
  ): EggLoggersOptions = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggersOptions]
  }
  
  @scala.inline
  implicit class EggLoggersOptionsOps[Self <: EggLoggersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentLogName(value: String): Self = this.set("agentLogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppLogName(value: String): Self = this.set("appLogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreLogName(value: String): Self = this.set("coreLogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLogName(value: String): Self = this.set("errorLogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setConcentrateError(value: duplicate | redirect | ignore): Self = this.set("concentrateError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcentrateError: Self = this.set("concentrateError", js.undefined)
    
    @scala.inline
    def setConsoleLevel(value: LoggerLevel): Self = this.set("consoleLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsoleLevel: Self = this.set("consoleLevel", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setLevel(value: LoggerLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setOutputJSON(value: Boolean): Self = this.set("outputJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputJSON: Self = this.set("outputJSON", js.undefined)
  }
}
