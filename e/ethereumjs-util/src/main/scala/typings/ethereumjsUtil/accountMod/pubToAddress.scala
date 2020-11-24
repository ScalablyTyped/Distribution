package typings.ethereumjsUtil.accountMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-util/dist/account", "pubToAddress")
@js.native
object pubToAddress extends js.Object {
  
  def apply(pubKey: Buffer): Buffer = js.native
  def apply(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
}
