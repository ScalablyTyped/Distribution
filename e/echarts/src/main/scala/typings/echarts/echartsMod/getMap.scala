package typings.echarts.echartsMod

import typings.echarts.echarts.MapObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts", "getMap")
@js.native
object getMap extends js.Object {
  /**
    * Get a registed map.
    *
    * @param {string} mapName Map name.
    * @return {MapObj} Map data.
    */
  def apply(mapName: String): MapObj = js.native
}

