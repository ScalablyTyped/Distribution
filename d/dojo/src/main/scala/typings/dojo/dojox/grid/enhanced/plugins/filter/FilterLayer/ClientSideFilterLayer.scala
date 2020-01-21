package typings.dojo.dojox.grid.enhanced.plugins.filter.FilterLayer

import typings.dojo.dojox.grid.enhanced.plugins.filter.ConditionExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/FilterLayer.ClientSideFilterLayer.html
  *
  * Add a client side filter layer on top of the data store,
  * so any filter expression can be applied to the store.
  *
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.filter.FilterLayer.ClientSideFilterLayer")
@js.native
class ClientSideFilterLayer protected () extends js.Object {
  def this(args: js.Any) = this()
  /**
    *
    */
  var layerFuncName: String = js.native
  /**
    *
    */
  var tags: js.Array[_] = js.native
  /**
    * The get/set function of the enabled status of this layer
    *
    * @param toEnable               OptionalIf given, is a setter, otherwise, it's getter.
    */
  def enabled(toEnable: Boolean): Boolean = js.native
  /**
    * The get/set function for fetchAll.
    *
    * @param toFetchAll               OptionalIf provided, it's a set function, otherwise it's a get function.
    */
  def fetchAllOnFirstFilter(toFetchAll: Boolean): js.Any = js.native
  /**
    * See _FilterLayerMixin.filterDef
    *
    * @param filter               Optional
    */
  def filterDef(filter: js.Any): js.Any = js.native
  /**
    * See _FilterLayerMixin.filterDef
    *
    * @param filter               Optional
    */
  def filterDef(filter: ConditionExpr): js.Any = js.native
  /**
    *
    * @param store
    */
  def initialize(store: js.Any): Unit = js.native
  /**
    * Get the name of this store layer.
    * The default name retrieved from class name, which should have a pattern of "{name}Layer".
    * If this pattern does not exist, the whole class name will be this layer's name.
    * It's better to override this method if your class name is too complicated.
    *
    */
  def name(): js.Any = js.native
  /**
    *
    * @param filter
    */
  def onFilterDefined(filter: js.Any): Unit = js.native
  /**
    * Called when store data is filtered. This event is before onComplete, after onBegin.
    *
    * @param filteredSize The number of remaining fetched items after filtering.
    * @param totalSize The number of original fetched items.
    */
  def onFiltered(filteredSize: Double, totalSize: Double): Unit = js.native
  /**
    *
    * @param mapping
    */
  def onRowMappingChange(mapping: js.Any): Unit = js.native
  /**
    *
    */
  def originFetch(): js.Any = js.native
  /**
    * Set the user defined way to retrieve data from store.
    *
    * @param getter
    */
  def setGetter(getter: js.Function): Unit = js.native
  /**
    *
    * @param store
    */
  def uninitialize(store: js.Any): Unit = js.native
}

