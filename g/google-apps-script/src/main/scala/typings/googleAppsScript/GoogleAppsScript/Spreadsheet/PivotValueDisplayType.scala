package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotValueDisplayType extends StObject
/**
  * An enumeration of ways to display a pivot value as a function of another value.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.PivotValueDisplayType")
@js.native
object PivotValueDisplayType extends StObject {
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_COLUMN_TOTAL
    extends StObject
       with PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_GRAND_TOTAL
    extends StObject
       with PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_ROW_TOTAL
    extends StObject
       with PivotValueDisplayType
}
