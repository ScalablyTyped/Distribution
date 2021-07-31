package typings.gestalt.mod

import typings.gestalt.anon.Path
import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.lightGray
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.transparent
import typings.gestalt.gestaltStrings.transparentDarkGray
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PogProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var bgColor: js.UndefOr[transparent | darkGray | transparentDarkGray | gray | lightGray | white | red] = js.undefined
  
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.undefined
  
  var focused: js.UndefOr[Boolean] = js.undefined
  
  var hovered: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[Icons] = js.undefined
  
  var iconColor: js.UndefOr[gray | darkGray | red | white] = js.undefined
  
  var padding: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
}
object PogProps {
  
  @scala.inline
  def apply(): PogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PogProps]
  }
  
  @scala.inline
  implicit class PogPropsMutableBuilder[Self <: PogProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setBgColor(value: transparent | darkGray | transparentDarkGray | gray | lightGray | white | red): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setDangerouslySetSvgPath(value: Path): Self = StObject.set(x, "dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetSvgPathUndefined: Self = StObject.set(x, "dangerouslySetSvgPath", js.undefined)
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    @scala.inline
    def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
    
    @scala.inline
    def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: gray | darkGray | red | white): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setPadding(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
