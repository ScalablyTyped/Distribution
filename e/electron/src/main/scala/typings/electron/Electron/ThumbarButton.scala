package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThumbarButton extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/thumbar-button
  var click: js.Function = js.native
  
  /**
    * Control specific states and behaviors of the button. By default, it is
    * `['enabled']`.
    */
  var flags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The icon showing in thumbnail toolbar.
    */
  var icon: NativeImage_ = js.native
  
  /**
    * The text of the button's tooltip.
    */
  var tooltip: js.UndefOr[String] = js.native
}
object ThumbarButton {
  
  @scala.inline
  def apply(click: js.Function, icon: NativeImage_): ThumbarButton = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbarButton]
  }
  
  @scala.inline
  implicit class ThumbarButtonMutableBuilder[Self <: ThumbarButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
