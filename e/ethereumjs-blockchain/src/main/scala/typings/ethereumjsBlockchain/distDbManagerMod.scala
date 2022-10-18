package typings.ethereumjsBlockchain

import org.scalablytyped.runtime.StringDictionary
import typings.bnJs.mod.^
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDbManagerMod {
  
  @JSImport("ethereumjs-blockchain/dist/dbManager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DBManager {
    def this(db: Any, common: Any) = this()
  }
  
  @js.native
  trait DBManager extends StObject {
    
    var _cache: StringDictionary[typings.ethereumjsBlockchain.distCacheMod.default[Buffer]] = js.native
    
    var _common: Any = js.native
    
    var _db: Any = js.native
    
    /**
      * Performs a batch operation on db.
      */
    def batch(ops: js.Array[Any]): js.Promise[Any] = js.native
    
    /**
      * Fetches a key from the db. If `opts.cache` is specified
      * it first tries to load from cache, and on cache miss will
      * try to put the fetched item on cache afterwards.
      */
    def get(key: String): js.Promise[Any] = js.native
    def get(key: String, opts: Any): js.Promise[Any] = js.native
    def get(key: Buffer): js.Promise[Any] = js.native
    def get(key: Buffer, opts: Any): js.Promise[Any] = js.native
    
    def getBlock(blockTag: Double): js.Promise[Any] = js.native
    def getBlock(blockTag: ^): js.Promise[Any] = js.native
    /**
      * Fetches a block (header and body), given a block tag
      * which can be either its hash or its number.
      */
    def getBlock(blockTag: Buffer): js.Promise[Any] = js.native
    
    /**
      * Fetches body of a block given its hash and number.
      */
    def getBody(hash: Buffer, number: ^): js.Promise[Buffer] = js.native
    
    /**
      * Fetches head block.
      */
    def getHeadBlock(): js.Promise[Any] = js.native
    
    /**
      * Fetches header of the head block.
      */
    def getHeadHeader(): js.Promise[Any] = js.native
    
    /**
      * Fetches header of a block given its hash and number.
      */
    def getHeader(hash: Buffer, number: ^): js.Promise[Any] = js.native
    
    /**
      * Fetches iterator heads from the db.
      */
    def getHeads(): js.Promise[Any] = js.native
    
    /**
      * Fetches total difficulty for a block given its hash and number.
      */
    def getTd(hash: Buffer, number: ^): js.Promise[^] = js.native
    
    /**
      * Performs a block hash to block number lookup.
      */
    def hashToNumber(hash: Buffer): js.Promise[^] = js.native
    
    /**
      * Performs a block number to block hash lookup.
      */
    def numberToHash(number: ^): js.Promise[Buffer] = js.native
  }
}
