package typings.electronGet.typesMod

import typings.electronGet.electronGetBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.electronGet.typesMod.ElectronPlatformArtifactDetails
  - typings.electronGet.typesMod.ElectronGenericArtifactDetails
*/
trait ElectronArtifactDetails extends js.Object
object ElectronArtifactDetails {
  
  @scala.inline
  def ElectronPlatformArtifactDetails(arch: String, artifactName: String, platform: String, version: String): ElectronArtifactDetails = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], artifactName = artifactName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronArtifactDetails]
  }
  
  @scala.inline
  def ElectronGenericArtifactDetails(artifactName: String, isGeneric: `true`, version: String): ElectronArtifactDetails = {
    val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronArtifactDetails]
  }
}
