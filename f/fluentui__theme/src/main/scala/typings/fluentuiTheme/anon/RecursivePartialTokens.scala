package typings.fluentuiTheme.anon

import typings.fluentuiTheme.themeMod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<@fluentui/theme.@fluentui/theme/lib/types/Theme.Tokens> */
@js.native
trait RecursivePartialTokens extends js.Object {
  
  var color: js.UndefOr[RecursivePartialbodyColor | js.Array[RecursivePartial[_]]] = js.native
}
object RecursivePartialTokens {
  
  @scala.inline
  def apply(): RecursivePartialTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialTokens]
  }
  
  @scala.inline
  implicit class RecursivePartialTokensOps[Self <: RecursivePartialTokens] (val x: Self) extends AnyVal {
    
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
    def setColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: RecursivePartialbodyColor | js.Array[RecursivePartial[_]]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
