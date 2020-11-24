package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdPosition extends js.Object {
  
  var adPosition: js.UndefOr[String] = js.native
  
  var frequency: js.UndefOr[Double] = js.native
  
  var minimumWordCount: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object AdPosition {
  
  @scala.inline
  def apply(): AdPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdPosition]
  }
  
  @scala.inline
  implicit class AdPositionOps[Self <: AdPosition] (val x: Self) extends AnyVal {
    
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
    def setAdPosition(value: String): Self = this.set("adPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdPosition: Self = this.set("adPosition", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setMinimumWordCount(value: Double): Self = this.set("minimumWordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumWordCount: Self = this.set("minimumWordCount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
