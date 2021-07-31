package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access filter criteria. To create a new criteria, use SpreadsheetApp.newFilterCriteria() and FilterCriteriaBuilder.
  */
trait FilterCriteria extends StObject {
  
  def copy(): FilterCriteriaBuilder
  
  def getCriteriaType(): BooleanCriteria
  
  def getCriteriaValues(): js.Array[js.Any]
  
  def getHiddenValues(): js.Array[String]
  
  def getVisibleValues(): js.Array[String]
}
object FilterCriteria {
  
  @scala.inline
  def apply(
    copy: () => FilterCriteriaBuilder,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[js.Any],
    getHiddenValues: () => js.Array[String],
    getVisibleValues: () => js.Array[String]
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getHiddenValues = js.Any.fromFunction0(getHiddenValues), getVisibleValues = js.Any.fromFunction0(getVisibleValues))
    __obj.asInstanceOf[FilterCriteria]
  }
  
  @scala.inline
  implicit class FilterCriteriaMutableBuilder[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => FilterCriteriaBuilder): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCriteriaType(value: () => BooleanCriteria): Self = StObject.set(x, "getCriteriaType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCriteriaValues(value: () => js.Array[js.Any]): Self = StObject.set(x, "getCriteriaValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHiddenValues(value: () => js.Array[String]): Self = StObject.set(x, "getHiddenValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibleValues(value: () => js.Array[String]): Self = StObject.set(x, "getVisibleValues", js.Any.fromFunction0(value))
  }
}
