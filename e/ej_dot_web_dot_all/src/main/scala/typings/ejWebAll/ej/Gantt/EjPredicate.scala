package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EjPredicate extends js.Object {
  
  /** Pass the field name of the column.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /** string/integer/date operator.
    */
  var filterOperator: js.UndefOr[String] = js.native
  
  /** Pass the value to be filtered in a column.
    */
  var filterValue: js.UndefOr[String] = js.native
  
  /** Optional - pass the ignore case value as true/false.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
}
object EjPredicate {
  
  @scala.inline
  def apply(): EjPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EjPredicate]
  }
  
  @scala.inline
  implicit class EjPredicateOps[Self <: EjPredicate] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setFilterOperator(value: String): Self = this.set("filterOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOperator: Self = this.set("filterOperator", js.undefined)
    
    @scala.inline
    def setFilterValue(value: String): Self = this.set("filterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValue: Self = this.set("filterValue", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
  }
}
