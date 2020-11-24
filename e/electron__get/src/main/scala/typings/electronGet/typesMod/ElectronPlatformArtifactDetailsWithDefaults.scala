package typings.electronGet.typesMod

import typings.electronGet.electronGetBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.electronGet.anon.OmitElectronPlatformArtif
  - typings.electronGet.typesMod.ElectronGenericArtifactDetails
*/
trait ElectronPlatformArtifactDetailsWithDefaults extends js.Object
object ElectronPlatformArtifactDetailsWithDefaults {
  
  @scala.inline
  def OmitElectronPlatformArtif(artifactName: String, version: String): ElectronPlatformArtifactDetailsWithDefaults = {
    val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronPlatformArtifactDetailsWithDefaults]
  }
  
  @scala.inline
  def ElectronGenericArtifactDetails(artifactName: String, isGeneric: `true`, version: String): ElectronPlatformArtifactDetailsWithDefaults = {
    val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronPlatformArtifactDetailsWithDefaults]
  }
}
