package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecalculationInterval extends StObject
/**
  * An enumeration representing the possible intervals used in spreadsheet recalculation.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.RecalculationInterval")
@js.native
object RecalculationInterval extends StObject {
  
  @js.native
  sealed trait HOUR
    extends StObject
       with RecalculationInterval
  
  @js.native
  sealed trait MINUTE
    extends StObject
       with RecalculationInterval
  
  @js.native
  sealed trait ON_CHANGE
    extends StObject
       with RecalculationInterval
}
