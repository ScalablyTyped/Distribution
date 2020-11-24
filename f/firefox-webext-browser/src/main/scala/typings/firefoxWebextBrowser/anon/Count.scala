package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends js.Object {
  
  var count: Double = js.native
  
  var rangeData: js.UndefOr[js.Array[EndOffset]] = js.native
  
  var rectData: js.UndefOr[js.Array[RectsAndTexts]] = js.native
}
object Count {
  
  @scala.inline
  def apply(count: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeDataVarargs(value: EndOffset*): Self = this.set("rangeData", js.Array(value :_*))
    
    @scala.inline
    def setRangeData(value: js.Array[EndOffset]): Self = this.set("rangeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeData: Self = this.set("rangeData", js.undefined)
    
    @scala.inline
    def setRectDataVarargs(value: RectsAndTexts*): Self = this.set("rectData", js.Array(value :_*))
    
    @scala.inline
    def setRectData(value: js.Array[RectsAndTexts]): Self = this.set("rectData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectData: Self = this.set("rectData", js.undefined)
  }
}
