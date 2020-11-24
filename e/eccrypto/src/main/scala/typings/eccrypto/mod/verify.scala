package typings.eccrypto.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eccrypto", "verify")
@js.native
object verify extends js.Object {
  
  def apply(publicKey: Buffer, msg: Buffer, sig: Buffer): js.Promise[Null] = js.native
}
