package typings.dockerode.mod

import typings.dockerode.anon.Disable
import typings.dockerode.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Privileges extends StObject {
  
  var CredentialSpec: js.UndefOr[File] = js.undefined
  
  var SELinuxContext: js.UndefOr[Disable] = js.undefined
}
object Privileges {
  
  inline def apply(): Privileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privileges]
  }
  
  extension [Self <: Privileges](x: Self) {
    
    inline def setCredentialSpec(value: File): Self = StObject.set(x, "CredentialSpec", value.asInstanceOf[js.Any])
    
    inline def setCredentialSpecUndefined: Self = StObject.set(x, "CredentialSpec", js.undefined)
    
    inline def setSELinuxContext(value: Disable): Self = StObject.set(x, "SELinuxContext", value.asInstanceOf[js.Any])
    
    inline def setSELinuxContextUndefined: Self = StObject.set(x, "SELinuxContext", js.undefined)
  }
}
