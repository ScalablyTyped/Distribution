package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MailMergeExportRange extends StObject
/**
  * Lists values that specify the range for mail-merge document export.
  */
@JSGlobal("MailMergeExportRange")
@js.native
object MailMergeExportRange extends StObject {
  
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
}
