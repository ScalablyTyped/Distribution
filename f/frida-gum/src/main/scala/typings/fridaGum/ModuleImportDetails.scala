package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleImportDetails extends js.Object {
  /**
    * Absolute address, if available.
    */
  var address: js.UndefOr[NativePointer] = js.undefined
  /**
    * Module name, if available.
    */
  var module: js.UndefOr[String] = js.undefined
  /**
    * Imported symbol name.
    */
  var name: String
  /**
    * Memory location where the import is stored, if available.
    */
  var slot: js.UndefOr[NativePointer] = js.undefined
  /**
    * The kind of import, if available.
    */
  var `type`: js.UndefOr[ModuleImportType] = js.undefined
}

object ModuleImportDetails {
  @scala.inline
  def apply(
    name: String,
    address: NativePointer = null,
    module: String = null,
    slot: NativePointer = null,
    `type`: ModuleImportType = null
  ): ModuleImportDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportDetails]
  }
}

