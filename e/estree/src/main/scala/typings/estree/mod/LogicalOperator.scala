package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.estree.estreeStrings.VerticallineVerticalline
  - typings.estree.estreeStrings.AmpersandAmpersand
*/
trait LogicalOperator extends js.Object

object LogicalOperator {
  @scala.inline
  def AmpersandAmpersand: typings.estree.estreeStrings.AmpersandAmpersand = this.cast("&&")
  @scala.inline
  def VerticallineVerticalline: typings.estree.estreeStrings.VerticallineVerticalline = this.cast("||")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

