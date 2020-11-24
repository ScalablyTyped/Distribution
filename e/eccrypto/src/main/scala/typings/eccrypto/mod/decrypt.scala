package typings.eccrypto.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eccrypto", "decrypt")
@js.native
object decrypt extends js.Object {
  
  def apply(privateKey: Buffer, opts: Ecies): js.Promise[Buffer] = js.native
}
