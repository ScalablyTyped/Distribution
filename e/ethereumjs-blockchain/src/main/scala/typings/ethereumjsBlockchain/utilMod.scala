package typings.ethereumjsBlockchain

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ethereumjs-blockchain/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bodyKey(n: typings.bnJs.mod.^, hash: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bodyKey")(n.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Convert BN to big endian Buffer
    */
  inline def bufBE8(n: typings.bnJs.mod.^): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufBE8")(n.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def hashToNumberKey(hash: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hashToNumberKey")(hash.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
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
  
  inline def headerKey(n: typings.bnJs.mod.^, hash: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("headerKey")(n.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("ethereumjs-blockchain/dist/util", "headsKey")
  @js.native
  val headsKey: /* "heads" */ String = js.native
  
  inline def numberToHashKey(n: typings.bnJs.mod.^): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToHashKey")(n.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def tdKey(n: typings.bnJs.mod.^, hash: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("tdKey")(n.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
