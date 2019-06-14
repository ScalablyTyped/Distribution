package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.unknown
  - fridaDashGumLib.fridaDashGumLibStrings.section
  - fridaDashGumLib.fridaDashGumLibStrings.undefined
  - fridaDashGumLib.fridaDashGumLibStrings.absolute
  - fridaDashGumLib.fridaDashGumLibStrings.`prebound-undefined`
  - fridaDashGumLib.fridaDashGumLibStrings.indirect
  - fridaDashGumLib.fridaDashGumLibStrings.`object`
  - fridaDashGumLib.fridaDashGumLibStrings.function
  - fridaDashGumLib.fridaDashGumLibStrings.file
  - fridaDashGumLib.fridaDashGumLibStrings.common
  - fridaDashGumLib.fridaDashGumLibStrings.tls
*/
trait ModuleSymbolType extends js.Object

object ModuleSymbolType {
  @scala.inline
  def Absolute: fridaDashGumLib.fridaDashGumLibStrings.absolute = this.cast("absolute")
  @scala.inline
  def Common: fridaDashGumLib.fridaDashGumLibStrings.common = this.cast("common")
  @scala.inline
  def File: fridaDashGumLib.fridaDashGumLibStrings.file = this.cast("file")
  @scala.inline
  def Function: fridaDashGumLib.fridaDashGumLibStrings.function = this.cast("function")
  @scala.inline
  def Indirect: fridaDashGumLib.fridaDashGumLibStrings.indirect = this.cast("indirect")
  // ELF
  @scala.inline
  def Object: fridaDashGumLib.fridaDashGumLibStrings.`object` = this.cast("object")
  @scala.inline
  def PreboundUndefined: fridaDashGumLib.fridaDashGumLibStrings.`prebound-undefined` = this.cast("prebound-undefined")
  @scala.inline
  def Section: fridaDashGumLib.fridaDashGumLibStrings.section = this.cast("section")
  @scala.inline
  def Tls: fridaDashGumLib.fridaDashGumLibStrings.tls = this.cast("tls")
  // Mach-O
  @scala.inline
  def Undefined: fridaDashGumLib.fridaDashGumLibStrings.undefined = this.cast("undefined")
  // Common
  @scala.inline
  def Unknown: fridaDashGumLib.fridaDashGumLibStrings.unknown = this.cast("unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

