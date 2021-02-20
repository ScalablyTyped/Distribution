package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionConfig extends StObject {
  
  var AutoLockManagers: Boolean = js.native
}
object EncryptionConfig {
  
  @scala.inline
  def apply(AutoLockManagers: Boolean): EncryptionConfig = {
    val __obj = js.Dynamic.literal(AutoLockManagers = AutoLockManagers.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  @scala.inline
  implicit class EncryptionConfigMutableBuilder[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLockManagers(value: Boolean): Self = StObject.set(x, "AutoLockManagers", value.asInstanceOf[js.Any])
  }
}
