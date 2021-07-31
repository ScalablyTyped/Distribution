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
  
  @scala.inline
  def apply(): SecretReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretReference]
  }
  
  @scala.inline
  implicit class SecretReferenceMutableBuilder[Self <: SecretReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: GID): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "File", js.undefined)
    
    @scala.inline
    def setSecretID(value: String): Self = StObject.set(x, "SecretID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretIDUndefined: Self = StObject.set(x, "SecretID", js.undefined)
    
    @scala.inline
    def setSecretName(value: String): Self = StObject.set(x, "SecretName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretNameUndefined: Self = StObject.set(x, "SecretName", js.undefined)
  }
}
