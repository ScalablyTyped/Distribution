package typings.electronOsxSign

import typings.electronOsxSign.distCjsTypesMod.ElectronMacPlatform
import typings.electronOsxSign.distCjsTypesMod.ValidatedSignOptions
import typings.electronOsxSign.electronOsxSignStrings.development
import typings.electronOsxSign.electronOsxSignStrings.distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsUtilProvisioningProfilesMod {
  
  @JSImport("@electron/osx-sign/dist/cjs/util-provisioning-profiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@electron/osx-sign/dist/cjs/util-provisioning-profiles", "ProvisioningProfile")
  @js.native
  open class ProvisioningProfile protected () extends StObject {
    def this(filePath: String, message: Any) = this()
    
    var filePath: String = js.native
    
    var message: Any = js.native
    
    def name: String = js.native
    
    def platforms: js.Array[ElectronMacPlatform] = js.native
    
    def `type`: development | distribution = js.native
  }
  
  inline def findProvisioningProfiles(opts: ValidatedSignOptions): js.Promise[js.Array[ProvisioningProfile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findProvisioningProfiles")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ProvisioningProfile]]]
  
  inline def getProvisioningProfile(filePath: String): js.Promise[ProvisioningProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvisioningProfile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProvisioningProfile]]
  inline def getProvisioningProfile(filePath: String, keychain: String): js.Promise[ProvisioningProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProvisioningProfile")(filePath.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProvisioningProfile]]
  
  inline def preEmbedProvisioningProfile(opts: ValidatedSignOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("preEmbedProvisioningProfile")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def preEmbedProvisioningProfile(opts: ValidatedSignOptions, profile: ProvisioningProfile): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("preEmbedProvisioningProfile")(opts.asInstanceOf[js.Any], profile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
