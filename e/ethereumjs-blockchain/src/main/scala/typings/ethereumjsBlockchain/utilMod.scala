package typings.ethereumjsBlockchain

import typings.bnJs.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-blockchain/dist/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def bodyKey(n: ^, hash: Buffer): Buffer = js.native
  
  /**
    * Convert BN to big endian Buffer
    */
  def bufBE8(n: ^): Buffer = js.native
  
  def hashToNumberKey(hash: Buffer): Buffer = js.native
  
  /**
    * Current canonical head for full sync
    */
  val headBlockKey: /* "LastBlock" */ String = js.native
  
  /**
    * Current canonical head for light sync
    */
  val headHeaderKey: /* "LastHeader" */ String = js.native
  
  def headerKey(n: ^, hash: Buffer): Buffer = js.native
  
  val headsKey: /* "heads" */ String = js.native
  
  def numberToHashKey(n: ^): Buffer = js.native
  
  def tdKey(n: ^, hash: Buffer): Buffer = js.native
}
