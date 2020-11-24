package typings.fullpageJs.anon

import typings.fullpageJs.fullpageJsStrings.cover
import typings.fullpageJs.fullpageJsStrings.reveal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Percentage extends js.Object {
  
  var percentage: js.UndefOr[Double] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[cover | reveal] = js.native
}
object Percentage {
  
  @scala.inline
  def apply(): Percentage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percentage]
  }
  
  @scala.inline
  implicit class PercentageOps[Self <: Percentage] (val x: Self) extends AnyVal {
    
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
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setType(value: cover | reveal): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
