package typings.feflowCli.Feflow

import typings.feflowCli.Command
import typings.feflowCli.Hook
import typings.feflowCli.Logger
import typings.feflowCli.anon._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * feflow context
  */
trait ctx extends js.Object {
  /**
    * Feflow context params
    */
  var args: _empty
  /**
    * Feflow command includes: (register)
    */
  var commander: Command
  /**
    * feflow config
    */
  var config: String
  /**
    * feflow config path
    */
  var configPath: String
  /**
    * Feflow hook includes: (hook)
    */
  var hook: Hook
  /**
    * Feflow logger includes: (trace、debug、info、warn、error、fatal)
    */
  var logger: Logger
  /**
    * Feflow configuration file in the current directory
    * ( .feflowrc.json/.feflowrc.js/.feflowrc.yml )
    */
  var projectConfig: String
  /**
    * Current project path
    */
  var projectPath: String
  /**
    * Feflow home directory path
    */
  var root: String
  /**
    * Feflow home directory package.json path
    */
  var rootPkg: String
  /**
    * Feflow version
    */
  var version: String
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
}

