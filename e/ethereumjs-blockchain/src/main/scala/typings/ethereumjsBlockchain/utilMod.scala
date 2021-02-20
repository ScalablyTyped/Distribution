package typings.ethereumjsBlockchain

import typings.bnJs.mod.^
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ethereumjs-blockchain/dist/util", "bodyKey")
  @js.native
  def bodyKey(n: ^, hash: Buffer): Buffer = js.native
  
  /**
    * Convert BN to big endian Buffer
    */
  @JSImport("ethereumjs-blockchain/dist/util", "bufBE8")
  @js.native
  def bufBE8(n: ^): Buffer = js.native
  
  @JSImport("ethereumjs-blockchain/dist/util", "hashToNumberKey")
  @js.native
  def hashToNumberKey(hash: Buffer): Buffer = js.native
  
  /**
    * Current canonical head for full sync
    */
  @JSImport("ethereumjs-blockchain/dist/util", "headBlockKey")
  @js.native
  val headBlockKey: /* "LastBlock" */ String = js.native
  
  /**
    * Current canonical head for light sync
    */
  @JSImport("ethereumjs-blockchain/dist/util", "headHeaderKey")
  @js.native
  val headHeaderKey: /* "LastHeader" */ String = js.native
  
  @JSImport("ethereumjs-blockchain/dist/util", "headerKey")
  @js.native
  def headerKey(n: ^, hash: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-blockchain/dist/util", "headsKey")
  @js.native
  val headsKey: /* "heads" */ String = js.native
  
  @JSImport("ethereumjs-blockchain/dist/util", "numberToHashKey")
  @js.native
  def numberToHashKey(n: ^): Buffer = js.native
  
  @JSImport("ethereumjs-blockchain/dist/util", "tdKey")
  @js.native
  def tdKey(n: ^, hash: Buffer): Buffer = js.native
}
