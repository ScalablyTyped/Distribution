package typings.fundamentalReact.anon

import typings.fundamentalReact.iconMod.IconGlyph
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListIconProps> */
@js.native
trait WeakValidationMapListIcon extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var glyph: js.UndefOr[Validator[js.UndefOr[IconGlyph | Null]]] = js.native
}
object WeakValidationMapListIcon {
  
  @scala.inline
  def apply(): WeakValidationMapListIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListIcon]
  }
  
  @scala.inline
  implicit class WeakValidationMapListIconMutableBuilder[Self <: WeakValidationMapListIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setGlyph(value: Validator[js.UndefOr[IconGlyph | Null]]): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
  }
}
