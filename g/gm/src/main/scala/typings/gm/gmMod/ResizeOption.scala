package typings.gm.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.Percentsign
  - typings.gm.gmStrings.`@`
  - typings.gm.gmStrings.Exclamationmark
  - typings.gm.gmStrings.^
  - typings.gm.gmStrings.Lessthansign
  - typings.gm.gmStrings.Greaterthansign
*/
trait ResizeOption extends js.Object

object ResizeOption {
  @scala.inline
  def `@`: typings.gm.gmStrings.`@` = this.cast("@")
  @scala.inline
  def Exclamationmark: typings.gm.gmStrings.Exclamationmark = this.cast("!")
  @scala.inline
  def Greaterthansign: typings.gm.gmStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def Lessthansign: typings.gm.gmStrings.Lessthansign = this.cast("<")
  @scala.inline
  def Percentsign: typings.gm.gmStrings.Percentsign = this.cast("%")
  @scala.inline
  def ^ : typings.gm.gmStrings.^ = this.cast("^")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

