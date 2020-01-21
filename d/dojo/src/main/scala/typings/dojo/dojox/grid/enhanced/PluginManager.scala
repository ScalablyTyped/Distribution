package typings.dojo.dojox.grid.enhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/_PluginManager.html
  *
  * Singleton plugin manager
  * Plugin manager is responsible for:
  *
  * Loading required plugins
  * Handling collaboration and dependencies among plugins
  * Some plugin dependencies:
  *
  * "columnReordering" attribute won't work when either DnD or Indirect Selections plugin is on.
  *
  * @param inGrid
  */
@JSGlobal("dojox.grid.enhanced._PluginManager")
@js.native
class PluginManager protected () extends js.Object {
  def this(inGrid: js.Any) = this()
  /**
    *
    */
  var registry: String = js.native
  /**
    * Destroy all resources
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param func
    * @param args
    */
  def forEach(func: js.Any, args: js.Any): Unit = js.native
  /**
    * Get plugin("name")
    *
    * @param name Plugin name
    */
  def getPlugin(name: String): js.Any = js.native
  /**
    * Load target plugin which must be already required (require(..))
    *
    * @param clazz Plugin class
    */
  def getPluginClazz(clazz: String): js.Any = js.native
  /**
    * Load target plugin which must be already required (require(..))
    *
    * @param clazz Plugin class
    */
  def getPluginClazz(clazz: js.Function): js.Any = js.native
  /**
    * See if target cell(column) is fixed or not.
    *
    * @param cell Target cell(column)
    */
  def isFixedCell(cell: js.Object): js.Any = js.native
  /**
    * Load required plugin("name")
    *
    * @param name Plugin name
    */
  def loadPlugin(name: String): js.Any = js.native
  /**
    * Check if plugin("name") existed
    *
    * @param name Plugin name
    */
  def pluginExisted(name: String): js.Any = js.native
  /**
    * Load plugins after DataGrid.postCreate() - the default phase when plugins are created
    * See EnhancedGrid.postCreate()
    *
    */
  def postInit(): Unit = js.native
  /**
    * Load appropriate plugins before DataGrid.postCreate().
    * See EnhancedGrid.postCreate()
    *
    */
  def preInit(): Unit = js.native
  /**
    * Register plugins - TODO, a better way rather than global registry?
    *
    * @param clazz Full class name, e.g. "dojox.grid.enhanced.plugins.DnD"
    * @param props               OptionalPlugin properties e.g. {"dependency": ["nestedSorting"], ...}
    */
  def registerPlugin(clazz: String, props: js.Object): Unit = js.native
  /**
    *
    */
  def startup(): Unit = js.native
}

