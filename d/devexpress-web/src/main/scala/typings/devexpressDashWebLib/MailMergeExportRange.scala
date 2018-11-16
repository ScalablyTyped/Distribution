package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailMergeExportRange extends js.Object

@JSGlobal("MailMergeExportRange")
@js.native
object MailMergeExportRange extends js.Object {
  @js.native
  sealed trait AllRecords
    extends devexpressDashWebLib.MailMergeExportRange
  
  @js.native
  sealed trait CurrentRecord
    extends devexpressDashWebLib.MailMergeExportRange
  
  @js.native
  sealed trait Range
    extends devexpressDashWebLib.MailMergeExportRange
  
  /* 0 */ val AllRecords: AllRecords with scala.Double = js.native
  /* 1 */ val CurrentRecord: CurrentRecord with scala.Double = js.native
  /* 2 */ val Range: Range with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.MailMergeExportRange with scala.Double] = js.native
}

