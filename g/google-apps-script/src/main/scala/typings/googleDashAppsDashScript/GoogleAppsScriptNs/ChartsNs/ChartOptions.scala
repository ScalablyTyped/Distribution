package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  def get(option: String): js.Object
}

object ChartOptions {
  @scala.inline
  def apply(get: String => js.Object): ChartOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ChartOptions]
  }
}

