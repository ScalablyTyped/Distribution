package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmulatedFormFactor extends js.Object {
  
  var emulatedFormFactor: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var onlyCategories: js.UndefOr[js.Any] = js.native
}
object EmulatedFormFactor {
  
  @scala.inline
  def apply(): EmulatedFormFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmulatedFormFactor]
  }
  
  @scala.inline
  implicit class EmulatedFormFactorOps[Self <: EmulatedFormFactor] (val x: Self) extends AnyVal {
    
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
    def setEmulatedFormFactor(value: String): Self = this.set("emulatedFormFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulatedFormFactor: Self = this.set("emulatedFormFactor", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOnlyCategories(value: js.Any): Self = this.set("onlyCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyCategories: Self = this.set("onlyCategories", js.undefined)
  }
}
