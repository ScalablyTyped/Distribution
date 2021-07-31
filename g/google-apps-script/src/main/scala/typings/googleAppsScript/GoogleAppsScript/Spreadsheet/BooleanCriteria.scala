package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BooleanCriteria extends StObject
/**
  * An enumeration representing the boolean criteria that can be used in conditional format or
  * filter.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.BooleanCriteria")
@js.native
object BooleanCriteria extends StObject {
  
  @js.native
  sealed trait CELL_EMPTY
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait CELL_NOT_EMPTY
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait CUSTOM_FORMULA
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait DATE_AFTER
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait DATE_AFTER_RELATIVE
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait DATE_BEFORE
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait DATE_BEFORE_RELATIVE
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO_RELATIVE
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait NUMBER_BETWEEN
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait NUMBER_EQUAL_TO
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN_OR_EQUAL_TO
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN_OR_EQUAL_TO
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait NUMBER_NOT_BETWEEN
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait NUMBER_NOT_EQUAL_TO
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait TEXT_CONTAINS
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait TEXT_DOES_NOT_CONTAIN
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait TEXT_ENDS_WITH
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait TEXT_EQUAL_TO
    extends StObject
       with BooleanCriteria
  
  @js.native
  sealed trait TEXT_STARTS_WITH
    extends StObject
       with BooleanCriteria
}
