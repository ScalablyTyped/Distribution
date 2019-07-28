package typings.fridaDashGum

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
    val __obj = js.Dynamic.literal(address = address, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ModuleExportDetails]
  }
}

