package typings.ethersprojectAbstractSigner.mod

import typings.ethersprojectAbstractProvider.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abstract-signer", "VoidSigner")
@js.native
class VoidSigner protected ()
  extends Signer
     with TypedDataSigner {
  def this(address: String) = this()
  def this(address: String, provider: Provider) = this()
  
  def _fail(message: String, operation: String): js.Promise[_] = js.native
  
  val address: String = js.native
}
