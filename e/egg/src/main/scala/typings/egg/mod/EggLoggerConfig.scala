package typings.egg.mod

import typings.egg.anon.PartialEggLoggerOptions
import typings.egg.eggStrings.duplicate
import typings.egg.eggStrings.ignore
import typings.egg.eggStrings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent egg.egg.RemoveSpecProp<egg-logger.egg-logger.EggLoggersOptions, 'type'> */
@js.native
trait EggLoggerConfig extends js.Object {
  
  var agentLogName: String = js.native
  
  /** allow debug log at prod, defaults to true */
  var allowDebugAtProd: js.UndefOr[Boolean] = js.native
  
  var appLogName: String = js.native
  
  var buffer: js.UndefOr[Boolean] = js.native
  
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
  
  var consoleLevel: js.UndefOr[typings.eggLogger.mod.LoggerLevel] = js.native
  
  var coreLogName: String = js.native
  
  /** custom config of coreLogger */
  var coreLogger: js.UndefOr[PartialEggLoggerOptions] = js.native
  
  var dir: String = js.native
  
  /** disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`. */
  var disableConsoleAfterReady: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var eol: js.UndefOr[String] = js.native
  
  var errorLogName: String = js.native
  
  var level: js.UndefOr[typings.eggLogger.mod.LoggerLevel] = js.native
  
  var outputJSON: js.UndefOr[Boolean] = js.native
}
object EggLoggerConfig {
  
  @scala.inline
  def apply(agentLogName: String, appLogName: String, coreLogName: String, dir: String, errorLogName: String): EggLoggerConfig = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggerConfig]
  }
  
  @scala.inline
  implicit class EggLoggerConfigOps[Self <: EggLoggerConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowDebugAtProd(value: Boolean): Self = this.set("allowDebugAtProd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDebugAtProd: Self = this.set("allowDebugAtProd", js.undefined)
    
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setConcentrateError(value: duplicate | redirect | ignore): Self = this.set("concentrateError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcentrateError: Self = this.set("concentrateError", js.undefined)
    
    @scala.inline
    def setConsoleLevel(value: typings.eggLogger.mod.LoggerLevel): Self = this.set("consoleLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsoleLevel: Self = this.set("consoleLevel", js.undefined)
    
    @scala.inline
    def setCoreLogger(value: PartialEggLoggerOptions): Self = this.set("coreLogger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreLogger: Self = this.set("coreLogger", js.undefined)
    
    @scala.inline
    def setDisableConsoleAfterReady(value: Boolean): Self = this.set("disableConsoleAfterReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableConsoleAfterReady: Self = this.set("disableConsoleAfterReady", js.undefined)
    
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
    def setLevel(value: typings.eggLogger.mod.LoggerLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setOutputJSON(value: Boolean): Self = this.set("outputJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputJSON: Self = this.set("outputJSON", js.undefined)
  }
}
