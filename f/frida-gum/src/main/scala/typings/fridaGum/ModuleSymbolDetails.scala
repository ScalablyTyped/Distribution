package typings.fridaGum

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
    * Size in bytes, if available.
    */
  var size: js.UndefOr[Double] = js.undefined
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
    section: ModuleSymbolSectionDetails = null,
    size: Int | Double = null
  ): ModuleSymbolDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], isGlobal = isGlobal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSymbolDetails]
  }
}

