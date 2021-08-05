package typings.dockerode.mod

import typings.dockerode.anon.GID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretReference extends StObject {
  
  var File: js.UndefOr[GID] = js.undefined
  
  var SecretID: js.UndefOr[String] = js.undefined
  
  var SecretName: js.UndefOr[String] = js.undefined
}
object SecretReference {
  
  inline def apply(): SecretReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretReference]
  }
  
  extension [Self <: SecretReference](x: Self) {
    
    inline def setFile(value: GID): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "File", js.undefined)
    
    inline def setSecretID(value: String): Self = StObject.set(x, "SecretID", value.asInstanceOf[js.Any])
    
    inline def setSecretIDUndefined: Self = StObject.set(x, "SecretID", js.undefined)
    
    inline def setSecretName(value: String): Self = StObject.set(x, "SecretName", value.asInstanceOf[js.Any])
    
    inline def setSecretNameUndefined: Self = StObject.set(x, "SecretName", js.undefined)
  }
}
