package typings
package fridaDashGumLib

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
  var module: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Imported symbol name.
    */
  var name: java.lang.String
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
    name: java.lang.String,
    address: NativePointer = null,
    module: java.lang.String = null,
    slot: NativePointer = null,
    `type`: ModuleImportType = null
  ): ModuleImportDetails = {
    val __obj = js.Dynamic.literal(name = name)
    if (address != null) __obj.updateDynamic("address")(address)
    if (module != null) __obj.updateDynamic("module")(module)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ModuleImportDetails]
  }
}

