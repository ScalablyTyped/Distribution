package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Promotion extends js.Object {
  
  var promotionAmount: js.UndefOr[Amount] = js.native
  
  var promotionId: js.UndefOr[String] = js.native
}
object Promotion {
  
  @scala.inline
  def apply(): Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotion]
  }
  
  @scala.inline
  implicit class PromotionOps[Self <: Promotion] (val x: Self) extends AnyVal {
    
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
    def setPromotionAmount(value: Amount): Self = this.set("promotionAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionAmount: Self = this.set("promotionAmount", js.undefined)
    
    @scala.inline
    def setPromotionId(value: String): Self = this.set("promotionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionId: Self = this.set("promotionId", js.undefined)
  }
}
