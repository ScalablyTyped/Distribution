package typings.electron.ElectronNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashReport extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/crash-report
  var date: Date
  var id: String
}

object CrashReport {
  @scala.inline
  def apply(date: Date, id: String): CrashReport = {
    val __obj = js.Dynamic.literal(date = date, id = id)
  
    __obj.asInstanceOf[CrashReport]
  }
}

