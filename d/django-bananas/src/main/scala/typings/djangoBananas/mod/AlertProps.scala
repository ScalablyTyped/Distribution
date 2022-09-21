package typings.djangoBananas.mod

import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertProps extends StObject {
  
  var agree: js.UndefOr[Boolean | String] = js.undefined
  
  var classes: Record[String, Any]
  
  var dismiss: js.UndefOr[Boolean | String] = js.undefined
  
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[ReactNode | String] = js.undefined
  
  var onAgree: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onDismiss: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object AlertProps {
  
  inline def apply(classes: Record[String, Any]): AlertProps = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
  
  extension [Self <: AlertProps](x: Self) {
    
    inline def setAgree(value: Boolean | String): Self = StObject.set(x, "agree", value.asInstanceOf[js.Any])
    
    inline def setAgreeUndefined: Self = StObject.set(x, "agree", js.undefined)
    
    inline def setClasses(value: Record[String, Any]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setDismiss(value: Boolean | String): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
    
    inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
    
    inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
    
    inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
    
    inline def setMessage(value: ReactNode | String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnAgree(value: () => Any): Self = StObject.set(x, "onAgree", js.Any.fromFunction0(value))
    
    inline def setOnAgreeUndefined: Self = StObject.set(x, "onAgree", js.undefined)
    
    inline def setOnClose(value: () => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnDismiss(value: () => Any): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
