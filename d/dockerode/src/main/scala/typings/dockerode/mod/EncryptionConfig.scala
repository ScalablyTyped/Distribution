package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  var AutoLockManagers: Boolean
}
object EncryptionConfig {
  
  inline def apply(AutoLockManagers: Boolean): EncryptionConfig = {
    val __obj = js.Dynamic.literal(AutoLockManagers = AutoLockManagers.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoLockManagers(value: Boolean): Self = StObject.set(x, "AutoLockManagers", value.asInstanceOf[js.Any])
  }
}
