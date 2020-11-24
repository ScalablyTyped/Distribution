package typings.ethereumjsUtil.accountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-util/dist/account", "isValidChecksumAddress")
@js.native
object isValidChecksumAddress extends js.Object {
  
  def apply(hexAddress: String): Boolean = js.native
  def apply(hexAddress: String, eip1191ChainId: Double): Boolean = js.native
}
