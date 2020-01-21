package typings.dojo.dojox.grid.enhanced.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/_StoreLayer.html
  *
  *
  */
trait StoreLayer_ extends js.Object {
  /**
    * Wrap the store with the given layer.
    *
    * @param store The store to be wrapped.
    * @param funcName
    * @param layer The layer to be used
    * @param layerFuncName
    */
  def wrap(
    store: js.Any,
    funcName: js.Any,
    layer: typings.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer,
    layerFuncName: js.Any
  ): js.Any
}

object StoreLayer_ {
  @scala.inline
  def apply(
    wrap: (js.Any, js.Any, typings.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer, js.Any) => js.Any
  ): StoreLayer_ = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction4(wrap))
  
    __obj.asInstanceOf[StoreLayer_]
  }
}

