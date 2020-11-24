package typings.ethersprojectPbkdf2

import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/pbkdf2/lib/browser-pbkdf2", JSImport.Namespace)
@js.native
object browserPbkdf2Mod extends js.Object {
  
  def pbkdf2(password: BytesLike, salt: BytesLike, iterations: Double, keylen: Double, hashAlgorithm: String): String = js.native
}
