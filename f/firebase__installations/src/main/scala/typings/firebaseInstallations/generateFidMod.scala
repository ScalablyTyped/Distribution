package typings.firebaseInstallations

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/installations/dist/src/helpers/generate-fid", JSImport.Namespace)
@js.native
object generateFidMod extends js.Object {
  
  val INVALID_FID: /* "" */ String = js.native
  
  val VALID_FID_PATTERN: RegExp = js.native
  
  def generateFid(): String = js.native
}
