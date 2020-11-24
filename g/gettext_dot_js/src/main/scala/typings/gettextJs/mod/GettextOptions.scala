package typings.gettextJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GettextOptions extends js.Object {
  
  var ctxt_delimiter: js.UndefOr[String] = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var plural_func: js.UndefOr[PluralForm] = js.native
}
object GettextOptions {
  
  @scala.inline
  def apply(): GettextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GettextOptions]
  }
  
  @scala.inline
  implicit class GettextOptionsOps[Self <: GettextOptions] (val x: Self) extends AnyVal {
    
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
    def setCtxt_delimiter(value: String): Self = this.set("ctxt_delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtxt_delimiter: Self = this.set("ctxt_delimiter", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPlural_func(value: /* n */ Double => Double): Self = this.set("plural_func", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePlural_func: Self = this.set("plural_func", js.undefined)
  }
}
