package typings.feflowCli.Feflow

import typings.feflowCli.Command
import typings.feflowCli.Hook
import typings.feflowCli.Logger
import typings.feflowCli.anon._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * feflow context
  */
@js.native
trait ctx extends js.Object {
  
  /**
    * Feflow context params
    */
  var args: _empty = js.native
  
  /**
    * Feflow command includes: (register)
    */
  var commander: Command = js.native
  
  /**
    * feflow config
    */
  var config: String = js.native
  
  /**
    * feflow config path
    */
  var configPath: String = js.native
  
  /**
    * Feflow hook includes: (hook)
    */
  var hook: Hook = js.native
  
  /**
    * Feflow logger includes: (trace、debug、info、warn、error、fatal)
    */
  var logger: Logger = js.native
  
  /**
    * Feflow configuration file in the current directory
    * ( .feflowrc.json/.feflowrc.js/.feflowrc.yml )
    */
  var projectConfig: String = js.native
  
  /**
    * Current project path
    */
  var projectPath: String = js.native
  
  /**
    * Feflow home directory path
    */
  var root: String = js.native
  
  /**
    * Feflow home directory package.json path
    */
  var rootPkg: String = js.native
  
  /**
    * Feflow version
    */
  var version: String = js.native
}
object ctx {
  
  @scala.inline
  def apply(
    args: _empty,
    commander: Command,
    config: String,
    configPath: String,
    hook: Hook,
    logger: Logger,
    projectConfig: String,
    projectPath: String,
    root: String,
    rootPkg: String,
    version: String
  ): ctx = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], commander = commander.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configPath = configPath.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], projectConfig = projectConfig.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rootPkg = rootPkg.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ctx]
  }
  
  @scala.inline
  implicit class ctxOps[Self <: ctx] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: _empty): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommander(value: Command): Self = this.set("commander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigPath(value: String): Self = this.set("configPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHook(value: Hook): Self = this.set("hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectConfig(value: String): Self = this.set("projectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectPath(value: String): Self = this.set("projectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPkg(value: String): Self = this.set("rootPkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
