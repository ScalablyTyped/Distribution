package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contains extends js.Object {
  
  var between: js.UndefOr[String] = js.native
  
  var contains: js.UndefOr[String] = js.native
  
  var endsWith: js.UndefOr[String] = js.native
  
  var equal: js.UndefOr[String] = js.native
  
  var greaterThan: js.UndefOr[String] = js.native
  
  var greaterThanOrEqual: js.UndefOr[String] = js.native
  
  var isBlank: js.UndefOr[String] = js.native
  
  var isNotBlank: js.UndefOr[String] = js.native
  
  var lessThan: js.UndefOr[String] = js.native
  
  var lessThanOrEqual: js.UndefOr[String] = js.native
  
  var notContains: js.UndefOr[String] = js.native
  
  var notEqual: js.UndefOr[String] = js.native
  
  var startsWith: js.UndefOr[String] = js.native
}
object Contains {
  
  @scala.inline
  def apply(): Contains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contains]
  }
  
  @scala.inline
  implicit class ContainsOps[Self <: Contains] (val x: Self) extends AnyVal {
    
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
    def setBetween(value: String): Self = this.set("between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetween: Self = this.set("between", js.undefined)
    
    @scala.inline
    def setContains(value: String): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setEndsWith(value: String): Self = this.set("endsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndsWith: Self = this.set("endsWith", js.undefined)
    
    @scala.inline
    def setEqual(value: String): Self = this.set("equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqual: Self = this.set("equal", js.undefined)
    
    @scala.inline
    def setGreaterThan(value: String): Self = this.set("greaterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreaterThan: Self = this.set("greaterThan", js.undefined)
    
    @scala.inline
    def setGreaterThanOrEqual(value: String): Self = this.set("greaterThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreaterThanOrEqual: Self = this.set("greaterThanOrEqual", js.undefined)
    
    @scala.inline
    def setIsBlank(value: String): Self = this.set("isBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBlank: Self = this.set("isBlank", js.undefined)
    
    @scala.inline
    def setIsNotBlank(value: String): Self = this.set("isNotBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNotBlank: Self = this.set("isNotBlank", js.undefined)
    
    @scala.inline
    def setLessThan(value: String): Self = this.set("lessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessThan: Self = this.set("lessThan", js.undefined)
    
    @scala.inline
    def setLessThanOrEqual(value: String): Self = this.set("lessThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessThanOrEqual: Self = this.set("lessThanOrEqual", js.undefined)
    
    @scala.inline
    def setNotContains(value: String): Self = this.set("notContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotContains: Self = this.set("notContains", js.undefined)
    
    @scala.inline
    def setNotEqual(value: String): Self = this.set("notEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotEqual: Self = this.set("notEqual", js.undefined)
    
    @scala.inline
    def setStartsWith(value: String): Self = this.set("startsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartsWith: Self = this.set("startsWith", js.undefined)
  }
}
