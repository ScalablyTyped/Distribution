package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateQuery extends js.Object {
  
  var after: js.UndefOr[String] = js.native
  
  var after_equal: js.UndefOr[String] = js.native
  
  var before: js.UndefOr[String] = js.native
  
  var before_equal: js.UndefOr[String] = js.native
  
  var between: js.UndefOr[js.Array[String]] = js.native
  
  var current: js.UndefOr[String] = js.native
  
  var equal: js.UndefOr[String] = js.native
  
  var last: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[String] = js.native
  
  var not_between: js.UndefOr[js.Array[String]] = js.native
  
  var not_equal: js.UndefOr[String] = js.native
}
object DateQuery {
  
  @scala.inline
  def apply(): DateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateQuery]
  }
  
  @scala.inline
  implicit class DateQueryOps[Self <: DateQuery] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfter_equal(value: String): Self = this.set("after_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter_equal: Self = this.set("after_equal", js.undefined)
    
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBefore_equal(value: String): Self = this.set("before_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore_equal: Self = this.set("before_equal", js.undefined)
    
    @scala.inline
    def setBetweenVarargs(value: String*): Self = this.set("between", js.Array(value :_*))
    
    @scala.inline
    def setBetween(value: js.Array[String]): Self = this.set("between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetween: Self = this.set("between", js.undefined)
    
    @scala.inline
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setEqual(value: String): Self = this.set("equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqual: Self = this.set("equal", js.undefined)
    
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setNot_betweenVarargs(value: String*): Self = this.set("not_between", js.Array(value :_*))
    
    @scala.inline
    def setNot_between(value: js.Array[String]): Self = this.set("not_between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot_between: Self = this.set("not_between", js.undefined)
    
    @scala.inline
    def setNot_equal(value: String): Self = this.set("not_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot_equal: Self = this.set("not_equal", js.undefined)
  }
}
