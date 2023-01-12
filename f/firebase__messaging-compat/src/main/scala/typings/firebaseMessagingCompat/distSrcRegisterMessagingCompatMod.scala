package typings.firebaseMessagingCompat

import typings.firebaseMessagingCompat.distSrcMessagingCompatMod.MessagingCompatImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRegisterMessagingCompatMod {
  
  @JSImport("@firebase/messaging-compat/dist/src/registerMessagingCompat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerMessagingCompat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMessagingCompat")().asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `messaging-compat`: MessagingCompatImpl
    }
    object NameServiceMapping {
      
      inline def apply(`messaging-compat`: MessagingCompatImpl): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("messaging-compat")(`messaging-compat`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        inline def `setMessaging-compat`(value: MessagingCompatImpl): Self = StObject.set(x, "messaging-compat", value.asInstanceOf[js.Any])
      }
    }
  }
}
