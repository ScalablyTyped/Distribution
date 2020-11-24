package typings.devexpressUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwoDigitYearMax extends js.Object {
  
  var twoDigitYearMax: Double = js.native
}
object TwoDigitYearMax {
  
  @scala.inline
  def apply(twoDigitYearMax: Double): TwoDigitYearMax = {
    val __obj = js.Dynamic.literal(twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoDigitYearMax]
  }
  
  @scala.inline
  implicit class TwoDigitYearMaxOps[Self <: TwoDigitYearMax] (val x: Self) extends AnyVal {
    
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
    def setTwoDigitYearMax(value: Double): Self = this.set("twoDigitYearMax", value.asInstanceOf[js.Any])
  }
}
