package typings.ethereumjsBlockchain

import org.scalablytyped.runtime.StringDictionary
import typings.bnJs.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-blockchain/dist/dbManager", JSImport.Namespace)
@js.native
object dbManagerMod extends js.Object {
  
  @js.native
  trait DBManager extends js.Object {
    
    var _cache: StringDictionary[typings.ethereumjsBlockchain.cacheMod.default[Buffer]] = js.native
    
    var _common: js.Any = js.native
    
    var _db: js.Any = js.native
    
    /**
      * Performs a batch operation on db.
      */
    def batch(ops: js.Array[_]): js.Promise[_] = js.native
    
    /**
      * Fetches a key from the db. If `opts.cache` is specified
      * it first tries to load from cache, and on cache miss will
      * try to put the fetched item on cache afterwards.
      */
    def get(key: String): js.Promise[_] = js.native
    def get(key: String, opts: js.Any): js.Promise[_] = js.native
    def get(key: Buffer): js.Promise[_] = js.native
    def get(key: Buffer, opts: js.Any): js.Promise[_] = js.native
    
    def getBlock(blockTag: Double): js.Promise[_] = js.native
    def getBlock(blockTag: ^): js.Promise[_] = js.native
    /**
      * Fetches a block (header and body), given a block tag
      * which can be either its hash or its number.
      */
    def getBlock(blockTag: Buffer): js.Promise[_] = js.native
    
    /**
      * Fetches body of a block given its hash and number.
      */
    def getBody(hash: Buffer, number: ^): js.Promise[Buffer] = js.native
    
    /**
      * Fetches head block.
      */
    def getHeadBlock(): js.Promise[_] = js.native
    
    /**
      * Fetches header of the head block.
      */
    def getHeadHeader(): js.Promise[_] = js.native
    
    /**
      * Fetches header of a block given its hash and number.
      */
    def getHeader(hash: Buffer, number: ^): js.Promise[_] = js.native
    
    /**
      * Fetches iterator heads from the db.
      */
    def getHeads(): js.Promise[_] = js.native
    
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
  
  @js.native
  class default protected () extends DBManager {
    def this(db: js.Any, common: js.Any) = this()
  }
}
