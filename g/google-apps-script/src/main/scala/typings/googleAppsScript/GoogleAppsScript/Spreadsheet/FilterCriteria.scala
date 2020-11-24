package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access filter criteria. To create a new criteria, use SpreadsheetApp.newFilterCriteria() and FilterCriteriaBuilder.
  */
@js.native
trait FilterCriteria extends js.Object {
  
  def copy(): FilterCriteriaBuilder = js.native
  
  def getCriteriaType(): BooleanCriteria = js.native
  
  def getCriteriaValues(): js.Array[_] = js.native
  
  def getHiddenValues(): js.Array[String] = js.native
  
  def getVisibleValues(): js.Array[String] = js.native
}
object FilterCriteria {
  
  @scala.inline
  def apply(
    copy: () => FilterCriteriaBuilder,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getHiddenValues: () => js.Array[String],
    getVisibleValues: () => js.Array[String]
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getHiddenValues = js.Any.fromFunction0(getHiddenValues), getVisibleValues = js.Any.fromFunction0(getVisibleValues))
    __obj.asInstanceOf[FilterCriteria]
  }
  
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCopy(value: () => FilterCriteriaBuilder): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCriteriaType(value: () => BooleanCriteria): Self = this.set("getCriteriaType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCriteriaValues(value: () => js.Array[_]): Self = this.set("getCriteriaValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHiddenValues(value: () => js.Array[String]): Self = this.set("getHiddenValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibleValues(value: () => js.Array[String]): Self = this.set("getVisibleValues", js.Any.fromFunction0(value))
  }
}
