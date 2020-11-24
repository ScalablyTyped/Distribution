package typings.globalize.relativeTimeMod.globalizeDistGlobalizeAugmentingMod

import typings.globalize.globalizeStrings.narrow
import typings.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTimeFormatterOptions extends js.Object {
  
  /**
    * eg. "short" or "narrow". Or falsy for default long form
    */
  var form: js.UndefOr[short | narrow] = js.native
}
object RelativeTimeFormatterOptions {
  
  @scala.inline
  def apply(): RelativeTimeFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeFormatterOptions]
  }
  
  @scala.inline
  implicit class RelativeTimeFormatterOptionsOps[Self <: RelativeTimeFormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setForm(value: short | narrow): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
  }
}
