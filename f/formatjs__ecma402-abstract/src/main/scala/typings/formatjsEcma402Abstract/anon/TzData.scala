package typings.formatjsEcma402Abstract.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TzData extends js.Object {
  
  var tzData: Record[String, _] = js.native
  
  var uppercaseLinks: Record[String, String] = js.native
}
object TzData {
  
  @scala.inline
  def apply(tzData: Record[String, _], uppercaseLinks: Record[String, String]): TzData = {
    val __obj = js.Dynamic.literal(tzData = tzData.asInstanceOf[js.Any], uppercaseLinks = uppercaseLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TzData]
  }
  
  @scala.inline
  implicit class TzDataOps[Self <: TzData] (val x: Self) extends AnyVal {
    
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
    def setTzData(value: Record[String, _]): Self = this.set("tzData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseLinks(value: Record[String, String]): Self = this.set("uppercaseLinks", value.asInstanceOf[js.Any])
  }
}
