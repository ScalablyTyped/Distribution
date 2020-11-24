package typings.forgeApis.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait With extends js.Object {
  
  var _with: js.UndefOr[String] = js.native
  
  var ifModifiedSince: js.UndefOr[Date] = js.native
}
object With {
  
  @scala.inline
  def apply(): With = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[With]
  }
  
  @scala.inline
  implicit class WithOps[Self <: With] (val x: Self) extends AnyVal {
    
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
    def set_with(value: String): Self = this.set("_with", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_with: Self = this.set("_with", js.undefined)
    
    @scala.inline
    def setIfModifiedSince(value: Date): Self = this.set("ifModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfModifiedSince: Self = this.set("ifModifiedSince", js.undefined)
  }
}
