package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("ethereum-cryptography/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRandomBytes(bytes: Double): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  @scala.inline
  def getRandomBytesSync(bytes: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBytesSync")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
