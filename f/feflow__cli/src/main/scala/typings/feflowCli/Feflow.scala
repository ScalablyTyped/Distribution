package typings.feflowCli

import typings.feflowCli.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  feflow namespace
  */
object Feflow {
  
  /**
    * feflow context
    */
  @js.native
  trait ctx extends StObject {
    
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
    implicit class ctxMutableBuilder[Self <: ctx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: _empty): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommander(value: Command): Self = StObject.set(x, "commander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHook(value: Hook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectConfig(value: String): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectPath(value: String): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPkg(value: String): Self = StObject.set(x, "rootPkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
