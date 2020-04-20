package typings.dojo.dojox.grid.enhanced.plugins.filter

import typings.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/FilterLayer.html
  *
  *
  */
trait FilterLayer_ extends js.Object {
  /**
    *
    */
  def ClientSideFilterLayer(): Unit
  /**
    *
    */
  def ServerSideFilterLayer(): Unit
  /**
    * Wrap the store with the given layer.
    *
    * @param store The store to be wrapped.
    * @param funcName
    * @param layer The layer to be used
    * @param layerFuncName
    */
  def wrap(store: js.Any, funcName: js.Any, layer: StoreLayer, layerFuncName: js.Any): js.Any
}

object FilterLayer_ {
  @scala.inline
  def apply(
    ClientSideFilterLayer: () => Unit,
    ServerSideFilterLayer: () => Unit,
    wrap: (js.Any, js.Any, StoreLayer, js.Any) => js.Any
  ): FilterLayer_ = {
    val __obj = js.Dynamic.literal(ClientSideFilterLayer = js.Any.fromFunction0(ClientSideFilterLayer), ServerSideFilterLayer = js.Any.fromFunction0(ServerSideFilterLayer), wrap = js.Any.fromFunction4(wrap))
    __obj.asInstanceOf[FilterLayer_]
  }
}

