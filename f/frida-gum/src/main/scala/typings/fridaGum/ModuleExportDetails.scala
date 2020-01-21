package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleExportDetails extends js.Object {
  /**
    * Absolute address.
    */
  var address: NativePointer
  /**
    * Exported symbol name.
    */
  var name: String
  /**
    * The kind of export.
    */
  var `type`: ModuleExportType
}

object ModuleExportDetails {
  @scala.inline
  def apply(address: NativePointer, name: String, `type`: ModuleExportType): ModuleExportDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleExportDetails]
  }
}

