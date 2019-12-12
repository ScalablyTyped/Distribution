package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import typings.devexpressDashWeb.MailMergeExportRange.AllRecords
import typings.devexpressDashWeb.MailMergeExportRange.CurrentRecord
import typings.devexpressDashWeb.MailMergeExportRange.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailMergeExportRange extends js.Object

/**
  * Lists values that specify the range for mail-merge document export.
  */
@JSGlobal("MailMergeExportRange")
@js.native
object MailMergeExportRange extends js.Object {
  /**
    * Specifies that all data source records will be included into the exported merged document.
    */
  @js.native
  sealed trait AllRecords extends MailMergeExportRange
  
  /**
    * Specifies that only the current data source record will be included into the exported merged document.
    */
  @js.native
  sealed trait CurrentRecord extends MailMergeExportRange
  
  /**
    * Specifies that a specific range of data source records will be included into the exported merged document.
    */
  @js.native
  sealed trait Range extends MailMergeExportRange
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MailMergeExportRange with Double] = js.native
  /* 0 */ @js.native
  object AllRecords extends TopLevel[AllRecords with Double]
  
  /* 1 */ @js.native
  object CurrentRecord extends TopLevel[CurrentRecord with Double]
  
  /* 2 */ @js.native
  object Range extends TopLevel[Range with Double]
  
}

