package typings.dojo.dojox.grid.enhanced

import typings.dojo.dojox.grid.EnhancedGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/_Plugin.html
  *
  * Base class for all plugins.
  * Provides common plugin functionality and basic life cycle management.
  *
  * Each concrete plugin must have a name field and is responsible for registering itself to the global plugin registry
  * e.g. for dnd plugin:
  *
  * dojox.grid.EnhancedGrid.registerPlugin("dnd" //plugin name//,
  *                                         dojox.grid.enhanced.plugins.DnD //full class name of a plugin//
  *                                         {"preInit": false, "dependency": ["nestedSorting"]} //properties//);
  * [Keywords] of plugin properties (case sensitive):
  *
  * "preInit": boolean, whether a plugin should be created before EnhancedGrid.postCreate(),
  *  false by default(plugins are created after EnhancedGrid.postCreate()).
  * "dependency": array or string, plugin(s) indicated by "dependency" will be created before the current one.
  *  Note: recursive cycle dependencies are not supported e.g. following dependency is invalid:
  *  pluginA -> pluginB -> pluginA
  *
  * @param inGrid The grid to plug in to.
  * @param option
  */
@JSGlobal("dojox.grid.enhanced._Plugin")
@js.native
class Plugin protected () extends js.Object {
  def this(inGrid: EnhancedGrid, option: js.Any) = this()
  /**
    * Grid that the plugin belongs to
    *
    */
  var grid: js.Object = js.native
  /**
    * Plugin name, e.g. 'nestedSorting', 'dnd'...
    *
    */
  var name: String = js.native
  /**
    * Plugin properties - leveraged with default and user specified properties.
    * e.g. for dnd plugin, it may look like {"class": dojox.grid.enhanced.plugins.DnD, "dependency": ["nestedSorting"], ...}
    *
    */
  var option: js.Object = js.native
  /**
    * Private properties/methods shouldn't be mixin-ed anytime.
    *
    */
  var privates: js.Object = js.native
  /**
    * Connects specified obj/event to specified method of this object.
    *
    * @param obj
    * @param event
    * @param method
    */
  def connect(obj: js.Any, event: js.Any, method: js.Any): js.Any = js.native
  /**
    * Destroy all resources.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Disconnects handle and removes it from connection list.
    *
    * @param handle
    */
  def disconnect(handle: js.Any): Unit = js.native
  /**
    *
    */
  def init(): Unit = js.native
  /**
    *
    */
  def onPostInit(): Unit = js.native
  /**
    *
    */
  def onPreInit(): Unit = js.native
  /**
    * Called when store is changed.
    *
    * @param store
    */
  def onSetStore(store: js.Any): Unit = js.native
  /**
    *
    */
  def onStartUp(): Unit = js.native
  /**
    * Subscribes to the specified topic and calls the specified method
    * of this object.
    *
    * @param topic
    * @param method
    */
  def subscribe(topic: js.Any, method: js.Any): js.Any = js.native
  /**
    * Un-subscribes handle and removes it from subscriptions list.
    *
    * @param handle
    */
  def unsubscribe(handle: js.Any): Unit = js.native
}

