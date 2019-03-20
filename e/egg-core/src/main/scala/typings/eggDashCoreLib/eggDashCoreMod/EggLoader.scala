package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-core", "EggLoader")
@js.native
class EggLoader[T, Config] protected () extends js.Object {
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
  var ContextLoader: eggDashCoreLib.eggDashCoreMod.ContextLoader = js.native
  var FileLoader: eggDashCoreLib.eggDashCoreMod.FileLoader = js.native
  var app: T = js.native
  var appInfo: EggAppInfo = js.native
  var config: Config = js.native
  var eggPaths: js.Array[java.lang.String] = js.native
  var pkg: PlainObject[_] = js.native
  var plugins: Plugins = js.native
  var serverScope: java.lang.String = js.native
  /**
    * Get app info
    * @return {EggAppInfo} appInfo
    * @since 1.0.0
    */
  def getAppInfo(): EggAppInfo = js.native
  /**
    * Get home directory
    * @return {String} home directory
    * @since 3.4.0
    */
  def getHomedir(): java.lang.String = js.native
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
  def getLoadUnits(): js.Array[eggDashCoreLib.Anon_PathType] = js.native
  def getTypeFiles(filename: java.lang.String): js.Array[java.lang.String] = js.native
  /* protected */ def loadAgentExtend(): scala.Unit = js.native
  /* protected */ def loadApplicationExtend(): scala.Unit = js.native
  // load methods
  /* protected */ def loadConfig(): scala.Unit = js.native
  /* protected */ def loadContextExtend(): scala.Unit = js.native
  /* protected */ def loadController(): scala.Unit = js.native
  /* protected */ def loadController(opt: stdLib.Partial[FileLoaderOption]): scala.Unit = js.native
  /* protected */ def loadCustomAgent(): scala.Unit = js.native
  /* protected */ def loadCustomApp(): scala.Unit = js.native
  /* protected */ def loadCustomLoader(): scala.Unit = js.native
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
  def loadFile[T](filepath: java.lang.String, inject: js.Any*): T = js.native
  /* protected */ def loadHelperExtend(): scala.Unit = js.native
  /* protected */ def loadMiddleware(): scala.Unit = js.native
  /* protected */ def loadMiddleware(opt: stdLib.Partial[FileLoaderOption]): scala.Unit = js.native
  /* protected */ def loadPlugin(): scala.Unit = js.native
  /* protected */ def loadRequestExtend(): scala.Unit = js.native
  /* protected */ def loadResponseExtend(): scala.Unit = js.native
  /* protected */ def loadRouter(): scala.Unit = js.native
  /* protected */ def loadService(): scala.Unit = js.native
  /* protected */ def loadService(opt: stdLib.Partial[ContextLoaderOption]): scala.Unit = js.native
  /**
    * Load files using {@link FileLoader}, inject to {@link Application}
    * @param {String|Array} directory - see {@link FileLoader}
    * @param {String} property - see {@link FileLoader}
    * @param {Object} opt - see {@link FileLoader}
    * @since 1.0.0
    */
  def loadToApp(directory: java.lang.String, property: java.lang.String): scala.Unit = js.native
  def loadToApp(directory: java.lang.String, property: java.lang.String, opt: stdLib.Partial[FileLoaderOption]): scala.Unit = js.native
  def loadToApp(directory: js.Array[java.lang.String], property: java.lang.String): scala.Unit = js.native
  def loadToApp(
    directory: js.Array[java.lang.String],
    property: java.lang.String,
    opt: stdLib.Partial[FileLoaderOption]
  ): scala.Unit = js.native
  /**
    * Load files using {@link ContextLoader}
    * @param {String|Array} directory - see {@link ContextLoader}
    * @param {String} property - see {@link ContextLoader}
    * @param {Object} opt - see {@link ContextLoader}
    * @since 1.0.0
    */
  def loadToContext(directory: java.lang.String, property: java.lang.String): scala.Unit = js.native
  def loadToContext(directory: java.lang.String, property: java.lang.String, opt: stdLib.Partial[ContextLoaderOption]): scala.Unit = js.native
  def loadToContext(directory: js.Array[java.lang.String], property: java.lang.String): scala.Unit = js.native
  def loadToContext(
    directory: js.Array[java.lang.String],
    property: java.lang.String,
    opt: stdLib.Partial[ContextLoaderOption]
  ): scala.Unit = js.native
  def resolveModule(filepath: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

