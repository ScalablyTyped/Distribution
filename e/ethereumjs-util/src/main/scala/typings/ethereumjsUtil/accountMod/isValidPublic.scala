package typings.ethereumjsUtil.accountMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-util/dist/account", "isValidPublic")
@js.native
object isValidPublic extends js.Object {
  
  def apply(publicKey: Buffer): Boolean = js.native
  def apply(publicKey: Buffer, sanitize: Boolean): Boolean = js.native
}
