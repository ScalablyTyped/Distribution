package typings.dojo.dojox.grid.enhanced.plugins.StoreLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/_StoreLayer._StoreLayer.html
  *
  * The most abstract class of store layers, provides basic utilities and some interfaces.
  *
  */
@JSGlobal("dojox.grid.enhanced.plugins._StoreLayer._StoreLayer")
@js.native
class StoreLayer () extends js.Object {
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
    *
    * @param store
    */
  def initialize(store: js.Any): Unit = js.native
  /**
    *
    */
  def invalidate(): Unit = js.native
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
    */
  def originFetch(): js.Any = js.native
  /**
    *
    * @param store
    */
  def uninitialize(store: js.Any): Unit = js.native
}

