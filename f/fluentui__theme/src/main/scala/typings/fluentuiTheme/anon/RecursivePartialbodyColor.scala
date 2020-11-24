package typings.fluentuiTheme.anon

import typings.fluentuiTheme.themeMod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<{  body :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet & @fluentui/theme.@fluentui/theme/lib/types/Theme.TokenSetType,   brand :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet & @fluentui/theme.@fluentui/theme/lib/types/Theme.TokenSetType, [key: string] : @fluentui/theme.@fluentui/theme/lib/types/Theme.TokenSetType}> */
@js.native
trait RecursivePartialbodyColor extends js.Object {
  
  var body: js.UndefOr[RecursivePartialColorToke | js.Array[RecursivePartial[_]]] = js.native
  
  var brand: js.UndefOr[RecursivePartialColorToke | js.Array[RecursivePartial[_]]] = js.native
}
object RecursivePartialbodyColor {
  
  @scala.inline
  def apply(): RecursivePartialbodyColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialbodyColor]
  }
  
  @scala.inline
  implicit class RecursivePartialbodyColorOps[Self <: RecursivePartialbodyColor] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: RecursivePartial[js.Any]*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: RecursivePartialColorToke | js.Array[RecursivePartial[_]]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBrandVarargs(value: RecursivePartial[js.Any]*): Self = this.set("brand", js.Array(value :_*))
    
    @scala.inline
    def setBrand(value: RecursivePartialColorToke | js.Array[RecursivePartial[_]]): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
  }
}
