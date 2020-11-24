package typings.ethers.utilsMod

import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/utils", "SigningKey")
@js.native
class SigningKey protected ()
  extends typings.ethersprojectSigningKey.mod.SigningKey {
  def this(privateKey: BytesLike) = this()
}
/* static members */
@JSImport("ethers/lib/utils", "SigningKey")
@js.native
object SigningKey extends js.Object {
  
  def isSigningKey(value: js.Any): /* is @ethersproject/signing-key.@ethersproject/signing-key.SigningKey */ Boolean = js.native
}
