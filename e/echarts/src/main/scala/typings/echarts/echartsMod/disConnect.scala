package typings.echarts.echartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("echarts/lib/echarts", "disConnect")
@js.native
object disConnect extends js.Object {
  
  /**
    * Disconnects interaction of multiple chart series. To have one single
    * instance to be removed, you can set `group` of chart instance to be null.
    *
    * @param {string} group Group id in string.
    */
  def apply(group: String): Unit = js.native
}
