package typings
package googleDotVisualizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: stdLib.Date
  var start: stdLib.Date
}

object Anon_End {
  @scala.inline
  def apply(end: stdLib.Date, start: stdLib.Date): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}

