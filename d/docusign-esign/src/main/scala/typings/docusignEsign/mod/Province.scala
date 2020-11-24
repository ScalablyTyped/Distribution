package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Province extends js.Object {
  
  var isoCode: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Province {
  
  @scala.inline
  def apply(): Province = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Province]
  }
  
  @scala.inline
  implicit class ProvinceOps[Self <: Province] (val x: Self) extends AnyVal {
    
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
    def setIsoCode(value: String): Self = this.set("isoCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsoCode: Self = this.set("isoCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
