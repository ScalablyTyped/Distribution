package typings.gestalt.mod

import typings.gestalt.anon.HrefLabel
import typings.gestalt.anon.OnClickText
import typings.gestalt.anon.OnDismiss
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.progress
import typings.gestalt.gestaltStrings.success
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastProps extends StObject {
  
  var dissmissButton: js.UndefOr[OnDismiss] = js.undefined
  
  var helperLink: js.UndefOr[OnClickText] = js.undefined
  
  var primaryAction: js.UndefOr[HrefLabel] = js.undefined
  
  var text: String | ReactElement
  
  var thumbnail: js.UndefOr[
    typings.gestalt.anon.Image | typings.gestalt.anon.Avatar | typings.gestalt.anon.Icon
  ] = js.undefined
  
  var variant: js.UndefOr[default | success | error | progress] = js.undefined
}
object ToastProps {
  
  inline def apply(text: String | ReactElement): ToastProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
    
    inline def setDissmissButton(value: OnDismiss): Self = StObject.set(x, "dissmissButton", value.asInstanceOf[js.Any])
    
    inline def setDissmissButtonUndefined: Self = StObject.set(x, "dissmissButton", js.undefined)
    
    inline def setHelperLink(value: OnClickText): Self = StObject.set(x, "helperLink", value.asInstanceOf[js.Any])
    
    inline def setHelperLinkUndefined: Self = StObject.set(x, "helperLink", js.undefined)
    
    inline def setPrimaryAction(value: HrefLabel): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
    
    inline def setText(value: String | ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: typings.gestalt.anon.Image | typings.gestalt.anon.Avatar | typings.gestalt.anon.Icon): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setVariant(value: default | success | error | progress): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
