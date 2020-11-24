package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoyaltyPoints extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  var pointsValue: js.UndefOr[String] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
}
object LoyaltyPoints {
  
  @scala.inline
  def apply(): LoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoyaltyPoints]
  }
  
  @scala.inline
  implicit class LoyaltyPointsOps[Self <: LoyaltyPoints] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPointsValue(value: String): Self = this.set("pointsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsValue: Self = this.set("pointsValue", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
  }
}
