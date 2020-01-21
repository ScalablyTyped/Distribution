package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.estree.estreeStrings.Equalssign
  - typings.estree.estreeStrings.PlussignEqualssign
  - typings.estree.estreeStrings.`-Equalssign`
  - typings.estree.estreeStrings.AsteriskEqualssign
  - typings.estree.estreeStrings.SlashEqualssign
  - typings.estree.estreeStrings.PercentsignEqualssign
  - typings.estree.estreeStrings.AsteriskAsteriskEqualssign
  - typings.estree.estreeStrings.LessthansignLessthansignEqualssign
  - typings.estree.estreeStrings.GreaterthansignGreaterthansignEqualssign
  - typings.estree.estreeStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
  - typings.estree.estreeStrings.VerticallineEqualssign
  - typings.estree.estreeStrings.`^Equalssign`
  - typings.estree.estreeStrings.AmpersandEqualssign
*/
trait AssignmentOperator extends js.Object

object AssignmentOperator {
  @scala.inline
  def `-Equalssign`: typings.estree.estreeStrings.`-Equalssign` = this.cast("-=")
  @scala.inline
  def AmpersandEqualssign: typings.estree.estreeStrings.AmpersandEqualssign = this.cast("&=")
  @scala.inline
  def AsteriskAsteriskEqualssign: typings.estree.estreeStrings.AsteriskAsteriskEqualssign = this.cast("**=")
  @scala.inline
  def AsteriskEqualssign: typings.estree.estreeStrings.AsteriskEqualssign = this.cast("*=")
  @scala.inline
  def Equalssign: typings.estree.estreeStrings.Equalssign = this.cast("=")
  @scala.inline
  def GreaterthansignGreaterthansignEqualssign: typings.estree.estreeStrings.GreaterthansignGreaterthansignEqualssign = this.cast(">>=")
  @scala.inline
  def GreaterthansignGreaterthansignGreaterthansignEqualssign: typings.estree.estreeStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign = this.cast(">>>=")
  @scala.inline
  def LessthansignLessthansignEqualssign: typings.estree.estreeStrings.LessthansignLessthansignEqualssign = this.cast("<<=")
  @scala.inline
  def PercentsignEqualssign: typings.estree.estreeStrings.PercentsignEqualssign = this.cast("%=")
  @scala.inline
  def PlussignEqualssign: typings.estree.estreeStrings.PlussignEqualssign = this.cast("+=")
  @scala.inline
  def SlashEqualssign: typings.estree.estreeStrings.SlashEqualssign = this.cast("/=")
  @scala.inline
  def VerticallineEqualssign: typings.estree.estreeStrings.VerticallineEqualssign = this.cast("|=")
  @scala.inline
  def `^Equalssign`: typings.estree.estreeStrings.`^Equalssign` = this.cast("^=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

