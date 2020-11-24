package typings.digibyte.mod

import typings.digibyte.anon.PrevHash
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("digibyte", "Block")
@js.native
class Block protected () extends js.Object {
  def this(data: js.Object) = this()
  def this(data: Buffer) = this()
  
  var hash: String = js.native
  
  var header: PrevHash = js.native
  
  var height: Double = js.native
  
  var transactions: js.Array[Transaction] = js.native
}
