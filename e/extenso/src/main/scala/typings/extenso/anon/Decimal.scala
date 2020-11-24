package typings.extenso.anon

import typings.extenso.extensoStrings.f
import typings.extenso.extensoStrings.formal
import typings.extenso.extensoStrings.informal
import typings.extenso.extensoStrings.m
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decimal extends js.Object {
  
  var decimal: js.UndefOr[formal | informal] = js.native
  
  var gender: js.UndefOr[m | f] = js.native
}
object Decimal {
  
  @scala.inline
  def apply(): Decimal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Decimal]
  }
  
  @scala.inline
  implicit class DecimalOps[Self <: Decimal] (val x: Self) extends AnyVal {
    
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
    def setDecimal(value: formal | informal): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    
    @scala.inline
    def setGender(value: m | f): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
  }
}
