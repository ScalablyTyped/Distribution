package typings.echarts.libEchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts/lib/echarts", "registerMap")
@js.native
object registerMap extends js.Object {
  /**
    * Registers available maps. This can only be used after including
    * [geo](https://echarts.apache.org/option.html#geo)
    * component or chart series of
    * [map](https://echarts.apache.org/option.html#series-map).
    *
    * @param {string} mapName Map name, referring to `map` value set in
    *     [geo](https://echarts.apache.org/option.html#geo)
    *     component or
    *     [map](https://echarts.apache.org/option.html#series-map).
    * @param {object} geoJson Data in GeoJson format. See
    *     [http://geojson.org/](http://geojson.org/) for more format information.
    * @param {object} [specialAreas] Zoomed part of a specific area in the map
    *     for better visual effect.
    *     See [USA Population Estimates example](https://echarts.apache.org/examples/en/editor.html?c=map-usa).
    */
  def apply(mapName: String, geoJson: js.Object): Unit = js.native
  def apply(mapName: String, geoJson: js.Object, specialAreas: js.Object): Unit = js.native
}

