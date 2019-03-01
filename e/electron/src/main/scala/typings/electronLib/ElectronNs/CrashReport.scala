package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashReport extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/crash-report
  var date: stdLib.Date
  var id: java.lang.String
}

object CrashReport {
  @scala.inline
  def apply(date: stdLib.Date, id: java.lang.String): CrashReport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[CrashReport]
  }
}

