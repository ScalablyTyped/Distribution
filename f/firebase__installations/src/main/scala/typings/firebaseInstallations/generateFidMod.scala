package typings.firebaseInstallations

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateFidMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/generate-fid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/installations/dist/src/helpers/generate-fid", "INVALID_FID")
  @js.native
  val INVALID_FID: /* "" */ String = js.native
  
  @JSImport("@firebase/installations/dist/src/helpers/generate-fid", "VALID_FID_PATTERN")
  @js.native
  val VALID_FID_PATTERN: RegExp = js.native
  
  inline def generateFid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFid")().asInstanceOf[String]
}
