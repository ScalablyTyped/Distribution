package typings.formatjsEcma402Abstract.typesNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencySpacingData extends js.Object {
  
  var afterInsertBetween: String = js.native
  
  var beforeInsertBetween: String = js.native
}
object CurrencySpacingData {
  
  @scala.inline
  def apply(afterInsertBetween: String, beforeInsertBetween: String): CurrencySpacingData = {
    val __obj = js.Dynamic.literal(afterInsertBetween = afterInsertBetween.asInstanceOf[js.Any], beforeInsertBetween = beforeInsertBetween.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySpacingData]
  }
  
  @scala.inline
  implicit class CurrencySpacingDataOps[Self <: CurrencySpacingData] (val x: Self) extends AnyVal {
    
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
    def setAfterInsertBetween(value: String): Self = this.set("afterInsertBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeInsertBetween(value: String): Self = this.set("beforeInsertBetween", value.asInstanceOf[js.Any])
  }
}
