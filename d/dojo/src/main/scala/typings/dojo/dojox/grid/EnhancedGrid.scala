package typings.dojo.dojox.grid

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.pluginMgr
import typings.dojo.dojoStrings.plugins
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/EnhancedGrid.html
  *
  * Provides enhanced features based on DataGrid
  * EnhancedGrid features are implemented as plugins that could be loaded on demand.
  * Explicit dojo.require() is needed to use these feature plugins.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.grid.EnhancedGrid")
@js.native
class EnhancedGrid () extends DataGrid {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Singleton plugin manager
    *
    */
  var pluginMgr: js.Object = js.native
  /**
    * Plugin properties, e.g. {nestedSorting: true, dnd: true, ...}
    *
    */
  var plugins: js.Object = js.native
  def canSort(colIndex: js.Any): Boolean = js.native
  def canSort(colIndex: js.Any, field: js.Any): Boolean = js.native
  /**
    * Overwrite: rewrite getCellX of view.header
    *
    */
  def createView(): js.Any = js.native
  /**
    *
    * @param field
    */
  def getCellByField(field: js.Any): js.Any = js.native
  @JSName("get")
  def get_pluginMgr(property: pluginMgr): js.Object = js.native
  @JSName("get")
  def get_plugins(property: plugins): js.Object = js.native
  /**
    *
    * @param target
    * @param source
    */
  def mixin(target: js.Any, source: js.Any): Unit = js.native
  /**
    * An easier way for getting a plugin, e.g. grid.plugin('dnd')
    *
    * @param name
    */
  def plugin(name: String): js.Any = js.native
  /**
    *
    * @param clazz
    * @param props
    */
  def registerPlugin(clazz: js.Any, props: js.Any): Unit = js.native
  @JSName("set")
  def set_pluginMgr(property: pluginMgr, value: js.Object): Unit = js.native
  @JSName("set")
  def set_plugins(property: plugins, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_pluginMgr(
    property: pluginMgr,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_plugins(
    property: plugins,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

