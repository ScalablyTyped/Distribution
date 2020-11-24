package typings.globalize.globalizeMod

import typings.globalize.globalizeStrings.decimal
import typings.globalize.globalizeStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberParserOptions extends js.Object {
  
  /**
    * decimal (default), or percent.
    */
  var style: js.UndefOr[decimal | percent] = js.native
}
object NumberParserOptions {
  
  @scala.inline
  def apply(): NumberParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberParserOptions]
  }
  
  @scala.inline
  implicit class NumberParserOptionsOps[Self <: NumberParserOptions] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: decimal | percent): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
