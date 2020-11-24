package typings.devextreme.anon

import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.gradientSet
import typings.devextreme.devextremeStrings.indicatingSet
import typings.devextreme.devextremeStrings.simpleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseColorSet extends js.Object {
  
  var baseColorSet: js.UndefOr[simpleSet | indicatingSet | gradientSet] = js.native
  
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
}
object BaseColorSet {
  
  @scala.inline
  def apply(): BaseColorSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseColorSet]
  }
  
  @scala.inline
  implicit class BaseColorSetOps[Self <: BaseColorSet] (val x: Self) extends AnyVal {
    
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
    def setBaseColorSet(value: simpleSet | indicatingSet | gradientSet): Self = this.set("baseColorSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseColorSet: Self = this.set("baseColorSet", js.undefined)
    
    @scala.inline
    def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = this.set("paletteExtensionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteExtensionMode: Self = this.set("paletteExtensionMode", js.undefined)
  }
}
