package typings.electronOsxSign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatOptions extends BaseSignOptions {
  
  var `identity-validation`: js.UndefOr[Boolean] = js.native
  
  var install: js.UndefOr[String] = js.native
  
  var pkg: js.UndefOr[String] = js.native
  
  var scripts: js.UndefOr[String] = js.native
}
object FlatOptions {
  
  @scala.inline
  def apply(app: String): FlatOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatOptions]
  }
  
  @scala.inline
  implicit class FlatOptionsOps[Self <: FlatOptions] (val x: Self) extends AnyVal {
    
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
    def `setIdentity-validation`(value: Boolean): Self = this.set("identity-validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIdentity-validation`: Self = this.set("identity-validation", js.undefined)
    
    @scala.inline
    def setInstall(value: String): Self = this.set("install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstall: Self = this.set("install", js.undefined)
    
    @scala.inline
    def setPkg(value: String): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    
    @scala.inline
    def setScripts(value: String): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
  }
}
