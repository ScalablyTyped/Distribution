package typings.fuzzaldrinPlus.mod

import typings.fuzzaldrinPlus.anon.TagClass
import typings.fuzzaldrinPlus.fuzzaldrinPlusStrings.Backslash
import typings.fuzzaldrinPlus.fuzzaldrinPlusStrings.Slash
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  var allowErrors: js.UndefOr[Boolean] = js.native
  
  var optCharRegEx: js.UndefOr[RegExp] = js.native
  
  var pathSeparator: js.UndefOr[Slash | Backslash | String] = js.native
  
  var preparedQuery: js.UndefOr[Query] = js.native
  
  var useExtensionBonus: js.UndefOr[Boolean] = js.native
  
  var usePathScoring: js.UndefOr[Boolean] = js.native
  
  var wrap: js.UndefOr[TagClass] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowErrors(value: Boolean): Self = this.set("allowErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowErrors: Self = this.set("allowErrors", js.undefined)
    
    @scala.inline
    def setOptCharRegEx(value: RegExp): Self = this.set("optCharRegEx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptCharRegEx: Self = this.set("optCharRegEx", js.undefined)
    
    @scala.inline
    def setPathSeparator(value: Slash | Backslash | String): Self = this.set("pathSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathSeparator: Self = this.set("pathSeparator", js.undefined)
    
    @scala.inline
    def setPreparedQuery(value: Query): Self = this.set("preparedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreparedQuery: Self = this.set("preparedQuery", js.undefined)
    
    @scala.inline
    def setUseExtensionBonus(value: Boolean): Self = this.set("useExtensionBonus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExtensionBonus: Self = this.set("useExtensionBonus", js.undefined)
    
    @scala.inline
    def setUsePathScoring(value: Boolean): Self = this.set("usePathScoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePathScoring: Self = this.set("usePathScoring", js.undefined)
    
    @scala.inline
    def setWrap(value: TagClass): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
