package typings.ethersprojectPbkdf2

import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2Mod {
  
  @JSImport("@ethersproject/pbkdf2/lib/pbkdf2", "pbkdf2")
  @js.native
  def pbkdf2(password: BytesLike, salt: BytesLike, iterations: Double, keylen: Double, hashAlgorithm: String): String = js.native
}
