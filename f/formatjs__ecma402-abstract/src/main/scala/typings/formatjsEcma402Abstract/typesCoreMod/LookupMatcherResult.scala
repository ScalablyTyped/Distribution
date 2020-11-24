package typings.formatjsEcma402Abstract.typesCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupMatcherResult extends js.Object {
  
  var extension: js.UndefOr[String] = js.native
  
  var locale: String = js.native
  
  var nu: js.UndefOr[String] = js.native
}
object LookupMatcherResult {
  
  @scala.inline
  def apply(locale: String): LookupMatcherResult = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupMatcherResult]
  }
  
  @scala.inline
  implicit class LookupMatcherResultOps[Self <: LookupMatcherResult] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setNu(value: String): Self = this.set("nu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNu: Self = this.set("nu", js.undefined)
  }
}
