package typings.electronOsxSign

import typings.electronOsxSign.distCjsTypesMod.PerFileSignOptions
import typings.electronOsxSign.distCjsTypesMod.ValidatedSignOptions
import typings.electronOsxSign.distCjsUtilIdentitiesMod.Identity
import typings.electronOsxSign.distCjsUtilProvisioningProfilesMod.ProvisioningProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsUtilEntitlementsMod {
  
  @JSImport("@electron/osx-sign/dist/cjs/util-entitlements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def preAutoEntitlements(opts: ValidatedSignOptions, perFileOpts: PerFileSignOptions, computed: ComputedOptions): js.Promise[Unit | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("preAutoEntitlements")(opts.asInstanceOf[js.Any], perFileOpts.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit | String]]
  
  trait ComputedOptions extends StObject {
    
    var identity: Identity
    
    var provisioningProfile: js.UndefOr[ProvisioningProfile] = js.undefined
  }
  object ComputedOptions {
    
    inline def apply(identity: Identity): ComputedOptions = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputedOptions] (val x: Self) extends AnyVal {
      
      inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setProvisioningProfile(value: ProvisioningProfile): Self = StObject.set(x, "provisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setProvisioningProfileUndefined: Self = StObject.set(x, "provisioningProfile", js.undefined)
    }
  }
}
