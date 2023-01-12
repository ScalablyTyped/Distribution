package typings.firebaseAuthCompat

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthCompatSrcPlatformMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSelfWindow(): Window | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_getSelfWindow")().asInstanceOf[Window | Null]
  
  inline def isAndroidOrIosCordovaScheme(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isAndroidOrIosCordovaScheme")().asInstanceOf[Boolean]
  inline def isAndroidOrIosCordovaScheme(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isAndroidOrIosCordovaScheme")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCordova(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("_isCordova")().asInstanceOf[js.Promise[Boolean]]
  
  inline def isLikelyCordova(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isLikelyCordova")().asInstanceOf[Boolean]
  
  inline def isPopupRedirectSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isPopupRedirectSupported")().asInstanceOf[Boolean]
  
  inline def isWebStorageSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isWebStorageSupported")().asInstanceOf[Boolean]
  
  inline def isWorker(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isWorker")().asInstanceOf[Boolean]
  
  object global {
    
    trait Document extends StObject {
      
      var documentMode: js.UndefOr[Double] = js.undefined
    }
    object Document {
      
      inline def apply(): Document = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Document]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
        
        inline def setDocumentMode(value: Double): Self = StObject.set(x, "documentMode", value.asInstanceOf[js.Any])
        
        inline def setDocumentModeUndefined: Self = StObject.set(x, "documentMode", js.undefined)
      }
    }
  }
}
