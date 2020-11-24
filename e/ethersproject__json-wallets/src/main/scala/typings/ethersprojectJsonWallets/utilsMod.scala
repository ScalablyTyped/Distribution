package typings.ethersprojectJsonWallets

import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.BytesLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getPassword(password: String): Uint8Array = js.native
  def getPassword(password: Bytes): Uint8Array = js.native
  
  def looseArrayify(hexString: String): Uint8Array = js.native
  
  def searchPath(`object`: js.Any, path: String): String = js.native
  
  def uuidV4(randomBytes: BytesLike): String = js.native
  
  def zpad(value: String, length: Double): String = js.native
  def zpad(value: Double, length: Double): String = js.native
}
