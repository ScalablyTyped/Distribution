package typings.gestalt.mod

import typings.gestalt.anon.Path
import typings.gestalt.gestaltStrings.brandPrimary
import typings.gestalt.gestaltStrings.dark
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.gestaltStrings.inverse
import typings.gestalt.gestaltStrings.light
import typings.gestalt.gestaltStrings.shopping
import typings.gestalt.gestaltStrings.subtle
import typings.gestalt.gestaltStrings.success
import typings.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconProps extends StObject {
  
  var accessibilityLabel: String
  
  var color: js.UndefOr[
    default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
  ] = js.undefined
  
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.undefined
  
  var icon: js.UndefOr[Icons] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double | String] = js.undefined
}
object IconProps {
  
  inline def apply(accessibilityLabel: String): IconProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  
  extension [Self <: IconProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setColor(
      value: default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDangerouslySetSvgPath(value: Path): Self = StObject.set(x, "dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetSvgPathUndefined: Self = StObject.set(x, "dangerouslySetSvgPath", js.undefined)
    
    inline def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
