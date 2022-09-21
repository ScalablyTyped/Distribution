package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to set up mail merge operations.
  */
@JSGlobal("MailMergeSettings")
@js.native
open class MailMergeSettings ()
  extends StObject
     with typings.devexpressWeb.MailMergeSettings {
  
  /**
    * Gets or sets the index of the row from which the exported range starts.
    */
  /* CompleteClass */
  var exportFrom: Double = js.native
  
  /**
    * Gets or sets the number of data rows in the exported mail-merge range.
    */
  /* CompleteClass */
  var exportRecordsCount: Double = js.native
  
  /**
    * Gets or sets the merge mode.
    */
  /* CompleteClass */
  var mergeMode: typings.devexpressWeb.MergeMode = js.native
  
  /**
    * Specifies which data rows should be exported into a merged document.
    */
  /* CompleteClass */
  var range: typings.devexpressWeb.MailMergeExportRange = js.native
}
