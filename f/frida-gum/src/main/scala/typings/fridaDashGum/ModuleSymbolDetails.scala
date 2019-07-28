package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleSymbolDetails extends js.Object {
  /**
    * Absolute address.
    */
  var address: NativePointer
  /**
    * Whether symbol is globally visible.
    */
  var isGlobal: Boolean
  /**
    * Symbol name.
    */
  var name: String
  /**
    * Which section this symbol resides in, if available.
    */
  var section: js.UndefOr[ModuleSymbolSectionDetails] = js.undefined
  /**
    * The kind of symbol.
    */
  var `type`: ModuleSymbolType
}

object ModuleSymbolDetails {
  @scala.inline
  def apply(
    address: NativePointer,
    isGlobal: Boolean,
    name: String,
    `type`: ModuleSymbolType,
    section: ModuleSymbolSectionDetails = null
  ): ModuleSymbolDetails = {
    val __obj = js.Dynamic.literal(address = address, isGlobal = isGlobal, name = name)
    __obj.updateDynamic("type")(`type`)
    if (section != null) __obj.updateDynamic("section")(section)
    __obj.asInstanceOf[ModuleSymbolDetails]
  }
}

