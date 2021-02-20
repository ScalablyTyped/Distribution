package typings.ethereumCryptography

import typings.node.Buffer
import typings.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashUtilsMod {
  
  @JSImport("ethereum-cryptography/hash-utils", "createHashFunction")
  @js.native
  def createHashFunction(hashConstructor: js.Function0[Hash]): js.Function1[/* msg */ Buffer, Buffer] = js.native
}
