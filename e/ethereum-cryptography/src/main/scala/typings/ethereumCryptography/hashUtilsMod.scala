package typings.ethereumCryptography

import typings.node.Buffer
import typings.node.cryptoMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-cryptography/hash-utils", JSImport.Namespace)
@js.native
object hashUtilsMod extends js.Object {
  def createHashFunction(hashConstructor: js.Function0[Hash]): js.Function1[/* msg */ Buffer, Buffer] = js.native
}

