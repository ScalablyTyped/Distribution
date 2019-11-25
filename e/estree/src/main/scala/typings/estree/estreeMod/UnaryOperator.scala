package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.estree.estreeStrings.`-`
  - typings.estree.estreeStrings.`+`
  - typings.estree.estreeStrings.`!`
  - typings.estree.estreeStrings.`~`
  - typings.estree.estreeStrings.typeof
  - typings.estree.estreeStrings.void
  - typings.estree.estreeStrings.delete
*/
trait UnaryOperator extends js.Object

object UnaryOperator {
  @scala.inline
  def `!`: typings.estree.estreeStrings.`!` = this.cast("!")
  @scala.inline
  def `+`: typings.estree.estreeStrings.`+` = this.cast("+")
  @scala.inline
  def `-`: typings.estree.estreeStrings.`-` = this.cast("-")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.estree.estreeStrings.delete = this.cast("delete")
  @scala.inline
  def typeof: typings.estree.estreeStrings.typeof = this.cast("typeof")
  @scala.inline
  def void: typings.estree.estreeStrings.void = this.cast("void")
  @scala.inline
  def `~`: typings.estree.estreeStrings.`~` = this.cast("~")
}

