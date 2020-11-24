package typings.elliptic.mod.eddsa

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "eddsa.Signature")
@js.native
class Signature protected () extends js.Object {
  def this(eddsa: typings.elliptic.mod.eddsa, sig: Bytes) = this()
  def this(eddsa: typings.elliptic.mod.eddsa, sig: Signature) = this()
  
  def toBytes(): Buffer = js.native
  
  def toHex(): String = js.native
}
