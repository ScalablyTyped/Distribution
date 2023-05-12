package typings.gestalt.mod

import typings.gestalt.anon.Disabled
import typings.gestalt.anon.HrefOnClick
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.errorBare
import typings.gestalt.gestaltStrings.info
import typings.gestalt.gestaltStrings.infoBare
import typings.gestalt.gestaltStrings.neutral
import typings.gestalt.gestaltStrings.recommendation
import typings.gestalt.gestaltStrings.recommendationBare
import typings.gestalt.gestaltStrings.success
import typings.gestalt.gestaltStrings.successBare
import typings.gestalt.gestaltStrings.warning
import typings.gestalt.gestaltStrings.warningBare
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlimBannerProps extends StObject {
  
  var dismissButton: js.UndefOr[OnDismissButtonObject] = js.undefined
  
  var helperLink: js.UndefOr[HrefOnClick] = js.undefined
  
  var iconAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var message: ReactElement | String
  
  var primaryAction: js.UndefOr[Disabled] = js.undefined
  
  var `type`: js.UndefOr[
    neutral | error | info | warning | success | recommendation | errorBare | infoBare | warningBare | successBare | recommendationBare
  ] = js.undefined
}
object SlimBannerProps {
  
  inline def apply(message: ReactElement | String): SlimBannerProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlimBannerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlimBannerProps] (val x: Self) extends AnyVal {
    
    inline def setDismissButton(value: OnDismissButtonObject): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    inline def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    inline def setHelperLink(value: HrefOnClick): Self = StObject.set(x, "helperLink", value.asInstanceOf[js.Any])
    
    inline def setHelperLinkUndefined: Self = StObject.set(x, "helperLink", js.undefined)
    
    inline def setIconAccessibilityLabel(value: String): Self = StObject.set(x, "iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setIconAccessibilityLabelUndefined: Self = StObject.set(x, "iconAccessibilityLabel", js.undefined)
    
    inline def setMessage(value: ReactElement | String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAction(value: Disabled): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
    
    inline def setType(
      value: neutral | error | info | warning | success | recommendation | errorBare | infoBare | warningBare | successBare | recommendationBare
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
