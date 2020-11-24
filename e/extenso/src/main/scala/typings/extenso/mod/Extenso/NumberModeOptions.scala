package typings.extenso.mod.Extenso

import typings.extenso.anon.Decimal
import typings.extenso.extensoStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberModeOptions
  extends BaseOptions
     with Options {
  
  var mode: js.UndefOr[number] = js.native
  
  var number: js.UndefOr[Decimal] = js.native
}
object NumberModeOptions {
  
  @scala.inline
  def apply(): NumberModeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberModeOptions]
  }
  
  @scala.inline
  implicit class NumberModeOptionsOps[Self <: NumberModeOptions] (val x: Self) extends AnyVal {
    
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
    def setMode(value: number): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNumber(value: Decimal): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
}
