package typings.eggCore.mod

import typings.eggCore.anon.PartialContextLoaderOptio
import typings.eggCore.anon.PartialFileLoaderOption
import typings.eggCore.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg-core", "EggLoader")
@js.native
class EggLoader[T, Config, Options /* <: EggLoaderOptions */] protected () extends js.Object {
  /**
    * @constructor
    * @param {Object} options - options
    * @param {String} options.baseDir - the directory of application
    * @param {EggCore} options.app - Application instance
    * @param {Logger} options.logger - logger
    * @param {Object} [options.plugins] - custom plugins
    * @since 1.0.0
    */
  def this(options: EggLoaderOptions) = this()
  
  var ContextLoader: typings.eggCore.mod.ContextLoader = js.native
  
  var FileLoader: typings.eggCore.mod.FileLoader = js.native
  
  var app: T = js.native
  
  var appInfo: EggAppInfo = js.native
  
  var config: Config = js.native
  
  var eggPaths: js.Array[String] = js.native
  
  /**
    * Get app info
    * @return {EggAppInfo} appInfo
    * @since 1.0.0
    */
  def getAppInfo(): EggAppInfo = js.native
  
  def getEggPaths(): js.Array[String] = js.native
  
  /**
    * Get home directory
    * @return {String} home directory
    * @since 3.4.0
    */
  def getHomedir(): String = js.native
  
  /**
    * Get all loadUnit
    *
    * loadUnit is a directory that can be loaded by EggLoader, it has the same structure.
    * loadUnit has a path and a type(app, framework, plugin).
    *
    * The order of the loadUnits:
    *
    * 1. plugin
    * 2. framework
    * 3. app
    *
    * @return {Array} loadUnits
    * @since 1.0.0
    */
  def getLoadUnits(): js.Array[Type] = js.native
  
  def getServerEnv(): String = js.native
  
  def getTypeFiles(filename: String): js.Array[String] = js.native
  
  /* protected */ def loadAgentExtend(): Unit = js.native
  
  /* protected */ def loadApplicationExtend(): Unit = js.native
  
  // load methods
  /* protected */ def loadConfig(): Unit = js.native
  
  /* protected */ def loadContextExtend(): Unit = js.native
  
  /* protected */ def loadController(): Unit = js.native
  /* protected */ def loadController(opt: PartialFileLoaderOption): Unit = js.native
  
  /* protected */ def loadCustomAgent(): Unit = js.native
  
  /* protected */ def loadCustomApp(): Unit = js.native
  
  /* protected */ def loadCustomLoader(): Unit = js.native
  
  // Low Level API
  /**
    * Load single file, will invoke when export is function
    *
    * @param {String} filepath - fullpath
    * @param {Array} arguments - pass rest arguments into the function when invoke
    * @return {Object} exports
    * @example
    * ```js
    * app.loader.loadFile(path.join(app.options.baseDir, 'config/router.js'));
    * ```
    * @since 1.0.0
    */
  def loadFile[T](filepath: String, inject: js.Any*): T = js.native
  
  /* protected */ def loadHelperExtend(): Unit = js.native
  
  /* protected */ def loadMiddleware(): Unit = js.native
  /* protected */ def loadMiddleware(opt: PartialFileLoaderOption): Unit = js.native
  
  /* protected */ def loadPlugin(): Unit = js.native
  
  /* protected */ def loadRequestExtend(): Unit = js.native
  
  /* protected */ def loadResponseExtend(): Unit = js.native
  
  /* protected */ def loadRouter(): Unit = js.native
  
  /* protected */ def loadService(): Unit = js.native
  /* protected */ def loadService(opt: PartialContextLoaderOptio): Unit = js.native
  
  /**
    * Load files using {@link FileLoader}, inject to {@link Application}
    * @param {String|Array} directory - see {@link FileLoader}
    * @param {String} property - see {@link FileLoader}
    * @param {Object} opt - see {@link FileLoader}
    * @since 1.0.0
    */
  def loadToApp(directory: String, property: String): Unit = js.native
  def loadToApp(directory: String, property: String, opt: PartialFileLoaderOption): Unit = js.native
  def loadToApp(directory: js.Array[String], property: String): Unit = js.native
  def loadToApp(directory: js.Array[String], property: String, opt: PartialFileLoaderOption): Unit = js.native
  
  /**
    * Load files using {@link ContextLoader}
    * @param {String|Array} directory - see {@link ContextLoader}
    * @param {String} property - see {@link ContextLoader}
    * @param {Object} opt - see {@link ContextLoader}
    * @since 1.0.0
    */
  def loadToContext(directory: String, property: String): Unit = js.native
  def loadToContext(directory: String, property: String, opt: PartialContextLoaderOptio): Unit = js.native
  def loadToContext(directory: js.Array[String], property: String): Unit = js.native
  def loadToContext(directory: js.Array[String], property: String, opt: PartialContextLoaderOptio): Unit = js.native
  
  var options: Options = js.native
  
  var pkg: PlainObject[_] = js.native
  
  var plugins: Plugins = js.native
  
  def resolveModule(filepath: String): js.UndefOr[String] = js.native
  
  var serverScope: String = js.native
}
