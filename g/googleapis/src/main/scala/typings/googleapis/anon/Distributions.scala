package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distributions extends js.Object {
  
  var category: js.UndefOr[String] = js.native
  
  var distributions: js.UndefOr[js.Array[Max]] = js.native
  
  var median: js.UndefOr[Double] = js.native
}
object Distributions {
  
  @scala.inline
  def apply(): Distributions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distributions]
  }
  
  @scala.inline
  implicit class DistributionsOps[Self <: Distributions] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setDistributionsVarargs(value: Max*): Self = this.set("distributions", js.Array(value :_*))
    
    @scala.inline
    def setDistributions(value: js.Array[Max]): Self = this.set("distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributions: Self = this.set("distributions", js.undefined)
    
    @scala.inline
    def setMedian(value: Double): Self = this.set("median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedian: Self = this.set("median", js.undefined)
  }
}
