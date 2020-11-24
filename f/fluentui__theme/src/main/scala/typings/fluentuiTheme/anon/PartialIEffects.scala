package typings.fluentuiTheme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@fluentui/theme.@fluentui/theme/lib/types.IEffects> */
@js.native
trait PartialIEffects extends js.Object {
  
  var elevation16: js.UndefOr[String] = js.native
  
  var elevation4: js.UndefOr[String] = js.native
  
  var elevation64: js.UndefOr[String] = js.native
  
  var elevation8: js.UndefOr[String] = js.native
  
  var roundedCorner2: js.UndefOr[String] = js.native
  
  var roundedCorner4: js.UndefOr[String] = js.native
  
  var roundedCorner6: js.UndefOr[String] = js.native
}
object PartialIEffects {
  
  @scala.inline
  def apply(): PartialIEffects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIEffects]
  }
  
  @scala.inline
  implicit class PartialIEffectsOps[Self <: PartialIEffects] (val x: Self) extends AnyVal {
    
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
    def setElevation16(value: String): Self = this.set("elevation16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation16: Self = this.set("elevation16", js.undefined)
    
    @scala.inline
    def setElevation4(value: String): Self = this.set("elevation4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation4: Self = this.set("elevation4", js.undefined)
    
    @scala.inline
    def setElevation64(value: String): Self = this.set("elevation64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation64: Self = this.set("elevation64", js.undefined)
    
    @scala.inline
    def setElevation8(value: String): Self = this.set("elevation8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation8: Self = this.set("elevation8", js.undefined)
    
    @scala.inline
    def setRoundedCorner2(value: String): Self = this.set("roundedCorner2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundedCorner2: Self = this.set("roundedCorner2", js.undefined)
    
    @scala.inline
    def setRoundedCorner4(value: String): Self = this.set("roundedCorner4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundedCorner4: Self = this.set("roundedCorner4", js.undefined)
    
    @scala.inline
    def setRoundedCorner6(value: String): Self = this.set("roundedCorner6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundedCorner6: Self = this.set("roundedCorner6", js.undefined)
  }
}
