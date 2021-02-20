package typings.evernote.anon

import typings.evernote.mod.UserStore.BootstrapProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profiles extends StObject {
  
  var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.native
}
object Profiles {
  
  @scala.inline
  def apply(): Profiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profiles]
  }
  
  @scala.inline
  implicit class ProfilesMutableBuilder[Self <: Profiles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfiles(value: js.Array[BootstrapProfile]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    @scala.inline
    def setProfilesVarargs(value: BootstrapProfile*): Self = StObject.set(x, "profiles", js.Array(value :_*))
  }
}
