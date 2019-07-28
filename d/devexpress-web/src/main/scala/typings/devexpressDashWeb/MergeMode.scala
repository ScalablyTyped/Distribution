package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MergeMode extends js.Object

@JSGlobal("MergeMode")
@js.native
object MergeMode extends js.Object {
  @js.native
  sealed trait JoinTables extends MergeMode
  
  @js.native
  sealed trait NewParagraph extends MergeMode
  
  @js.native
  sealed trait NewSection extends MergeMode
  
  /* 2 */ val JoinTables: typings.devexpressDashWeb.MergeMode.JoinTables with Double = js.native
  /* 0 */ val NewParagraph: typings.devexpressDashWeb.MergeMode.NewParagraph with Double = js.native
  /* 1 */ val NewSection: typings.devexpressDashWeb.MergeMode.NewSection with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MergeMode with Double] = js.native
}

