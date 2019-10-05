package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/printer-info
  var description: String
  var isDefault: Boolean
  var name: String
  var status: Double
}

object PrinterInfo {
  @scala.inline
  def apply(description: String, isDefault: Boolean, name: String, status: Double): PrinterInfo = {
    val __obj = js.Dynamic.literal(description = description, isDefault = isDefault, name = name, status = status)
  
    __obj.asInstanceOf[PrinterInfo]
  }
}

