package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  def get(option: java.lang.String): js.Object
}

object ChartOptions {
  @scala.inline
  def apply(get: js.Function1[java.lang.String, js.Object]): ChartOptions = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[ChartOptions]
  }
}

