package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MergeMode extends js.Object

/**
  * Lists delimiters that start the new merged range.
  */
@JSGlobal("MergeMode")
@js.native
object MergeMode extends js.Object {
  /**
    * Enables you to join rows, which result from a mail merge involving a table with merged fields, into a whole table.
    */
  @js.native
  sealed trait JoinTables extends MergeMode
  
  /**
    * Specifies that the next merged range starts with a new paragraph.
    */
  @js.native
  sealed trait NewParagraph extends MergeMode
  
  /**
    * Specifies that the next merged range starts with a new section. The section break type is obtained from the previous section break or set to the NextPage by default. For headers and footers, it is the only allowed option.
    */
  @js.native
  sealed trait NewSection extends MergeMode
  
  /* 2 */ val JoinTables: typings.devexpressDashWeb.MergeMode.JoinTables with Double = js.native
  /* 0 */ val NewParagraph: typings.devexpressDashWeb.MergeMode.NewParagraph with Double = js.native
  /* 1 */ val NewSection: typings.devexpressDashWeb.MergeMode.NewSection with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MergeMode with Double] = js.native
}

