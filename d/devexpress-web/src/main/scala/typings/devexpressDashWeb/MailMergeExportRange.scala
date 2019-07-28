package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailMergeExportRange extends js.Object

@JSGlobal("MailMergeExportRange")
@js.native
object MailMergeExportRange extends js.Object {
  @js.native
  sealed trait AllRecords extends MailMergeExportRange
  
  @js.native
  sealed trait CurrentRecord extends MailMergeExportRange
  
  @js.native
  sealed trait Range extends MailMergeExportRange
  
  /* 0 */ val AllRecords: typings.devexpressDashWeb.MailMergeExportRange.AllRecords with Double = js.native
  /* 1 */ val CurrentRecord: typings.devexpressDashWeb.MailMergeExportRange.CurrentRecord with Double = js.native
  /* 2 */ val Range: typings.devexpressDashWeb.MailMergeExportRange.Range with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MailMergeExportRange with Double] = js.native
}

