package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for FilterCriteria.
  */
@js.native
trait FilterCriteriaBuilder extends StObject {
  
  def build(): FilterCriteria = js.native
  
  def copy(): FilterCriteriaBuilder = js.native
  
  def getCriteriaType(): BooleanCriteria = js.native
  
  def getCriteriaValues(): js.Array[js.Any] = js.native
  
  def getHiddenValues(): js.Array[String] = js.native
  
  def getVisibleValues(): js.Array[String] = js.native
  
  def setHiddenValues(values: js.Array[String]): FilterCriteriaBuilder = js.native
  
  def setVisibleValues(values: js.Array[String]): FilterCriteriaBuilder = js.native
  
  def whenCellEmpty(): FilterCriteriaBuilder = js.native
  
  def whenCellNotEmpty(): FilterCriteriaBuilder = js.native
  
  def whenDateAfter(date: Date): FilterCriteriaBuilder = js.native
  def whenDateAfter(date: RelativeDate): FilterCriteriaBuilder = js.native
  
  def whenDateBefore(date: Date): FilterCriteriaBuilder = js.native
  def whenDateBefore(date: RelativeDate): FilterCriteriaBuilder = js.native
  
  def whenDateEqualTo(date: Date): FilterCriteriaBuilder = js.native
  def whenDateEqualTo(date: RelativeDate): FilterCriteriaBuilder = js.native
  
  def whenFormulaSatisfied(formula: String): FilterCriteriaBuilder = js.native
  
  def whenNumberBetween(start: Double, end: Double): FilterCriteriaBuilder = js.native
  
  def whenNumberEqualTo(number: Double): FilterCriteriaBuilder = js.native
  
  def whenNumberGreaterThan(number: Double): FilterCriteriaBuilder = js.native
  
  def whenNumberGreaterThanOrEqualTo(number: Double): FilterCriteriaBuilder = js.native
  
  def whenNumberLessThan(number: Double): FilterCriteriaBuilder = js.native
  
  def whenNumberLessThanOrEqualTo(number: Double): FilterCriteriaBuilder = js.native
  
  def whenNumberNotBetween(start: Double, end: Double): FilterCriteriaBuilder = js.native
  
  def whenNumberNotEqualTo(number: Double): FilterCriteriaBuilder = js.native
  
  def whenTextContains(text: String): FilterCriteriaBuilder = js.native
  
  def whenTextDoesNotContain(text: String): FilterCriteriaBuilder = js.native
  
  def whenTextEndsWith(text: String): FilterCriteriaBuilder = js.native
  
  def whenTextEqualTo(text: String): FilterCriteriaBuilder = js.native
  
  def whenTextStartsWith(text: String): FilterCriteriaBuilder = js.native
  
  def withCriteria(criteria: BooleanCriteria, args: js.Array[js.Any]): FilterCriteriaBuilder = js.native
}
