package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MergeMode extends js.Object

@JSGlobal("MergeMode")
@js.native
object MergeMode extends js.Object {
  @js.native
  sealed trait JoinTables
    extends devexpressDashWebLib.MergeMode
  
  @js.native
  sealed trait NewParagraph
    extends devexpressDashWebLib.MergeMode
  
  @js.native
  sealed trait NewSection
    extends devexpressDashWebLib.MergeMode
  
  /* 2 */ val JoinTables: JoinTables with scala.Double = js.native
  /* 0 */ val NewParagraph: NewParagraph with scala.Double = js.native
  /* 1 */ val NewSection: NewSection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.MergeMode with scala.Double] = js.native
}

