package typings.fluentuiTheme.anon

import typings.fluentuiTheme.ischemeMod.IScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in @fluentui/theme.@fluentui/theme/lib/types/IScheme.ISchemeNames ]:? @fluentui/theme.@fluentui/theme/lib/types/IScheme.IScheme} */
@js.native
trait PinISchemeNamesIScheme extends js.Object {
  
  var default: js.UndefOr[IScheme] = js.native
  
  var neutral: js.UndefOr[IScheme] = js.native
  
  var soft: js.UndefOr[IScheme] = js.native
  
  var strong: js.UndefOr[IScheme] = js.native
}
object PinISchemeNamesIScheme {
  
  @scala.inline
  def apply(): PinISchemeNamesIScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinISchemeNamesIScheme]
  }
  
  @scala.inline
  implicit class PinISchemeNamesISchemeOps[Self <: PinISchemeNamesIScheme] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: IScheme): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setNeutral(value: IScheme): Self = this.set("neutral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutral: Self = this.set("neutral", js.undefined)
    
    @scala.inline
    def setSoft(value: IScheme): Self = this.set("soft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoft: Self = this.set("soft", js.undefined)
    
    @scala.inline
    def setStrong(value: IScheme): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
  }
}
