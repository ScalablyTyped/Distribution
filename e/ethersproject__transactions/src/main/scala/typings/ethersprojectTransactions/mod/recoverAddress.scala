package typings.ethersprojectTransactions.mod

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.SignatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/transactions", "recoverAddress")
@js.native
object recoverAddress extends js.Object {
  
  def apply(digest: BytesLike, signature: SignatureLike): String = js.native
}
