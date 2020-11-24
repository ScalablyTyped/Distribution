package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberQuery extends js.Object {
  
  var between: js.UndefOr[js.Array[Double]] = js.native
  
  var equal: js.UndefOr[Double] = js.native
  
  var greater: js.UndefOr[Double] = js.native
  
  var greater_equal: js.UndefOr[Double] = js.native
  
  var less: js.UndefOr[Double] = js.native
  
  var less_equal: js.UndefOr[Double] = js.native
  
  var not_between: js.UndefOr[js.Array[Double]] = js.native
  
  var not_equal: js.UndefOr[Double] = js.native
}
object NumberQuery {
  
  @scala.inline
  def apply(): NumberQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberQuery]
  }
  
  @scala.inline
  implicit class NumberQueryOps[Self <: NumberQuery] (val x: Self) extends AnyVal {
    
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
    def setBetweenVarargs(value: Double*): Self = this.set("between", js.Array(value :_*))
    
    @scala.inline
    def setBetween(value: js.Array[Double]): Self = this.set("between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetween: Self = this.set("between", js.undefined)
    
    @scala.inline
    def setEqual(value: Double): Self = this.set("equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqual: Self = this.set("equal", js.undefined)
    
    @scala.inline
    def setGreater(value: Double): Self = this.set("greater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreater: Self = this.set("greater", js.undefined)
    
    @scala.inline
    def setGreater_equal(value: Double): Self = this.set("greater_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreater_equal: Self = this.set("greater_equal", js.undefined)
    
    @scala.inline
    def setLess(value: Double): Self = this.set("less", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLess: Self = this.set("less", js.undefined)
    
    @scala.inline
    def setLess_equal(value: Double): Self = this.set("less_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLess_equal: Self = this.set("less_equal", js.undefined)
    
    @scala.inline
    def setNot_betweenVarargs(value: Double*): Self = this.set("not_between", js.Array(value :_*))
    
    @scala.inline
    def setNot_between(value: js.Array[Double]): Self = this.set("not_between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot_between: Self = this.set("not_between", js.undefined)
    
    @scala.inline
    def setNot_equal(value: Double): Self = this.set("not_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot_equal: Self = this.set("not_equal", js.undefined)
  }
}
