package typings.electronGet

import typings.electronGet.typesMod.ElectronArtifactDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object artifactUtilsMod {
  
  @JSImport("@electron/get/dist/cjs/artifact-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArtifactFileName(details: ElectronArtifactDetails): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getArtifactFileName")(details.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getArtifactRemoteURL(details: ElectronArtifactDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArtifactRemoteURL")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
