package typings.electronGet

import typings.electronGet.esmTypesMod.ElectronArtifactDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmArtifactUtilsMod {
  
  @JSImport("@electron/get/dist/esm/artifact-utils", "getArtifactFileName")
  @js.native
  def getArtifactFileName(details: ElectronArtifactDetails): String = js.native
  
  @JSImport("@electron/get/dist/esm/artifact-utils", "getArtifactRemoteURL")
  @js.native
  def getArtifactRemoteURL(details: ElectronArtifactDetails): js.Promise[String] = js.native
}
