package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("ethereum-cryptography/random", "getRandomBytes")
  @js.native
  def getRandomBytes(bytes: Double): js.Promise[Buffer] = js.native
  
  @JSImport("ethereum-cryptography/random", "getRandomBytesSync")
  @js.native
  def getRandomBytesSync(bytes: Double): Buffer = js.native
}
