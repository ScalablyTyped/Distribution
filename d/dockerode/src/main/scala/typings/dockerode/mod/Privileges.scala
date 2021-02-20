package typings.dockerode.mod

import typings.dockerode.anon.Disable
import typings.dockerode.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Privileges extends StObject {
  
  var CredentialSpec: js.UndefOr[File] = js.native
  
  var SELinuxContext: js.UndefOr[Disable] = js.native
}
object Privileges {
  
  @scala.inline
  def apply(): Privileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privileges]
  }
  
  @scala.inline
  implicit class PrivilegesMutableBuilder[Self <: Privileges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialSpec(value: File): Self = StObject.set(x, "CredentialSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialSpecUndefined: Self = StObject.set(x, "CredentialSpec", js.undefined)
    
    @scala.inline
    def setSELinuxContext(value: Disable): Self = StObject.set(x, "SELinuxContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELinuxContextUndefined: Self = StObject.set(x, "SELinuxContext", js.undefined)
  }
}
